// entry=0x11ccc0

/* WARNING: Removing unreachable block (ram,0x0021d5c8) */
/* WARNING: Removing unreachable block (ram,0x00227440) */

void H11ccc0(ulong param_1)

{
  char cVar1;
  undefined **ppuVar2;
  undefined **ppuVar3;
  ushort uVar4;
  ushort uVar5;
  uint uVar6;
  uint uVar7;
  undefined8 uVar8;
  long *plVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  uint uVar16;
  code *pcVar17;
  long lVar18;
  ulong uVar19;
  byte bVar20;
  ulong uVar21;
  int iVar22;
  undefined8 uVar23;
  ulong uVar24;
  uint uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  long unaff_x19;
  uint *puVar29;
  undefined8 uVar30;
  int unaff_w23;
  undefined8 uVar31;
  long lVar32;
  long lVar33;
  ulong unaff_x27;
  long *unaff_x29;
  
  if ((param_1 & 1) == 0) {
    uVar25 = -(int)DAT_00281e58;
    uVar8 = (*(code *)(&PTR_FUN_0027c1e0)
                      [(long)(int)((uVar25 ^ 0xcc88cf42) + (uVar25 & 0xcc88cf42) * 2) * 300 +
                       (long)(int)(-0x33772ffa - (-(int)DAT_00281e58 ^ 0xffffffffU))])(unaff_w23);
    uVar25 = -(int)DAT_00281e58;
    pcVar17 = (code *)(&PTR_FUN_0027c1e0)
                      [(long)(int)((uVar25 | 0xcc88cf42) + (uVar25 & 0xcc88cf42)) * 300 +
                       (long)(int)(-0x33772f9a - (-(int)DAT_00281e58 ^ 0xffffffffU))];
    *(undefined8 *)(unaff_x19 + 0x358) = uVar8;
    lVar33 = (*pcVar17)(uVar8,unaff_w23);
    CallSupervisor(0);
    *(long *)(unaff_x19 + 0x350) = lVar33;
    if (lVar33 == -1) {
      uVar25 = *(uint *)(unaff_x19 + 0x50c);
      uVar26 = *(undefined8 *)(unaff_x19 + 0x500);
      uVar27 = *(undefined8 *)(unaff_x19 + 0x4f8);
      uVar28 = *(undefined8 *)(unaff_x19 + 0x4f0);
      uVar8 = *(undefined8 *)(unaff_x19 + 0x4e8);
      uVar10 = *(undefined8 *)(unaff_x19 + 0x4e0);
      uVar11 = *(undefined8 *)(unaff_x19 + 0x4d8);
      uVar12 = *(undefined8 *)(unaff_x19 + 0x4d0);
      uVar23 = *(undefined8 *)(unaff_x19 + 0x4c8);
      uVar13 = *(undefined8 *)(unaff_x19 + 0x4c0);
      uVar14 = *(undefined8 *)(unaff_x19 + 0x4b8);
      uVar15 = *(undefined8 *)(unaff_x19 + 0x4b0);
      uVar30 = *(undefined8 *)(unaff_x19 + 0x4a8);
      uVar31 = *(undefined8 *)(unaff_x19 + 0x4a0);
    }
    else {
      uVar24 = *(ulong *)(unaff_x19 + 0x350);
      puVar29 = (uint *)((*(ulong *)(uVar24 + 0x28) | uVar24) + (*(ulong *)(uVar24 + 0x28) & uVar24)
                        );
      uVar4 = *(ushort *)(uVar24 + 0x3c);
      *(uint *)(unaff_x19 + 0x230) = (uint)uVar4;
      uVar5 = *(ushort *)(uVar24 + 0x3e);
      *(ulong *)(unaff_x19 + 0x228) = uVar24 + 0x3a;
      uVar19 = (ulong)*(ushort *)(uVar24 + 0x3a) * (ulong)uVar5;
      uVar21 = uVar19 | (ulong)puVar29;
      uVar19 = uVar19 & (ulong)puVar29;
      *(ulong *)(unaff_x19 + 0x218) =
           (*(long *)(uVar21 + uVar19 + 0x18) - (uVar24 ^ 0xffffffffffffffff)) + -1;
      if (uVar4 != 0) {
        *(ulong *)(unaff_x19 + 0x200) = uVar21 + uVar19 + 0x20;
        *(uint *)(unaff_x19 + 0x20c) = 1 - ((uint)DAT_00281e58 & 1 ^ 1);
        *(int *)(unaff_x19 + 0x1c4) =
             (int)(char)(-(char)DAT_00281e58 ^ 0x42) +
             (int)(char)((-(char)DAT_00281e58 & 0x42U) << 1);
        *(undefined4 *)(unaff_x19 + 0x1bc) = 0;
        uVar25 = 0;
        do {
          uVar16 = *puVar29;
          *(ulong *)(unaff_x19 + 0x150) =
               (*(ulong *)(unaff_x19 + 0x218) | (ulong)uVar16) +
               (*(ulong *)(unaff_x19 + 0x218) & (ulong)uVar16);
          if (uVar16 == 0) {
            ppuVar3 = &PTR_LAB_0027b718 + (int)(-0x33773094 - (-(int)DAT_00281e58 ^ 0xffffffffU));
            if (-1 < (int)puVar29[1]) {
              ppuVar3 = &PTR_LAB_0027a198;
            }
                    /* WARNING: Could not recover jumptable at 0x00226bd4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(code *)*ppuVar3)((long)unaff_w23);
            return;
          }
          if ((*(ulong *)(unaff_x19 + 0x218) <= *(ulong *)(unaff_x19 + 0x150)) &&
             (*(ulong *)(unaff_x19 + 0x150) <
              (**(long **)(unaff_x19 + 0x200) - (*(ulong *)(unaff_x19 + 0x218) ^ 0xffffffffffffffff)
              ) - 1)) {
            bVar20 = **(byte **)(unaff_x19 + 0x150);
            if (bVar20 != 0) {
              uVar25 = 0;
              do {
                uVar16 = uVar25 << (ulong)((-(int)DAT_00281e58 | 0xcf47U) * 2 -
                                           (-(int)DAT_00281e58 ^ 0xcf47U) & 0x1f);
                uVar25 = uVar16 & uVar25 >> 0x1b | uVar16 ^ uVar25 >> 0x1b;
                uVar25 = (uVar25 | bVar20) & (uVar25 & bVar20 ^ 0xffffffff);
                bVar20 = *(byte *)(*(long *)(unaff_x19 + 0x150) + 1);
                cVar1 = (char)DAT_00281e58;
                *(long *)(unaff_x19 + 0x150) = *(long *)(unaff_x19 + 0x150) + 1;
              } while (bVar20 != (byte)((-cVar1 | 0x42U) + (-cVar1 & 0x42U)));
              ppuVar3 = &PTR_LAB_00282688;
              if (uVar25 != 0x4fa6c346) {
                ppuVar3 = &PTR_LAB_002751f0;
              }
              ppuVar2 = &PTR_LAB_0027eef8;
              if (uVar25 != 0x4fa6c2f9) {
                ppuVar2 = ppuVar3;
              }
              ppuVar3 = &PTR_LAB_0027c010;
              if (uVar25 != 0x2db9b74) {
                ppuVar3 = ppuVar2;
              }
                    /* WARNING: Could not recover jumptable at 0x002136f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
              (*(code *)*ppuVar3)();
              return;
            }
            puVar29 = (uint *)((long)puVar29 +
                              (-1 - ((ulong)**(ushort **)(unaff_x19 + 0x228) ^ 0xffffffffffffffff)))
            ;
          }
          uVar25 = (uVar25 | 1) * 2 - (uVar25 ^ 1);
        } while (uVar25 != *(uint *)(unaff_x19 + 0x230));
        uVar25 = (*(uint *)(unaff_x19 + 0x20c) | 1) & (*(uint *)(unaff_x19 + 0x20c) & 1 ^ 1);
        uVar16 = (uint)((char)*(undefined4 *)(unaff_x19 + 0x1bc) ==
                       (byte)((-(char)DAT_00281e58 & 0x7fU | 0x42) * '\x02' -
                             (-(char)DAT_00281e58 ^ 0x42U)));
        uVar25 = uVar16 & uVar25 | uVar16 ^ uVar25;
        uVar16 = (uint)((char)*(undefined4 *)(unaff_x19 + 0x1c4) == '\0');
        if ((uVar16 & uVar25) == 0 && uVar16 == uVar25) {
          *(undefined ***)(unaff_x19 + 0x38) = &PTR_LAB_00276610;
          uVar19 = *(ulong *)(unaff_x19 + 0x438);
          plVar9 = (long *)FUN_0026eefc(*(undefined8 *)(unaff_x19 + 0x430),&DAT_00286190);
          lVar18 = *plVar9;
          uVar19 = (*(ulong *)(lVar18 + 8) ^ 0xffffffffffffffff) & uVar19 |
                   *(ulong *)(lVar18 + 8) & (uVar19 ^ 0xffffffffffffffff);
          *(long *)(unaff_x19 + 0x1d8) = *(long *)(unaff_x19 + 0x848) + 0x30;
          lVar32 = *(long *)(*(long *)(unaff_x19 + 0x848) + 0x30);
          *(long *)(unaff_x19 + 0x198) = lVar32 + 0x68;
          lVar33 = (*(ulong *)(lVar32 + 0x68) | uVar19) + (*(ulong *)(lVar32 + 0x68) & uVar19);
          *(long *)(unaff_x19 + 0x58) = lVar32 + 0x80;
          *(long *)(unaff_x19 + 0x178) = lVar33;
          *(long *)(lVar32 + 0x80) = lVar33;
          uVar25 = *(uint *)(lVar18 + 0x10);
          *(long *)(unaff_x19 + 0x50) = lVar32 + 0x88;
          *(ulong *)(lVar32 + 0x88) =
               (ulong)((uVar25 | *(uint *)(unaff_x19 + 0x42c)) &
                      (uVar25 & *(uint *)(unaff_x19 + 0x42c) ^ 0xffffffff));
          ppuVar3 = &PTR_LAB_002753e0 +
                    (long)(int)((-(int)DAT_00281e58 | 0xcc88cf42U) +
                               (-(int)DAT_00281e58 & 0xcc88cf42U)) * 0x69;
          if (*(short *)(((*(ulong *)(lVar18 + 0x40) | *(ulong *)(lVar32 + 8)) &
                         (*(ulong *)(lVar18 + 0x40) & *(ulong *)(lVar32 + 8) ^ 0xffffffffffffffff))
                        + 0x12) !=
              *(short *)(*(long *)(unaff_x19 + 0x350) +
                        (-DAT_00281e58 ^ 0x42c7e286cc88cf54U) +
                        (-DAT_00281e58 & 0x42c7e286cc88cf54U) * 2)) {
            ppuVar3 = (undefined **)(*(long *)(unaff_x19 + 0x38) + 0x130);
          }
                    /* WARNING: Could not recover jumptable at 0x0022d964. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)*ppuVar3)();
          return;
        }
      }
      CallSupervisor(0);
      uVar25 = *(uint *)(unaff_x19 + 0x50c);
      uVar26 = *(undefined8 *)(unaff_x19 + 0x500);
      uVar27 = *(undefined8 *)(unaff_x19 + 0x4f8);
      uVar28 = *(undefined8 *)(unaff_x19 + 0x4f0);
      uVar8 = *(undefined8 *)(unaff_x19 + 0x4e8);
      uVar10 = *(undefined8 *)(unaff_x19 + 0x4e0);
      uVar11 = *(undefined8 *)(unaff_x19 + 0x4d8);
      uVar12 = *(undefined8 *)(unaff_x19 + 0x4d0);
      uVar23 = *(undefined8 *)(unaff_x19 + 0x4c8);
      uVar13 = *(undefined8 *)(unaff_x19 + 0x4c0);
      uVar14 = *(undefined8 *)(unaff_x19 + 0x4b8);
      uVar15 = *(undefined8 *)(unaff_x19 + 0x4b0);
      uVar30 = *(undefined8 *)(unaff_x19 + 0x4a8);
      uVar31 = *(undefined8 *)(unaff_x19 + 0x4a0);
    }
  }
  else {
    uVar25 = *(uint *)(unaff_x19 + 0x50c);
    uVar26 = *(undefined8 *)(unaff_x19 + 0x500);
    uVar27 = *(undefined8 *)(unaff_x19 + 0x4f8);
    uVar28 = *(undefined8 *)(unaff_x19 + 0x4f0);
    uVar8 = *(undefined8 *)(unaff_x19 + 0x4e8);
    uVar10 = *(undefined8 *)(unaff_x19 + 0x4e0);
    uVar11 = *(undefined8 *)(unaff_x19 + 0x4d8);
    uVar12 = *(undefined8 *)(unaff_x19 + 0x4d0);
    uVar23 = *(undefined8 *)(unaff_x19 + 0x4c8);
    uVar13 = *(undefined8 *)(unaff_x19 + 0x4c0);
    uVar14 = *(undefined8 *)(unaff_x19 + 0x4b8);
    uVar15 = *(undefined8 *)(unaff_x19 + 0x4b0);
    uVar30 = *(undefined8 *)(unaff_x19 + 0x4a8);
    uVar31 = *(undefined8 *)(unaff_x19 + 0x4a0);
  }
  while( true ) {
    do {
      lVar33 = *(long *)(*(long *)(unaff_x19 + 0x848) + 0x68);
      if (lVar33 == 0) {
        uVar11 = *(undefined8 *)(unaff_x19 + 0x8d0);
        uVar25 = -(int)DAT_00281e58;
        uVar16 = -(int)DAT_00281e58;
        uVar8 = (*(code *)(&PTR_FUN_0027c1e0)
                          [(long)(int)((uVar16 | 0xcc88cf42) + (uVar16 & 0xcc88cf42)) * 300 +
                           (long)(int)((uVar25 ^ 0xcc88d00e) + (uVar25 & 0xcc88d00e) * 2)])
                          (0,uVar10,(long)(int)*(undefined8 *)(unaff_x19 + 0x8e0));
        uVar25 = -(int)DAT_00281e58;
        uVar16 = -(int)DAT_00281e58;
        (*(code *)(&PTR_FUN_0027c1e0)
                  [(long)(int)((uVar25 | 0xcc88cf42) * 2 - (uVar25 ^ 0xcc88cf42)) * 300 +
                   (long)(int)((uVar16 | 0xcc88cff5) + (uVar16 & 0xcc88cff5))])
                  (uVar11,0x200,&DAT_00282806,uVar8);
        uVar25 = -(int)DAT_00281e58;
                    /* WARNING: Could not recover jumptable at 0x00217308. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_002808d8)
                  ((&DAT_0029e620)
                   [(long)(int)(-0x337730bf - (-(int)DAT_00281e58 ^ 0xffffffffU)) * 0x2b +
                    (long)(int)((uVar25 ^ 0xcc88cf48) + (uVar25 & 0xcc88cf48) * 2)]);
        return;
      }
      *(long *)(unaff_x19 + 0x848) = lVar33;
    } while (*(int *)(lVar33 + 0x28) != 2);
    uVar16 = (uint)(*(char *)(*(long *)(unaff_x19 + 0x848) + 0x60) != '\0');
    if ((uVar16 & uVar25) == 0 && ((uVar16 ^ uVar25) & 1) == 0) {
      ppuVar3 = &PTR_LAB_002817a8;
      if (*(char *)(*(long *)(unaff_x19 + 0x848) + 0x61) != '\0') {
        ppuVar3 = &PTR_LAB_0027bdd0;
      }
                    /* WARNING: Could not recover jumptable at 0x0021c83c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar3)();
      return;
    }
    *(undefined8 *)(unaff_x19 + 0x4a0) = uVar31;
    *(undefined8 *)(unaff_x19 + 0x4a8) = uVar30;
    *(undefined8 *)(unaff_x19 + 0x4b0) = uVar15;
    *(undefined8 *)(unaff_x19 + 0x4b8) = uVar14;
    *(undefined8 *)(unaff_x19 + 0x4c0) = uVar13;
    *(undefined8 *)(unaff_x19 + 0x4c8) = uVar23;
    *(undefined8 *)(unaff_x19 + 0x4d0) = uVar12;
    *(undefined8 *)(unaff_x19 + 0x4d8) = uVar11;
    *(undefined8 *)(unaff_x19 + 0x4e0) = uVar10;
    *(undefined8 *)(unaff_x19 + 0x4e8) = uVar8;
    *(undefined8 *)(unaff_x19 + 0x4f0) = uVar28;
    *(undefined8 *)(unaff_x19 + 0x4f8) = uVar27;
    *(undefined8 *)(unaff_x19 + 0x500) = uVar26;
    *(uint *)(unaff_x19 + 0x50c) = uVar25;
    if ((unaff_x27 & 1) != 0) break;
    if (*(long *)(*(long *)(unaff_x19 + 0x848) + 0x20) != 0) {
      ppuVar3 = (undefined **)&DAT_00278e10;
      if (DAT_002836a0 != 0x42c7e286cc88cf41 - (-DAT_00281e58 ^ 0xffffffffffffffffU)) {
        ppuVar3 = &PTR_LAB_0027d890;
      }
                    /* WARNING: Could not recover jumptable at 0x00216498. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar3)();
      return;
    }
    if (*(char *)(*(long *)(unaff_x19 + 0x848) + 0x50) != '\0') break;
    uVar25 = *(uint *)(unaff_x19 + 0x50c);
    uVar26 = *(undefined8 *)(unaff_x19 + 0x500);
    uVar27 = *(undefined8 *)(unaff_x19 + 0x4f8);
    uVar28 = *(undefined8 *)(unaff_x19 + 0x4f0);
    uVar8 = *(undefined8 *)(unaff_x19 + 0x4e8);
    uVar10 = *(undefined8 *)(unaff_x19 + 0x4e0);
    uVar11 = *(undefined8 *)(unaff_x19 + 0x4d8);
    uVar12 = *(undefined8 *)(unaff_x19 + 0x4d0);
    uVar23 = *(undefined8 *)(unaff_x19 + 0x4c8);
    uVar13 = *(undefined8 *)(unaff_x19 + 0x4c0);
    uVar14 = *(undefined8 *)(unaff_x19 + 0x4b8);
    uVar15 = *(undefined8 *)(unaff_x19 + 0x4b0);
    uVar30 = *(undefined8 *)(unaff_x19 + 0x4a8);
    uVar31 = *(undefined8 *)(unaff_x19 + 0x4a0);
  }
  if (*(char *)(*(long *)(unaff_x19 + 0x848) + 0x38) != '\0') {
                    /* WARNING: Could not recover jumptable at 0x00213a54. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00276880)(*(undefined4 *)(*(long *)(unaff_x19 + 0x848) + 0x3c));
    return;
  }
  iVar22 = (int)DAT_00281e58;
  if (0x36f < (-iVar22 | 0xcc88cf45U) * 2 - (-iVar22 ^ 0xcc88cf45U)) {
    uVar16 = (iVar22 * -2 | 0x99119e84U) - (-iVar22 ^ 0xcc88cf42U);
    uVar25 = uVar16 >> (ulong)((-iVar22 | 0xcf5aU) + (-iVar22 & 0xcf5aU) & 0x1f);
    uVar16 = ((uVar25 ^ 0xffffffff) & uVar16 | uVar25 & (uVar16 ^ 0xffffffff)) *
             ((-iVar22 | 0x285ab8d7U) + (-iVar22 & 0x285ab8d7U));
    uVar6 = ((-iVar22 | 0x14d2b722U) * 2 - (-iVar22 ^ 0x14d2b722U)) *
            (0x285ab8d6 - (-iVar22 ^ 0xffffffffU));
    uVar7 = ((-iVar22 | 0x285ab8d7U) + (-iVar22 & 0x285ab8d7U)) * 0x370;
    uVar25 = uVar7 >> (ulong)((-iVar22 ^ 0xcf5aU) + (-iVar22 & 0xcf5aU) * 2 & 0x1f);
    uVar25 = ((uVar25 ^ 0xffffffff) & uVar7 | uVar25 & (uVar7 ^ 0xffffffff)) *
             ((-iVar22 | 0x285ab8d7U) + (-iVar22 & 0x285ab8d7U));
    uVar16 = ((uVar16 | uVar6) & (uVar16 & uVar6 ^ 0xffffffff)) *
             ((-iVar22 | 0x285ab8d7U) * 2 - (-iVar22 ^ 0x285ab8d7U));
    uVar16 = (uVar16 ^ 0xffffffff) & uVar25 | uVar16 & (uVar25 ^ 0xffffffff);
    uVar25 = uVar16 >> (ulong)((-iVar22 | 0xcf4fU) + (-iVar22 & 0xcf4fU) & 0x1f);
    uVar25 = ((uVar25 ^ 0xffffffff) & uVar16 | uVar25 & (uVar16 ^ 0xffffffff)) *
             ((-iVar22 ^ 0x285ab8d7U) + (-iVar22 & 0x285ab8d7U) * 2);
    uVar4 = (ushort)(uVar25 >> (ulong)((-iVar22 | 0xcf51U) * 2 - (-iVar22 ^ 0xcf51U) & 0x1f));
    uVar5 = (ushort)uVar25;
    if ((ushort)((uVar4 | uVar5) & (uVar4 & uVar5 ^ 0xffff)) == 0x6613) {
                    /* WARNING: Could not recover jumptable at 0x0021c210. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_0027bd60)(0x696);
      return;
    }
    *(undefined8 *)(((ulong)unaff_x29 | 8) * 2 - ((ulong)unaff_x29 ^ 8)) = 4;
    *unaff_x29 = 0x42c7e286cc88cf61 - (-DAT_00281e58 ^ 0xffffffffffffffffU);
                    /* WARNING: Could not recover jumptable at 0x0021d278. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00278bc0)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00229d94. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002749c0)();
  return;
}


