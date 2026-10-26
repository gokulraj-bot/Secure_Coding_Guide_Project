# Checker test plan
1. Run `python scripts/check_secure_patterns.py .` on the repository.
2. Expected starter baseline: no configured pattern should be found.
3. For a negative test, create a temporary file outside the submission tree containing a sample line such as `String q = "SELECT * FROM users WHERE id = '" + userId;`.
4. Run the checker against that temporary folder and confirm it reports the SQL concatenation pattern.
5. Delete the temporary folder.
6. Record actual output and any false positives in the verification report.

Do not put the intentionally unsafe test file into production or deploy it.
