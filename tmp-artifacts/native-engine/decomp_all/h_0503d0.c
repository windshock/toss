// entry=0x503d0

void H503d0(void)

{
  long lVar1;
  short in_w8;
  short in_w12;
  long unaff_x19;
  undefined8 *unaff_x29;
  
  if (in_w12 == in_w8) {
    **(undefined8 **)(unaff_x19 + 0x2a8) = 0;
                    /* WARNING: Could not recover jumptable at 0x00151a90. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00281590)();
    return;
  }
  *(undefined8 *)(((ulong)unaff_x29 | 8) * 2 - ((ulong)unaff_x29 ^ 8)) = 0x20;
  *unaff_x29 = 0x1c;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == unaff_x29[-0xc]) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


