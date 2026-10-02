// entry=0x139054

void H139054(void)

{
  long lVar1;
  byte in_w8;
  uint in_w9;
  int in_w10;
  long unaff_x29;
  
  DAT_002862a0 = (in_w9 | -in_w10) * 2 - (in_w9 ^ -in_w10);
  if (((in_w9 == 1 ^ in_w8 ^ 1) & in_w9 == 1) != 0) {
    memset(&DAT_00283608,0,9);
                    /* WARNING: Could not recover jumptable at 0x0023c3fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00277608)();
    return;
  }
  DAT_0029e5ec = 0;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


