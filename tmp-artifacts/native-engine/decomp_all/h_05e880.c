// entry=0x5e880

void H5e880(void)

{
  byte *pbVar1;
  byte *pbVar2;
  uint uVar3;
  undefined **ppuVar4;
  byte bVar5;
  ulong in_x11;
  uint in_w12;
  long unaff_x19;
  
  uVar3 = (in_w12 ^ 0xffffff00) & in_w12;
  pbVar1 = (byte *)(unaff_x19 + 0x760 + in_x11);
  bVar5 = *pbVar1;
  uVar3 = (uVar3 | bVar5) * 2 - (uVar3 ^ bVar5);
  uVar3 = (uVar3 ^ (byte)(&DAT_0012ce33)[in_x11 & 0xf]) +
          (uVar3 & (byte)(&DAT_0012ce33)[in_x11 & 0xf]) * 2;
  pbVar2 = (byte *)(unaff_x19 + 0x760 + (ulong)((uVar3 ^ 0xffffff00) & uVar3));
  *pbVar1 = *pbVar2;
  *pbVar2 = bVar5;
  ppuVar4 = &PTR_LAB_002785a0;
  if ((in_x11 | 1) * 2 - (in_x11 ^ 1) != 0x100) {
    ppuVar4 = &PTR_H5e880_0027cfd0;
  }
                    /* WARNING: Could not recover jumptable at 0x0015e938. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar4)(0);
  return;
}


