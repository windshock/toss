// entry=0xfd570

void FUN_001fd570(void)

{
  byte *pbVar1;
  byte bVar2;
  uint uVar3;
  char cVar4;
  bool bVar5;
  uint uVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  int iVar10;
  ulong uVar11;
  ulong uVar12;
  int iVar13;
  uint uVar14;
  uint uVar15;
  byte local_170 [256];
  long local_70;
  
  lVar7 = tpidr_el0;
  local_70 = *(long *)(lVar7 + 0x28);
  do {
    while (DAT_00286214 != 0) {
      ClearExclusiveLocal();
    }
    cVar4 = '\x01';
    bVar5 = (bool)ExclusiveMonitorPass(0x286214,0x10);
    if (bVar5) {
      DAT_00286214 = 1;
      cVar4 = ExclusiveMonitorsStatus();
    }
  } while (cVar4 != '\0');
  if ((DAT_00282fc8 >> 0x20) * (DAT_00282fc8 & 0xffffffff) >> 0x20 == 0) {
    iVar13 = (int)DAT_0027b708;
    lVar8 = ~DAT_0027b708 + 0x9ae45e5adf21db0c;
    uVar14 = (-iVar13 | 0x165fa62dU) + (-iVar13 & 0x165fa62dU);
    do {
      pbVar1 = &DAT_00275298 +
               (lVar8 << ((-DAT_0027b708 ^ 0x9ae45e5adf21db0d) +
                          (-DAT_0027b708 & 0x9ae45e5adf21db0d) * 2 & 0x3f));
      uVar15 = ((uint)pbVar1[(-DAT_0027b708 | 0x9ae45e5adf21db0c) * 2 -
                             (-DAT_0027b708 ^ 0x9ae45e5adf21db0c)] <<
                (ulong)((-iVar13 | 0xdf21db13U) * 2 - (-iVar13 ^ 0xdf21db13U) & 0x1f) |
                (uint)*pbVar1 |
                (uint)pbVar1[(-DAT_0027b708 | 0x9ae45e5adf21db0d) +
                             (-DAT_0027b708 & 0x9ae45e5adf21db0d)] <<
                (ulong)(0xdf21db1bU - iVar13 & 0x1f) |
               (uint)pbVar1[(-DAT_0027b708 ^ 0x9ae45e5adf21db0e) +
                            (-DAT_0027b708 & 0x9ae45e5adf21db0e) * 2] <<
               (ulong)(0xdf21db23U - iVar13 & 0x1f)) *
               ((-iVar13 ^ 0x3af3c4a0U) + (-iVar13 & 0x3af3c4a0U) * 2);
      lVar8 = lVar8 + ((-DAT_0027b708 | 0x9ae45e5adf21db0c) * 2 -
                      (-DAT_0027b708 ^ 0x9ae45e5adf21db0c));
      uVar14 = (uVar15 >> (ulong)((-iVar13 | 0xdf21db23U) + (-iVar13 & 0xdf21db23U) & 0x1f) ^ uVar15
               ) * ((-iVar13 ^ 0x3af3c4a0U) + (-iVar13 & 0x3af3c4a0U) * 2) ^
               uVar14 * ((-iVar13 | 0x3af3c4a0U) * 2 - (-iVar13 ^ 0x3af3c4a0U));
    } while (lVar8 != (-DAT_0027b708 | 0x9ae45e5adf21db0e) * 2 -
                      (-DAT_0027b708 ^ 0x9ae45e5adf21db0e));
    uVar15 = (-iVar13 ^ 0xdf21db1aU) + (-iVar13 & 0xdf21db1aU) * 2;
    uVar12 = (ulong)uVar15;
    uVar6 = (-iVar13 | 0xdf21db1bU) * 2 - (-iVar13 ^ 0xdf21db1bU);
    uVar11 = (ulong)uVar6;
    uVar3 = (((uint)DAT_002752a5 <<
              (ulong)((-iVar13 ^ 0xdf21db13U) + (-iVar13 & 0xdf21db13U) * 2 & 0x1f) |
             (uint)DAT_002752a6 << (ulong)(uVar6 & 0x1f)) ^ (uint)DAT_002752a4) *
            ((-iVar13 | 0x3af3c4a0U) + (-iVar13 & 0x3af3c4a0U));
    uVar6 = uVar3 >> (ulong)((-iVar13 | 0xdf21db23U) + (-iVar13 & 0xdf21db23U) & 0x1f);
    uVar9 = (ulong)uVar6;
    iVar10 = (-iVar13 | 0x3af3c4a0U) + (-iVar13 & 0x3af3c4a0U);
    uVar14 = ((uVar6 ^ uVar3) * iVar10 ^
             uVar14 * ((-iVar13 | 0x3af3c4a0U) + (-iVar13 & 0x3af3c4a0U))) * (0x3af3c4a0 - iVar13) ^
             (-iVar13 ^ 0x5bcb9eedU) + (-iVar13 & 0x5bcb9eedU) * 2;
    uVar14 = (uVar14 >> (ulong)((-iVar13 | 0xdf21db18U) + (-iVar13 & 0xdf21db18U) & 0x1f) ^ uVar14)
             * ((-iVar13 | 0x3af3c4a0U) * 2 - (-iVar13 ^ 0x3af3c4a0U));
    if ((uVar14 >> (ulong)(uVar15 & 0x1f) ^ uVar14) != 0xae23281c) {
      *(undefined8 *)
       (((long)&stack0xfffffffffffffff0 * 2 | 0x10U) - ((ulong)&stack0xfffffffffffffff0 ^ 8)) = 0x14
      ;
      if (*(long *)(lVar7 + 0x28) == local_70) {
        return;
      }
      goto LAB_001fdb38;
    }
    uVar12 = 0;
    iVar13 = -0x20de24f5 - iVar13;
    do {
      local_170[uVar12] = (byte)iVar13;
      uVar12 = (uVar12 ^ 1) + (uVar12 & 1) * 2;
      iVar13 = iVar13 + 1;
    } while (uVar12 != 0x100);
    uVar12 = 0;
    uVar14 = 0;
    do {
      bVar2 = local_170[uVar12];
      uVar14 = (uint)bVar2 + ((uVar14 ^ 0xffffff00) & uVar14);
      uVar14 = (uVar14 | (byte)(&DAT_0012cdb9)[uVar12 % 0xf]) +
               (uVar14 & (byte)(&DAT_0012cdb9)[uVar12 % 0xf]);
      uVar15 = (uVar14 ^ 0xffffff00) & uVar14;
      local_170[uVar12] = local_170[uVar15];
      uVar12 = (uVar12 | 1) + (uVar12 & 1);
      local_170[uVar15] = bVar2;
    } while (uVar12 != 0x100);
    uVar15 = 0;
    uVar12 = 0;
    uVar14 = 0;
    do {
      uVar14 = (uVar14 ^ 0xffffff00) & uVar14;
      uVar14 = (uVar14 ^ 1) + (uVar14 & 1) * 2;
      uVar6 = (uVar14 ^ 0xffffff00) & uVar14;
      bVar2 = local_170[uVar6];
      uVar15 = (uVar15 ^ 0xffffff00) & uVar15;
      uVar15 = (uVar15 | bVar2) + (uVar15 & bVar2);
      uVar3 = (uVar15 ^ 0xffffff00) & uVar15;
      local_170[uVar6] = local_170[uVar3];
      local_170[uVar3] = bVar2;
      bVar2 = (local_170[uVar6] ^ bVar2) + (local_170[uVar6] & bVar2) * '\x02';
      (&DAT_00275298)[uVar12] =
           bVar2 & ((&DAT_00275298)[uVar12] ^ 0xff) | (&DAT_00275298)[uVar12] & (bVar2 ^ 0xff);
      uVar12 = (uVar12 << 1 | 2) - (uVar12 ^ 1);
    } while (uVar12 != 0x9ae45e5adf21db1a - DAT_0027b708);
    DAT_00282fc8 = DAT_00282fc8 | 0x1000000;
  }
  DAT_00286214 = 0;
  uVar12 = (-DAT_0027b708 ^ 0x9ae45e5adf21db0b) + (-DAT_0027b708 & 0x9ae45e5adf21db0b) * 2;
  uVar9 = (-DAT_0027b708 | 0x9ae45e5adf21daa7) * 2 - (-DAT_0027b708 ^ 0x9ae45e5adf21daa7);
  iVar10 = 0x275298;
  uVar11 = (-DAT_0027b708 ^ 0x9ae45e5adf221b0b) + (-DAT_0027b708 & 0x1ae45e5adf221b0b) * 2;
  CallSupervisor(0);
  if (*(long *)(lVar7 + 0x28) == local_70) {
    DAT_00286214 = 0;
    return;
  }
LAB_001fdb38:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(uVar9,iVar10,uVar11,uVar12);
}


