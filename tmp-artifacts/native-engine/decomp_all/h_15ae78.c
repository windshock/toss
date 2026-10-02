// entry=0x15ae78

void H15ae78(ulong param_1)

{
  undefined **ppuVar1;
  
  ppuVar1 = &PTR_LAB_002816d0;
  if ((param_1 & 1) == 0) {
    ppuVar1 = &PTR_LAB_00276958;
  }
                    /* WARNING: Could not recover jumptable at 0x0025ae9c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


