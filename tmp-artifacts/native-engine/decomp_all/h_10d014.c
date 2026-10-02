// entry=0x10d014

void H10c07c(ulong param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined4 param_5)

{
  undefined **ppuVar1;
  uint uVar2;
  uint in_w10;
  ulong in_x11;
  long unaff_x19;
  long unaff_x23;
  uint unaff_w26;
  long unaff_x29;
  
  if ((in_x11 & 1) == 0) {
    uVar2 = 0;
    if (in_w10 != 0) {
      uVar2 = unaff_w26 / in_w10;
    }
    (&DAT_915e2a0196034945)[unaff_x19 - (-DAT_00280ba0 ^ 0xffffffffffffffffU)] =
         (&DAT_0027ad10)[(unaff_w26 | -(uVar2 * in_w10)) * 2 - (unaff_w26 ^ -(uVar2 * in_w10))];
    ppuVar1 = &PTR_LAB_00285dd8 +
              (int)((-(int)DAT_00280ba0 | 0x9603494aU) + (-(int)DAT_00280ba0 & 0x9603494aU));
    if (in_w10 <= unaff_w26) {
      ppuVar1 = &PTR_H105dfc_0027fb60;
    }
                    /* WARNING: Could not recover jumptable at 0x00205ebc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  *(undefined1 *)
   (unaff_x23 +
    ((-DAT_00280ba0 | 0x915e2a0196034946U) + (-DAT_00280ba0 & 0x915e2a0196034946U)) * 0x80 + param_1
   ) = 0x2d;
  if (param_1 < 0x7f) {
                    /* WARNING: Could not recover jumptable at 0x0020c9a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002829b0)((param_1 | 1) + (param_1 & 1));
    return;
  }
  *(undefined4 *)(unaff_x29 + -0x9c) = param_5;
  *(undefined8 *)(unaff_x29 + -0x98) = param_4;
  *(undefined1 *)(unaff_x23 + 0x7f) = 0;
  CallSupervisor(0);
  ppuVar1 = &PTR_LAB_0027f588;
  if ((ulong)((long)((-DAT_00280ba0 | 0x915e2a01960348e2U) * 2 -
                     (-DAT_00280ba0 ^ 0x915e2a01960348e2U) << 0x20) >>
             ((-DAT_00280ba0 | 0x4966U) + (-DAT_00280ba0 & 0x4966U) & 0x3f)) <=
      (-DAT_00280ba0 | 0x915e2a0196033946U) * 2 - (-DAT_00280ba0 ^ 0x915e2a0196033946U)) {
    ppuVar1 = &PTR_LAB_00278390;
  }
                    /* WARNING: Could not recover jumptable at 0x0020e968. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


