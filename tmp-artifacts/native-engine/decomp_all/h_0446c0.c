// entry=0x446c0

void FUN_001446c0(uint param_1)

{
  uint uVar1;
  undefined8 uVar2;
  
  uVar2 = tpidr_el0;
  uVar1 = -(int)DAT_002744c0;
  if ((uVar1 | 0xcf13ab7c) + (uVar1 & 0xcf13ab7c) <= param_1) {
                    /* WARNING: Could not recover jumptable at 0x0014473c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00278c08)();
    return;
  }
  uVar1 = -(int)DAT_002744c0;
                    /* WARNING: Could not recover jumptable at 0x001448c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_0027a060)[(int)((uVar1 ^ 0xcf13abb2) + (uVar1 & 0xcf13abb2) * 2)])();
  return;
}


