// entry=0xaf84c

void Haf84c(void)

{
  undefined **ppuVar1;
  char cVar2;
  char in_w8;
  long unaff_x19;
  char *pcVar3;
  char *unaff_x20;
  
  pcVar3 = unaff_x20;
  if (in_w8 != ':') {
    do {
      unaff_x20 = pcVar3 + (0x2e00d84656e407c0 - (-DAT_0027fb18 ^ 0xffffffffffffffffU));
      cVar2 = *pcVar3;
      pcVar3 = unaff_x20;
    } while (cVar2 != (byte)((-(char)DAT_0027fb18 | 0xfaU) * '\x02' - (-(char)DAT_0027fb18 ^ 0xfaU))
            );
  }
  memset(*(void **)(unaff_x19 + 0x290),0,0x801);
  ppuVar1 = &PTR_LAB_0027bbb8;
  if (0 < (int)(((int)*(undefined8 *)(unaff_x19 + 0x38) - (-(int)unaff_x20 ^ 0xffffffffU)) + -1)) {
    ppuVar1 = &PTR_LAB_00281ac8;
  }
                    /* WARNING: Could not recover jumptable at 0x0019b2c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


