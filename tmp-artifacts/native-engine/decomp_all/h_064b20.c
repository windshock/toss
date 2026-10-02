// entry=0x64b20

void FUN_00164b20(void)

{
  char cVar1;
  bool bVar2;
  long lVar3;
  uint uVar4;
  ulong uVar5;
  undefined1 *puVar6;
  ulong uVar7;
  long lVar8;
  byte bVar9;
  int iVar10;
  int iVar11;
  uint uVar12;
  long lVar13;
  uint uVar14;
  byte *pbVar15;
  byte local_128 [256];
  long local_28;
  
  lVar3 = tpidr_el0;
  local_28 = *(long *)(lVar3 + 0x28);
  do {
    while (DAT_00286214 != 0) {
      ClearExclusiveLocal();
    }
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0x286214,0x10);
    if (bVar2) {
      DAT_00286214 = 1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  if ((DAT_00282fc8 >> 0x20) * (DAT_00282fc8 & 0xffffffff) >> 0x20 == 0) {
    iVar10 = (int)DAT_002752d8;
    pbVar15 = &DAT_00275298;
    lVar13 = (DAT_002752d8 * -2 | 0x150bacac440eed30U) - (-DAT_002752d8 ^ 0x8a85d65622077698U);
    iVar11 = (-iVar10 | 0x9825103aU) + (-iVar10 & 0x9825103aU);
    do {
      bVar9 = *pbVar15;
      puVar6 = (undefined1 *)(ulong)bVar9;
      pbVar15 = pbVar15 + (-DAT_002752d8 | 0x8a85d65622077699U) +
                          (-DAT_002752d8 & 0x8a85d65622077699U);
      lVar13 = (-0x757a29a9ddf88967 - DAT_002752d8) + lVar13;
      uVar14 = -iVar10 ^ 0x220876d7;
      uVar7 = (ulong)uVar14;
      lVar8 = (-DAT_002752d8 | 0x8a85d656220776a7U) + (-DAT_002752d8 & 0x8a85d656220776a7U);
      uVar14 = (-iVar10 | 0x220876d7U) * 2 - uVar14;
      uVar5 = (ulong)uVar14;
      iVar11 = (uint)bVar9 + iVar11 * uVar14;
    } while (lVar13 != lVar8);
    if (iVar11 != 0x31b35812) {
      *(undefined8 *)((ulong)&stack0xfffffffffffffff0 | 8) = 4;
      if (*(long *)(lVar3 + 0x28) == local_28) {
        return;
      }
      goto LAB_00164e8c;
    }
    uVar5 = 0;
    bVar9 = 0;
    do {
      local_128[uVar5] = bVar9;
      uVar5 = (uVar5 << 1 | 2) - (uVar5 ^ 1);
      bVar9 = (bVar9 ^ 1) + (bVar9 & 1) * '\x02';
    } while (uVar5 != 0x100);
    uVar5 = 0;
    uVar14 = (-iVar10 | 0x22077698U) + (-iVar10 & 0x22077698U);
    do {
      bVar9 = local_128[uVar5];
      uVar14 = (uVar14 ^ 0xffffff00) & uVar14;
      uVar14 = (uVar14 ^ bVar9) + (uVar14 & bVar9) * 2;
      uVar14 = (uVar14 | (byte)(&DAT_0012cdb9)[uVar5 % 0xf]) * 2 -
               (uVar14 ^ (byte)(&DAT_0012cdb9)[uVar5 % 0xf]);
      uVar12 = (uVar14 ^ 0xffffff00) & uVar14;
      local_128[uVar5] = local_128[uVar12];
      uVar5 = uVar5 + 1;
      local_128[uVar12] = bVar9;
    } while (uVar5 != 0x100);
    uVar12 = 0;
    uVar5 = 0;
    uVar14 = 0;
    do {
      uVar14 = (uVar14 ^ 0xffffff00) & uVar14;
      uVar14 = (uVar14 << 1 | 2) - (uVar14 ^ 1);
      uVar4 = (uVar14 ^ 0xffffff00) & uVar14;
      bVar9 = local_128[uVar4];
      uVar12 = (uVar12 ^ 0xffffff00) & uVar12;
      uVar12 = (uVar12 | bVar9) * 2 - (uVar12 ^ bVar9);
      lVar13 = ((-DAT_002752d8 | 0x8a85d65622077698U) + (-DAT_002752d8 & 0x8a85d65622077698U)) *
               0x100 + -0x128;
      uVar7 = (ulong)((uVar12 ^ 0xffffff00) & uVar12);
      local_128[uVar4] = local_128[uVar7 + lVar13 + 0x128];
      local_128[uVar7 + lVar13 + 0x128] = bVar9;
      bVar9 = (local_128[uVar4] | bVar9) * '\x02' - (local_128[uVar4] ^ bVar9);
      (&DAT_00275298)[uVar5] =
           bVar9 & ((&DAT_00275298)[uVar5] ^ 0xff) | (&DAT_00275298)[uVar5] & (bVar9 ^ 0xff);
      uVar5 = (uVar5 ^ 1) + (uVar5 & 1) * 2;
    } while (uVar5 != 0xf);
    DAT_00282fc8 = DAT_00282fc8 | 0x2000000000000000;
  }
  DAT_00286214 = 0;
  uVar7 = 0x8a85d6562207b698 - DAT_002752d8;
  uVar5 = 0x8a85d65622077634 - DAT_002752d8;
  puVar6 = &DAT_00275298;
  lVar8 = (-DAT_002752d8 | 0x8a85d65622077698U) + (-DAT_002752d8 & 0x8a85d65622077698U);
  CallSupervisor(0);
  if (*(long *)(lVar3 + 0x28) == local_28) {
    DAT_00286214 = 0;
    return;
  }
LAB_00164e8c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(uVar5,puVar6,uVar7,lVar8);
}


