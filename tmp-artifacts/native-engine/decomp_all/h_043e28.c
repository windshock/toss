// entry=0x43e28

uint FUN_00143e28(ulong param_1,byte *param_2,ulong param_3,undefined1 *param_4,int param_5,
                 uint param_6,int param_7)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  uint uVar8;
  ulong uVar9;
  ulong uVar10;
  uint uVar11;
  ulong uVar12;
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  int iVar15;
  ulong uVar16;
  uint uVar17;
  ulong uVar18;
  uint uVar19;
  uint uVar20;
  ulong uVar21;
  ulong uVar22;
  byte *pbVar23;
  undefined1 auVar24 [16];
  ushort uVar25;
  ushort uVar26;
  ushort uVar27;
  ushort uVar28;
  short sVar29;
  short sVar30;
  short sVar31;
  short sVar32;
  int iVar33;
  int iVar34;
  int iVar35;
  int iVar36;
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  int iVar43;
  int iVar44;
  int iVar45;
  int iVar46;
  byte bVar48;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  undefined8 uVar47;
  byte bVar54;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  undefined8 uVar55;
  byte bVar62;
  
  if (((ulong)param_2 & 0xf) != 0) {
    *param_4 = 1;
    return 0;
  }
  uVar18 = param_1 >> 0x10 & 0xffff;
  uVar21 = (ulong)((uint)param_1 & 0xffff);
  uVar22 = param_3 >> 5;
  param_3 = param_3 & 0x1f;
  iVar15 = (int)DAT_00274af8;
  if (uVar22 != 0) {
    do {
      uVar10 = uVar22;
      if (0xac < uVar22) {
        uVar10 = 0xad;
      }
      iVar33 = 0;
      iVar34 = 0;
      iVar35 = 0;
      iVar36 = (int)uVar21 * (int)uVar10;
      uVar25 = 0;
      uVar26 = 0;
      uVar27 = 0;
      uVar28 = 0;
      sVar29 = 0;
      sVar30 = 0;
      sVar31 = 0;
      sVar32 = 0;
      iVar43 = 0;
      iVar44 = 0;
      iVar45 = 0;
      iVar46 = 0;
      uVar16 = uVar10 & 0xffffffff;
      pbVar23 = param_2;
      auVar38 = ZEXT816(0);
      auVar42 = ZEXT816(0);
      auVar40 = ZEXT816(0);
      do {
        uVar55 = *(undefined8 *)(pbVar23 + 8);
        uVar47 = *(undefined8 *)pbVar23;
        iVar33 = iVar33 + iVar43;
        iVar34 = iVar34 + iVar44;
        iVar35 = iVar35 + iVar45;
        iVar36 = iVar36 + iVar46;
        uVar19 = (int)uVar16 - 1;
        uVar16 = (ulong)uVar19;
        bVar48 = (byte)((ulong)uVar47 >> 8);
        bVar49 = (byte)((ulong)uVar47 >> 0x10);
        bVar50 = (byte)((ulong)uVar47 >> 0x18);
        bVar51 = (byte)((ulong)uVar47 >> 0x20);
        bVar52 = (byte)((ulong)uVar47 >> 0x28);
        bVar53 = (byte)((ulong)uVar47 >> 0x30);
        bVar54 = (byte)((ulong)uVar47 >> 0x38);
        bVar56 = (byte)((ulong)uVar55 >> 8);
        bVar57 = (byte)((ulong)uVar55 >> 0x10);
        bVar58 = (byte)((ulong)uVar55 >> 0x18);
        bVar59 = (byte)((ulong)uVar55 >> 0x20);
        bVar60 = (byte)((ulong)uVar55 >> 0x28);
        bVar61 = (byte)((ulong)uVar55 >> 0x30);
        bVar62 = (byte)((ulong)uVar55 >> 0x38);
        auVar39._0_2_ = auVar40._0_2_ + (ushort)(byte)uVar47;
        auVar39._2_2_ = auVar40._2_2_ + (ushort)bVar48;
        auVar39._4_2_ = auVar40._4_2_ + (ushort)bVar49;
        auVar39._6_2_ = auVar40._6_2_ + (ushort)bVar50;
        auVar39._8_2_ = auVar40._8_2_ + (ushort)bVar51;
        auVar39._10_2_ = auVar40._10_2_ + (ushort)bVar52;
        auVar39._12_2_ = auVar40._12_2_ + (ushort)bVar53;
        auVar39._14_2_ = auVar40._14_2_ + (ushort)bVar54;
        auVar37._0_2_ = auVar42._0_2_ + (ushort)(byte)uVar55;
        auVar37._2_2_ = auVar42._2_2_ + (ushort)bVar56;
        auVar37._4_2_ = auVar42._4_2_ + (ushort)bVar57;
        auVar37._6_2_ = auVar42._6_2_ + (ushort)bVar58;
        auVar37._8_2_ = auVar42._8_2_ + (ushort)bVar59;
        auVar37._10_2_ = auVar42._10_2_ + (ushort)bVar60;
        auVar37._12_2_ = auVar42._12_2_ + (ushort)bVar61;
        auVar37._14_2_ = auVar42._14_2_ + (ushort)bVar62;
        uVar25 = uVar25 + pbVar23[0x10];
        uVar26 = uVar26 + pbVar23[0x11];
        uVar27 = uVar27 + pbVar23[0x12];
        uVar28 = uVar28 + pbVar23[0x13];
        sVar29 = sVar29 + (ushort)pbVar23[0x14];
        sVar30 = sVar30 + (ushort)pbVar23[0x15];
        sVar31 = sVar31 + (ushort)pbVar23[0x16];
        sVar32 = sVar32 + (ushort)pbVar23[0x17];
        auVar24._0_2_ = auVar38._0_2_ + (ushort)pbVar23[0x18];
        auVar24._2_2_ = auVar38._2_2_ + (ushort)pbVar23[0x19];
        auVar24._4_2_ = auVar38._4_2_ + (ushort)pbVar23[0x1a];
        auVar24._6_2_ = auVar38._6_2_ + (ushort)pbVar23[0x1b];
        auVar24._8_2_ = auVar38._8_2_ + (ushort)pbVar23[0x1c];
        auVar24._10_2_ = auVar38._10_2_ + (ushort)pbVar23[0x1d];
        auVar24._12_2_ = auVar38._12_2_ + (ushort)pbVar23[0x1e];
        auVar24._14_2_ = auVar38._14_2_ + (ushort)pbVar23[0x1f];
        iVar43 = iVar43 + (uint)(ushort)((ushort)pbVar23[0x10] + (ushort)pbVar23[0x11] +
                                        (ushort)(byte)uVar47 + (ushort)bVar48) +
                          (uint)(ushort)((ushort)pbVar23[0x12] + (ushort)pbVar23[0x13] +
                                        (ushort)bVar49 + (ushort)bVar50);
        iVar44 = iVar44 + (uint)(ushort)((ushort)pbVar23[0x14] + (ushort)pbVar23[0x15] +
                                        (ushort)bVar51 + (ushort)bVar52) +
                          (uint)(ushort)((ushort)pbVar23[0x16] + (ushort)pbVar23[0x17] +
                                        (ushort)bVar53 + (ushort)bVar54);
        iVar45 = iVar45 + (uint)(ushort)((ushort)pbVar23[0x18] + (ushort)pbVar23[0x19] +
                                        (ushort)(byte)uVar55 + (ushort)bVar56) +
                          (uint)(ushort)((ushort)pbVar23[0x1a] + (ushort)pbVar23[0x1b] +
                                        (ushort)bVar57 + (ushort)bVar58);
        iVar46 = iVar46 + (uint)(ushort)((ushort)pbVar23[0x1c] + (ushort)pbVar23[0x1d] +
                                        (ushort)bVar59 + (ushort)bVar60) +
                          (uint)(ushort)((ushort)pbVar23[0x1e] + (ushort)pbVar23[0x1f] +
                                        (ushort)bVar61 + (ushort)bVar62);
        pbVar23 = pbVar23 + 0x20;
        auVar38 = auVar24;
        auVar42 = auVar37;
        auVar40 = auVar39;
      } while (uVar19 != 0);
      auVar40 = NEON_ext(auVar39,auVar39,8,1);
      auVar41 = NEON_ext(auVar37,auVar37,8,1);
      auVar38._2_2_ = uVar26;
      auVar38._0_2_ = uVar25;
      auVar38._4_2_ = uVar27;
      auVar38._6_2_ = uVar28;
      auVar38._8_2_ = sVar29;
      auVar38._10_2_ = sVar30;
      auVar38._12_2_ = sVar31;
      auVar38._14_2_ = sVar32;
      auVar42._2_2_ = uVar26;
      auVar42._0_2_ = uVar25;
      auVar42._4_2_ = uVar27;
      auVar42._6_2_ = uVar28;
      auVar42._8_2_ = sVar29;
      auVar42._10_2_ = sVar30;
      auVar42._12_2_ = sVar31;
      auVar42._14_2_ = sVar32;
      auVar38 = NEON_ext(auVar38,auVar42,8,1);
      uVar16 = uVar10 * 0x20 + 0x1fffffffe0 & 0x1fffffffe0;
      auVar42 = NEON_ext(auVar24,auVar24,8,1);
      iVar33 = iVar33 * 0x20 + (uint)auVar39._0_2_ * 0x20 + (uint)auVar40._0_2_ * 0x1c +
               (uint)auVar37._0_2_ * 0x18 + (uint)auVar41._0_2_ * 0x14 + (uint)uVar25 * 0x10 +
               (uint)auVar38._0_2_ * 0xc + (uint)auVar24._0_2_ * 8 + (uint)auVar42._0_2_ * 4;
      iVar34 = iVar34 * 0x20 + (uint)auVar39._2_2_ * 0x1f + (uint)auVar40._2_2_ * 0x1b +
               (uint)auVar37._2_2_ * 0x17 + (uint)auVar41._2_2_ * 0x13 + (uint)uVar26 * 0xf +
               (uint)auVar38._2_2_ * 0xb + (uint)auVar24._2_2_ * 7 + (uint)auVar42._2_2_ * 3;
      iVar35 = iVar35 * 0x20 + (uint)auVar39._4_2_ * 0x1e + (uint)auVar40._4_2_ * 0x1a +
               (uint)auVar37._4_2_ * 0x16 + (uint)auVar41._4_2_ * 0x12 + (uint)uVar27 * 0xe +
               (uint)auVar38._4_2_ * 10 + (uint)auVar24._4_2_ * 6 + (uint)auVar42._4_2_ * 2;
      iVar36 = iVar36 * 0x20 + (uint)auVar39._6_2_ * 0x1d + (uint)auVar40._6_2_ * 0x19 +
               (uint)auVar37._6_2_ * 0x15 + (uint)auVar41._6_2_ * 0x11 + (uint)uVar28 * 0xd +
               (uint)auVar38._6_2_ * 9 + (uint)auVar24._6_2_ * 5 + (uint)auVar42._6_2_;
      auVar13._4_4_ = iVar44;
      auVar13._0_4_ = iVar43;
      auVar13._8_4_ = iVar45;
      auVar13._12_4_ = iVar46;
      auVar14._4_4_ = iVar44;
      auVar14._0_4_ = iVar43;
      auVar14._8_4_ = iVar45;
      auVar14._12_4_ = iVar46;
      auVar42 = NEON_ext(auVar13,auVar14,8,1);
      auVar40._4_4_ = iVar34;
      auVar40._0_4_ = iVar33;
      auVar40._8_4_ = iVar35;
      auVar40._12_4_ = iVar36;
      auVar41._4_4_ = iVar34;
      auVar41._0_4_ = iVar33;
      auVar41._8_4_ = iVar35;
      auVar41._12_4_ = iVar36;
      auVar38 = NEON_ext(auVar40,auVar41,8,1);
      uVar20 = 0x50e48f5d - iVar15;
      uVar19 = iVar43 + iVar44 + auVar42._0_4_ + auVar42._4_4_ + (int)uVar21;
      uVar17 = 0;
      if (uVar20 != 0) {
        uVar17 = uVar19 / uVar20;
      }
      uVar9 = (-DAT_00274af8 ^ 0x85d7445150e48f5dU) + (-DAT_00274af8 & 0x85d7445150e48f5dU) * 2;
      uVar21 = (ulong)((param_5 + -1) * (uint)param_2[uVar16 + 0x1f]) + (ulong)uVar19;
      uVar12 = 0;
      if (uVar9 != 0) {
        uVar12 = uVar21 / uVar9;
      }
      uVar21 = uVar21 - uVar12 * uVar9;
      uVar22 = uVar22 - uVar10;
      uVar11 = 0x50e48f5d - iVar15;
      uVar19 = iVar33 + iVar34 + auVar38._0_4_ + auVar38._4_4_ + (int)uVar18 +
               (uVar17 * uVar20 - uVar19);
      uVar20 = 0;
      if (uVar11 != 0) {
        uVar20 = uVar19 / uVar11;
      }
      uVar18 = (ulong)(uint)((int)uVar21 * param_7) +
               (ulong)(uVar19 - uVar20 * uVar11) * (ulong)param_6;
      uVar10 = (-DAT_00274af8 | 0x85d7445150e48f5dU) + (-DAT_00274af8 & 0x85d7445150e48f5dU);
      uVar9 = 0;
      if (uVar10 != 0) {
        uVar9 = uVar18 / uVar10;
      }
      param_2 = param_2 + uVar16 + 0x20;
      uVar18 = uVar18 - uVar9 * uVar10;
    } while (uVar22 != 0);
  }
  uVar19 = (uint)uVar21;
  iVar36 = (int)uVar18;
  if (param_3 == 0) goto LAB_00144194;
  uVar22 = param_3;
  pbVar23 = param_2;
  if (param_3 < 0x10) {
LAB_001440e8:
    do {
      param_3 = param_3 - 1;
      uVar20 = (int)uVar21 + (uint)*param_2;
      uVar21 = (ulong)uVar20;
      uVar17 = uVar20 + (int)uVar18;
      uVar18 = (ulong)uVar17;
      param_2 = param_2 + 1;
    } while (param_3 != 0);
    param_2 = pbVar23 + uVar22;
  }
  else {
    bVar48 = *param_2;
    param_3 = param_3 - 0x10;
    iVar33 = uVar19 + bVar48 + (uint)param_2[1];
    iVar34 = iVar33 + (uint)param_2[2];
    iVar35 = iVar34 + (uint)param_2[3];
    iVar43 = iVar35 + (uint)param_2[4];
    iVar44 = iVar43 + (uint)param_2[5];
    iVar45 = iVar44 + (uint)param_2[6];
    iVar46 = iVar45 + (uint)param_2[7];
    iVar1 = iVar46 + (uint)param_2[8];
    iVar2 = iVar1 + (uint)param_2[9];
    iVar3 = iVar2 + (uint)param_2[10];
    iVar4 = iVar3 + (uint)param_2[0xb];
    iVar5 = iVar4 + (uint)param_2[0xc];
    iVar6 = iVar5 + (uint)param_2[0xd];
    iVar7 = iVar6 + (uint)param_2[0xe];
    uVar20 = iVar7 + (uint)param_2[0xf];
    uVar21 = (ulong)uVar20;
    param_2 = param_2 + 0x10;
    uVar17 = uVar19 + bVar48 + iVar36 + iVar33 + iVar34 + iVar35 + iVar43 + iVar44 + iVar45 + iVar46
             + iVar1 + iVar2 + iVar3 + iVar4 + iVar5 + iVar6 + iVar7 + uVar20;
    uVar18 = (ulong)uVar17;
    uVar22 = param_3;
    pbVar23 = param_2;
    if (param_3 != 0) goto LAB_001440e8;
  }
  uVar19 = (-iVar15 | 0x50e48f5dU) + (-iVar15 & 0x50e48f5dU);
  uVar21 = (ulong)((param_5 + -1) * (uint)param_2[-1]) + (ulong)uVar20;
  uVar11 = 0;
  if (uVar19 != 0) {
    uVar11 = uVar20 / uVar19;
  }
  uVar18 = (-DAT_00274af8 | 0x85d7445150e48f5dU) * 2 - (-DAT_00274af8 ^ 0x85d7445150e48f5dU);
  uVar8 = (-iVar15 ^ 0x50e48f5dU) + (-iVar15 & 0x50e48f5dU) * 2;
  iVar15 = 0;
  if (uVar18 != 0) {
    iVar15 = (int)(uVar21 / uVar18);
  }
  uVar17 = uVar17 + (uVar11 * uVar19 - uVar20);
  uVar19 = (int)uVar21 - iVar15 * (int)uVar18;
  uVar20 = 0;
  if (uVar8 != 0) {
    uVar20 = uVar17 / uVar8;
  }
  uVar18 = (ulong)(uVar19 * param_7) + (ulong)(uVar17 - uVar20 * uVar8) * (ulong)param_6;
  uVar21 = (-DAT_00274af8 ^ 0x85d7445150e48f5dU) + (-DAT_00274af8 & 0x85d7445150e48f5dU) * 2;
  iVar15 = 0;
  if (uVar21 != 0) {
    iVar15 = (int)(uVar18 / uVar21);
  }
  iVar36 = (int)uVar18 - iVar15 * (int)uVar21;
LAB_00144194:
  return uVar19 | iVar36 << 0x10;
}


