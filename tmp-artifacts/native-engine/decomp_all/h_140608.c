// entry=0x140608

void H140608(void)

{
  ulong uVar1;
  uint uVar2;
  int iVar3;
  ulong uVar4;
  byte *pbVar5;
  
  iVar3 = -0x4fc8df9f - (-(int)DAT_00279eb0 ^ 0xffffffffU);
  uVar4 = 0x3f63e72908692045 - (-DAT_00279eb0 ^ 0xffffffffffffffffU);
  if (((DAT_00280f70 ^ 0xfffffffe) & DAT_00280f70) == 1) {
    DAT_002862e4 = 0;
                    /* WARNING: Could not recover jumptable at 0x0023c5fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00275738)();
    return;
  }
  pbVar5 = &DAT_00281003;
  do {
    uVar2 = -(int)DAT_00279eb0;
    uVar2 = iVar3 * ((uVar2 ^ 0x86a2085) + (uVar2 & 0x86a2085) * 2);
    iVar3 = (uVar2 | *pbVar5) * 2 - (uVar2 ^ *pbVar5);
    uVar1 = (-DAT_00279eb0 | 0x3f63e72908692047U) + (-DAT_00279eb0 & 0x3f63e72908692047U);
    uVar4 = (uVar4 ^ uVar1) + (uVar4 & uVar1) * 2;
    pbVar5 = pbVar5 + (-DAT_00279eb0 | 0x3f63e72908692047U) + (-DAT_00279eb0 & 0x3f63e72908692047U);
  } while (uVar4 != (-DAT_00279eb0 ^ 0x3f63e72908692058U) +
                    (-DAT_00279eb0 & 0x3f63e72908692058U) * 2);
                    /* WARNING: Could not recover jumptable at 0x0023fac0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00283280)(iVar3);
  return;
}


