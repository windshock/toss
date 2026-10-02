// entry=0x4db10

void H4db10(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint in_w12;
  uint uVar3;
  byte *in_x13;
  int in_w14;
  
  uVar2 = ((in_w14 * 0x1003f ^ in_w12) + (in_w14 * 0x1003f & in_w12) * 2) * 0x1003f;
  uVar2 = ((uVar2 | *in_x13) + (uVar2 & *in_x13)) *
          (-0x683eaee - (-(int)DAT_00275ca8 ^ 0xffffffffU));
  uVar2 = ((uVar2 ^ in_x13[1]) + (uVar2 & in_x13[1]) * 2) * 0x1003f;
  uVar3 = (uint)in_x13[(-DAT_00275ca8 | 0x642804bbf97b14d5U) + (-DAT_00275ca8 & 0x642804bbf97b14d5U)
                       + 1];
  uVar2 = ((uVar2 | uVar3) + (uVar2 & uVar3)) * 0x1003f;
  uVar3 = (uint)(in_x13 + (-DAT_00275ca8 | 0x642804bbf97b14d5U) +
                          (-DAT_00275ca8 & 0x642804bbf97b14d5U) + 1)
                [(-DAT_00275ca8 ^ 0x642804bbf97b14d5U) + (-DAT_00275ca8 & 0x642804bbf97b14d5U) * 2];
  ppuVar1 = &PTR_LAB_00275420;
  if ((uVar2 | uVar3) * 2 - (uVar2 ^ uVar3) != 0x2d0f7194) {
    ppuVar1 = &PTR_LAB_0027f148;
  }
                    /* WARNING: Could not recover jumptable at 0x00159cec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


