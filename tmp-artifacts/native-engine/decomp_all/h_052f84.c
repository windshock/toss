// entry=0x52f84

void H52f84(ulong param_1)

{
  undefined **ppuVar1;
  byte in_w9;
  ulong in_x11;
  uint in_w12;
  
  if (in_w12 != in_w9) {
    ppuVar1 = &PTR_LAB_00277f60;
    if ((in_x11 & 1) == 0) {
      ppuVar1 = &PTR_LAB_00277820 +
                (long)(int)(-0x684eb2d - (-(int)DAT_00275ca8 ^ 0xffffffffU)) * 0x52;
    }
                    /* WARNING: Could not recover jumptable at 0x00153750. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  ppuVar1 = &PTR_LAB_0027d6f8;
  if ((param_1 & 1) == 0) {
    ppuVar1 = &PTR_LAB_00275c40;
  }
                    /* WARNING: Could not recover jumptable at 0x0015d1e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


