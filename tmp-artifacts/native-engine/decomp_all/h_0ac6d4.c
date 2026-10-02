// entry=0xac6d4

void Hac2c4(ulong param_1)

{
  byte *pbVar1;
  ulong uVar2;
  byte *pbVar3;
  uint uVar4;
  undefined **ppuVar5;
  byte bVar6;
  ulong uVar7;
  uint in_w12;
  long unaff_x19;
  
  uVar4 = (in_w12 ^ 0xffffff00) & in_w12;
  pbVar1 = (byte *)(unaff_x19 + 0x330 + param_1);
  bVar6 = *pbVar1;
  uVar2 = (-DAT_0027fb18 ^ 0x2e00d84656e407cbU) + (-DAT_0027fb18 & 0x2e00d84656e407cbU) * 2;
  uVar7 = 0;
  if (uVar2 != 0) {
    uVar7 = param_1 / uVar2;
  }
  uVar4 = (((uVar4 | bVar6) * 2 - (uVar4 ^ bVar6)) -
          ((byte)(&DAT_0012ccd5)[param_1 - uVar7 * uVar2] ^ 0xffffffff)) - 1;
  pbVar3 = (byte *)(unaff_x19 + 0x330 + (ulong)((uVar4 ^ 0xffffff00) & uVar4));
  *pbVar1 = *pbVar3;
  *pbVar3 = bVar6;
  ppuVar5 = (undefined **)&DAT_00283520;
  if ((param_1 ^ 1) + (param_1 & 1) * 2 != 0x100) {
    ppuVar5 = &PTR_LAB_0027db28 +
              (int)((-(int)DAT_0027fb18 ^ 0x56e407ceU) + (-(int)DAT_0027fb18 & 0x56e407ceU) * 2);
  }
                    /* WARNING: Could not recover jumptable at 0x001ac3c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar5)();
  return;
}


