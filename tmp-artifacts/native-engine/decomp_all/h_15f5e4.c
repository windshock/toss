// entry=0x15f5e4

/* WARNING: Removing unreachable block (ram,0x0025fee8) */
/* WARNING: Removing unreachable block (ram,0x0025ff04) */
/* WARNING: Removing unreachable block (ram,0x0025ff18) */
/* WARNING: Removing unreachable block (ram,0x00260068) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

void FUN_0025f5e4(ulong param_1)

{
  uint uVar1;
  uint uVar2;
  byte bVar3;
  uint uVar4;
  uint uVar5;
  char cVar6;
  bool bVar7;
  long lVar8;
  undefined1 *puVar9;
  uint uVar10;
  ulong uVar11;
  ulong uVar12;
  long lVar13;
  int iVar14;
  uint uVar15;
  uint uVar16;
  undefined1 *puVar17;
  uint uVar18;
  byte *pbVar19;
  ulong uVar20;
  long lVar21;
  ulong local_1650;
  ulong local_1644;
  ulong local_1638;
  ulong local_162c;
  ulong local_1620;
  ulong local_1614;
  ulong local_1608;
  ulong local_15fc;
  ulong local_15f0;
  ulong local_15e4;
  ulong local_15d8;
  ulong local_15cc;
  ulong local_15c0;
  ulong local_15b4;
  ulong local_15a8;
  ulong local_159c;
  ulong local_1590;
  ulong local_1584;
  ulong local_1578;
  ulong local_156c [557];
  ulong *local_400;
  ulong *local_3f8;
  ulong *local_3f0;
  ulong *local_3e8;
  ulong *local_3e0;
  ulong *local_3d8;
  ulong *local_3d0;
  ulong *local_3c8;
  ulong *local_3c0;
  ulong *local_3b8;
  ulong *local_3b0;
  ulong *local_3a8;
  ulong *local_3a0;
  ulong *local_398;
  ulong *local_390;
  ulong *local_388;
  ulong *local_380;
  ulong *local_378;
  ulong *local_370;
  ulong *local_368;
  undefined1 auStack_360 [516];
  undefined4 local_15c;
  uint local_158 [64];
  long local_58;
  
  lVar8 = tpidr_el0;
  local_58 = *(long *)(lVar8 + 0x28);
  do {
    while (DAT_00286318 != 0) {
      ClearExclusiveLocal();
    }
    cVar6 = '\x01';
    bVar7 = (bool)ExclusiveMonitorPass(0x286318,0x10);
    if (bVar7) {
      DAT_00286318 = 1;
      cVar6 = ExclusiveMonitorsStatus();
    }
  } while (cVar6 != '\0');
  if (DAT_00278c88 != '\0') {
    iVar14 = (int)DAT_00276260;
    uVar15 = 0x25dd8c02 - iVar14;
    pbVar19 = &DAT_0027a318;
    puVar17 = (undefined1 *)
              ((-DAT_00276260 ^ 0xa8f93682dd7d75c0U) + (-DAT_00276260 & 0x28f93682dd7d75c0U) * 2);
    do {
      bVar3 = *pbVar19;
      uVar10 = (uint)bVar3;
      puVar17 = puVar17 + (-0x5706c97d22828a3f - DAT_00276260);
      pbVar19 = pbVar19 + (-DAT_00276260 ^ 0xa8f93682dd7d75c1U) +
                          (-DAT_00276260 & 0xa8f93682dd7d75c1U) * 2;
      uVar16 = (-iVar14 | 0xdd7d75e1U) * 2 - (-iVar14 ^ 0xdd7d75e1U);
      puVar9 = (undefined1 *)
               ((-DAT_00276260 | 0xa8f93682dd7d75d0U) * 2 - (-DAT_00276260 ^ 0xa8f93682dd7d75d0U));
      uVar15 = uVar15 * uVar16 ^ (uint)bVar3;
    } while (puVar17 != puVar9);
    if (uVar15 != 0x6445961f) {
      *(undefined8 *)
       (((long)&stack0xfffffffffffffff0 * 2 | 0x10U) - ((ulong)&stack0xfffffffffffffff0 ^ 8)) = 0x18
      ;
      if (*(long *)(lVar8 + 0x28) == local_58) {
        return;
      }
      goto LAB_0026007c;
    }
    uVar20 = 0;
    uVar15 = 0;
    do {
      *(char *)((long)local_158 + uVar20) = (char)uVar15;
      uVar20 = (uVar20 << 1 | 2) - (uVar20 ^ 1);
      uVar15 = (uVar15 << 1 | 2) - (uVar15 ^ 1);
    } while (uVar20 != 0x100);
    uVar20 = 0;
    uVar15 = 0;
    do {
      uVar15 = (uVar15 ^ 0xffffff00) & uVar15;
      lVar21 = ((-DAT_00276260 | 0xa8f93682dd7d75c0U) * 2 - (-DAT_00276260 ^ 0xa8f93682dd7d75c0U)) *
               0x100 + -0x158;
      bVar3 = *(byte *)((long)local_158 + uVar20 + lVar21 + 0x158);
      uVar15 = (uVar15 | bVar3) + (uVar15 & bVar3);
      uVar15 = (uVar15 ^ (byte)(&DAT_0012cdaa)[uVar20 % 0xe]) +
               (uVar15 & (byte)(&DAT_0012cdaa)[uVar20 % 0xe]) * 2;
      uVar11 = (ulong)((uVar15 ^ 0xffffff00) & uVar15);
      *(undefined1 *)((long)local_158 + uVar20 + lVar21 + 0x158) =
           *(undefined1 *)((long)local_158 + uVar11);
      *(byte *)((long)local_158 + uVar11) = bVar3;
      uVar20 = (uVar20 | 1) + (uVar20 & 1);
    } while (uVar20 != 0x100);
    uVar15 = 0;
    uVar20 = 0;
    uVar16 = 0xdd7d75c0 - iVar14;
    do {
      uVar16 = (uVar16 ^ 0xffffff00) & uVar16;
      uVar16 = (uVar16 << 1 | 2) - (uVar16 ^ 1);
      uVar11 = (ulong)((uVar16 ^ 0xffffff00) & uVar16);
      bVar3 = *(byte *)((long)local_158 + uVar11);
      uVar15 = (uVar15 ^ 0xffffff00) & uVar15;
      uVar15 = (uVar15 | bVar3) + (uVar15 & bVar3);
      uVar12 = (ulong)((uVar15 ^ 0xffffff00) & uVar15);
      lVar21 = ((-DAT_00276260 | 0xa8f93682dd7d75c0U) + (-DAT_00276260 & 0xa8f93682dd7d75c0U)) *
               0x100 + -0x158;
      *(undefined1 *)((long)local_158 + uVar11) =
           *(undefined1 *)((long)local_158 + uVar12 + lVar21 + 0x158);
      *(byte *)((long)local_158 + uVar12 + lVar21 + 0x158) = bVar3;
      bVar3 = (*(byte *)((long)local_158 + uVar11) | bVar3) +
              (*(byte *)((long)local_158 + uVar11) & bVar3);
      (&DAT_0027a318)[uVar20] =
           bVar3 & ((&DAT_0027a318)[uVar20] ^ 0xff) | (&DAT_0027a318)[uVar20] & (bVar3 ^ 0xff);
      uVar20 = (uVar20 ^ 1) + (uVar20 & 1) * 2;
    } while (uVar20 != 0x10);
    DAT_00278c88 = '\0';
  }
  DAT_00286318 = 0;
  do {
    while (DAT_0029e5f0 != 0) {
      ClearExclusiveLocal();
    }
    cVar6 = '\x01';
    bVar7 = (bool)ExclusiveMonitorPass(0x29e5f0,0x10);
    if (bVar7) {
      DAT_0029e5f0 = 1;
      cVar6 = ExclusiveMonitorsStatus();
    }
  } while (cVar6 != '\0');
  if ((DAT_00281708 & 1) == 0) {
    iVar14 = (int)DAT_00276260;
    uVar15 = 0xe1d8f7f - iVar14;
    lVar21 = (-DAT_00276260 | 0xa8f93682dd7d75c0U) + (-DAT_00276260 & 0xa8f93682dd7d75c0U);
    do {
      pbVar19 = &DAT_002821a8 + (lVar21 << (0xa8f93682dd7d75c2U - DAT_00276260 & 0x3f));
      uVar16 = ((uint)pbVar19[(-DAT_00276260 | 0xa8f93682dd7d75c1U) * 2 -
                              (-DAT_00276260 ^ 0xa8f93682dd7d75c1U)] <<
                (ulong)((-iVar14 | 0xdd7d75c8U) + (-iVar14 & 0xdd7d75c8U) & 0x1f) | (uint)*pbVar19 |
                (uint)pbVar19[(-DAT_00276260 | 0xa8f93682dd7d75c2U) +
                              (-DAT_00276260 & 0xa8f93682dd7d75c2U)] <<
                (ulong)(iVar14 * -2 - (-iVar14 ^ 0xdd7d75d0U) & 0x1f) |
               (uint)pbVar19[(-DAT_00276260 ^ 0xa8f93682dd7d75c3U) +
                             (-DAT_00276260 & 0xa8f93682dd7d75c3U) * 2] <<
               (ulong)((-iVar14 | 0xdd7d75d8U) + (-iVar14 & 0xdd7d75d8U) & 0x1f)) *
               (0x394f5f55 - iVar14);
      lVar21 = (-0x5706c97d22828a3f - DAT_00276260) + lVar21;
      uVar15 = (uVar16 >> (ulong)((-iVar14 ^ 0xdd7d75d8U) + (-iVar14 & 0xdd7d75d8U) * 2 & 0x1f) ^
               uVar16) * ((-iVar14 | 0x394f5f55U) + (-iVar14 & 0x394f5f55U)) ^
               uVar15 * ((-iVar14 | 0x394f5f55U) + (-iVar14 & 0x394f5f55U));
    } while (lVar21 != (-DAT_00276260 | 0xa8f93682dd7d75c4U) * 2 -
                       (-DAT_00276260 ^ 0xa8f93682dd7d75c4U));
    uVar10 = 0x394f5f55 - iVar14;
    puVar9 = (undefined1 *)(ulong)(0xdd7d75c0U - iVar14);
    uVar15 = (((-iVar14 | 0xdd7d75c0U) + (-iVar14 & 0xdd7d75c0U) >>
               (ulong)(0xdd7d75d8U - iVar14 & 0x1f) ^ 0xdd7d75c0U - iVar14) * uVar10 ^
             uVar15 * ((-iVar14 | 0x394f5f55U) * 2 - (-iVar14 ^ 0x394f5f55U))) *
             (0x394f5f55 - iVar14) ^ (iVar14 * -2 | 0x67c58362U) - (-iVar14 ^ 0xb3e2c1b1U);
    uVar16 = 0xdd7d75cf - iVar14;
    uVar15 = (uVar15 >> (ulong)(0xdd7d75cdU - iVar14 & 0x1f) ^ uVar15) *
             ((-iVar14 | 0x394f5f55U) + (-iVar14 & 0x394f5f55U));
    if ((uVar15 >> (ulong)(uVar16 & 0x1f) ^ uVar15) != 0x3e8684ac) {
      if (*(long *)(lVar8 + 0x28) == local_58) {
        DAT_00286318 = 0;
        return;
      }
      goto LAB_0026007c;
    }
    uVar20 = 1;
    local_15c = 0x8699f514;
    local_158[0]._0_1_ = 0x14;
    do {
      *(undefined1 *)((long)local_158 + uVar20) = *(undefined1 *)((long)local_158 + (uVar20 - 4));
      uVar20 = (uVar20 | 1) + (uVar20 & 1);
    } while (uVar20 != (-DAT_00276260 ^ 0xa8f93682dd7d75c4U) +
                       (-DAT_00276260 & 0xa8f93682dd7d75c4U) * 2);
    local_158[1] = 0;
    local_158[2] = 0;
    uVar15 = 0xbe1e08bb;
    local_158[3] = (-iVar14 | 0xdd7d75c0U) + (-iVar14 & 0xdd7d75c0U);
    do {
      uVar10 = (uVar15 >> 2 ^ 0x3ffffffc) & uVar15 >> 2;
      lVar21 = 3;
      uVar16 = _DAT_002821a8;
      do {
        uVar18 = (uint)lVar21;
        uVar2 = *(uint *)(&DAT_002821a8 + (ulong)(uVar18 - 1) * 4);
        uVar4 = uVar15 & (uVar16 ^ 0xffffffff) | uVar16 & (uVar15 ^ 0xffffffff);
        uVar1 = (uVar18 ^ 0xfffffffc) & uVar18;
        uVar5 = uVar16 << 2 & (uVar2 >> 5 ^ 0xffffffff) | uVar2 >> 5 & (uVar16 << 2 ^ 0xffffffff);
        uVar16 = uVar16 >> 3 & (uVar2 << 4 ^ 0xffffffff) | uVar2 << 4 & (uVar16 >> 3 ^ 0xffffffff);
        uVar1 = uVar2 & (local_158[(uVar1 | uVar10) & (uVar1 & uVar10 ^ 0xffffffff)] ^ 0xffffffff) |
                local_158[(uVar1 | uVar10) & (uVar1 & uVar10 ^ 0xffffffff)] & (uVar2 ^ 0xffffffff);
        lVar13 = lVar21 * 4;
        uVar16 = (uVar5 ^ uVar16) + (uVar5 & uVar16) * 2;
        uVar1 = (uVar1 | uVar4) * 2 - (uVar1 ^ uVar4);
        uVar16 = -(uVar16 & (uVar1 ^ 0xffffffff) | uVar1 & (uVar16 ^ 0xffffffff));
        uVar16 = (*(uint *)(&DAT_002821a8 + lVar13) ^ uVar16) +
                 (*(uint *)(&DAT_002821a8 + lVar13) & uVar16) * 2;
        lVar21 = lVar21 + -1;
        *(uint *)(&DAT_002821a8 + lVar13) = uVar16;
      } while (uVar18 - 1 != 0);
      uVar1 = (uVar16 | uVar15) & (uVar16 & uVar15 ^ 0xffffffff);
      uVar10 = _DAT_002821b4 & (local_158[uVar10] ^ 0xffffffff) |
               local_158[uVar10] & (_DAT_002821b4 ^ 0xffffffff);
      uVar16 = ((_DAT_002821b4 << 4 | uVar16 >> 3) & (_DAT_002821b4 << 4 & uVar16 >> 3 ^ 0xffffffff)
               ) + ((_DAT_002821b4 >> 5 | uVar16 * 4) &
                   (_DAT_002821b4 >> 5 & uVar16 * 4 ^ 0xffffffff));
      uVar10 = (uVar10 | uVar1) + (uVar10 & uVar1);
      uVar16 = -((uVar10 | uVar16) & (uVar10 & uVar16 ^ 0xffffffff));
      _DAT_002821a8 = (_DAT_002821a8 | uVar16) * 2 - (_DAT_002821a8 ^ uVar16);
      uVar15 = (uVar15 ^ 0x61c88647) + (uVar15 & 0x61c88647) * 2;
    } while (uVar15 != 0);
    DAT_00281708 = 0xffffffff;
  }
  puVar9 = auStack_360;
  DAT_0029e5f0 = 0;
  local_400 = &local_1650;
  local_1650 = param_1 & 0xffffffff;
  local_3f8 = &local_1644;
  local_3f0 = &local_1638;
  local_3e8 = &local_162c;
  local_3e0 = &local_1620;
  local_3d8 = &local_1614;
  local_3d0 = &local_1608;
  local_3c8 = &local_15fc;
  local_3c0 = &local_15f0;
  local_3b8 = &local_15e4;
  local_3b0 = &local_15d8;
  local_3a8 = &local_15cc;
  local_3a0 = &local_15c0;
  local_398 = &local_15b4;
  local_390 = &local_15a8;
  local_388 = &local_159c;
  local_380 = &local_1590;
  local_378 = &local_1584;
  local_370 = &local_1578;
  local_368 = local_156c;
  CallSupervisor(0);
  uVar10 = 0x200;
  CallSupervisor(0);
  uVar16 = 0x2821a8;
  param_1 = 1;
  local_1644 = local_1650;
  local_1638 = local_1650;
  local_162c = local_1650;
  local_1620 = local_1650;
  local_1614 = local_1650;
  local_1608 = local_1650;
  local_15fc = local_1650;
  local_15f0 = local_1650;
  local_15e4 = local_1650;
  local_15d8 = local_1650;
  local_15cc = local_1650;
  local_15c0 = local_1650;
  local_15b4 = local_1650;
  local_15a8 = local_1650;
  local_159c = local_1650;
  local_1590 = local_1650;
  local_1584 = local_1650;
  local_1578 = local_1650;
  local_156c[0] = local_1650;
  if (*(long *)(lVar8 + 0x28) == local_58) {
    DAT_0029e5f0 = 0;
    return;
  }
LAB_0026007c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(param_1,uVar16,puVar9,uVar10);
}


