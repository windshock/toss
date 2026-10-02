// entry=0x14fa74

void H14e0c8(void)

{
  undefined **ppuVar1;
  byte bVar2;
  uint uVar3;
  uint uVar4;
  ulong in_x7;
  byte *pbVar5;
  long lVar6;
  byte *pbVar7;
  int iVar8;
  undefined8 in_x12;
  long unaff_x19;
  long unaff_x22;
  long unaff_x26;
  uint unaff_w27;
  
  *(undefined8 *)(unaff_x19 + 0x248) = in_x12;
  *(undefined8 *)(unaff_x19 + 0x168) = 0;
  *(undefined8 *)(unaff_x19 + 0x220) = 0;
  *(undefined8 *)(unaff_x19 + 0x218) = 0;
  lVar6 = *(long *)(unaff_x22 + 0x260);
  *(ulong *)(unaff_x19 + 0x210) =
       *(long *)(unaff_x19 + 0x2b8) +
       ((in_x7 | -*(long *)(unaff_x22 + 0x260)) * 2 - (in_x7 ^ -*(long *)(unaff_x22 + 0x260))) *
       0x5c;
  lVar6 = (in_x7 | -lVar6) + (in_x7 & -lVar6);
  uVar4 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
  uVar3 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
  uVar4 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((unaff_w27 | uVar4) + (unaff_w27 & uVar4)) * 300 +
                     (long)(int)((unaff_w27 + 0x1d ^ uVar3) + (unaff_w27 + 0x1d & uVar3) * 2)])
                    (*(undefined8 *)(unaff_x19 + 0x278),*(long *)(unaff_x19 + 0x2d0) + lVar6,
                     (-lVar6 | 0x800U) + (-lVar6 & 0x800U));
  if (0 < (int)uVar4) {
    lVar6 = lVar6 + ((long)((ulong)uVar4 << 0x20) >>
                    ((unaff_x26 + 0x1fU | -*(long *)(unaff_x22 + 0x260)) * 2 -
                     (unaff_x26 + 0x1fU ^ -*(long *)(unaff_x22 + 0x260)) & 0x3f));
  }
  pbVar7 = *(byte **)(unaff_x19 + 0x270);
  if (lVar6 == 0) {
    if (*(long *)(unaff_x19 + 0x220) != *(long *)(unaff_x19 + 0x218)) {
      uVar4 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
      (*(code *)(&PTR_FUN_0027c1e0)
                [(long)(int)((uVar4 ^ 0x143a5e89) + (uVar4 & 0x143a5e89) * 2) * 300 +
                 (long)(0x143a5f76 - (int)*(undefined8 *)(unaff_x22 + 0x260))])(2);
      ppuVar1 = (undefined **)&DAT_002816e8;
      if (**(long **)(unaff_x19 + 0x2d8) != 0) {
        ppuVar1 = &PTR_LAB_00276128;
      }
                    /* WARNING: Could not recover jumptable at 0x00250c64. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar1)();
      return;
    }
    ppuVar1 = (undefined **)&DAT_002816e8;
    if (**(long **)(unaff_x19 + 0x2d8) != 0) {
      ppuVar1 = &PTR_LAB_00276128;
    }
                    /* WARNING: Could not recover jumptable at 0x00250d00. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(0x8032e68a143a5e89,*(undefined8 *)(unaff_x19 + 0x250));
    return;
  }
  bVar2 = *pbVar7;
  if (bVar2 != 0) {
    *(undefined8 *)(unaff_x19 + 0x160) = 0;
    ppuVar1 = &PTR_LAB_00280e80;
    if (0x2f < bVar2) {
      ppuVar1 = &PTR_LAB_00280a60;
    }
                    /* WARNING: Could not recover jumptable at 0x0024e294. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(pbVar7 + (unaff_x26 - *(long *)(unaff_x22 + 0x260)));
    return;
  }
  *(undefined8 *)(unaff_x19 + 0x160) = 0;
  bVar2 = pbVar7[2];
  *(undefined8 *)(unaff_x19 + 0x158) = 0;
  if (bVar2 == 0x20) {
    pbVar7 = pbVar7 + 1;
    do {
      pbVar5 = pbVar7 + 1;
      bVar2 = *pbVar7;
      iVar8 = (int)*(undefined8 *)(unaff_x22 + 0x260);
      pbVar7 = pbVar5;
    } while ((uint)bVar2 != ((iVar8 * -2 | 0x52U) - (-iVar8 ^ 0xa9U) & 0xff));
    if (*pbVar5 == 0x20) {
      do {
        pbVar5 = pbVar5 + 1;
        uVar4 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
      } while ((uint)*pbVar5 == ((uVar4 ^ 0xa9) + (uVar4 & 0x29) * 2 & 0xff));
    }
    ppuVar1 = &PTR_LAB_00277950;
    if (pbVar5[1] != 0x20) {
      ppuVar1 = &PTR_LAB_0027bef8;
    }
                    /* WARNING: Could not recover jumptable at 0x0024e67c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(pbVar5 + 2);
    return;
  }
  ppuVar1 = &PTR_LAB_0027bd98;
  if (pbVar7[3] != 0x20) {
    ppuVar1 = &PTR_LAB_0027a228;
  }
                    /* WARNING: Could not recover jumptable at 0x0024e550. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


