// entry=0x105a74

void H105a74(void)

{
  byte *pbVar1;
  byte *pbVar2;
  uint uVar3;
  uint uVar4;
  undefined **ppuVar5;
  byte bVar6;
  byte bVar7;
  long in_x6;
  ulong in_x11;
  uint in_w12;
  uint in_w13;
  
  uVar3 = (in_w12 ^ 0xffffff00) & in_w12;
  uVar3 = (uVar3 ^ 1) + (uVar3 & 1) * 2;
  uVar4 = (in_w13 ^ 0xffffff00) & in_w13;
  pbVar1 = (byte *)(in_x6 + (ulong)((uVar3 ^ 0xffffff00) & uVar3));
  bVar6 = *pbVar1;
  uVar3 = (uVar4 | bVar6) + (uVar4 & bVar6);
  pbVar2 = (byte *)(in_x6 + (ulong)((uVar3 ^ 0xffffff00) & uVar3));
  *pbVar1 = *pbVar2;
  *pbVar2 = bVar6;
  bVar6 = (*pbVar1 ^ bVar6) + (*pbVar1 & bVar6) * '\x02';
  bVar7 = *(byte *)((long)&DAT_00283608 + in_x11);
  *(byte *)((long)&DAT_00283608 + in_x11) = (bVar7 | bVar6) & (bVar7 & bVar6 ^ 0xff);
  ppuVar5 = &PTR_LAB_00283ca0;
  if ((in_x11 | 1) + (in_x11 & 1) != 9) {
    ppuVar5 = &PTR_H105a74_0027d8a0;
  }
                    /* WARNING: Could not recover jumptable at 0x00205b6c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar5)();
  return;
}


