# Quiz and Answer Key

## 1. Which OWASP Top 10:2025 category covers a user accessing another user's private record?
- A. A01 Broken Access Control
- B. A04 Cryptographic Failures
- C. A09 Logging and Alerting Failures

**Answer:** A. Access control checks whether the current user is permitted to access the resource.

## 2. What is the preferred Java approach for putting a user value into an SQL query?
- A. String concatenation
- B. PreparedStatement with parameters
- C. Base64 encoding

**Answer:** B. Parameters keep SQL syntax separate from supplied data.

## 3. Does client-side validation replace server-side validation?
- A. Yes
- B. No

**Answer:** B. Client-side checks can be bypassed; validate on the server.

## 4. How should applications store user passwords?
- A. Plain text
- B. Reversible encryption only
- C. A vetted password-hashing function

**Answer:** C. Password hashing is designed for password verification without storing the original password.

## 5. What should be done with debug mode in production?
- A. Leave it enabled
- B. Disable it and use safe configuration
- C. Expose it only on a hidden URL

**Answer:** B. Debug features and detailed errors can reveal sensitive implementation information.

## 6. What is a supply-chain risk?
- A. A compromised or vulnerable dependency/build component
- B. A CSS layout issue
- C. A user forgetting their username

**Answer:** A. Dependencies, build tools, and release pipelines are part of the software supply chain.

## 7. What is the safer way to show a plain-text user comment in the browser?
- A. innerHTML
- B. textContent
- C. eval

**Answer:** B. textContent inserts plain text rather than parsing it as HTML.

## 8. What should logs avoid recording?
- A. Timestamp
- B. Correlation ID
- C. Passwords and session tokens

**Answer:** C. Passwords and session tokens are secrets and must not be logged.

## 9. If an authorization service fails, what should a protected action normally do?
- A. Allow by default
- B. Fail safely / deny access
- C. Use the last user's role

**Answer:** B. Protected operations should fail safely if authorization cannot be confirmed.

## 10. How should AI-generated security advice be used?
- A. Trust it automatically
- B. Verify with primary sources and tests
- C. Use only if it sounds confident

**Answer:** B. AI can be wrong or outdated; verify its claims and code.

