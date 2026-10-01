# Conclusion Strength

Use one of these three scopes whenever you write a security conclusion.

## 1. Target-proven

Use only when the target itself showed the claimed behavior and the required premises are confirmed.

Examples:

- the live target executed the hidden second request
- the live target cached user-specific data across sessions
- the live target showed the exact ownership confusion claimed

## 2. Lab-proven

Use when the claim is demonstrated in a target-shaped lab that mirrors confirmed target facts, but not yet proven end-to-end on the live target.

Examples:

- a local `nginx -> Tomcat` chain reproduces the same request-boundary anomaly
- distinct lab client IPs show the fan-out capacity is higher than same-IP tests suggested

## 3. Hypothesis-only

Use when the idea is plausible but still depends on an unverified premise.

Examples:

- “This probably becomes session confusion if orphan responses occur”
- “This may become cache poisoning if a user-specific path is cached by URL”

## Reporting rule

Write the demonstrated primitive first, then the stronger conditional impact.

Example:

```text
Demonstrated: hidden second request execution in a target-shaped lab.
Conditional: if the deployment also reuses a shared backend response queue without ownership checks, this class can escalate to cross-user response confusion.
```

Do not flatten these into one sentence that sounds target-proven.
