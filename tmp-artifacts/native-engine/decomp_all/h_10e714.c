// entry=0x10e714

void thunk_FUN_0020ce78(ulong param_1)

{
  undefined **ppuVar1;
  
  ppuVar1 = &PTR_H1096d4_0027f330;
  if ((param_1 & 1) == 0) {
    ppuVar1 = &PTR_H105bf8_0027f740;
  }
                    /* WARNING: Could not recover jumptable at 0x0020ce9c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


