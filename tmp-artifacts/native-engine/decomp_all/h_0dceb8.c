// entry=0xdceb8

void Hdceb8(void)

{
  long lVar1;
  long unaff_x29;
  
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(7);
}


