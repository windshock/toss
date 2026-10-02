// entry=0x1673e4

void H1673e4(void)

{
  byte *pbVar1;
  byte bVar2;
  byte bVar3;
  uint uVar4;
  long lVar5;
  int iVar6;
  uint uVar7;
  int iVar8;
  uint unaff_w21;
  long unaff_x22;
  ulong unaff_x29;
  
  do {
    uVar7 = (*(code *)PTR_FUN_00283940)();
    pbVar1 = &DAT_00283640 +
             (unaff_x22 << ((-(ulong)uVar7 | 0x360e) + (-(ulong)uVar7 & 0x360e) & 0x3f));
    bVar2 = *pbVar1;
    lVar5 = (*(code *)PTR_FUN_00283940)();
    bVar3 = pbVar1[(-lVar5 | 0x990ce53f5de4360dU) + (-lVar5 & 0x990ce53f5de4360dU)];
    iVar8 = (*(code *)PTR_FUN_00283940)();
    uVar7 = (uint)bVar3 << (ulong)((-iVar8 ^ 0x3614U) + (-iVar8 & 0x3614U) * 2 & 0x1f);
    uVar4 = uVar7 & bVar2 | uVar7 ^ bVar2;
    lVar5 = (*(code *)PTR_FUN_00283940)();
    bVar2 = pbVar1[(-lVar5 ^ 0x990ce53f5de4360eU) + (-lVar5 & 0x990ce53f5de4360eU) * 2];
    iVar8 = (*(code *)PTR_FUN_00283940)();
    uVar7 = (uint)bVar2 << (ulong)((-iVar8 | 0x361cU) + (-iVar8 & 0x361cU) & 0x1f);
    uVar4 = uVar4 & uVar7 | uVar4 ^ uVar7;
    lVar5 = (*(code *)PTR_FUN_00283940)();
    bVar2 = pbVar1[(-lVar5 | 0x990ce53f5de4360fU) + (-lVar5 & 0x990ce53f5de4360fU)];
    iVar8 = (*(code *)PTR_FUN_00283940)();
    uVar7 = (uint)bVar2 << (ulong)((-iVar8 | 0x3624U) + (-iVar8 & 0x3624U) & 0x1f);
    iVar8 = (*(code *)PTR_FUN_00283940)();
    uVar4 = (uVar4 & uVar7 | uVar4 ^ uVar7) * ((-iVar8 ^ 0xb9b61fa1U) + (-iVar8 & 0xb9b61fa1U) * 2);
    iVar8 = (*(code *)PTR_FUN_00283940)();
    uVar7 = uVar4 >> (ulong)((-iVar8 | 0x3624U) * 2 - (-iVar8 ^ 0x3624U) & 0x1f);
    iVar8 = (*(code *)PTR_FUN_00283940)();
    uVar7 = ((uVar7 | uVar4) & (uVar7 & uVar4 ^ 0xffffffff)) *
            ((-iVar8 | 0xb9b61fa1U) + (-iVar8 & 0xb9b61fa1U));
    iVar8 = (*(code *)PTR_FUN_00283940)();
    uVar4 = unaff_w21 * ((-iVar8 ^ 0xb9b61fa1U) + (-iVar8 & 0xb9b61fa1U) * 2);
    unaff_w21 = (uVar7 | uVar4) & (uVar7 & uVar4 ^ 0xffffffff);
    lVar5 = (*(code *)PTR_FUN_00283940)();
    unaff_x22 = (unaff_x22 -
                (0x990ce53f5de4360c - (-lVar5 ^ 0xffffffffffffffffU) ^ 0xffffffffffffffff)) + -1;
    lVar5 = (*(code *)PTR_FUN_00283940)();
  } while (unaff_x22 != -0x66f31ac0a21bc9ef - (-lVar5 ^ 0xffffffffffffffffU));
  iVar8 = (*(code *)PTR_FUN_00283940)();
  iVar6 = (*(code *)PTR_FUN_00283940)();
  uVar4 = 0x5de4360b - (-iVar6 ^ 0xffffffffU) >>
          (ulong)((-iVar8 | 0x3624U) * 2 - (-iVar8 ^ 0x3624U) & 0x1f);
  iVar8 = (*(code *)PTR_FUN_00283940)();
  uVar7 = (-iVar8 ^ 0x5de4360cU) + (-iVar8 & 0x5de4360cU) * 2;
  iVar8 = (*(code *)PTR_FUN_00283940)();
  uVar7 = ((uVar4 ^ 0xffffffff) & uVar7 | uVar4 & (uVar7 ^ 0xffffffff)) *
          ((-iVar8 ^ 0xb9b61fa1U) + (-iVar8 & 0xb9b61fa1U) * 2);
  iVar8 = (*(code *)PTR_FUN_00283940)();
  uVar4 = unaff_w21 * (-0x4649e060 - (-iVar8 ^ 0xffffffffU));
  iVar8 = (*(code *)PTR_FUN_00283940)();
  uVar7 = ((uVar7 ^ 0xffffffff) & uVar4 | uVar7 & (uVar4 ^ 0xffffffff)) *
          ((-iVar8 | 0xb9b61fa1U) * 2 - (-iVar8 ^ 0xb9b61fa1U));
  iVar8 = (*(code *)PTR_FUN_00283940)();
  uVar4 = 0xb6b4d3aa - (-iVar8 ^ 0xffffffffU);
  uVar4 = (uVar7 ^ 0xffffffff) & uVar4 | uVar7 & (uVar4 ^ 0xffffffff);
  iVar8 = (*(code *)PTR_FUN_00283940)();
  uVar7 = uVar4 >> (ulong)((-iVar8 ^ 0x3619U) + (-iVar8 & 0x3619U) * 2 & 0x1f);
  iVar8 = (*(code *)PTR_FUN_00283940)();
  uVar4 = ((uVar7 ^ 0xffffffff) & uVar4 | uVar7 & (uVar4 ^ 0xffffffff)) *
          ((-iVar8 | 0xb9b61fa1U) + (-iVar8 & 0xb9b61fa1U));
  iVar8 = (*(code *)PTR_FUN_00283940)();
  uVar7 = uVar4 >> (ulong)((-iVar8 | 0x361bU) + (-iVar8 & 0x361bU) & 0x1f);
  if (((uVar7 | uVar4) & (uVar7 & uVar4 ^ 0xffffffff)) == 0x6e4939cc) {
                    /* WARNING: Could not recover jumptable at 0x00260510. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*DAT_0027dcd0)(0);
    return;
  }
  *(undefined8 *)((unaff_x29 | 8) + (unaff_x29 & 8)) = 0x20;
                    /* WARNING: Could not recover jumptable at 0x0026af50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00282140)();
  return;
}


