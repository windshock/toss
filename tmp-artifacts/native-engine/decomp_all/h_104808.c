// entry=0x104808

void H104808(ulong param_1)

{
  undefined **ppuVar1;
  uint uVar2;
  
  uVar2 = -(int)DAT_00278630;
  ppuVar1 = &PTR_LAB_00283038 + (long)(int)((uVar2 ^ 0xf5eef27e) + (uVar2 & 0xf5eef27e) * 2) * 0x62;
  if ((param_1 & 1) == 0) {
    ppuVar1 = &PTR_LAB_0027fee8;
  }
  uVar2 = -(int)DAT_00278630;
                    /* WARNING: Could not recover jumptable at 0x002048a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)((uVar2 ^ 0x53ef4648) + (uVar2 & 0x53ef4648) * 2);
  return;
}


