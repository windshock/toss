// entry=0xd0f54

void Hd0f54(void)

{
  byte *pbVar1;
  uint uVar2;
  undefined **ppuVar3;
  byte bVar4;
  ulong in_x11;
  uint in_w12;
  long unaff_x20;
  
  uVar2 = (in_w12 ^ 0xffffff00) & in_w12;
  bVar4 = *(byte *)(unaff_x20 + in_x11);
  uVar2 = (uVar2 ^ bVar4) + (uVar2 & bVar4) * 2;
  uVar2 = (uVar2 | (byte)(&DAT_0012cde5)[in_x11 % 0xe]) * 2 -
          (uVar2 ^ (byte)(&DAT_0012cde5)[in_x11 % 0xe]);
  pbVar1 = (byte *)(unaff_x20 +
                   (ulong)((uVar2 ^ (-(int)DAT_00283df0 | 0x15b28b19U) * 2 -
                                    (-(int)DAT_00283df0 ^ 0x15b28b19U) ^ 0xffffffff) & uVar2));
  *(byte *)(unaff_x20 + in_x11) = *pbVar1;
  *pbVar1 = bVar4;
  ppuVar3 = &PTR_LAB_00274710;
  if ((in_x11 | 1) + (in_x11 & 1) != 0x100) {
    ppuVar3 = &PTR_Hd0f54_0027e798;
  }
                    /* WARNING: Could not recover jumptable at 0x001d1034. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)(0);
  return;
}


