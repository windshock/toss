// entry=0x3dd40

void FUN_0013dd40(uint param_1)

{
  undefined **ppuVar1;
  uint uVar2;
  int iVar3;
  
  iVar3 = (int)DAT_00280b68;
  uVar2 = -iVar3;
  (*(code *)(&PTR_FUN_0027c1e0)[(int)((uVar2 | 0x3d42d717) * 2 - (uVar2 ^ 0x3d42d717))])(0);
  ppuVar1 = &PTR_LAB_0027e550;
  if (0x3d42d703 - (-iVar3 ^ 0xffffffffU) <= param_1) {
    ppuVar1 = &PTR_LAB_00275ff0;
  }
                    /* WARNING: Could not recover jumptable at 0x0013ddd8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


