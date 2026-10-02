// entry=0xc944c

void Hc944c(void)

{
  long lVar1;
  long unaff_x29;
  
  CallSupervisor(0);
  CallSupervisor(0);
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == *(long *)(unaff_x29 + -0x48)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail((-(int)DAT_0027a008 | 0x7cf76010U) + (-(int)DAT_0027a008 & 0x7cf76010U));
}


