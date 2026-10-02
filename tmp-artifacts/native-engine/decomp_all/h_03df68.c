// entry=0x3df68

void FUN_0013df68(long param_1)

{
  ulong uVar1;
  undefined **ppuVar2;
  ulong uVar3;
  ulong uVar4;
  
  uVar3 = *(ulong *)(param_1 + 8);
  uVar4 = *(ulong *)(param_1 + 0x10);
  uVar1 = uVar4 - 0x10015;
  if ((long)(uVar4 - 0x10015) <=
      (long)((-DAT_00279e88 | 0x1e48da829620afb5U) + (-DAT_00279e88 & 0x1e48da829620afb5U))) {
    uVar1 = (-DAT_00279e88 | 0x1e48da829620afb5U) * 2 - (-DAT_00279e88 ^ 0x1e48da829620afb5U);
  }
  ppuVar2 = &PTR_LAB_002783a0;
  if ((uVar3 - 0x16 | uVar4) * 2 - (uVar3 - 0x16 ^ uVar4) <= (uVar1 | uVar3) + (uVar1 & uVar3)) {
    ppuVar2 = &PTR_LAB_00276610 +
              (int)((-(int)DAT_00279e88 ^ 0x9620afccU) + (-(int)DAT_00279e88 & 0x9620afccU) * 2);
  }
                    /* WARNING: Could not recover jumptable at 0x0013e04c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)(0);
  return;
}


