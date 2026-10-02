// entry=0x104724

void thunk_FUN_00204954(void)

{
  long lVar1;
  undefined8 *unaff_x29;
  
  *(undefined8 *)(((ulong)unaff_x29 | 8) * 2 - ((ulong)unaff_x29 ^ 8)) = 0x10;
  *unaff_x29 = 0x24;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == unaff_x29[-0xc]) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


