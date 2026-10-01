# Changelog

## 2026-03-30

### Added

- initial standalone release of the `security-hypothesis-lab` skill
- compact experiment loop for security validation work
- lab-improvement rules for client identity, ownership, target-shape, cost-model, and fresh-state upgrades
- conclusion-strength guidance for distinguishing `target-proven`, `lab-proven`, and `hypothesis-only`
- common failure-pattern notes for premise inflation, same-lab repetition, lab-only certainty, impact conflation, and hidden harness bias

### Notes

- this skill is intended to sit above domain-specific security skills such as WAF/IPS/IDS retest, static audit, architecture review, or external software analysis
- it is inspired by the operating discipline behind `autoresearch`, but adapted for security validation rather than ML experimentation
