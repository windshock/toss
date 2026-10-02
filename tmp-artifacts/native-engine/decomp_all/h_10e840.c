// entry=0x10e840

void H10e840(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4)

{
  undefined **ppuVar1;
  long in_x11;
  long unaff_x23;
  long unaff_x29;
  
  *(undefined4 *)(unaff_x29 + -0x9c) = param_4;
  *(undefined8 *)(unaff_x29 + -0x98) = param_3;
  *(undefined1 *)(unaff_x23 + in_x11) = 0;
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


