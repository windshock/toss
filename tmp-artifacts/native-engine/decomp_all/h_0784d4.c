// entry=0x784d4

void H784d4(void)

{
  long lVar1;
  long unaff_x29;
  
  DAT_0029e5ec = 0;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


