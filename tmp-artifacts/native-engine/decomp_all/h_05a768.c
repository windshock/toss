// entry=0x5a768

void H5a2a0(void)

{
  undefined **ppuVar1;
  ulong uVar2;
  ulong in_x14;
  
  uVar2 = 0x642804bbf97b14d4 - (-DAT_00275ca8 ^ 0xffffffffffffffffU);
  ppuVar1 = &PTR_LAB_00283f90;
  if ((in_x14 | uVar2) + (in_x14 & uVar2) !=
      0x642804bbf97b14d7 - (-DAT_00275ca8 ^ 0xffffffffffffffffU)) {
    ppuVar1 = &PTR_H5a2a0_0027e1c0;
  }
                    /* WARNING: Could not recover jumptable at 0x0015a4e4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


