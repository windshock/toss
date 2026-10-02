// entry=0x671c0

void H671c0(void)

{
  long lVar1;
  uint in_w8;
  long unaff_x19;
  long unaff_x29;
  
  if (((in_w8 ^ 0x40ffffff) & in_w8) == 0x18000000) {
                    /* WARNING: Could not recover jumptable at 0x00166e8c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_H66a80_0027d818)(*(undefined4 *)(unaff_x19 + 0xc));
    return;
  }
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(0);
}


