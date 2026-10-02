// entry=0xc2ba8

void Hc29e0(ulong param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  uint uVar3;
  undefined **ppuVar4;
  byte bVar5;
  uint uVar6;
  byte bVar7;
  uint in_w9;
  uint in_w10;
  long unaff_x24;
  
  uVar3 = (in_w9 ^ 0xffffff00) & in_w9;
  uVar6 = (uVar3 | 1) * 2 - (uVar3 ^ 1);
  uVar3 = (in_w10 ^ 0xffffff00) & in_w10;
  pbVar1 = (byte *)(unaff_x24 + (ulong)((uVar6 ^ 0xffffff00) & uVar6));
  bVar5 = *pbVar1;
  uVar3 = (uVar3 ^ bVar5) + (uVar3 & bVar5) * 2;
  pbVar2 = (byte *)(unaff_x24 + (ulong)((uVar3 ^ 0xffffff00) & uVar3));
  *pbVar1 = *pbVar2;
  *pbVar2 = bVar5;
  bVar7 = (*pbVar1 ^ bVar5) + (*pbVar1 & bVar5) * '\x02';
  bVar5 = (&DAT_0027a318)[param_1];
  (&DAT_0027a318)[param_1] = (bVar5 | bVar7) & (bVar5 & bVar7 ^ 0xff);
  ppuVar4 = &PTR_LAB_0027b620;
  if ((param_1 | 1) + (param_1 & 1) != 0x10) {
    ppuVar4 = &PTR_Hc29e0_0027ed38;
  }
                    /* WARNING: Could not recover jumptable at 0x001c2adc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar4)();
  return;
}


