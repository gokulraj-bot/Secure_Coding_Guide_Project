# Secure Coding Guide for Beginners — OWASP Top 10:2025

Beginner-friendly capstone package for second-year CSE students.

## Contents
- `docs/Research_Report.docx` — report, guide, checklist, snippets, verification template, ethics and references
- `docs/Presentation.pptx` — six-slide talk
- `docs/OWASP_Top10_Cheat_Sheet.png` — one-page infographic
- `website/index.html` — local learning website with category cards, snippets and a quiz
- `src/java/SecureCodingExamples.java` — defensive Java examples
- `scripts/check_secure_patterns.py` — simple static pattern check
- `.github/workflows/security-check.yml` — GitHub Actions workflow
- `docs/Prompt_Library.md` — prompts to document AI work
- `docs/Quiz_and_Answer_Key.md` — ten-question quiz and explanations
- `docs/Verification_Report.md` — honest verification log template and initial checks
- `docs/Before_After_Analysis.md` — comparison of unsafe and safer patterns

## Run the website
Open `website/index.html` in a browser. It is a static educational page and does not require a server.

## Run the checklist script
Requires Python 3.10+:
```bash
python scripts/check_secure_patterns.py .
```
The script is a lightweight teaching check, not a full SAST tool. A pass is not proof of security.

## Java example
The file uses standard Java APIs and includes illustrative methods. Some methods require a JDBC `Connection` and a trusted password-hashing implementation supplied by a maintained library. Compile the self-contained examples with:
```bash
javac src/java/SecureCodingExamples.java
java -cp src/java SecureCodingExamples
```

## GitHub Actions
Push this folder to a GitHub repository. The workflow runs the pattern checker on pushes and pull requests.

## Important student task before submission
The project brief requires using at least two AI research tools. This package includes prompts and a verification template, but does not claim those external tools were run automatically. Run at least two tools yourself, capture the date and results, check citations against the official sources, and complete `docs/Verification_Report.md`. Also add your name, register number, college and faculty details to the report/presentation.

## Ethics
Only test software you own or have explicit permission to test. No real-world scanning or exploitation is part of this project. Keep secrets out of prompts and repositories.
