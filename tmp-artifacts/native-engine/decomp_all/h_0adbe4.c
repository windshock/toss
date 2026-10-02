// entry=0xadbe4

void Hadbe4(void)

{
  byte *pbVar1;
  byte *pbVar2;
  undefined **ppuVar3;
  byte bVar4;
  uint uVar5;
  ulong in_x9;
  uint in_w12;
  long unaff_x19;
  
  pbVar1 = (byte *)(unaff_x19 + 0x840 +
                    ((-DAT_0027fb18 | 0x2e00d84656e407c0U) + (-DAT_0027fb18 & 0x2e00d84656e407c0U))
                    * 0x100 + in_x9);
  bVar4 = *pbVar1;
  uVar5 = ((((in_w12 ^ 0xffffff00) & in_w12) - (bVar4 ^ 0xffffffff)) -
          ((byte)(&DAT_0012cc7e)[in_x9 & 0xf] ^ 0xffffffff)) - 2;
  pbVar2 = (byte *)(unaff_x19 + 0x840 +
                   (ulong)((uVar5 ^ (-(int)DAT_0027fb18 ^ 0x56e408bfU) +
                                    (-(int)DAT_0027fb18 & 0x56e408bfU) * 2 ^ 0xffffffff) & uVar5));
  *pbVar1 = *pbVar2;
  *pbVar2 = bVar4;
  ppuVar3 = &PTR_LAB_00278200 +
            (long)(int)((-(int)DAT_0027fb18 ^ 0x56e407c0U) + (-(int)DAT_0027fb18 & 0x56e407c0U) * 2)
            * 0x5b;
  if ((in_x9 | 1) * 2 - (in_x9 ^ 1) != 0x100) {
    ppuVar3 = &PTR_Hadbe4_0027de78;
  }
                    /* WARNING: Could not recover jumptable at 0x001add20. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)();
  return;
}


