// entry=0x71054

void H71054(int param_1)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  int iStack0000000000000034;
  uint uStack0000000000000044;
  
  CallSupervisor(0);
  if (param_1 == 0 && param_1 == DAT_0028623c || (param_1 == 0) != (param_1 == DAT_0028623c)) {
    ppuVar1 = &PTR_LAB_0027df10;
    if (param_1 != 1) {
      ppuVar1 = &PTR_LAB_00275e68;
    }
                    /* WARNING: Could not recover jumptable at 0x0017191c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(1);
    return;
  }
  uVar2 = -(int)DAT_00276da8;
  iStack0000000000000034 = -param_1;
  uVar3 = -(int)DAT_00276da8;
  uStack0000000000000044 = (uint)(param_1 < (int)((uVar2 | 0x3994d2a0) + (uVar2 & 0x3994d2a0)));
                    /* WARNING: Could not recover jumptable at 0x00170920. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00281350)[(int)((uVar3 | 0x3994d2a5) + (uVar3 & 0x3994d2a5))])
            ((-DAT_00276da8 ^ 0x1a0a294d3994d2a0U) + (-DAT_00276da8 & 0x1a0a294d3994d2a0U) * 2);
  return;
}


