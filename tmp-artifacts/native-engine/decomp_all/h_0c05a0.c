// entry=0xc05a0

void Hc05a0(undefined8 param_1,ushort param_2)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  ushort uVar6;
  ushort uVar7;
  int in_w8;
  int in_w9;
  int iVar8;
  uint in_w14;
  
  iVar8 = (int)DAT_00274ad8;
  uVar2 = in_w14 >> (ulong)((-iVar8 | 0x6d08U) + (-iVar8 & 0x6d08U) & 0x1f);
  uVar3 = ((uVar2 ^ 0xffffffff) & in_w14 | uVar2 & (in_w14 ^ 0xffffffff)) *
          ((-iVar8 ^ 0x7fb85685U) + (-iVar8 & 0x7fb85685U) * 2);
  uVar4 = in_w9 * ((-iVar8 ^ 0x7fb85685U) + (-iVar8 & 0x7fb85685U) * 2);
  uVar5 = in_w8 * ((-iVar8 | 0x7fb85685U) + (-iVar8 & 0x7fb85685U));
  uVar2 = uVar5 >> (ulong)((-iVar8 | 0x6d08U) * 2 - (-iVar8 ^ 0x6d08U) & 0x1f);
  uVar2 = ((uVar2 | uVar5) & (uVar2 & uVar5 ^ 0xffffffff)) * (0x7fb85684 - (-iVar8 ^ 0xffffffffU));
  uVar3 = ((uVar3 ^ 0xffffffff) & uVar4 | uVar3 & (uVar4 ^ 0xffffffff)) *
          ((-iVar8 ^ 0x7fb85685U) + (-iVar8 & 0x7fb85685U) * 2);
  uVar2 = (uVar3 | uVar2) & (uVar3 & uVar2 ^ 0xffffffff);
  uVar3 = uVar2 >> (ulong)((-iVar8 | 0x6cfdU) + (-iVar8 & 0x6cfdU) & 0x1f);
  uVar2 = ((uVar3 ^ 0xffffffff) & uVar2 | uVar3 & (uVar2 ^ 0xffffffff)) *
          ((-iVar8 | 0x7fb85685U) * 2 - (-iVar8 ^ 0x7fb85685U));
  uVar6 = (ushort)(uVar2 >> (ulong)((-iVar8 | 0x6cffU) + (-iVar8 & 0x6cffU) & 0x1f));
  uVar7 = (ushort)uVar2;
  ppuVar1 = &PTR_LAB_00283018;
  if ((ushort)((uVar6 | uVar7) & (uVar6 & uVar7 ^ 0xffff)) != param_2) {
    ppuVar1 = &PTR_thunk_FUN_001bf87c_002806f0;
  }
                    /* WARNING: Could not recover jumptable at 0x001c075c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


