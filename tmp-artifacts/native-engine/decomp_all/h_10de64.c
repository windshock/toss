// entry=0x10de64

void H10de64(void)

{
  undefined **ppuVar1;
  long in_x12;
  int in_w15;
  long unaff_x24;
  
  if (in_w15 != *(int *)(unaff_x24 + in_x12 * 0x10 + 8)) {
                    /* WARNING: Could not recover jumptable at 0x0020c7b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027b2a8)();
    return;
  }
  ppuVar1 = &PTR_LAB_002796b8;
  if ((int)in_x12 + 1 <=
      (int)((-(int)DAT_00280ba0 | 0x96034946U) * 2 - (-(int)DAT_00280ba0 ^ 0x96034946U))) {
    ppuVar1 = &PTR_LAB_00281a68;
  }
                    /* WARNING: Could not recover jumptable at 0x0020ed88. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


