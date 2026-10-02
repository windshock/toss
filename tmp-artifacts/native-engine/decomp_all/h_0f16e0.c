// entry=0xf16e0

void FUN_001f16e0(code *param_1)

{
  undefined **ppuVar1;
  int iVar2;
  long unaff_x23;
  
  iVar2 = (*param_1)();
  if (iVar2 != 0) {
    FUN_001f1510();
    return;
  }
  ppuVar1 = &PTR_FUN_0027c178;
  if (((*(ulong *)(unaff_x23 + 0x50) ^ 0xfffffffffffffffe) & *(ulong *)(unaff_x23 + 0x50)) != 0) {
    ppuVar1 = &PTR_FUN_0027b6c0;
  }
                    /* WARNING: Could not recover jumptable at 0x001f14fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


