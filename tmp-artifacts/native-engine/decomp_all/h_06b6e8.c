// entry=0x6b6e8

void H6b488(ulong param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  uint uVar3;
  uint uVar4;
  undefined **ppuVar5;
  byte bVar6;
  byte bVar7;
  uint in_w9;
  uint in_w10;
  long unaff_x23;
  
  uVar3 = (in_w9 ^ 0xffffff00) & in_w9;
  uVar3 = (uVar3 | 1) + (uVar3 & 1);
  uVar4 = (in_w10 ^ 0xffffff00) & in_w10;
  pbVar1 = (byte *)(unaff_x23 + (ulong)((uVar3 ^ 0xffffff00) & uVar3));
  bVar6 = *pbVar1;
  uVar3 = (uVar4 | bVar6) + (uVar4 & bVar6);
  pbVar2 = (byte *)(unaff_x23 + (ulong)((uVar3 ^ 0xffffff00) & uVar3));
  *pbVar1 = *pbVar2;
  *pbVar2 = bVar6;
  bVar7 = (*pbVar1 ^ bVar6) + (*pbVar1 & bVar6) * '\x02';
  bVar6 = (&DAT_0027cb48)[param_1];
  (&DAT_0027cb48)[param_1] = (bVar6 | bVar7) & (bVar6 & bVar7 ^ 0xff);
  ppuVar5 = &PTR_LAB_0027ada0;
  if ((param_1 ^ 1) + (param_1 & 1) * 2 != 0x400) {
    ppuVar5 = &PTR_H6b488_00280710;
  }
                    /* WARNING: Could not recover jumptable at 0x0016b580. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar5)();
  return;
}


