// entry=0x87d04

void H87d04(void)

{
  undefined **ppuVar1;
  uint *in_x9;
  uint *in_x12;
  int *unaff_x28;
  long unaff_x29;
  
  if (*in_x9 <= *in_x12) {
    *unaff_x28 = 2;
    ppuVar1 = (undefined **)&DAT_0027bb50;
    if (*unaff_x28 != 2) {
      ppuVar1 = &PTR_LAB_002820b8;
    }
                    /* WARNING: Could not recover jumptable at 0x0017c8a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0018d380. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_0027a908)
            [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 0x59])
            (**(long **)(unaff_x29 + -0xf8) + (ulong)*in_x12 * 0x10);
  return;
}


