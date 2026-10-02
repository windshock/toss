// entry=0x68c98

void H68c98(void)

{
  long lVar1;
  long unaff_x29;
  
  CallSupervisor(0);
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(0xffffffff - ((uint)DAT_00276dd0 & 1) & 1);
}


