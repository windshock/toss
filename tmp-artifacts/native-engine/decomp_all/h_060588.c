// entry=0x60588

void H60588(void)

{
  undefined **ppuVar1;
  long lVar2;
  ulong in_x9;
  long in_x10;
  long unaff_x29;
  
  if (in_x9 < 0xfffffffffffff001) {
    CallSupervisor(0);
    ppuVar1 = &PTR_LAB_0027beb8 + (int)(0x1660fbdc - (-(int)DAT_00274ad0 ^ 0xffffffffU));
    if ((ulong)((in_x10 << 0x20) >>
               ((-DAT_00274ad0 ^ 0xfb9dU) + (-DAT_00274ad0 & 0xfb9dU) * 2 & 0x3f)) <
        0xfffffffffffff001) {
      ppuVar1 = &PTR_LAB_00281368;
    }
                    /* WARNING: Could not recover jumptable at 0x00163704. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(0xfffffffb,
                        (-DAT_00274ad0 | 0xf939b2f55761727eU) * 2 -
                        (-DAT_00274ad0 ^ 0xf939b2f55761727eU),&DAT_00279b00);
    return;
  }
  lVar2 = tpidr_el0;
  if (*(long *)(lVar2 + 0x28) == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(0x1660fb78 - (-(int)DAT_00274ad0 ^ 0xffffffffU));
}


