# Lab Improvement Rules

Improve the lab when the current setup reproduces a primitive but cannot answer the impact question.

## Upgrade the lab instead of repeating it when

- the same run keeps producing the same ambiguous evidence
- the interpretation depends on a premise the lab does not model
- the strongest claim requires ownership proof that the lab does not expose
- the capacity result may be biased by same-host, same-IP, or shared socket pools

## Typical upgrades

### Client identity upgrade

Use when:

- same-IP bias is suspected
- concurrency ceilings look suspiciously low or unstable
- you need to know whether different clients change the result

Upgrade:

- separate Docker clients or isolated namespaces
- distinct client IPs inside the lab
- preserve the same front, target path, and payload

### Ownership upgrade

Use when:

- you need to know who generated the response
- queue poisoning or cross-user claims are in play

Upgrade:

- front debug logs
- pcap on front-to-origin leg
- connection/request counters
- victim and attacker ownership markers

### Target-shape upgrade

Use when:

- the claim depends on backend type, cache layer, host routing, or fallback behavior

Upgrade:

- mirror the confirmed proxy chain
- mirror the real route family and host structure
- mirror cache/no-cache behavior only when confirmed

### Cost-model upgrade

Use when:

- the primitive is known, but the question is practical impact

Upgrade:

- use the real expensive endpoint shape
- add delay or CPU work intentionally
- keep the causal mechanism the same and change only the cost profile

### Fresh-state upgrade

Use when:

- a capacity or fan-out result changes across repeated runs
- later runs fail with connect churn, empty responses, or lab-only saturation signals
- you need to know whether the number belongs to the primitive or to accumulated lab state

Upgrade:

- reset the lab or wait for an explicit cooldown window
- rerun the decisive case from a fresh state
- record both the fresh-state result and the degraded rerun result when they differ

## What not to do

- Do not add unrelated complexity just to make the lab look realistic.
- Do not change three premises at once if one would answer the question.
- Do not call a new lab result “more realistic” unless you can name the target fact it mirrors.
