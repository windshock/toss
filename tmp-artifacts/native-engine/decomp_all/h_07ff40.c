// entry=0x7ff40

void H7ff40(void)

{
  long lVar1;
  undefined8 *unaff_x29;
  
  *(undefined8 *)(((ulong)unaff_x29 ^ 8) + ((ulong)unaff_x29 & 8) * 2) = 0x18;
  *unaff_x29 = 0x20;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == unaff_x29[-0xc]) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


