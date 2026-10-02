// entry=0xfcbf0

void Hfcbf0(int param_1)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  
  ppuVar1 = &PTR_LAB_0027b318;
  if (param_1 != 0) {
    ppuVar1 = &PTR_Hfb750_0027efe8;
  }
  ppuVar2 = &PTR_thunk_FUN_001fcb80_0027fda0;
  if (param_1 != 1) {
    ppuVar2 = ppuVar1;
  }
  ppuVar1 = &PTR_LAB_002820e8;
  if (param_1 != 2) {
    ppuVar1 = ppuVar2;
  }
  ppuVar2 = &PTR_LAB_00279c78;
  if (param_1 != -0x4adc980d - (-(int)DAT_00280f50 ^ 0xffffffffU)) {
    ppuVar2 = ppuVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x001fcc78. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


