// entry=0x51b94

void H51b94(ulong param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  uint uVar3;
  byte bVar4;
  uint in_w11;
  long unaff_x19;
  
  do {
    uVar3 = (in_w11 ^ 0xffffff00) & in_w11;
    pbVar1 = (byte *)(unaff_x19 + 0x360 + param_1);
    bVar4 = *pbVar1;
    in_w11 = (((uVar3 | bVar4) * 2 - (uVar3 ^ bVar4)) -
             ((byte)(&DAT_0012ccd5)[param_1 % 0xb] ^ 0xffffffff)) - 1;
    pbVar2 = (byte *)(unaff_x19 + 0x360 + (ulong)((in_w11 ^ 0xffffff00) & in_w11));
    *pbVar1 = *pbVar2;
    *pbVar2 = bVar4;
    param_1 = param_1 + 1;
  } while (param_1 != 0x100);
  pbVar1 = (byte *)(unaff_x19 + 0x361);
  bVar4 = *pbVar1;
  pbVar2 = (byte *)(unaff_x19 + 0x360 + (ulong)((bVar4 ^ 0xffffff00) & (uint)bVar4));
  *pbVar1 = *pbVar2;
  *pbVar2 = bVar4;
  bVar4 = (*pbVar1 ^ bVar4) + (*pbVar1 & bVar4) * '\x02';
  DAT_0027e7b4 = (DAT_0027e7b4 ^ 0xff) & bVar4 | DAT_0027e7b4 & (bVar4 ^ 0xff);
                    /* WARNING: Could not recover jumptable at 0x0014c388. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027de38)();
  return;
}


