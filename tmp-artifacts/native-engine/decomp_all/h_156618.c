// entry=0x156618

void H156618(undefined8 param_1,undefined8 param_2,long param_3)

{
  bool bVar1;
  undefined **ppuVar2;
  int iVar3;
  int unaff_w23;
  uint unaff_w24;
  long unaff_x25;
  
  iVar3 = (int)DAT_00277160;
  if (*(byte *)(param_3 + 5) !=
      (byte)((-(char)DAT_00277160 ^ 0xb5U) + (-(char)DAT_00277160 & 0x35U) * '\x02')) {
    if (0xfa09c2b4 - (-iVar3 ^ 0xffffffffU) != (uint)*(byte *)(param_3 + 5)) {
      unaff_x25 = 0;
    }
    (*(code *)(&DAT_0029e620)
              [(long)(int)((-iVar3 ^ 0xfa09c241U) + (-iVar3 & 0xfa09c241U) * 2) * 0x2b +
               (long)(int)(-0x5f63da6 - (-iVar3 ^ 0xffffffffU))])();
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
                    /* WARNING: Could not recover jumptable at 0x002557b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00275050)(*(undefined1 *)(param_3 + 6));
  return;
}


