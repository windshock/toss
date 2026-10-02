// entry=0x34ff8

void FUN_00134ff8(void)

{
  uint uVar1;
  char cVar2;
  bool bVar3;
  long lVar4;
  uint uVar5;
  ulong uVar6;
  undefined1 *puVar7;
  ulong uVar8;
  long lVar9;
  byte bVar10;
  uint uVar11;
  long lVar12;
  uint uVar13;
  byte *pbVar14;
  byte local_128 [256];
  long local_28;
  
  lVar4 = tpidr_el0;
  local_28 = *(long *)(lVar4 + 0x28);
  do {
    while (DAT_00286214 != 0) {
      ClearExclusiveLocal();
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x286214,0x10);
    if (bVar3) {
      DAT_00286214 = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  if ((DAT_00282fc8 >> 0x20) * (DAT_00282fc8 & 0xffffffff) >> 0x20 == 0) {
    pbVar14 = &DAT_00275298;
    uVar11 = 0x1057a6eb - (int)DAT_00274f40;
    lVar12 = (-DAT_00274f40 | 0x4d00f9b804d5485U) + (-DAT_00274f40 & 0x4d00f9b804d5485U);
    do {
      bVar10 = *pbVar14;
      puVar7 = (undefined1 *)(ulong)bVar10;
      uVar1 = -(int)DAT_00274f40;
      pbVar14 = pbVar14 + (-DAT_00274f40 | 0x4d00f9b804d5486U) +
                          (-DAT_00274f40 & 0x4d00f9b804d5486U);
      uVar13 = uVar1 ^ 0x804d54a6;
      uVar8 = (ulong)uVar13;
      lVar12 = (0x4d00f9b804d5486 - DAT_00274f40) + lVar12;
      uVar13 = (uVar1 | 0x804d54a6) * 2 - uVar13;
      uVar6 = (ulong)uVar13;
      lVar9 = (-DAT_00274f40 | 0x4d00f9b804d5494U) + (-DAT_00274f40 & 0x4d00f9b804d5494U);
      uVar11 = uVar11 * uVar13 ^ (uint)bVar10;
    } while (lVar12 != lVar9);
    if (uVar11 != 0xdbb0adce) {
      *(undefined8 *)((ulong)&stack0xfffffffffffffff0 ^ 8) = 0x28;
      if (*(long *)(lVar4 + 0x28) == local_28) {
        return;
      }
      goto LAB_00135340;
    }
    uVar6 = 0;
    bVar10 = 0;
    do {
      local_128[uVar6] = bVar10;
      uVar6 = (uVar6 ^ 1) + (uVar6 & 1) * 2;
      bVar10 = (bVar10 | 1) + (bVar10 & 1);
    } while (uVar6 != (-DAT_00274f40 | 0x4d00f9b804d5585U) * 2 -
                      (-DAT_00274f40 ^ 0x4d00f9b804d5585U));
    uVar6 = 0;
    uVar11 = 0;
    do {
      bVar10 = local_128[uVar6];
      uVar11 = ((uVar11 ^ 0xffffff00) & uVar11) + (uint)bVar10 +
               (uint)(byte)(&DAT_0012cdb9)[uVar6 % 0xf];
      uVar13 = (uVar11 ^ 0xffffff00) & uVar11;
      local_128[uVar6] = local_128[uVar13];
      uVar6 = (uVar6 ^ 1) + (uVar6 & 1) * 2;
      local_128[uVar13] = bVar10;
    } while (uVar6 != 0x100);
    uVar11 = 0;
    uVar6 = 0;
    uVar13 = 0;
    do {
      uVar13 = (uVar13 ^ 0xffffff00) & uVar13;
      uVar13 = (uVar13 << 1 | 2) - (uVar13 ^ 1);
      uVar1 = (uVar13 ^ 0xffffff00) & uVar13;
      bVar10 = local_128[uVar1];
      uVar11 = (uint)bVar10 + ((uVar11 ^ 0xffffff00) & uVar11);
      uVar5 = ((-(int)DAT_00274f40 | 0x804d5584U) + (-(int)DAT_00274f40 & 0x804d5584U) ^
              uVar11 ^ 0xffffffff) & uVar11;
      local_128[uVar1] = local_128[uVar5];
      local_128[uVar5] = bVar10;
      bVar10 = (local_128[uVar1] ^ bVar10) + (local_128[uVar1] & bVar10) * '\x02';
      (&DAT_00275298)[uVar6] =
           ((&DAT_00275298)[uVar6] | bVar10) & ((&DAT_00275298)[uVar6] & bVar10 ^ 0xff);
      uVar6 = (uVar6 ^ 1) + (uVar6 & 1) * 2;
    } while (uVar6 != 0xf);
    DAT_00282fc8 = DAT_00282fc8 | 0x8000000000000000;
  }
  DAT_00286214 = 0;
  uVar8 = 0x4d00f9b804d9485 - DAT_00274f40;
  uVar6 = (-DAT_00274f40 | 0x4d00f9b804d5421U) * 2 - (-DAT_00274f40 ^ 0x4d00f9b804d5421U);
  puVar7 = &DAT_00275298;
  lVar9 = (-DAT_00274f40 ^ 0x4d00f9b804d5485U) + (-DAT_00274f40 & 0x4d00f9b804d5485U) * 2;
  CallSupervisor(0);
  if (*(long *)(lVar4 + 0x28) == local_28) {
    DAT_00286214 = 0;
    return;
  }
LAB_00135340:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(uVar6,puVar7,uVar8,lVar9);
}


