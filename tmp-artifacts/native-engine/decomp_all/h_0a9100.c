// entry=0xa9100

void FUN_001abe74(long param_1)

{
  undefined **ppuVar1;
  long in_x10;
  char *in_x11;
  char *in_x12;
  
  DAT_0029e82c = 0;
  if (in_x10 == 0) {
    ppuVar1 = &PTR_LAB_00275310 +
              (int)((-(int)DAT_0027fb18 | 0x56e407f7U) + (-(int)DAT_0027fb18 & 0x56e407f7U));
    if (param_1 != 0) {
      ppuVar1 = &PTR_Ha0f04_0027f550;
    }
                    /* WARNING: Could not recover jumptable at 0x001a9264. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  if (*in_x12 != *in_x11) {
                    /* WARNING: Could not recover jumptable at 0x0019c29c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002768d0)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0019daec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_Ha6330_0027f2e0)();
  return;
}


