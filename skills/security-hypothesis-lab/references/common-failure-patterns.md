# Common Failure Patterns

Use this list when the narrative is running ahead of the evidence.

## Pattern 1: premise inflation

You saw one primitive and immediately described the strongest public impact.

Fix:

- list the missing premises
- test one of them
- or downgrade the claim

## Pattern 2: same-lab repetition

You keep rerunning the same inconclusive lab without changing the missing premise.

Fix:

- name the missing premise
- change the lab to target it directly

## Pattern 3: lab-only certainty

You proved something in a lab and started writing as if the target already proved it.

Fix:

- relabel as `lab-proven`
- name the target fact still missing

## Pattern 4: impact conflation

You mixed primitive, exploit path, and business impact into one conclusion.

Fix:

- primitive: what definitely happened
- exploit path: what could happen if extra conditions hold
- business impact: what matters if the exploit path is real

## Pattern 5: hidden bias in the harness

The test setup itself changed the observed limit.

Common examples:

- same-IP instead of distinct clients
- one host process sharing socket limits
- debug build changing timing
- cache warmed by a previous run

Fix:

- isolate the bias
- rerun with one changed variable
- compare before/after explicitly
