// entry=0x82ee4

void H82ee4(void)

{
  undefined **ppuVar1;
  long unaff_x28;
  
  ppuVar1 = &PTR_LAB_002801d0;
  if (unaff_x28 != 0) {
    ppuVar1 = &PTR_LAB_00281578;
  }
                    /* WARNING: Could not recover jumptable at 0x0018424c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


