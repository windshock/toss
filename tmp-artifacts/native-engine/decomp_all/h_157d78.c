// entry=0x157d78

void H157d78(void)

{
  long lVar1;
  byte in_w8;
  int in_w9;
  undefined4 in_w10;
  long unaff_x29;
  
  DAT_0029e860 = in_w10;
  if (((in_w9 == 1 ^ in_w8 ^ 1) & in_w9 == 1) != 0) {
                    /* WARNING: Could not recover jumptable at 0x00257080. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00275a78)();
    return;
  }
  DAT_00286240 = -0x5f63dc0 - (-(int)DAT_00277160 ^ 0xffffffffU);
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


