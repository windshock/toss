// entry=0xf405c

void thunk_FUN_001f5edc(void)

{
  long lVar1;
  undefined8 *unaff_x29;
  
  *(undefined8 *)(((ulong)unaff_x29 | 8) + ((ulong)unaff_x29 & 8)) = 0x28;
  *unaff_x29 = 0x28;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == unaff_x29[-0xc]) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


