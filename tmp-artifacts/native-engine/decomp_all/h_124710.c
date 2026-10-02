// entry=0x124710

void H124710(void)

{
  undefined **ppuVar1;
  ulong in_x11;
  
  ppuVar1 = &PTR_LAB_0027bd68;
  if ((in_x11 & 1) == 0) {
    ppuVar1 = &PTR_LAB_00278780;
  }
                    /* WARNING: Could not recover jumptable at 0x00224754. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


