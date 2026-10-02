// entry=0x81258

void H81164(void)

{
  undefined **ppuVar1;
  ulong in_x17;
  
  ppuVar1 = &PTR_LAB_0027d630;
  if ((in_x17 & 1) == 0) {
    ppuVar1 = &PTR_H7ff40_0027e5c0;
  }
                    /* WARNING: Could not recover jumptable at 0x00181188. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


