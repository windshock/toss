// entry=0xf494c

void Hf494c(ulong param_1)

{
  undefined **ppuVar1;
  
  ppuVar1 = &PTR_LAB_00282628;
  if ((param_1 & 1) == 0) {
    ppuVar1 = &PTR_thunk_FUN_001f5edc_0027d3e0;
  }
                    /* WARNING: Could not recover jumptable at 0x001f4970. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


