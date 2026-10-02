// entry=0x132fb8

void FUN_00232fb8(int param_1)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  uint uVar3;
  undefined8 uVar4;
  
  uVar4 = tpidr_el0;
  ppuVar1 = &PTR_LAB_0027a990;
  if (param_1 != 0) {
    ppuVar1 = (undefined **)&DAT_00279238;
  }
  ppuVar2 = &PTR_LAB_00277198;
  if (param_1 != 1) {
    ppuVar2 = ppuVar1;
  }
  ppuVar1 = &PTR_LAB_002804e8;
  if (param_1 != 0x5de9c899 - (-(int)DAT_00274ae0 ^ 0xffffffffU)) {
    ppuVar1 = ppuVar2;
  }
  uVar3 = -(int)DAT_00274ae0;
  ppuVar2 = &PTR_LAB_00274760;
  if (param_1 != (uVar3 | 0x5de9c89b) * 2 - (uVar3 ^ 0x5de9c89b)) {
    ppuVar2 = ppuVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x002330a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


