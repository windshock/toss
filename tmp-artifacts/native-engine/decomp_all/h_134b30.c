// entry=0x134b30

void H134b30(void)

{
  long lVar1;
  long unaff_x29;
  
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == *(long *)(unaff_x29 + -0x68)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


