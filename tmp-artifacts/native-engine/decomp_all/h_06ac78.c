// entry=0x6ac78

void H6ac78(void)

{
  uint in_w8;
  uint in_w9;
  
  if (((in_w9 ^ in_w8 ^ 1) & in_w9 & 1) != 0) {
    memset(&DAT_0027cb48,0,0x400);
  }
  DAT_0029e610 = 0x58495401 - (-(int)DAT_00283cb8 ^ 0xffffffffU);
                    /* WARNING: Could not recover jumptable at 0x0016b364. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002819c8)();
  return;
}


