// entry=0x13712c

void FUN_0023712c(int param_1)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  undefined8 uVar3;
  int iVar4;
  
  uVar3 = tpidr_el0;
  iVar4 = (int)DAT_00279eb0;
  ppuVar2 = &PTR_LAB_0027e538;
  if (param_1 != 0x8692045 - (-iVar4 ^ 0xffffffffU)) {
    ppuVar2 = &PTR_LAB_00274638;
  }
  ppuVar1 = &PTR_LAB_0027d3a8;
  if (param_1 != 1) {
    ppuVar1 = ppuVar2;
  }
  ppuVar2 = &PTR_LAB_00279c60;
  if (param_1 != 0x8692047 - (-iVar4 ^ 0xffffffffU)) {
    ppuVar2 = ppuVar1;
  }
  ppuVar1 = &PTR_LAB_002761d8;
  if (param_1 != (-iVar4 | 0x8692049U) * 2 - (-iVar4 ^ 0x8692049U)) {
    ppuVar1 = ppuVar2;
  }
  ppuVar2 = (undefined **)&DAT_0027cfc8;
  if (param_1 != (-iVar4 | 0x869204aU) * 2 - (-iVar4 ^ 0x869204aU)) {
    ppuVar2 = ppuVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x0023726c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


