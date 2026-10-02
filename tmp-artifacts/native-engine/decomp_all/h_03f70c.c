// entry=0x3f70c

void H3f70c(void)

{
  long lVar1;
  int in_w8;
  long unaff_x29;
  
  if (in_w8 != -1) {
    DAT_0027a9b0 = in_w8 + 8;
    DAT_00282fc0 = in_w8;
                    /* WARNING: Could not recover jumptable at 0x00142eb0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00283f20)();
    return;
  }
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(0xffffffff);
}


