// entry=0xef138

void Hef138(ulong param_1)

{
  undefined **ppuVar1;
  
  ppuVar1 = &PTR_LAB_002817d8;
  if ((param_1 & 1) == 0) {
    ppuVar1 = &PTR_LAB_00279e48;
  }
                    /* WARNING: Could not recover jumptable at 0x001ef15c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


