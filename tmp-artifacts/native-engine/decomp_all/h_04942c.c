// entry=0x4942c

void H4942c(void)

{
  long lVar1;
  undefined8 *unaff_x29;
  
  unaff_x29[1] = (-DAT_00275ca8 | 0x642804bbf97b14e0U) + (-DAT_00275ca8 & 0x642804bbf97b14e0U);
  *unaff_x29 = 0x14;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == unaff_x29[-0xc]) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


