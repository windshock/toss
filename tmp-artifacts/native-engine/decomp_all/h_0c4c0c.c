// entry=0xc4c0c

void FUN_001c4c0c(uint param_1)

{
  undefined8 uVar1;
  
  uVar1 = tpidr_el0;
                    /* WARNING: Could not recover jumptable at 0x001c4c58. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_001c4c5c + (ulong)*(ushort *)(&DAT_0012c9ee + (ulong)param_1 * 2) * 4))();
  return;
}


