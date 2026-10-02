// entry=0x5c2c8

void H5bd20(void)

{
  byte *pbVar1;
  undefined **ppuVar2;
  uint uVar3;
  int iVar4;
  long in_x10;
  long in_x12;
  uint uVar5;
  byte *in_x13;
  int in_w14;
  
  iVar4 = (int)DAT_00275ca8;
  uVar3 = in_w14 * ((-iVar4 | 0xf97c1513U) + (-iVar4 & 0xf97c1513U));
  pbVar1 = in_x13 + (-DAT_00275ca8 | 0x642804bbf97b14d5U) + (-DAT_00275ca8 & 0x642804bbf97b14d5U) +
           (-DAT_00275ca8 ^ 0x642804bbf97b14d5U) + (-DAT_00275ca8 & 0x642804bbf97b14d5U) * 2;
  uVar3 = ((uVar3 | *in_x13) + (uVar3 & *in_x13)) *
          ((-iVar4 ^ 0xf97c1513U) + (-iVar4 & 0xf97c1513U) * 2);
  uVar5 = (uint)in_x13[(-DAT_00275ca8 | 0x642804bbf97b14d5U) + (-DAT_00275ca8 & 0x642804bbf97b14d5U)
                      ];
  uVar3 = ((uVar3 ^ uVar5) + (uVar3 & uVar5) * 2) * (-0x683eaee - (-iVar4 ^ 0xffffffffU));
  uVar3 = ((((uVar3 | *pbVar1) * 2 - (uVar3 ^ *pbVar1)) * 0x1003f - (pbVar1[1] ^ 0xffffffff)) + -1)
          * 0x1003f;
  uVar5 = (uint)pbVar1[2];
  uVar3 = ((uVar3 | uVar5) + (uVar3 & uVar5)) * ((-iVar4 | 0xf97c1513U) + (-iVar4 & 0xf97c1513U));
  uVar5 = (uint)(pbVar1 + 2)
                [(-DAT_00275ca8 | 0x642804bbf97b14d5U) + (-DAT_00275ca8 & 0x642804bbf97b14d5U)];
  if ((uVar3 | uVar5) * 2 - (uVar3 ^ uVar5) != 0x7d8b68ec) {
    ppuVar2 = &PTR_LAB_00280820;
    if (in_x12 != in_x10) {
      ppuVar2 = &PTR_LAB_0027ec58;
    }
                    /* WARNING: Could not recover jumptable at 0x00150844. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0015bccc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002858d8)();
  return;
}


