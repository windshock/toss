// entry=0x146ac8

void H146ac8(void)

{
  long *in_x10;
  ulong unaff_x24;
  long lStack0000000000000040;
  
  lStack0000000000000040 = (*in_x10 - (unaff_x24 ^ 0xffffffffffffffff)) + -1;
                    /* WARNING: Could not recover jumptable at 0x002458d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00278658)
            [(int)((-(int)DAT_00279b20 | 0x33359708U) + (-(int)DAT_00279b20 & 0x33359708U))])();
  return;
}


