// entry=0x1452bc

void FUN_002452bc(int param_1)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  uint uVar3;
  undefined8 uVar4;
  
  uVar4 = tpidr_el0;
  uVar3 = -(int)DAT_00279b20;
  ppuVar1 = (undefined **)
            ((long)(int)((uVar3 ^ 0x333596ae) + (uVar3 & 0x333596ae) * 2) * 0x388 + 0x274b00);
  if (param_1 != 0) {
    ppuVar1 = &PTR_LAB_00277420;
  }
  ppuVar2 = &PTR_LAB_00275b00;
  if (param_1 != 1) {
    ppuVar2 = ppuVar1;
  }
  ppuVar1 = &PTR_LAB_0027bbc0;
  if (param_1 != 2) {
    ppuVar1 = ppuVar2;
  }
  uVar3 = -(int)DAT_00279b20;
  ppuVar2 = &PTR_LAB_00285800;
  if (param_1 != (uVar3 | 0x333596b1) + (uVar3 & 0x333596b1)) {
    ppuVar2 = ppuVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x0024538c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


