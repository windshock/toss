// entry=0x127d84

void H127d84(void)

{
  undefined **ppuVar1;
  long in_x9;
  
  ppuVar1 = &PTR_LAB_00277d50;
  if (*(char *)(in_x9 + 1) != '\0') {
    ppuVar1 = &PTR_LAB_0027b0e0;
  }
                    /* WARNING: Could not recover jumptable at 0x00227df4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


