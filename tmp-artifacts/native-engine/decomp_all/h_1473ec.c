// entry=0x1473ec

void H1473ec(long param_1,long param_2)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  int iVar3;
  int *in_x9;
  ulong uVar4;
  ulong in_x10;
  long *in_x11;
  ulong unaff_x25;
  
  uVar4 = (*in_x11 - (in_x10 ^ 0xffffffffffffffff)) - 1;
  if (uVar4 <= unaff_x25) {
    uVar4 = unaff_x25;
  }
  if (in_x9 <= (int *)(param_1 + 0x38U)) {
    ppuVar1 = &PTR_LAB_0027f438;
    if ((param_2 != 0 || uVar4 != 0) && (param_2 == 0) == (uVar4 == 0)) {
      ppuVar1 = &PTR_LAB_0027eed8;
    }
                    /* WARNING: Could not recover jumptable at 0x002457cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  iVar3 = *(int *)(param_1 + 0x38U);
  ppuVar1 = &PTR_LAB_00277d38;
  if (iVar3 != 2) {
    ppuVar1 = &PTR_LAB_00274478;
  }
  ppuVar2 = &PTR_LAB_00282d60;
  if (iVar3 != (-(int)DAT_00279b20 | 0x333596afU) + (-(int)DAT_00279b20 & 0x333596afU)) {
    ppuVar2 = ppuVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x002459d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)(param_2);
  return;
}


