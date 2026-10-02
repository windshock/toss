// entry=0x38ae8

void H38ae8(void)

{
  undefined **ppuVar1;
  long unaff_x19;
  
  ppuVar1 = &PTR_LAB_00283a00;
  if (unaff_x19 != 4) {
    ppuVar1 = &PTR_LAB_00276688;
  }
                    /* WARNING: Could not recover jumptable at 0x00139f78. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


