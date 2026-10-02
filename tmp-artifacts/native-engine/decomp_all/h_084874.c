// entry=0x84874

void H84874(undefined1 *param_1)

{
  long lVar1;
  int in_w9;
  undefined8 *unaff_x29;
  
  if (-0x72280ef5 - (-(int)DAT_00274480 ^ 0xffffffffU) == in_w9) {
    *(undefined4 *)(unaff_x29 + -0xf) = 0x1f6dfbd;
    *param_1 = 0xbd;
                    /* WARNING: Could not recover jumptable at 0x001834d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027eca0)();
    return;
  }
  *(undefined8 *)(((ulong)unaff_x29 ^ 8) + ((ulong)unaff_x29 & 8) * 2) = 0x18;
  *unaff_x29 = 4;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == unaff_x29[-0xc]) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


