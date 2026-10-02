// entry=0xf7ce0

void Hf7ce0(void)

{
  uint uVar1;
  ulong uVar2;
  undefined **ppuVar3;
  bool bVar4;
  byte bVar5;
  int iVar6;
  long lVar7;
  byte *pbVar8;
  ulong uVar9;
  char *pcVar10;
  char *in_x9;
  byte in_w10;
  ulong in_x13;
  char *in_x14;
  char cVar11;
  char *in_x15;
  uint in_w16;
  char in_w17;
  uint uVar12;
  char *pcVar13;
  long *unaff_x19;
  char *pcVar14;
  ulong unaff_x24;
  long unaff_x25;
  undefined1 auVar15 [16];
  
LAB_001f60a0:
  DAT_00286268 = -0x4a7cf305 - (-(int)DAT_00285dc0 ^ 0xffffffffU);
  bVar5 = in_w17 + 0x9c;
  iVar6 = bVar5 - 0x14;
  if (bVar5 < 0x14 || iVar6 == 0) {
    iVar6 = 0x12ca24;
                    /* WARNING: Could not find normalized switch variable to match jumptable */
    switch(bVar5) {
    case 0:
    case 0x14:
      if ((((in_w10 ^ in_w17 != 'd') & in_w10 & 1) == 0) ||
         (*(undefined1 *)
           (*unaff_x19 + (-0x6b2be3944a7cf305 - (-DAT_00285dc0 ^ 0xffffffffffffffffU)) * 0x100 +
           in_x13) = 0x2d, in_x13 < 0xff)) {
                    /* WARNING: Could not recover jumptable at 0x001f35d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_Hf6e78_0027e970)(0);
        return;
      }
      pcVar14 = (char *)*unaff_x19;
      pcVar14[(-0x6b2be3944a7cf305 - (-DAT_00285dc0 ^ 0xffffffffffffffffU)) * 0x100 + 0xff] = '\0';
      pcVar13 = pcVar14;
      do {
        pcVar10 = pcVar13;
        pcVar13 = pcVar10 + 1;
      } while (*pcVar10 !=
               (byte)((-(char)DAT_00285dc0 ^ 0xfcU) + (-(char)DAT_00285dc0 & 0x7cU) * '\x02'));
      uVar2 = ((ulong)pcVar10 | -(long)pcVar14) + ((ulong)pcVar10 & -(long)pcVar14);
      uVar2 = (uVar2 | 1) + (uVar2 & 1);
      uVar1 = -(int)DAT_00285dc0;
      uVar12 = -(int)DAT_00285dc0;
      auVar15 = (*(code *)(&PTR_FUN_0027c1e0)
                          [(long)(int)((uVar1 | 0xb5830cfc) * 2 - (uVar1 ^ 0xb5830cfc)) * 300 +
                           (long)(int)((uVar12 ^ 0xb5830e11) + (uVar12 & 0xb5830e11) * 2)])(uVar2);
      lVar7 = auVar15._0_8_;
      *(long *)(unaff_x25 + (-0x6b2be3944a7cf305 - (-DAT_00285dc0 ^ 0xffffffffffffffffU)) * 0x18 +
               unaff_x24 * 8) = lVar7;
      if ((uVar2 != 0 || lVar7 != 0) && (uVar2 == 0) == (lVar7 == 0)) {
        uVar9 = 0;
        do {
          if (pcVar14[uVar9] == '\0') {
            if (uVar9 < uVar2) {
                    /* WARNING: Could not recover jumptable at 0x001f5e0c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
              (*(code *)PTR_LAB_002787b0)
                        (lVar7 + uVar9,auVar15._8_8_,(uVar2 ^ -uVar9) + (uVar2 & -uVar9) * 2);
              return;
            }
            break;
          }
          *(char *)(lVar7 + uVar9) = pcVar14[uVar9];
          uVar9 = (uVar9 | 1) + (uVar9 & 1);
        } while (uVar9 != uVar2);
      }
      ppuVar3 = &PTR_LAB_0027b3e8;
      if ((unaff_x24 | 1) * 2 - (unaff_x24 ^ 1) != 3) {
        ppuVar3 = &PTR_LAB_00280c48;
      }
                    /* WARNING: Could not recover jumptable at 0x001f3158. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar3)();
      return;
    case 8:
      ppuVar3 = &PTR_Hf3f04_0027d3a0;
      if (((in_w10 ^ in_x15[3] != 'd') & in_w10 & 1) == 0) {
        ppuVar3 = &PTR_LAB_00277dc8;
      }
                    /* WARNING: Could not recover jumptable at 0x001f34e4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar3)();
      return;
    case 0xf:
      cVar11 = *in_x9;
      in_w16 = 1;
      if (cVar11 != '\0') {
        lVar7 = *unaff_x19;
        pcVar13 = in_x9;
        do {
          *(char *)(lVar7 + ((DAT_00285dc0 * -2 | 0xa838d76b0619f8U) -
                            (-DAT_00285dc0 ^ 0xd41c6bb5830cfcU)) * 0x100 + in_x13) = cVar11;
          pcVar13 = pcVar13 + 1;
          cVar11 = *pcVar13;
          in_x13 = (in_x13 | 1) + (in_x13 & 1);
          iVar6 = 0;
          in_w16 = ((uint)DAT_00285dc0 ^ 1) & 1;
        } while (in_x13 < 0x100 && (cVar11 != '\0') == in_x13 < 0x100);
      }
    }
  }
  in_x15 = in_x14 + 1;
  cVar11 = in_x14[1];
  if (in_x13 < 0x100 == (cVar11 == '\0') || in_x13 >= 0x100) {
    ppuVar3 = &PTR_LAB_00285a60;
    if (0xfe < in_x13) {
      ppuVar3 = &PTR_LAB_00281e78;
    }
                    /* WARNING: Could not recover jumptable at 0x001f4b8c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar3)(0xff);
    return;
  }
  uVar12 = (uint)DAT_00285dc0;
  uVar1 = 0xffffffff - (uVar12 & 1);
  if ((((uint)(cVar11 == '%') ^ ((in_w16 ^ 1) & uVar1 | in_w16 & (uVar1 ^ 1)) ^ 1) &
      (uint)(cVar11 == '%')) == 0) {
    lVar7 = *unaff_x19;
    *(char *)(lVar7 + in_x13) = cVar11;
                    /* WARNING: Could not recover jumptable at 0x001f2fc4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00278180)((char *)(lVar7 + in_x13),iVar6);
    return;
  }
  in_x14 = in_x15 + (-DAT_00285dc0 | 0x94d41c6bb5830cfdU) + (-DAT_00285dc0 & 0x94d41c6bb5830cfdU);
  in_w17 = *in_x14;
LAB_001f4494:
  do {
    if (DAT_00286268 == 0) {
      cVar11 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(0x286268,0x10);
      if (bVar4) {
        DAT_00286268 = 1;
        cVar11 = ExclusiveMonitorsStatus();
      }
      if (cVar11 != '\0') goto LAB_001f4494;
      bVar4 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar4 = false;
    }
  } while (!bVar4);
  lVar7 = (-DAT_00285dc0 | 0x94d41c6bb5830cfcU) * 2 - (-DAT_00285dc0 ^ 0x94d41c6bb5830cfcU);
  iVar6 = (-uVar12 ^ 0x4181af8) + (-uVar12 & 0x4181af8) * 2;
  if ((DAT_00285da8 & 1) != 0) {
    pbVar8 = &DAT_0027ad10;
    do {
      uVar1 = iVar6 * ((-uVar12 ^ 0xb5840d3b) + (-uVar12 & 0xb5840d3b) * 2);
      iVar6 = (uVar1 | *pbVar8) * 2 - (uVar1 ^ *pbVar8);
      lVar7 = (lVar7 - ((-DAT_00285dc0 ^ 0x94d41c6bb5830cfdU) +
                        (-DAT_00285dc0 & 0x94d41c6bb5830cfdU) * 2 ^ 0xffffffffffffffff)) + -1;
      pbVar8 = pbVar8 + (-0x6b2be3944a7cf304 - (-DAT_00285dc0 ^ 0xffffffffffffffffU));
    } while (lVar7 != (-DAT_00285dc0 | 0x94d41c6bb5830d0cU) + (-DAT_00285dc0 & 0x94d41c6bb5830d0cU))
    ;
                    /* WARNING: Could not recover jumptable at 0x001f7a38. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027b398)(iVar6);
    return;
  }
  goto LAB_001f60a0;
}


