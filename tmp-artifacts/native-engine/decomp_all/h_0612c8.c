// entry=0x612c8

void H612c8(void)

{
  long lVar1;
  undefined8 *unaff_x29;
  
  *unaff_x29 = 0x10;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == unaff_x29[-0xb]) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


