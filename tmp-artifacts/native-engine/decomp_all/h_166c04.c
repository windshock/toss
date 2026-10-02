// entry=0x166c04

void H166864(void)

{
  uint uVar1;
  byte *pbVar2;
  byte *pbVar3;
  uint uVar4;
  undefined **ppuVar5;
  byte bVar6;
  byte bVar7;
  int iVar8;
  uint in_w8;
  long unaff_x21;
  uint unaff_w22;
  long unaff_x24;
  
  uVar4 = (in_w8 ^ 0xffffff00) & in_w8;
  iVar8 = (*(code *)PTR_FUN_00283940)();
  uVar1 = (-iVar8 ^ 0x5de4360dU) + (-iVar8 & 0x5de4360dU) * 2;
  uVar1 = (uVar4 ^ uVar1) + (uVar4 & uVar1) * 2;
  uVar4 = (unaff_w22 ^ 0xffffff00) & unaff_w22;
  pbVar2 = (byte *)(unaff_x24 + (ulong)((uVar1 ^ 0xffffff00) & uVar1));
  bVar6 = *pbVar2;
  uVar1 = (uVar4 | bVar6) + (uVar4 & bVar6);
  pbVar3 = (byte *)(unaff_x24 + (ulong)((uVar1 ^ 0xffffff00) & uVar1));
  *pbVar2 = *pbVar3;
  *pbVar3 = bVar6;
  bVar7 = (*pbVar2 | bVar6) * '\x02' - (*pbVar2 ^ bVar6);
  bVar6 = (&DAT_00283640)[unaff_x21];
  (&DAT_00283640)[unaff_x21] = (bVar6 ^ 0xff) & bVar7 | bVar6 & (bVar7 ^ 0xff);
  ppuVar5 = &PTR_LAB_00282058;
  if (unaff_x21 != 0x17) {
    ppuVar5 = (undefined **)&DAT_0027ecf0;
  }
                    /* WARNING: Could not recover jumptable at 0x0026699c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar5)();
  return;
}


