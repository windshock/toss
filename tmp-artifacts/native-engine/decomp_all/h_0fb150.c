// entry=0xfb150

void Hfb150(ulong param_1)

{
  undefined **ppuVar1;
  
  ppuVar1 = &PTR_LAB_002764e0;
  if ((param_1 & 1) == 0) {
    ppuVar1 = (undefined **)&DAT_00285e08;
  }
                    /* WARNING: Could not recover jumptable at 0x001fb174. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


