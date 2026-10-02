// entry=0x9f9a0

void H9edfc(void)

{
  int iVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint3 uVar8;
  long lVar9;
  uint in_w13;
  uint in_w14;
  uint uVar10;
  long lVar11;
  long unaff_x19;
  
  uVar4 = (in_w13 >> 2 ^ 0xfffffffc) & in_w13 >> 2;
  lVar11 = 1;
  do {
    uVar10 = (uint)lVar11;
    uVar6 = *(uint *)(&DAT_00281700 + (ulong)(uVar10 - 1) * 4);
    lVar9 = lVar11 * 4;
    uVar7 = *(uint *)(&DAT_00281700 + lVar9);
    uVar2 = (uVar6 >> 5 | in_w14 << 2) & (uVar6 >> 5 & in_w14 << 2 ^ 0xffffffff);
    uVar5 = (uVar6 << 4 ^ 0xffffffff) & in_w14 >> 3 | uVar6 << 4 & (in_w14 >> 3 ^ 0xffffffff);
    uVar2 = (uVar2 ^ uVar5) + (uVar2 & uVar5) * 2;
    uVar5 = (in_w14 | in_w13) & (in_w14 & in_w13 ^ 0xffffffff);
    uVar3 = (uVar10 ^ 0xfffffffc) & uVar10;
    uVar3 = *(uint *)(unaff_x19 + 800 + (ulong)((uVar3 | uVar4) & (uVar3 & uVar4 ^ 0xffffffff)) * 4)
    ;
    uVar3 = (uVar3 ^ 0xffffffff) & uVar6 | uVar3 & (uVar6 ^ 0xffffffff);
    uVar5 = (uVar3 ^ uVar5) + (uVar3 & uVar5) * 2;
    uVar2 = -((uVar5 | uVar2) & (uVar5 & uVar2 ^ 0xffffffff));
    in_w14 = (uVar7 ^ uVar2) + (uVar7 & uVar2) * 2;
    (&DAT_00281700)[lVar9] = (char)in_w14;
    (&DAT_00281701)[lVar9] = (char)(in_w14 >> 8);
    (&DAT_00281702)[lVar9] = (char)(in_w14 >> 0x10);
    (&DAT_00281703)[lVar9] = (char)(in_w14 >> 0x18);
    lVar11 = lVar11 + -1;
  } while (uVar10 - 1 != (-(int)DAT_0027fb18 | 0x56e407c0U) + (-(int)DAT_0027fb18 & 0x56e407c0U));
  uVar8 = CONCAT12(DAT_00281706,CONCAT11(DAT_00281705,DAT_00281704));
  uVar5 = (uint)uVar8;
  uVar2 = (uint)(uVar8 >> 5);
  uVar3 = (uVar2 ^ 0xffffffff) & in_w14 * 4 | uVar2 & (in_w14 * 4 ^ 0xffffffff);
  uVar2 = (uVar5 << 4 | in_w14 >> 3) & (uVar5 << 4 & in_w14 >> 3 ^ 0xffffffff);
  uVar3 = (uVar3 | uVar2) * 2 - (uVar3 ^ uVar2);
  uVar2 = (in_w14 | in_w13) & (in_w14 & in_w13 ^ 0xffffffff);
  uVar4 = *(uint *)(unaff_x19 + 800 + (ulong)uVar4 * 4);
  uVar4 = (uVar4 | uVar5) & (uVar4 & uVar5 ^ 0xffffffff);
  uVar4 = (uVar4 | uVar2) + (uVar4 & uVar2);
  uVar4 = -((uVar4 ^ 0xffffffff) & uVar3 | uVar4 & (uVar3 ^ 0xffffffff));
  iVar1 = (CONCAT11(DAT_00281701,DAT_00281700) | uVar4) +
          (CONCAT11(DAT_00281701,DAT_00281700) & uVar4);
  DAT_00281700 = (undefined1)iVar1;
  DAT_00281701 = (undefined1)((uint)iVar1 >> 8);
                    /* WARNING: Could not recover jumptable at 0x0019bc28. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00274778)();
  return;
}


