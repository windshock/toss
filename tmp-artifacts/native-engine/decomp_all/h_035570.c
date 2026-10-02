// entry=0x35570

undefined8 H35570(byte *param_1,undefined8 param_2,undefined8 param_3,long *param_4)

{
  char cVar1;
  char cVar2;
  undefined **ppuVar3;
  byte bVar4;
  uint uVar5;
  bool bVar6;
  undefined8 uVar7;
  uint uVar8;
  
  if (*param_1 != (byte)((-(char)DAT_00275240 | 0xa1U) + (-(char)DAT_00275240 & 0xa1U))) {
    *param_4 = (long)(param_1 + 1);
    bVar4 = *param_1;
    uVar8 = (uint)bVar4;
    if ((0x2f < uVar8) &&
       (cVar1 = (char)DAT_00275240, uVar5 = (int)(char)('g' - (-cVar1 ^ 0xffU)) - 1,
       bVar6 = (byte)((bVar4 ^ (byte)uVar5) + (char)((uVar8 & uVar5 & 0x7f) << 1)) < 0x27,
       (0x66 >= uVar8 || !bVar6) && 0x66 < uVar8 == bVar6)) {
      cVar2 = '0';
      if (0x39 < uVar8) {
        cVar2 = (-cVar1 | 0xf8U) + (-cVar1 & 0xf8U);
      }
      ppuVar3 = &PTR_LAB_002755a0;
      if (param_1[1] != (byte)((-cVar1 | 0xa1U) * '\x02' - (-cVar1 ^ 0xa1U))) {
        ppuVar3 = &PTR_LAB_0027a148;
      }
                    /* WARNING: Could not recover jumptable at 0x00135720. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar7 = (*(code *)*ppuVar3)((char)(((uVar8 | -(int)cVar2 & 0xffU) & 0x7f) << 1) -
                                  (bVar4 ^ (byte)-(int)cVar2));
      return uVar7;
    }
  }
  return 0;
}


