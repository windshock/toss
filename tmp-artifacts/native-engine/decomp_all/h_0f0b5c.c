// entry=0xf0b5c

void Hf0b5c(void)

{
  undefined **ppuVar1;
  long in_x6;
  
  ppuVar1 = &PTR_LAB_00278f08;
  if (in_x6 != 0) {
    ppuVar1 = &PTR_LAB_00279530;
  }
                    /* WARNING: Could not recover jumptable at 0x001f0b84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(2);
  return;
}


