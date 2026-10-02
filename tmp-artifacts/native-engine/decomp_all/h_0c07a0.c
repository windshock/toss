// entry=0xc07a0

void Hc07a0(ushort param_1,ushort param_2)

{
  uint uVar1;
  undefined **ppuVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  ushort uVar6;
  ushort uVar7;
  int iVar8;
  
  iVar8 = (int)DAT_00274ad8;
  if ((-iVar8 | 0x23e66cf3U) * 2 - (-iVar8 ^ 0x23e66cf3U) < (uint)param_1) {
                    /* WARNING: Could not recover jumptable at 0x001bfa50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027a2b0)();
    return;
  }
  uVar1 = (-iVar8 ^ 0x23e66cf0U) + (-iVar8 & 0x23e66cf0U) * 2;
  if (param_1 == 1) {
                    /* WARNING: Could not recover jumptable at 0x001bef94. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_Hc05a0_0027fe68)();
    return;
  }
  if (param_1 == 2) {
                    /* WARNING: Could not recover jumptable at 0x001bf3b0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00278218)();
    return;
  }
  if (param_1 != 3) {
    uVar3 = uVar1 >> (ulong)((-iVar8 | 0x6d08U) + (-iVar8 & 0x6d08U) & 0x1f);
    uVar3 = ((uVar3 ^ 0xffffffff) & uVar1 | uVar3 & (uVar1 ^ 0xffffffff)) *
            ((-iVar8 ^ 0x7fb85685U) + (-iVar8 & 0x7fb85685U) * 2);
    uVar4 = (-0x2e7e024f - (-iVar8 ^ 0xffffffffU)) *
            ((-iVar8 ^ 0x7fb85685U) + (-iVar8 & 0x7fb85685U) * 2);
    uVar5 = (uint)param_1 * ((-iVar8 | 0x7fb85685U) + (-iVar8 & 0x7fb85685U));
    uVar1 = uVar5 >> (ulong)((-iVar8 | 0x6d08U) * 2 - (-iVar8 ^ 0x6d08U) & 0x1f);
    uVar1 = ((uVar1 | uVar5) & (uVar1 & uVar5 ^ 0xffffffff)) * (0x7fb85684 - (-iVar8 ^ 0xffffffffU))
    ;
    uVar3 = ((uVar3 ^ 0xffffffff) & uVar4 | uVar3 & (uVar4 ^ 0xffffffff)) *
            ((-iVar8 ^ 0x7fb85685U) + (-iVar8 & 0x7fb85685U) * 2);
    uVar1 = (uVar3 | uVar1) & (uVar3 & uVar1 ^ 0xffffffff);
    uVar3 = uVar1 >> (ulong)((-iVar8 | 0x6cfdU) + (-iVar8 & 0x6cfdU) & 0x1f);
    uVar1 = ((uVar3 ^ 0xffffffff) & uVar1 | uVar3 & (uVar1 ^ 0xffffffff)) *
            ((-iVar8 | 0x7fb85685U) * 2 - (-iVar8 ^ 0x7fb85685U));
    uVar6 = (ushort)(uVar1 >> (ulong)((-iVar8 | 0x6cffU) + (-iVar8 & 0x6cffU) & 0x1f));
    uVar7 = (ushort)uVar1;
    ppuVar2 = &PTR_LAB_00283018;
    if ((ushort)((uVar6 | uVar7) & (uVar6 & uVar7 ^ 0xffff)) != param_2) {
      ppuVar2 = &PTR_thunk_FUN_001bf87c_002806f0;
    }
                    /* WARNING: Could not recover jumptable at 0x001c075c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x001bf470. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00285c88)();
  return;
}


