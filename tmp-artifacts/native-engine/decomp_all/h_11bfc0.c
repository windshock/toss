// entry=0x11bfc0

void H11a02c(void)

{
  undefined **ppuVar1;
  long in_x9;
  
  ppuVar1 = &PTR_H11a02c_0027ff48;
  if (*(char *)(in_x9 + 1) != ' ') {
    ppuVar1 = &PTR_LAB_00279640;
  }
                    /* WARNING: Could not recover jumptable at 0x0021a060. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


