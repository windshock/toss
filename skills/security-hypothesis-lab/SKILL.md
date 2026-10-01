---
name: security-hypothesis-lab
description: Hypothesis-driven security validation workflow for protocol parsing, request smuggling, cache poisoning, race condition, DAST, and target-shaped lab work. Use when a security task needs explicit separation of confirmed facts, unverified premises, testable hypotheses, lab design, iterative experiment planning, and conclusion strength before escalating a finding.
---

# Security Hypothesis Lab

## Overview

Use this skill as the top-level experiment program for security work that is still ambiguous. Treat each run as a validation loop, not as a one-shot scan or a pile of ad hoc probes.

This skill is inspired by the operating style behind `autoresearch`: keep a compact top-level program, run the next best experiment, and improve the program when the current loop cannot answer the real question. Do not copy that repo's ML workflow; copy its discipline around experiment selection and iteration.

## Use This Skill First When

- a finding depends on deployment assumptions such as proxy chain, backend type, cache placement, or client IP diversity
- the first local lab reproduced a primitive but not the claimed impact
- you are drifting from confirmed facts into plausible stories
- you need to decide whether to rerun the same test, improve the lab, or downgrade the claim
- multiple lower-level security skills apply and you need one place to control the experiment loop

## Core Loop

For each question, write down these five items before choosing the next action:

1. `question`: the single uncertainty you are trying to remove
2. `facts`: only what has been directly observed or confirmed
3. `premises`: unverified assumptions that the current interpretation depends on
4. `hypothesis`: one causal claim to test next
5. `exit rule`: what observation would confirm, falsify, or narrow the hypothesis

Then choose exactly one next move:

- rerun the same probe because the first run was noisy
- improve the local lab because the current lab cannot decide between hypotheses
- gather stronger ownership evidence such as debug logs, pcap, or connection-level counters
- downgrade the claim because the stronger impact is still premise-dependent

## Non-Negotiable Rules

- Separate `fact`, `premise`, `hypothesis`, and `conclusion` explicitly.
- Do not promote a lab-only explanation to a target conclusion unless the required premises are confirmed.
- If a stronger impact depends on an extra condition, report the demonstrated primitive and the conditional impact separately.
- If the current lab cannot answer the real question, improve the lab instead of stretching the interpretation.
- If concurrency or fan-out results might be biased by same-host or same-IP execution, rerun with isolated client identities before claiming capacity.

## Experiment Decisions

Use these references as needed:

- Read [experiment-loop.md](./references/experiment-loop.md) to structure the next experiment and keep notes short.
- Read [lab-improvement.md](./references/lab-improvement.md) when the current lab reproduced a primitive but not the claimed impact.
- Read [conclusion-strength.md](./references/conclusion-strength.md) before writing severity or exploitability language.
- Read [common-failure-patterns.md](./references/common-failure-patterns.md) when you suspect you are overfitting to one lab artifact.

## How This Fits With Other Skills

- Use this skill to decide the next experiment and the strength of the resulting claim.
- Use domain skills such as `$waf-ips-ids-retest`, `$sec-audit-static`, or `$security-architecture-review` to execute the domain-specific work.
- When those skills start to accumulate interpretation logic that is really about premises and hypothesis control, move that logic back into this skill.
