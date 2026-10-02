// entry=0xba828

void Hba828(void)

{
  int iVar1;
  uint in_w8;
  
  iVar1 = (-(int)DAT_0027b358 | 0x6d1d685bU) + (-(int)DAT_0027b358 & 0x6d1d685bU);
  if ((in_w8 & 1) == 0) {
    iVar1 = 0;
  }
  DAT_00286224 = (DAT_00286224 | -iVar1) + (DAT_00286224 & -iVar1);
                    /* WARNING: Could not recover jumptable at 0x001bba78. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*DAT_0027a4a0)();
  return;
}


