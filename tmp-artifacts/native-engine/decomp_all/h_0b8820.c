// entry=0xb8820

void FUN_001b8820(uint param_1)

{
  undefined8 uVar1;
  
  uVar1 = tpidr_el0;
                    /* WARNING: Could not recover jumptable at 0x001b885c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_001b8b60 + (ulong)*(ushort *)(&DAT_0012c9de + (ulong)param_1 * 2) * 4))();
  return;
}


