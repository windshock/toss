// entry_off=148634 name=FUN_00248634 body=[[00248634, 0024878f]]

void FUN_00248634(undefined8 param_1,undefined8 param_2)

{
  undefined **ppuVar1;
  long *plVar2;
  undefined1 auStack_1df0 [2064];
  undefined1 auStack_15e0 [2096];
  undefined1 auStack_db0 [16];
  undefined1 auStack_da0 [64];
  undefined1 auStack_d60 [1024];
  undefined1 auStack_960 [1024];
  undefined1 auStack_560 [32];
  undefined1 auStack_540 [128];
  undefined1 auStack_4c0 [32];
  undefined1 auStack_4a0 [408];
  undefined1 *local_308;
  undefined1 *local_2f8;
  undefined1 *local_2e8;
  undefined1 *local_210;
  undefined1 *local_200;
  undefined1 *local_1f8;
  undefined1 *local_1f0;
  undefined1 *local_1e8;
  undefined1 *local_1c8;
  undefined1 *local_1c0;
  undefined1 *local_1a8;
  undefined8 local_1a0;
  long local_198;
  undefined2 local_188;
  undefined2 local_186;
  undefined8 local_80;
  
  local_198 = tpidr_el0;
  local_80 = *(undefined8 *)(local_198 + 0x28);
  local_186 = 0;
  local_188 = 0;
  local_308 = auStack_4a0;
  local_1a8 = auStack_4c0;
  local_1f0 = auStack_540;
  local_1f8 = auStack_560;
  local_210 = auStack_960;
  local_200 = auStack_d60;
  local_2e8 = auStack_da0;
  local_2f8 = auStack_db0;
  local_1c0 = auStack_15e0;
  local_1c8 = auStack_1df0;
  local_1e8 = local_308;
  local_1a0 = param_2;
  plVar2 = (long *)FUN_0026eefc(&DAT_00286150);
  ppuVar1 = &PTR_LAB_00281d10;
  if (*plVar2 != 0) {
    ppuVar1 = (undefined **)&DAT_00283cb0;
  }
                    /* WARNING: Could not recover jumptable at 0x0024878c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


