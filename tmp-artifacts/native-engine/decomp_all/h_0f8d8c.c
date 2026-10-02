// entry=0xf8d8c

void FUN_001f8d8c(int param_1)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  int iVar3;
  
  iVar3 = (int)DAT_00280b88;
  ppuVar2 = &PTR_LAB_0027fbb0;
  if (param_1 != (-iVar3 | 0xa1caba8aU) * 2 - (-iVar3 ^ 0xa1caba8aU)) {
    ppuVar2 = &PTR_FUN_00283510;
  }
  ppuVar1 = &PTR_LAB_0027ac38;
  if (param_1 != 1) {
    ppuVar1 = ppuVar2;
  }
  ppuVar2 = &PTR_LAB_002756d8;
  if (param_1 != (-iVar3 | 0xa1caba8cU) * 2 - (-iVar3 ^ 0xa1caba8cU)) {
    ppuVar2 = ppuVar1;
  }
  ppuVar1 = &PTR_LAB_0027aee8;
  if (param_1 != 3) {
    ppuVar1 = ppuVar2;
  }
  ppuVar2 = &PTR_LAB_00283ab0 + (long)(int)(-0x5e354577 - (-iVar3 ^ 0xffffffffU)) * 0x6d;
  if (param_1 != (-iVar3 | 0xa1caba8eU) * 2 - (-iVar3 ^ 0xa1caba8eU)) {
    ppuVar2 = ppuVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x001f8e8c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


