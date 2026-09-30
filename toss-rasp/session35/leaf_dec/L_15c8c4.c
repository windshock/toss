// FUN_0015c8b4 @0015c8b4

void FUN_0015c8b4(void)

{
  undefined **ppuVar1;
  char *in_x9;
  
  ppuVar1 = &PTR_LAB_0027ad20 +
            (int)((-(int)DAT_00275ca8 | 0xf97b14e2U) * 2 - (-(int)DAT_00275ca8 ^ 0xf97b14e2U));
  if (*in_x9 != (byte)((-(char)DAT_00275ca8 | 0xd4U) + (-(char)DAT_00275ca8 & 0xd4U))) {
    ppuVar1 = &PTR_FUN_002786b0;
  }
                    /* WARNING: Could not recover jumptable at 0x0015c96c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}

