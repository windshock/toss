// entry=0x15f0a0

void H15f0a0(undefined8 param_1,ulong param_2)

{
  undefined **ppuVar1;
  long in_x11;
  ulong in_x15;
  long in_x16;
  char in_w17;
  ulong uVar2;
  long unaff_x26;
  
  if ((param_2 & 1) == 0) {
    do {
      *(char *)(unaff_x26 + in_x15) = in_w17;
      uVar2 = 0x4e91c1194b98a2a0 - (-DAT_00285720 ^ 0xffffffffffffffffU);
      in_x15 = (in_x15 ^ uVar2) + (in_x15 & uVar2) * 2;
      in_w17 = *(char *)(in_x11 + 1);
      in_x11 = in_x11 + 1;
    } while (in_x15 < 0x800 != (in_w17 == '\0') && in_x15 < 0x800);
  }
  ppuVar1 = &PTR_LAB_002763d0;
  if (in_x15 < 0x800 ==
      (*(char *)(in_x16 + 1) ==
      (byte)((-(char)DAT_00285720 | 0xa0U) * '\x02' - (-(char)DAT_00285720 ^ 0xa0U))) ||
      in_x15 >= 0x800) {
    ppuVar1 = &PTR_LAB_0027b478;
  }
                    /* WARNING: Could not recover jumptable at 0x0025b8fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(1);
  return;
}


