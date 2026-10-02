// entry=0xc64d0

void Hc64d0(void)

{
  undefined **ppuVar1;
  long unaff_x21;
  
  ppuVar1 = &PTR_LAB_0027f9c8;
  if (*(long *)(unaff_x21 + 0x68) != *(long *)(unaff_x21 + 0x48)) {
    ppuVar1 = &PTR_LAB_00279920;
  }
                    /* WARNING: Could not recover jumptable at 0x001c8228. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


