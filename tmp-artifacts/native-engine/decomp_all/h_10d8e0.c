// entry=0x10d8e0

void H10d8e0(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  undefined **ppuVar1;
  int in_w8;
  uint uVar2;
  ulong in_x12;
  byte in_w14;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x28;
  long unaff_x29;
  
  uVar2 = (uint)(in_x12 >> 7) & 0x1ffffff;
  uVar2 = in_w8 << 5 & uVar2 | in_w8 << 5 ^ uVar2;
  if (**(char **)(unaff_x29 + -0xe0) == '\n') {
    ppuVar1 = &PTR_LAB_002784f8;
    if (((uVar2 | in_w14) & (uVar2 & in_w14 ^ 0xffffffff)) != 0xd0359aa) {
      ppuVar1 = (undefined **)&DAT_00279078;
    }
                    /* WARNING: Could not recover jumptable at 0x00206fe8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(param_1,*(undefined8 *)(unaff_x29 + -0xe8),param_3,param_3);
    return;
  }
  *(undefined8 *)(unaff_x29 + -0xd0) = unaff_x20;
  *(undefined8 *)(unaff_x29 + -200) = unaff_x23;
  *(undefined8 *)(unaff_x29 + -0xc0) = unaff_x28;
  *(undefined8 *)(unaff_x29 + -0x108) = unaff_x22;
  *(undefined8 *)(unaff_x29 + -0x148) = unaff_x21;
  *(undefined8 *)(unaff_x29 + -0x160) = param_8;
  ppuVar1 = (undefined **)&DAT_00279e10;
  if (**(char **)(unaff_x29 + -0xe8) != '\n') {
    ppuVar1 = &PTR_H10d1ec_0027fee0 +
              (long)(int)((-(int)DAT_00280ba0 | 0x96034946U) * 2 -
                         (-(int)DAT_00280ba0 ^ 0x96034946U)) * 0x69;
  }
                    /* WARNING: Could not recover jumptable at 0x0020a8b0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(param_5,*(undefined8 *)(unaff_x29 + -0xf0));
  return;
}


