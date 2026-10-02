// entry=0x55e70

void H5579c(void)

{
  undefined **ppuVar1;
  ulong in_x14;
  
  ppuVar1 = &PTR_LAB_00276a28;
  if ((in_x14 & 1) == 0) {
    ppuVar1 = &PTR_LAB_002794b0;
  }
                    /* WARNING: Could not recover jumptable at 0x001557c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


