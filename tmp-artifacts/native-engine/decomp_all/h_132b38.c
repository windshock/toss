// entry=0x132b38

void H12d2c8(void)

{
  undefined **ppuVar1;
  byte in_w10;
  ulong in_x12;
  
  if ((in_x12 & 1) != 0) {
                    /* WARNING: Could not recover jumptable at 0x00218e84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_H124710_0027d7e0)();
    return;
  }
  ppuVar1 = &PTR_LAB_00276110;
  if ((-(int)DAT_00281e58 | 0xcc88cfa6U) + (-(int)DAT_00281e58 & 0xcc88cfa6U) != (uint)in_w10) {
    ppuVar1 = &PTR_LAB_0027eb40;
  }
                    /* WARNING: Could not recover jumptable at 0x00221d98. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


