// entry=0x145acc

void H145a88(void)

{
  undefined **ppuVar1;
  short in_w9;
  
  ppuVar1 = &PTR_LAB_0027f438;
  if (in_w9 != 0) {
    ppuVar1 = &PTR_LAB_0027dff8;
  }
                    /* WARNING: Could not recover jumptable at 0x00247830. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


