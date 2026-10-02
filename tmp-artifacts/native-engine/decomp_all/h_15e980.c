// entry=0x15e980

void H15e980(void)

{
  long lVar1;
  undefined8 *unaff_x29;
  
  unaff_x29[1] = (-DAT_00285720 | 0x4e91c1194b98a2c8U) + (-DAT_00285720 & 0x4e91c1194b98a2c8U);
  *unaff_x29 = 0x28;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == unaff_x29[-0xc]) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


