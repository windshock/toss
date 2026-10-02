// entry=0xafed8

void FUN_001afed8(uint param_1)

{
  undefined8 uVar1;
  
  uVar1 = tpidr_el0;
                    /* WARNING: Could not recover jumptable at 0x001b02ac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_001b019c + (ulong)*(ushort *)(&DAT_0012c9c6 + (ulong)param_1 * 2) * 4))();
  return;
}


