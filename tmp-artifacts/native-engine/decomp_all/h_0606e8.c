// entry=0x606e8

void H606e8(void)

{
  undefined **ppuVar1;
  long in_x10;
  
  ppuVar1 = &PTR_LAB_002782a0;
  if ((in_x10 - (0xf939b2f51660fb7d - (-DAT_00274ad0 ^ 0xffffffffffffffffU) ^ 0xffffffffffffffff)) +
      -1 != (-DAT_00274ad0 | 0xf939b2f51660fb85U) + (-DAT_00274ad0 & 0xf939b2f51660fb85U)) {
    ppuVar1 = &PTR_H606e8_0027d560;
  }
                    /* WARNING: Could not recover jumptable at 0x00160920. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(0xffffffffffffffff,-(int)DAT_00274ad0 ^ 0x7232e512,0xffffffff,
                      (-(int)DAT_00274ad0 | 0x1660fb85U) << 1);
  return;
}


