// entry=0x12bbac

void H12bbac(ulong param_1)

{
  undefined **ppuVar1;
  undefined1 in_w9;
  long unaff_x19;
  
  *(undefined1 *)(unaff_x19 + 0x9c0 + param_1) = in_w9;
  ppuVar1 = &PTR_LAB_0027a370 +
            (int)((-(int)DAT_00281e58 | 0xcc88cf43U) * 2 - (-(int)DAT_00281e58 ^ 0xcc88cf43U));
  if ((param_1 | 1) * 2 - (param_1 ^ 1) != 0x100) {
    ppuVar1 = &PTR_H12bbac_0027f3c0;
  }
                    /* WARNING: Could not recover jumptable at 0x0022bc30. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


