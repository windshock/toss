// entry=0x102200

void Hff0c0(ulong param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  uint uVar3;
  byte bVar4;
  byte bVar5;
  uint in_w9;
  uint in_w11;
  long unaff_x19;
  
  do {
    uVar3 = (in_w9 ^ 0xffffff00) & in_w9;
    in_w9 = (uVar3 | 1) + (uVar3 & 1);
    uVar3 = (in_w11 ^ 0xffffff00) & in_w11;
    pbVar1 = (byte *)(unaff_x19 + 0x1030 + (ulong)((in_w9 ^ 0xffffff00) & in_w9));
    bVar4 = *pbVar1;
    in_w11 = (uVar3 | bVar4) * 2 - (uVar3 ^ bVar4);
    pbVar2 = (byte *)(unaff_x19 + 0x1030 + (ulong)((in_w11 ^ 0xffffff00) & in_w11));
    *pbVar1 = *pbVar2;
    *pbVar2 = bVar4;
    bVar5 = (*pbVar1 | bVar4) + (*pbVar1 & bVar4);
    bVar4 = (&DAT_0027a318)[param_1];
    (&DAT_0027a318)[param_1] = (bVar4 | bVar5) & (bVar4 & bVar5 ^ 0xff);
    param_1 = (param_1 | 1) * 2 - (param_1 ^ 1);
  } while (param_1 != 0x10);
                    /* WARNING: Could not recover jumptable at 0x0020248c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00275818)();
  return;
}


