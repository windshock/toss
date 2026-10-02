// entry=0xfba40

void thunk_FUN_001fcd8c(void)

{
  undefined **ppuVar1;
  long lVar2;
  ulong uVar3;
  long unaff_x29;
  
  CallSupervisor(0);
  uVar3 = (long)((-DAT_00280f50 ^ 0xe5eb2050b523678dU) + (-DAT_00280f50 & 0xe5eb2050b523678dU) * 2
                << ((-DAT_00280f50 | 0x6811U) * 2 - (-DAT_00280f50 ^ 0x6811U) & 0x3f)) >> 0x20;
  if (uVar3 < 0xfffffffffffff001) {
    CallSupervisor(0);
    ppuVar1 = &PTR_LAB_00278458;
    if (0xc < (long)uVar3) {
      ppuVar1 = &PTR_LAB_0027fc18 +
                (long)(int)(-0x4adc9810 - (-(int)DAT_00280f50 ^ 0xffffffffU)) * 99;
    }
                    /* WARNING: Could not recover jumptable at 0x001fb938. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(uVar3,(-DAT_00280f50 | 0xe5eb2050b52367f1U) +
                              (-DAT_00280f50 & 0xe5eb2050b52367f1U),
                        (-DAT_00280f50 | 0xe5eb2050b52367f3U) * 2 -
                        (-DAT_00280f50 ^ 0xe5eb2050b52367f3U));
    return;
  }
  CallSupervisor(0);
  lVar2 = tpidr_el0;
  if (*(long *)(lVar2 + 0x28) == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(0xffffffff);
}


