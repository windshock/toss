// entry=0x10b2b4

void H10b2b4(void)

{
  undefined **ppuVar1;
  ulong in_x4;
  ulong uVar2;
  
  uVar2 = (-DAT_00280ba0 | 0x915e2a0196034947U) * 2 - (-DAT_00280ba0 ^ 0x915e2a0196034947U);
  ppuVar1 = &PTR_LAB_00275208;
  if ((in_x4 | uVar2) + (in_x4 & uVar2) !=
      (-DAT_00280ba0 | 0x915e2a019603494aU) + (-DAT_00280ba0 & 0x915e2a019603494aU)) {
    ppuVar1 = &PTR_H10b2b4_00280330 +
              (long)(int)((-(int)DAT_00280ba0 ^ 0x96034946U) +
                         (-(int)DAT_00280ba0 & 0x96034946U) * 2) * 0x67;
  }
                    /* WARNING: Could not recover jumptable at 0x0020b51c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


