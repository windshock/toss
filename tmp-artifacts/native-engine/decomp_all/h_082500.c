// entry=0x82500

void H82500(char *param_1)

{
  char cVar1;
  uint uVar2;
  uint uVar3;
  char *pcVar4;
  undefined1 *in_x9;
  char *unaff_x19;
  char *unaff_x26;
  
  *param_1 = '\x11' - (-(char)DAT_00274480 ^ 0xffU);
  *in_x9 = 0;
  do {
    pcVar4 = unaff_x19;
    unaff_x19 = pcVar4 + ((-DAT_00274480 | 0x99bbd15a94f8c2f3U) * 2 -
                         (-DAT_00274480 ^ 0x99bbd15a94f8c2f3U));
  } while (*pcVar4 != '\0');
  cVar1 = *unaff_x26;
  *pcVar4 = cVar1;
  if (cVar1 != (byte)((-(char)DAT_00274480 | 0xf2U) * '\x02' - (-(char)DAT_00274480 ^ 0xf2U))) {
    do {
      cVar1 = unaff_x26[1];
      pcVar4[1] = cVar1;
      pcVar4 = pcVar4 + 1;
      unaff_x26 = unaff_x26 + 1;
    } while (cVar1 != '\0');
  }
  uVar2 = -(int)DAT_00274480;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 300 +
             (long)(int)((uVar2 | 0x94f8c342) * 2 - (uVar2 ^ 0x94f8c342))])();
  uVar2 = -(int)DAT_00274480;
  uVar3 = -(int)DAT_00274480;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar3 | 0x94f8c2f2) * 2 - (uVar3 ^ 0x94f8c2f2)) * 0x2b +
             (long)(int)((uVar2 | 0x94f8c30c) * 2 - (uVar2 ^ 0x94f8c30c))])();
  uVar2 = -(int)DAT_00274480;
  (*(code *)(&DAT_0029e620)
            [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 0x2b +
             (long)(int)((uVar2 | 0x94f8c2f7) * 2 - (uVar2 ^ 0x94f8c2f7))])();
  uVar2 = -(int)DAT_00274480;
  uVar3 = -(int)DAT_00274480;
                    /* WARNING: Could not recover jumptable at 0x00180ab0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00282540)
            (&DAT_0029e620 +
             (long)(int)((uVar3 ^ 0x94f8c2f2) + (uVar3 & 0x94f8c2f2) * 2) * 0x2b +
             (long)(int)((uVar2 ^ 0x94f8c2f7) + (uVar2 & 0x94f8c2f7) * 2));
  return;
}


