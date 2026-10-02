// entry=0x682b0

void H682b0(ulong param_1)

{
  long lVar1;
  long unaff_x29;
  
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail((param_1 ^
                   (-DAT_00276dd0 ^ 0x2f88561a761abe8U) + (-DAT_00276dd0 & 0x2f88561a761abe8U) * 2 ^
                   0xffffffffffffffff) & param_1);
}


