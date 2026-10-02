// entry=0x7152c

void H7152c(void)

{
  undefined **ppuVar1;
  int in_w8;
  
  ppuVar1 = &PTR_LAB_0027df10;
  if (in_w8 != 1) {
    ppuVar1 = &PTR_LAB_00275e68;
  }
                    /* WARNING: Could not recover jumptable at 0x0017191c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(1);
  return;
}


