// entry=0x1036ec

void H10361c(void)

{
  uint uVar1;
  undefined **ppuVar2;
  byte bVar3;
  ulong in_x11;
  uint in_w12;
  
  uVar1 = (in_w12 ^ 0xffffff00) & in_w12;
  bVar3 = (&stack0x00000010)[in_x11];
  uVar1 = (uVar1 | bVar3) * 2 - (uVar1 ^ bVar3);
  uVar1 = (uVar1 | (byte)(&DAT_0012cc5c)[in_x11 % 0xc]) * 2 -
          (uVar1 ^ (byte)(&DAT_0012cc5c)[in_x11 % 0xc]);
  (&stack0x00000010)[in_x11] = (&stack0x00000010)[(uVar1 ^ 0xffffff00) & uVar1];
  (&stack0x00000010)[(uVar1 ^ 0xffffff00) & uVar1] = bVar3;
  ppuVar2 = &PTR_LAB_00281db0;
  if (in_x11 != 0xff) {
    ppuVar2 = &PTR_H10361c_0027d960;
  }
                    /* WARNING: Could not recover jumptable at 0x002036e4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)(0);
  return;
}


