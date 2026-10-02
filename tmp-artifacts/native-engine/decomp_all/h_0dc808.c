// entry=0xdc808

void FUN_001dc808(uint param_1)

{
  undefined8 uVar1;
  
  uVar1 = tpidr_el0;
                    /* WARNING: Could not recover jumptable at 0x001dcea4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_001dc8fc + (ulong)*(ushort *)(&DAT_0012ca0a + (ulong)param_1 * 2) * 4))();
  return;
}


