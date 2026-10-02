// entry=0x135240

void FUN_00235240(int param_1)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  
  ppuVar2 = (undefined **)&DAT_00281d88;
  if (param_1 != 0) {
    ppuVar2 = &PTR_LAB_00277338;
  }
  ppuVar1 = &PTR_LAB_00279488;
  if (param_1 != 1) {
    ppuVar1 = ppuVar2;
  }
  ppuVar2 = &PTR_LAB_0027b798;
  if (param_1 != 2) {
    ppuVar2 = ppuVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x0023528c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


