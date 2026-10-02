// entry=0x15e320

void H15e320(ulong param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  ulong uVar3;
  uint uVar4;
  undefined **ppuVar5;
  byte bVar6;
  byte bVar7;
  uint in_w10;
  uint in_w11;
  long unaff_x19;
  
  uVar4 = (in_w10 ^ 0xffffff00) & in_w10;
  uVar4 = (uVar4 | 1) + (uVar4 & 1);
  pbVar1 = (byte *)(unaff_x19 + 0xb0 + (ulong)((uVar4 ^ 0xffffff00) & uVar4));
  bVar6 = *pbVar1;
  uVar4 = (((in_w11 ^ (-(int)DAT_00285720 | 0x4b98a39fU) * 2 - (-(int)DAT_00285720 ^ 0x4b98a39fU) ^
                      0xffffffff) & in_w11) - (bVar6 ^ 0xffffffff)) - 1;
  pbVar2 = (byte *)(unaff_x19 + 0xb0 + (ulong)((uVar4 ^ 0xffffff00) & uVar4));
  *pbVar1 = *pbVar2;
  *pbVar2 = bVar6;
  bVar7 = (*pbVar1 - (bVar6 ^ 0xff)) - 1;
  bVar6 = (&DAT_0027e7b4)[param_1];
  (&DAT_0027e7b4)[param_1] = (bVar6 | bVar7) & (bVar6 & bVar7 ^ 0xff);
  uVar3 = (-DAT_00285720 ^ 0x4e91c1194b98a2a1U) + (-DAT_00285720 & 0x4e91c1194b98a2a1U) * 2;
  ppuVar5 = &PTR_LAB_002762e8;
  if ((param_1 | uVar3) * 2 - (param_1 ^ uVar3) != 7) {
    ppuVar5 = &PTR_H15e320_00280968;
  }
                    /* WARNING: Could not recover jumptable at 0x0025e468. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar5)();
  return;
}


