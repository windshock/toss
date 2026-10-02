// entry=0x135d5c

void H135d5c(void)

{
  undefined **ppuVar1;
  char *in_x12;
  
  ppuVar1 = &PTR_LAB_0027a510;
  if (*in_x12 != '\0') {
    ppuVar1 = &PTR_H135d5c_0027e940;
  }
                    /* WARNING: Could not recover jumptable at 0x00235d90. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


