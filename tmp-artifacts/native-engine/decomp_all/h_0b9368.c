// entry=0xb9368

void Hb9368(void)

{
  undefined **ppuVar1;
  long unaff_x21;
  
  ppuVar1 = &PTR_Hb8b58_0027de20;
  if (*(int *)(unaff_x21 + 8) !=
      (-(int)DAT_00279740 | 0x30fa725dU) + (-(int)DAT_00279740 & 0x30fa725dU)) {
    ppuVar1 = &PTR_LAB_002813f0;
  }
                    /* WARNING: Could not recover jumptable at 0x001b8c34. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


