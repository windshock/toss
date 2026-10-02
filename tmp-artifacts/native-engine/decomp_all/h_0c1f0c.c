// entry=0xc1f0c

void Hc1f0c(void)

{
  undefined **ppuVar1;
  int in_w8;
  
  ppuVar1 = &PTR_LAB_0027b9e8;
  if (in_w8 == 1) {
    ppuVar1 = &PTR_LAB_0027f600;
  }
                    /* WARNING: Could not recover jumptable at 0x001c29b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)((-(int)DAT_0027a2f0 | 0xc6bf8cf7U) * 2 - (-(int)DAT_0027a2f0 ^ 0xc6bf8cf7U));
  return;
}


