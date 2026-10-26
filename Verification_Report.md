# AI Verification Report

**Status at package creation (26 October 2026):** The OWASP category names below were checked against the official OWASP Top 10:2025 page. This package does not claim to have executed ChatGPT, Gemini, Claude, Perplexity, or NotebookLM on the student's behalf. Complete the actual multi-tool comparison before submission.

| Item | Check | Status | Follow-up |
|---|---|---|---|
| OWASP category names | Compare with official OWASP Top 10:2025 | Checked against official list | Re-check on submission date |
| PreparedStatement example | Compare with Java API docs and compile with JDBC setup | API pattern is standard; runtime DB test not included | Test using a trusted test database |
| `textContent` guidance | Compare with MDN documentation | Defensive guidance; browser test recommended | Test in target browser |
| Password storage | Compare with OWASP Password Storage Cheat Sheet | General recommendation verified conceptually | Choose maintained library and current parameters |
| AI-generated API names | Compile and inspect official docs | No AI-generated API claims treated as verified | Record actual tool outputs |
| Static checker | Run against starter repository | Heuristic only; false positives/negatives possible | Add unit tests and manual review |

## Required two-tool record
For each AI tool, paste the actual prompt, date, output summary, sources it cited, what was independently checked, and any error found. Do not invent results or claim a test passed unless it was run.

| Tool | Date | Claim checked | Primary source | Result / correction |
|---|---|---|---|---|
| ChatGPT | Fill in | Fill in | Fill in | Fill in |
| Gemini or Perplexity / NotebookLM | Fill in | Fill in | Fill in | Fill in |

## Limitations
A pattern checker cannot prove an application secure. A source may change, and sample code must be adapted to a real framework, database schema, and threat model. This report is an educational record, not a formal security certification.
