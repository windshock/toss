// entry=0x6fa54

void FUN_0016fa54(uint param_1)

{
  undefined8 uVar1;
  
  uVar1 = tpidr_el0;
                    /* WARNING: Could not recover jumptable at 0x0016fab8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_0016fabc + (ulong)*(ushort *)(&DAT_0012c936 + (ulong)param_1 * 2) * 4))();
  return;
}


