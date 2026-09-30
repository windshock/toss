// FUN_001441a4 @001441a4

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_001441a4(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  byte bVar7;
  uint uVar8;
  char cVar9;
  bool bVar10;
  long lVar11;
  uint uVar12;
  long lVar13;
  int iVar14;
  uint uVar15;
  ulong uVar16;
  ulong uVar17;
  int iVar18;
  int iVar19;
  long lVar20;
  uint uVar21;
  byte *pbVar22;
  undefined4 local_5c;
  uint local_58 [4];
  long local_48;
  
  lVar11 = tpidr_el0;
  local_48 = *(long *)(lVar11 + 0x28);
  do {
    while (DAT_0029e3c0 != 0) {
      ClearExclusiveLocal();
    }
    cVar9 = '\x01';
    bVar10 = (bool)ExclusiveMonitorPass(0x29e3c0,0x10);
    if (bVar10) {
      DAT_0029e3c0 = 1;
      cVar9 = ExclusiveMonitorsStatus();
    }
  } while (cVar9 != '\0');
  if ((DAT_002862e0 & 1) == 0) {
    iVar19 = (int)DAT_00275c78;
    pbVar22 = &DAT_002747ba;
    lVar20 = (-DAT_00275c78 ^ 0x7e7c99a68f471707U) + (-DAT_00275c78 & 0x7e7c99a68f471707U) * 2;
    iVar18 = (iVar19 * -2 | 0x8082ff8aU) - (-iVar19 ^ 0xc0417fc5U);
    do {
      bVar7 = *pbVar22;
      uVar16 = (ulong)bVar7;
      pbVar22 = pbVar22 + (0x7e7c99a68f471708 - DAT_00275c78);
      uVar21 = -iVar19 ^ 0x8f481746;
      uVar17 = (ulong)uVar21;
      iVar14 = (-iVar19 | 0x8f481746U) * 2 - uVar21;
      lVar20 = lVar20 + (-DAT_00275c78 | 0x7e7c99a68f471708U) +
                        (-DAT_00275c78 & 0x7e7c99a68f471708U);
      lVar13 = (-DAT_00275c78 | 0x7e7c99a68f47171fU) + (-DAT_00275c78 & 0x7e7c99a68f47171fU);
      iVar18 = (uint)bVar7 + iVar18 * iVar14;
    } while (lVar20 != lVar13);
    if (iVar18 != 0x1afb4f31) {
      *(undefined8 *)
       (((long)&stack0xfffffffffffffff0 * 2 | 0x10U) - ((ulong)&stack0xfffffffffffffff0 ^ 8)) = 0x20
      ;
      if (*(long *)(lVar11 + 0x28) == local_48) {
        return;
      }
      goto LAB_001445c4;
    }
    uVar17 = 1;
    local_5c = 0xd80c2121;
    local_58[0]._0_1_ = 0x21;
    do {
      *(undefined1 *)((long)local_58 + uVar17) = *(undefined1 *)((long)local_58 + (uVar17 - 4));
      uVar17 = (uVar17 << 1 | 2) - (uVar17 ^ 1);
    } while (uVar17 != 4);
    local_58[2] = 0;
    local_58[3] = 0;
    local_58[1] = 0;
    uVar21 = 0xa708a81e;
    do {
      uVar1 = (uVar21 >> 2 ^ 0x3ffffffc) & uVar21 >> 2;
      uVar17 = 5;
      uVar12 = _DAT_002747ba;
      do {
        uVar15 = (uint)uVar17;
        uVar3 = (uVar12 | uVar21) & (uVar12 & uVar21 ^ 0xffffffff);
        uVar2 = (uVar15 ^ 0xfffffffc) & uVar15;
        lVar20 = uVar17 * 4;
        uVar5 = *(uint *)(&DAT_002747ba + lVar20);
        uVar6 = *(uint *)(&DAT_002747ba +
                         ((ulong)(uVar15 - 1) <<
                         ((-DAT_00275c78 ^ 0x7e7c99a68f471709U) +
                          (-DAT_00275c78 & 0x7e7c99a68f471709U) * 2 & 0x3f)));
        iVar18 = (int)DAT_00275c78;
        uVar8 = -iVar18;
        uVar2 = (local_58[(uVar2 | uVar1) & (uVar2 & uVar1 ^ 0xffffffff)] | uVar6) &
                (local_58[(uVar2 | uVar1) & (uVar2 & uVar1 ^ 0xffffffff)] & uVar6 ^ 0xffffffff);
        uVar4 = (uVar6 << 4 | uVar12 >> 3) & (uVar6 << 4 & uVar12 >> 3 ^ 0xffffffff);
        uVar6 = uVar6 >> (ulong)((uVar8 ^ 0x170c) + (uVar8 & 0x170c) * 2 & 0x1f);
        uVar2 = (uVar2 | uVar3) + (uVar2 & uVar3);
        uVar12 = (uVar6 | uVar12 << 2) & (uVar6 & uVar12 << 2 ^ 0xffffffff);
        uVar12 = (uVar12 | uVar4) * 2 - (uVar12 ^ uVar4);
        uVar12 = -((uVar2 | uVar12) & (uVar2 & uVar12 ^ 0xffffffff));
        uVar12 = (uVar5 ^ uVar12) + (uVar5 & uVar12) * 2;
        uVar17 = ~uVar17 + uVar17 * 2;
        (&DAT_002747ba)[lVar20] = (char)uVar12;
        (&DAT_002747bb)[lVar20] = (char)(uVar12 >> 8);
        (&DAT_002747bc)[lVar20] = (char)(uVar12 >> (ulong)(0x1717U - iVar18 & 0x1f));
        (&DAT_002747bd)[lVar20] = (char)(uVar12 >> 0x18);
      } while (uVar15 - 1 != 0);
      uVar2 = (uVar12 | uVar21) & (uVar12 & uVar21 ^ 0xffffffff);
      uVar1 = (local_58[uVar1] | _DAT_002747ce) & (local_58[uVar1] & _DAT_002747ce ^ 0xffffffff);
      uVar3 = uVar12 << (ulong)((-(int)DAT_00275c78 | 0x1709U) * 2 - (-(int)DAT_00275c78 ^ 0x1709U)
                               & 0x1f);
      uVar4 = uVar12 >> 3 & (_DAT_002747ce << 4 ^ 0xffffffff) |
              _DAT_002747ce << 4 & (uVar12 >> 3 ^ 0xffffffff);
      uVar3 = (_DAT_002747ce >> 5 | uVar3) & (_DAT_002747ce >> 5 & uVar3 ^ 0xffffffff);
      uVar12 = (uVar1 ^ uVar2) + (uVar1 & uVar2) * 2;
      uVar1 = (uVar3 ^ uVar4) + (uVar3 & uVar4) * 2;
      uVar12 = -(uVar1 & (uVar12 ^ 0xffffffff) | uVar12 & (uVar1 ^ 0xffffffff));
      _DAT_002747ba = (_DAT_002747ba | uVar12) * 2 - (_DAT_002747ba ^ uVar12);
      uVar21 = (uVar21 ^ 0x61c88647) + (uVar21 & 0x61c88647) * 2;
    } while (uVar21 != 0);
    DAT_002862e0 = DAT_002862e0 | 1;
  }
  DAT_0029e3c0 = 0;
  lVar13 = 0x7e7c99a68f4716a3 - DAT_00275c78;
  uVar17 = (-DAT_00275c78 | 0x7e7c99a68f471707U) + (-DAT_00275c78 & 0x7e7c99a68f471707U);
  iVar14 = 0x2747ba;
  uVar16 = (-DAT_00275c78 ^ 0x7e7c99a68f471707U) + (-DAT_00275c78 & 0x7e7c99a68f471707U) * 2;
  CallSupervisor(0);
  if (*(long *)(lVar11 + 0x28) == local_48) {
    DAT_0029e3c0 = 0;
    return;
  }
LAB_001445c4:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(lVar13,iVar14,uVar16,uVar17);
}

