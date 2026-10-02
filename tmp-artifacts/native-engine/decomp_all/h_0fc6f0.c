// entry=0xfc6f0

void Hfc6f0(void)

{
  undefined **ppuVar1;
  long lVar2;
  long unaff_x21;
  long unaff_x29;
  
  CallSupervisor(0);
  if ((-DAT_00280f50 ^ 0xe5eb2050b52367f1U) + (-DAT_00280f50 & 0xe5eb2050b52367f1U) * 2 != -1) {
    ppuVar1 = &PTR_LAB_00281758 + (int)(-0x4adc97fc - (-(int)DAT_00280f50 ^ 0xffffffffU));
    if (unaff_x21 << 0x20 !=
        (-DAT_00280f50 ^ 0xe5eb2050b52367f1U) + (-DAT_00280f50 & 0xe5eb2050b52367f1U) * 2) {
      ppuVar1 = &PTR_LAB_002755f0;
    }
                    /* WARNING: Could not recover jumptable at 0x001fd210. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  CallSupervisor(0);
  lVar2 = tpidr_el0;
  if (*(long *)(lVar2 + 0x28) == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(0xfffffffd);
}


