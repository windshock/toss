// entry=0x10f180

void FUN_0020f180(int param_1)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  undefined8 uVar3;
  
  uVar3 = tpidr_el0;
  ppuVar2 = &PTR_LAB_00276b90;
  if (param_1 != 0) {
    ppuVar2 = &PTR_LAB_002742a8;
  }
  ppuVar1 = &PTR_LAB_00281dc0;
  if (param_1 != 1) {
    ppuVar1 = ppuVar2;
  }
  ppuVar2 = (undefined **)&DAT_0027e610;
  if (param_1 != 2) {
    ppuVar2 = ppuVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x0020f208. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


