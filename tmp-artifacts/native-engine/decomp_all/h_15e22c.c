// entry=0x15e22c

void H15e22c(void)

{
  long lVar1;
  short in_w8;
  short in_w12;
  undefined8 *unaff_x29;
  
  if (in_w12 == in_w8) {
                    /* WARNING: Could not recover jumptable at 0x0025de08. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00282a40)();
    return;
  }
  unaff_x29[1] = 0x14;
  *unaff_x29 = 0x14;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == unaff_x29[-0xc]) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


