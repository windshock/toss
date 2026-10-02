// entry=0x7723c

void H7723c(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  int unaff_w21;
  int iStack0000000000000034;
  uint uStack0000000000000044;
  
  CallSupervisor(0);
  if (unaff_w21 == 0 && unaff_w21 == DAT_0028623c || (unaff_w21 == 0) != (unaff_w21 == DAT_0028623c)
     ) {
    ppuVar1 = &PTR_LAB_0027df10;
    if (unaff_w21 != 1) {
      ppuVar1 = &PTR_LAB_00275e68;
    }
                    /* WARNING: Could not recover jumptable at 0x0017191c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(1);
    return;
  }
  uVar2 = -(int)DAT_00276da8;
  iStack0000000000000034 = -unaff_w21;
  uVar3 = -(int)DAT_00276da8;
  uStack0000000000000044 = (uint)(unaff_w21 < (int)((uVar2 | 0x3994d2a0) + (uVar2 & 0x3994d2a0)));
                    /* WARNING: Could not recover jumptable at 0x00170920. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00281350)[(int)((uVar3 | 0x3994d2a5) + (uVar3 & 0x3994d2a5))])
            ((-DAT_00276da8 ^ 0x1a0a294d3994d2a0U) + (-DAT_00276da8 & 0x1a0a294d3994d2a0U) * 2);
  return;
}


