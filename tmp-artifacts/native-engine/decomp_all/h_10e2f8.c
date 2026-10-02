// entry=0x10e2f8

void H10e2f8(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined **ppuVar1;
  int in_w13;
  long unaff_x29;
  
  if (**(char **)(unaff_x29 + -0xf0) ==
      (byte)((-(char)DAT_00280ba0 & 0x7fU | 0x50) * '\x02' - (-(char)DAT_00280ba0 ^ 0x50U))) {
    ppuVar1 = &PTR_LAB_002784f8;
    if (in_w13 != 0xd0359aa) {
      ppuVar1 = (undefined **)&DAT_00279078;
    }
                    /* WARNING: Could not recover jumptable at 0x00206fe8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(param_1,*(undefined8 *)(unaff_x29 + -0xf8),param_3,param_3,param_1,
                        *(undefined8 *)(unaff_x29 + -0x88),*(undefined8 *)(unaff_x29 + -0x90),
                        *(undefined8 *)(unaff_x29 + -0x160));
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0020d9ec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_H108708_0027f2f0)();
  return;
}


