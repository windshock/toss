// entry=0xf1954

void FUN_001f20f4(int param_1)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  int iVar3;
  
  iVar3 = (int)DAT_00281e48;
  DAT_002862c0 = -0x2fe79926 - iVar3;
  ppuVar2 = &PTR_LAB_00277478;
  if (param_1 != -0x2fe79927 - (-iVar3 ^ 0xffffffffU)) {
    ppuVar2 = &PTR_FUN_0027f6e8;
  }
  ppuVar1 = &PTR_LAB_0027fde8;
  if (param_1 != 1) {
    ppuVar1 = ppuVar2;
  }
  ppuVar2 = &PTR_LAB_00275eb8;
  if (param_1 != -0x2fe79925 - (-iVar3 ^ 0xffffffffU)) {
    ppuVar2 = ppuVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x001f21ac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


