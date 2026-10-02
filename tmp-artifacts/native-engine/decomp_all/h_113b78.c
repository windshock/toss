// entry=0x113b78

void H113a78(void)

{
  byte *pbVar1;
  byte *pbVar2;
  uint uVar3;
  uint uVar4;
  undefined **ppuVar5;
  byte bVar6;
  byte bVar7;
  ulong in_x9;
  uint in_w10;
  uint in_w11;
  long unaff_x19;
  
  uVar3 = (in_w10 ^ 0xffffff00) & in_w10;
  uVar3 = (uVar3 ^ 1) + (uVar3 & 1) * 2;
  uVar4 = (in_w11 ^ 0xffffff00) & in_w11;
  pbVar1 = (byte *)(unaff_x19 + 0xef0 + (ulong)((uVar3 ^ 0xffffff00) & uVar3));
  bVar6 = *pbVar1;
  uVar3 = (uVar4 ^ bVar6) + (uVar4 & bVar6) * 2;
  pbVar2 = (byte *)(unaff_x19 + 0xef0 + (ulong)((uVar3 ^ 0xffffff00) & uVar3));
  *pbVar1 = *pbVar2;
  *pbVar2 = bVar6;
  bVar7 = (*pbVar1 ^ bVar6) + (*pbVar1 & bVar6) * '\x02';
  bVar6 = (&DAT_00282790)[in_x9];
  (&DAT_00282790)[in_x9] = (bVar6 | bVar7) & (bVar6 & bVar7 ^ 0xff);
  ppuVar5 = &PTR_LAB_002746a8;
  if ((in_x9 | 1) + (in_x9 & 1) != 0x168) {
    ppuVar5 = &PTR_H113a78_0027eda8;
  }
                    /* WARNING: Could not recover jumptable at 0x00213b74. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar5)();
  return;
}


