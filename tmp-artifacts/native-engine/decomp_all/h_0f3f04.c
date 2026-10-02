// entry=0xf3f04

void Hf3f04(void)

{
  undefined **ppuVar1;
  ulong uVar2;
  uint uVar3;
  uint uVar4;
  char *pcVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  char *pcVar9;
  ulong in_x11;
  ulong in_x13;
  ulong in_x15;
  long *unaff_x19;
  char *pcVar10;
  ulong unaff_x24;
  long unaff_x25;
  undefined1 auVar11 [16];
  
  *(byte *)(*unaff_x19 + in_x13) =
       (-(char)DAT_00285dc0 ^ 0x29U) + (-(char)DAT_00285dc0 & 0x29U) * '\x02';
  if (in_x13 < 0xff) {
    uVar2 = 10;
    if ((in_x15 & 1) == 0) {
      uVar2 = 0x10;
    }
    uVar7 = 0x94d41c6bb5830cfb - (-DAT_00285dc0 ^ 0xffffffffffffffffU);
    uVar8 = 0;
    if (uVar2 != 0) {
      uVar8 = in_x11 / uVar2;
    }
    *(undefined1 *)(unaff_x19[1] + uVar7) =
         (&DAT_0027ad10)
         [(in_x11 | -(uVar8 * uVar2)) + (in_x11 & -(uVar8 * uVar2)) +
          (-0x6b2be3944a7cf305 - (-DAT_00285dc0 ^ 0xffffffffffffffffU)) * 0x10];
    ppuVar1 = &PTR_LAB_00285810;
    if (uVar2 <= in_x11) {
      ppuVar1 = &PTR_LAB_00281b28;
    }
                    /* WARNING: Could not recover jumptable at 0x001f6454. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)((uVar7 | 1) * 2 - (uVar7 ^ 1));
    return;
  }
  pcVar10 = (char *)*unaff_x19;
  pcVar10[(-0x6b2be3944a7cf305 - (-DAT_00285dc0 ^ 0xffffffffffffffffU)) * 0x100 + 0xff] = '\0';
  pcVar5 = pcVar10;
  do {
    pcVar9 = pcVar5;
    pcVar5 = pcVar9 + 1;
  } while (*pcVar9 != (byte)((-(char)DAT_00285dc0 ^ 0xfcU) + (-(char)DAT_00285dc0 & 0x7cU) * '\x02')
          );
  uVar2 = ((ulong)pcVar9 | -(long)pcVar10) + ((ulong)pcVar9 & -(long)pcVar10);
  uVar2 = (uVar2 | 1) + (uVar2 & 1);
  uVar3 = -(int)DAT_00285dc0;
  uVar4 = -(int)DAT_00285dc0;
  auVar11 = (*(code *)(&PTR_FUN_0027c1e0)
                      [(long)(int)((uVar3 | 0xb5830cfc) * 2 - (uVar3 ^ 0xb5830cfc)) * 300 +
                       (long)(int)((uVar4 ^ 0xb5830e11) + (uVar4 & 0xb5830e11) * 2)])(uVar2);
  lVar6 = auVar11._0_8_;
  *(long *)(unaff_x25 + (-0x6b2be3944a7cf305 - (-DAT_00285dc0 ^ 0xffffffffffffffffU)) * 0x18 +
           unaff_x24 * 8) = lVar6;
  if ((uVar2 != 0 || lVar6 != 0) && (uVar2 == 0) == (lVar6 == 0)) {
    uVar8 = 0;
    do {
      if (pcVar10[uVar8] == '\0') {
        if (uVar8 < uVar2) {
                    /* WARNING: Could not recover jumptable at 0x001f5e0c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)PTR_LAB_002787b0)
                    (lVar6 + uVar8,auVar11._8_8_,(uVar2 ^ -uVar8) + (uVar2 & -uVar8) * 2);
          return;
        }
        break;
      }
      *(char *)(lVar6 + uVar8) = pcVar10[uVar8];
      uVar8 = (uVar8 | 1) + (uVar8 & 1);
    } while (uVar8 != uVar2);
  }
  ppuVar1 = &PTR_LAB_0027b3e8;
  if ((unaff_x24 | 1) * 2 - (unaff_x24 ^ 1) != 3) {
    ppuVar1 = &PTR_LAB_00280c48;
  }
                    /* WARNING: Could not recover jumptable at 0x001f3158. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


