// entry=0x36270

void H35a60(void)

{
  undefined **ppuVar1;
  long in_x11;
  
  ppuVar1 = &PTR_LAB_002790c8;
  if (in_x11 != 0) {
    ppuVar1 = &PTR_LAB_002816b0;
  }
                    /* WARNING: Could not recover jumptable at 0x00136a4c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


