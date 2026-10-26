# Before / After Analysis

| Topic | Before (risk) | After (defensive pattern) | Expected improvement | Remaining limitation |
|---|---|---|---|---|
| SQL query | User input concatenated into SQL string | PreparedStatement with bound parameters | Data is not parsed as SQL syntax | Table permissions and query logic still need review |
| Input validation | Raw value parsed without format/range checks | Server-side format and business-range checks | Rejects malformed and out-of-range values predictably | Validation does not replace authorization |
| Access control | Lookup trusts browser-provided record ID | Server checks authenticated owner on every request | Blocks cross-user record access when correctly applied | Real systems need roles, tenant boundaries, and tests |
| Passwords | Plaintext password saved | Maintained password-hashing library | Reduces impact of database exposure | Correct parameters, salts, reset flows, and MFA still matter |
| Browser output | User text assigned to innerHTML | textContent for plain text | Prevents parsing text as HTML | Rich text needs safe sanitization and contextual handling |

## Demo measurement
Run the static checker before and after reviewing your source. Record findings and false positives. Do not claim security improved based only on the absence of pattern matches. Pair the checker with code review, unit tests, dependency review, and manual authorization tests.
