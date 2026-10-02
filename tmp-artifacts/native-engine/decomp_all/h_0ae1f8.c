// entry=0xae1f8

void Hae1f8(void)

{
  undefined **ppuVar1;
  char *in_x12;
  char in_w13;
  
  ppuVar1 = &PTR_LAB_0027a798 +
            (long)(int)((-(int)DAT_0027fb18 | 0x56e407c0U) * 2 - (-(int)DAT_0027fb18 ^ 0x56e407c0U))
            * 0x59;
  if (in_w13 != *in_x12) {
    ppuVar1 = &PTR_LAB_00282db0;
  }
                    /* WARNING: Could not recover jumptable at 0x001ae25c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


