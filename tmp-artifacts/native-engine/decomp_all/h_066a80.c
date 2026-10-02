// entry=0x66a80

void H66a80(void)

{
  long lVar1;
  ulong in_x10;
  long unaff_x29;
  
  if ((in_x10 & 1) != 0) {
                    /* WARNING: Could not recover jumptable at 0x00166728. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00283fe8)();
    return;
  }
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(0);
}


