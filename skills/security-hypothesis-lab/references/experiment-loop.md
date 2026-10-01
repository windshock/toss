# Experiment Loop

Use this file as the compact `program` for security experiments.

## Per-question template

Write one block per open question:

```text
Question:
Facts:
- ...

Premises:
- ...

Hypothesis:
- ...

Next experiment:
- ...

Exit rule:
- confirm if ...
- falsify if ...
- otherwise narrow to ...
```

Keep only one main hypothesis active at a time. If there are two independent hypotheses, split them into two blocks.

## Preferred next actions

Choose the cheapest action that can genuinely change the conclusion:

1. rerun the same probe if the first result may be noise
2. add one stronger ownership signal such as debug logs, pcap, or response-owner evidence
3. improve the lab to mirror the missing deployment fact
4. downgrade the claim if the stronger impact still rests on an open premise

## Progress labels

Use these labels in your notes:

- `open`: not enough evidence yet
- `narrowed`: one explanation eliminated, stronger ones still open
- `confirmed`: the tested hypothesis survived and the premise was verified
- `falsified`: the tested hypothesis failed
- `conditional`: plausible, but still depends on an unverified premise

## Good examples

### Example 1: same-IP fan-out ceiling

```text
Question:
Is the measured TC-24 ceiling a protocol limit or a same-IP harness artifact?

Facts:
- Same-host testing becomes unstable above 16 clients.
- nginx logs show upstream connect errors.

Premises:
- Shared source IP may be biasing the result.

Hypothesis:
- Distinct client IPs will raise the stable ceiling.

Next experiment:
- Rerun with isolated Docker clients on the same lab network.

Exit rule:
- If the ceiling increases materially, the old result was harness-biased.
```

### Example 2: desync vs independent cache defect

```text
Question:
Does the observed cache poisoning require TC-24 or happen with normal requests?

Facts:
- Cache entry can be seeded via a hidden second request.

Premises:
- The cache might already be unsafe without desync.

Hypothesis:
- A normal request can seed the same poisoned cache entry.

Next experiment:
- Reproduce with direct, non-smuggled requests only.

Exit rule:
- If poisoning still works, split the cache issue from TC-24.
```
