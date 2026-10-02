// entry=0x67ad0

void FUN_00167ad0(uint *param_1)

{
  long lVar1;
  long lVar2;
  
  lVar1 = tpidr_el0;
  if (param_1 + 1 < (uint *)(((ulong)*param_1 - ((ulong)param_1 ^ 0xffffffffffffffff)) + -1)) {
                    /* WARNING: Could not recover jumptable at 0x00167bbc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027dd00)();
    return;
  }
  lVar2 = tpidr_el0;
  if (*(long *)(lVar2 + 0x28) == *(long *)(lVar1 + 0x28)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


