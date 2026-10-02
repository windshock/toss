// entry=0xf7848

void Hf7848(void)

{
  undefined **ppuVar1;
  ulong in_x16;
  
  ppuVar1 = &PTR_LAB_00285af0;
  if ((in_x16 & 1) == 0) {
    ppuVar1 = &PTR_LAB_0027b230;
  }
                    /* WARNING: Could not recover jumptable at 0x001f786c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


