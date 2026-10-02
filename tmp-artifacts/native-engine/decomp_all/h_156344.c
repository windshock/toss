// entry=0x156344

void H156344(void)

{
  bool bVar1;
  undefined **ppuVar2;
  uint uVar3;
  byte in_w8;
  uint in_w9;
  int unaff_w23;
  uint unaff_w24;
  long unaff_x25;
  
  if (in_w9 != in_w8) {
    unaff_x25 = 0;
  }
  uVar3 = -(int)DAT_00277160;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar3 ^ 0xfa09c241) + (uVar3 & 0xfa09c241) * 2) * 0x2b +
             (long)(int)(-0x5f63da6 - (-(int)DAT_00277160 ^ 0xffffffffU))])();
  bVar1 = (int)((unaff_w24 ^ 1) + (unaff_w24 & 1) * 2) < unaff_w23;
  ppuVar2 = &PTR_LAB_0027d450;
  if (bVar1 == (unaff_x25 != 0) || !bVar1) {
    ppuVar2 = &PTR_LAB_00281460;
  }
                    /* WARNING: Could not recover jumptable at 0x00256414. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


