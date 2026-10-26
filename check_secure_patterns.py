#!/usr/bin/env python3
"""Teaching-only secure coding pattern checker. Not a full security scanner."""
from pathlib import Path
import re
import sys

SKIP_DIRS = {".git", ".venv", "node_modules", "target", "build", "__pycache__"}
EXTENSIONS = {".java", ".js", ".ts", ".html", ".jsp", ".py"}
RULES = [
    ("SQL string concatenation", re.compile(r'(?i)(SELECT|UPDATE|INSERT|DELETE).{0,120}\+\s*[A-Za-z_]\w*'), 
     "Use parameterized database APIs; do not concatenate untrusted values into SQL."),
    ("Unsafe DOM HTML assignment", re.compile(r'\.innerHTML\s*=\s*'), 
     "Use textContent for plain text or a maintained sanitizer for intended rich HTML."),
    ("Possible hard-coded password", re.compile(r'(?i)(password|passwd|secret)\s*=\s*["\'][^"\']{4,}["\']'), 
     "Load secrets from an approved secret store or environment; never commit real secrets."),
]
def main(root: Path) -> int:
    findings = []
    for path in root.rglob("*"):
        if not path.is_file() or path.suffix.lower() not in EXTENSIONS:
            continue
        if any(part in SKIP_DIRS for part in path.parts):
            continue
        try:
            content = path.read_text(encoding="utf-8", errors="ignore")
        except OSError:
            continue
        for label, pattern, advice in RULES:
            for match in pattern.finditer(content):
                line = content.count("\n", 0, match.start()) + 1
                findings.append((path, line, label, advice))
    if findings:
        print("Potential patterns found (manual review required):")
        for path, line, label, advice in findings:
            print(f"{path}:{line}: {label} — {advice}")
        return 1
    print("PASS: no configured patterns found. This is not proof that the code is secure.")
    return 0

if __name__ == "__main__":
    target = Path(sys.argv[1]) if len(sys.argv) > 1 else Path(".")
    raise SystemExit(main(target))
