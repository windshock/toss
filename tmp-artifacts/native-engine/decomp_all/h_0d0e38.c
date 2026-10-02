// entry=0xd0e38

void Hd0e38(void)

{
  undefined **ppuVar1;
  long in_x14;
  
  ppuVar1 = &PTR_LAB_00282d98;
  if (in_x14 != 0) {
    ppuVar1 = &PTR_LAB_0027d3c8;
  }
                    /* WARNING: Could not recover jumptable at 0x001d0e5c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


