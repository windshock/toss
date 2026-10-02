// entry=0x4c98c

void H4b8a0(ulong param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  uint uVar3;
  undefined **ppuVar4;
  byte bVar5;
  uint in_w12;
  long unaff_x19;
  
  uVar3 = (in_w12 ^ 0xffffff00) & in_w12;
  pbVar1 = (byte *)(unaff_x19 + 0x870 + param_1);
  bVar5 = *pbVar1;
  uVar3 = (((uVar3 | bVar5) * 2 - (uVar3 ^ bVar5)) -
          ((byte)(&DAT_0012cc7e)[param_1 & 0xf] ^ 0xffffffff)) - 1;
  pbVar2 = (byte *)(unaff_x19 + 0x870 + (ulong)((uVar3 ^ 0xffffff00) & uVar3));
  *pbVar1 = *pbVar2;
  *pbVar2 = bVar5;
  ppuVar4 = &PTR_LAB_00280cb8 +
            (long)(int)((-(int)DAT_00275ca8 ^ 0xf97b14d4U) + (-(int)DAT_00275ca8 & 0xf97b14d4U) * 2)
            * 0x65;
  if ((param_1 ^ 1) + (param_1 & 1) * 2 != 0x100) {
    ppuVar4 = &PTR_H4b8a0_0027fbb8;
  }
                    /* WARNING: Could not recover jumptable at 0x0014b984. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar4)();
  return;
}


