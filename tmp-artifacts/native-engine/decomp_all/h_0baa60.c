// entry=0xbaa60

void Hbaa60(void)

{
  long lVar1;
  long in_stack_00000018;
  
  memset(&DAT_00276db0,0,8);
  DAT_0029e3d0 = 0;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == in_stack_00000018) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


