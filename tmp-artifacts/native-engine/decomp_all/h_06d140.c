// entry=0x6d140

void H6d140(void)

{
  undefined **ppuVar1;
  ulong in_x4;
  
  ppuVar1 = &PTR_LAB_00277ec0;
  if ((in_x4 & 1) == 0) {
    ppuVar1 = &PTR_LAB_002857d8;
  }
                    /* WARNING: Could not recover jumptable at 0x0016d168. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


