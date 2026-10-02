// entry=0x5897c

void H5897c(void)

{
  undefined **ppuVar1;
  char *in_x9;
  char in_w10;
  
  ppuVar1 = &PTR_LAB_00278fd8;
  if (in_w10 != *in_x9) {
    ppuVar1 = &PTR_LAB_002817c8;
  }
                    /* WARNING: Could not recover jumptable at 0x001589ac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


