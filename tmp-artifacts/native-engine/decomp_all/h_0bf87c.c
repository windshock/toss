// entry=0xbf87c

void FUN_001bf87c(void)

{
  long lVar1;
  undefined8 *unaff_x29;
  
  unaff_x29[1] = 0xc;
  *unaff_x29 = 0x20;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == unaff_x29[-0xb]) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


