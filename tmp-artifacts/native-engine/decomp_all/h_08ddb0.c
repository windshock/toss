// entry=0x8ddb0

void FUN_0018ddb0(uint param_1)

{
  undefined8 uVar1;
  
  uVar1 = tpidr_el0;
                    /* WARNING: Could not recover jumptable at 0x0018e6f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_0018e598 + (ulong)*(ushort *)(&DAT_0012c968 + (ulong)param_1 * 2) * 4))();
  return;
}


