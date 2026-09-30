// FUN_001545f0 @001545f0

void FUN_001545f0(void)

{
  uint uVar1;
  ushort uVar2;
  ushort uVar3;
  ushort in_w8;
  ushort in_w9;
  
  uVar1 = (int)(short)(in_w9 | 0x17d0) + (int)(short)(in_w9 & 0x17d0);
  uVar1 = (uVar1 ^ 0xfff8) & 0xffff & uVar1;
  uVar3 = -(short)DAT_00275ca8;
  uVar2 = -(short)DAT_00275ca8;
  FUN_0014c83c((short)((int)(short)((in_w8 ^ (ushort)((int)(short)(uVar3 | 0x14d5) +
                                                      (int)(short)(uVar3 & 0x14d5) <<
                                                     (ulong)(uVar1 & 0x1f)) ^ 0xffff) & in_w8) >>
                      (uVar1 & 0x1f)) == (ushort)((uVar2 ^ 0x14d5) + (uVar2 & 0x14d5) * 2));
  return;
}

