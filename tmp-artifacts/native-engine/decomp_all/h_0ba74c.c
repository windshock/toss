// entry=0xba74c

void FUN_001ba74c(uint param_1)

{
  undefined8 uVar1;
  
  uVar1 = tpidr_el0;
                    /* WARNING: Could not recover jumptable at 0x001ba79c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_001ba7a0 + (ulong)*(ushort *)(&DAT_0012c9e6 + (ulong)param_1 * 2) * 4))();
  return;
}


