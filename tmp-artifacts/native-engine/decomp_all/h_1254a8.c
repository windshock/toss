// entry=0x1254a8

void H1254a8(void)

{
  long *unaff_x29;
  
  *unaff_x29 = (-DAT_00281e58 | 0x42c7e286cc88cf66U) * 2 - (-DAT_00281e58 ^ 0x42c7e286cc88cf66U);
                    /* WARNING: Could not recover jumptable at 0x00215068. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_002839f0)
            [(long)(int)((-(int)DAT_00281e58 | 0xcc88cf42U) + (-(int)DAT_00281e58 & 0xcc88cf42U)) *
             0x6d])();
  return;
}


