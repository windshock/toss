// entry=0x1673a8

void H1673a8(ulong param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  byte bVar3;
  int iVar4;
  ulong uVar5;
  char in_w9;
  uint uVar6;
  long unaff_x24;
  
  do {
    *(char *)(unaff_x24 + param_1) = in_w9;
    param_1 = (param_1 ^ 1) + (param_1 & 1) * 2;
    in_w9 = in_w9 + '\x01';
  } while (param_1 != 0x100);
  uVar5 = 0;
  uVar6 = 0;
  do {
    uVar6 = (uVar6 ^ 0xffffff00) & uVar6;
    bVar3 = *(byte *)(unaff_x24 + uVar5);
    uVar6 = (((uVar6 | bVar3) + (uVar6 & bVar3)) -
            ((byte)(&DAT_0012ce10)[uVar5 % 0x11] ^ 0xffffffff)) - 1;
    pbVar2 = (byte *)(unaff_x24 + (ulong)((uVar6 ^ 0xffffff00) & uVar6));
    *(byte *)(unaff_x24 + uVar5) = *pbVar2;
    *pbVar2 = bVar3;
    uVar5 = (uVar5 | 1) + (uVar5 & 1);
  } while (uVar5 != 0x100);
  iVar4 = (*(code *)PTR_FUN_00283940)();
  uVar6 = (-iVar4 ^ 0x5de4360dU) + (-iVar4 & 0x5de4360dU) * 2;
  pbVar2 = (byte *)(unaff_x24 + (ulong)((uVar6 ^ 0xffffff00) & uVar6));
  bVar3 = *pbVar2;
  pbVar1 = (byte *)(unaff_x24 + (ulong)((bVar3 ^ 0xffffff00) & (uint)bVar3));
  *pbVar2 = *pbVar1;
  *pbVar1 = bVar3;
  bVar3 = (*pbVar2 | bVar3) * '\x02' - (*pbVar2 ^ bVar3);
  DAT_00283640 = (DAT_00283640 ^ 0xff) & bVar3 | DAT_00283640 & (bVar3 ^ 0xff);
                    /* WARNING: Could not recover jumptable at 0x0026699c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*DAT_0027ecf0)();
  return;
}


