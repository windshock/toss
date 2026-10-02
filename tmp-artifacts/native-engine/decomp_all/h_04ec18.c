// entry=0x4ec18

void H4ec18(void)

{
  byte *pbVar1;
  undefined **ppuVar2;
  uint uVar3;
  uint uVar4;
  char cVar5;
  bool bVar6;
  uint uVar7;
  undefined8 uVar8;
  long *plVar9;
  uint uVar10;
  code *pcVar11;
  int iVar12;
  ulong uVar13;
  ulong uVar14;
  long unaff_x19;
  undefined8 unaff_x22;
  undefined4 unaff_w23;
  undefined8 uStack_2260;
  undefined8 uStack_2258;
  undefined8 uStack_2250;
  undefined8 uStack_2248;
  undefined8 uStack_2240;
  undefined8 uStack_2238;
  undefined8 uStack_2230;
  undefined8 uStack_2228;
  undefined8 uStack_2220;
  undefined8 uStack_2218;
  undefined1 auStack_21e0 [1024];
  undefined1 auStack_1de0 [2064];
  undefined1 auStack_15d0 [2064];
  undefined1 auStack_dc0 [2080];
  undefined1 auStack_5a0 [1120];
  undefined1 auStack_140 [32];
  undefined1 auStack_120 [32];
  undefined1 auStack_100 [96];
  undefined1 auStack_a0 [32];
  undefined1 auStack_80 [32];
  undefined1 auStack_60 [32];
  undefined1 auStack_40 [32];
  undefined1 auStack_20 [32];
  
LAB_0014ec1c:
  do {
    if (DAT_002862c0 == 0) {
      cVar5 = '\x01';
      bVar6 = (bool)ExclusiveMonitorPass(0x2862c0,0x10);
      if (bVar6) {
        DAT_002862c0 = 1;
        cVar5 = ExclusiveMonitorsStatus();
      }
      if (cVar5 != '\0') goto LAB_0014ec1c;
      bVar6 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar6 = false;
    }
    if (bVar6) {
      uVar7 = (uint)DAT_00275ca8;
      uVar13 = (-DAT_00275ca8 | 0x642804bbf97b14d4U) + (-DAT_00275ca8 & 0x642804bbf97b14d4U);
      uVar10 = (-uVar7 ^ 0xcd0ae1ba) + (-uVar7 & 0xcd0ae1ba) * 2;
      if (-(uint)(((DAT_00274eb8 ^ 0xfffffffe) & DAT_00274eb8) == 1) == -(uVar7 & 1)) {
        do {
          pbVar1 = &DAT_00282790 +
                   (uVar13 << (0x642804bbf97b14d5 - (-DAT_00275ca8 ^ 0xffffffffffffffffU) & 0x3f));
          uVar3 = (uint)pbVar1[0x642804bbf97b14d4 - (-DAT_00275ca8 ^ 0xffffffffffffffffU)] <<
                  (ulong)(0x14db - (-uVar7 ^ 0xffffffff) & 0x1f);
          uVar4 = uVar3 & *pbVar1 | uVar3 ^ *pbVar1;
          uVar3 = (uint)pbVar1[(-DAT_00275ca8 ^ 0x642804bbf97b14d6U) +
                               (-DAT_00275ca8 & 0x642804bbf97b14d6U) * 2] <<
                  (ulong)((-uVar7 | 0xf97b14e4) * 2 - (-uVar7 ^ 0xf97b14e4) & 0x1f);
          uVar4 = uVar4 & uVar3 | uVar4 ^ uVar3;
          uVar3 = (uint)pbVar1[0x642804bbf97b14d6 - (-DAT_00275ca8 ^ 0xffffffffffffffffU)] <<
                  (ulong)((-uVar7 ^ 0x14ec) + (-uVar7 & 0x14ec) * 2 & 0x1f);
          uVar4 = (uVar4 & uVar3 | uVar4 ^ uVar3) * ((-uVar7 | 0x554cfe69) + (-uVar7 & 0x554cfe69));
          uVar3 = uVar4 >> (ulong)(0x14eb - (-uVar7 ^ 0xffffffff) & 0x1f);
          uVar3 = ((uVar3 | uVar4) & (uVar3 & uVar4 ^ 0xffffffff)) *
                  ((-uVar7 ^ 0x554cfe69) + (-uVar7 & 0x554cfe69) * 2);
          uVar10 = uVar10 * ((-uVar7 ^ 0x554cfe69) + (-uVar7 & 0x554cfe69) * 2);
          uVar10 = (uVar3 | uVar10) & (uVar3 & uVar10 ^ 0xffffffff);
          uVar14 = (-DAT_00275ca8 | 0x642804bbf97b14d5U) * 2 - (-DAT_00275ca8 ^ 0x642804bbf97b14d5U)
          ;
          uVar13 = (uVar13 | uVar14) + (uVar13 & uVar14);
        } while (uVar13 != 0x642804bbf97b152d - (-DAT_00275ca8 ^ 0xffffffffffffffffU));
        uVar4 = (-uVar7 | 0xf97b14d4) + (-uVar7 & 0xf97b14d4) >>
                (ulong)((-uVar7 | 0x14ec) + (-uVar7 & 0x14ec) & 0x1f);
        uVar3 = (-uVar7 ^ 0xf97b14d4) + (-uVar7 & 0xf97b14d4) * 2;
        uVar3 = ((uVar4 ^ 0xffffffff) & uVar3 | uVar4 & (uVar3 ^ 0xffffffff)) *
                ((-uVar7 | 0x554cfe69) * 2 - (-uVar7 ^ 0x554cfe69));
        uVar10 = uVar10 * ((-uVar7 | 0x554cfe69) + (-uVar7 & 0x554cfe69));
        uVar10 = ((uVar3 | uVar10) & (uVar3 & uVar10 ^ 0xffffffff)) *
                 ((-uVar7 | 0x554cfe69) + (-uVar7 & 0x554cfe69));
        uVar7 = 0x30a348b6 - (-uVar7 ^ 0xffffffff);
                    /* WARNING: Could not recover jumptable at 0x0014a9d4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_0027e730)((uVar10 | uVar7) & (uVar10 & uVar7 ^ 0xffffffff));
        return;
      }
      *(undefined4 *)(unaff_x19 + 0x2f4) = unaff_w23;
      DAT_002862c0 = 0;
      *(undefined1 **)(unaff_x19 + 0x2d8) = auStack_20;
      *(undefined1 **)(unaff_x19 + 0x2c8) = auStack_40;
      *(undefined1 **)(unaff_x19 + 0x2d0) = auStack_60;
      *(undefined1 **)(unaff_x19 + 0x2c0) = auStack_80;
      *(undefined1 **)(unaff_x19 + 0x2b8) = auStack_a0;
      *(undefined1 **)(unaff_x19 + 0x290) = auStack_100;
      *(undefined1 **)(unaff_x19 + 0x280) = auStack_120;
      *(undefined1 **)(unaff_x19 + 0x278) = auStack_140;
      *(undefined1 **)(unaff_x19 + 0x2a8) = auStack_5a0;
      *(undefined1 **)(unaff_x19 + 0x2a0) = auStack_dc0;
      *(undefined1 **)(unaff_x19 + 0x298) = auStack_15d0;
      *(undefined1 **)(unaff_x19 + 0x288) = auStack_1de0;
      *(undefined1 **)(unaff_x19 + 0x2f8) = auStack_21e0;
      *(undefined8 **)(unaff_x19 + 0x2e8) = &uStack_2260;
      iVar12 = (int)DAT_00275ca8;
      pcVar11 = (code *)(&PTR_FUN_0027c1e0)
                        [(long)(int)((iVar12 * -2 | 0xf2f629a8U) - (-iVar12 ^ 0xf97b14d4U)) * 300 +
                         (long)(-0x684eafa - iVar12)];
      *(undefined8 *)(unaff_x19 + 0x300) = unaff_x22;
      uVar8 = (*pcVar11)(4);
      *(undefined8 *)(unaff_x19 + 0x2e0) = uVar8;
      uStack_2218 = 0;
      uStack_2220 = 0;
      uStack_2228 = 0;
      uStack_2230 = 0;
      uStack_2238 = 0;
      uStack_2240 = 0;
      uStack_2248 = 0;
      uStack_2250 = 0;
      uStack_2258 = 0;
      uStack_2260 = 0;
      plVar9 = (long *)FUN_0026eefc(&DAT_00286150);
      if (*plVar9 == 0) {
        plVar9 = (long *)FUN_0026eefc(&DAT_00286190);
                    /* WARNING: Could not recover jumptable at 0x00150fb4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*DAT_00280290)(*plVar9 == 0);
        return;
      }
      iVar12 = (int)DAT_00275ca8;
      *(undefined **)(unaff_x19 + 0x308) =
           (&PTR_FUN_0027c1e0)
           [(long)(int)((-iVar12 | 0xf97b14d4U) + (-iVar12 & 0xf97b14d4U)) * 300 +
            (long)(int)((-iVar12 ^ 0xf97b14dfU) + (-iVar12 & 0xf97b14dfU) * 2)];
      ppuVar2 = &PTR_LAB_0027ff68;
      if ((-iVar12 | 0xf97b14d4U) * 2 - (-iVar12 ^ 0xf97b14d4U) != 0x80) {
        ppuVar2 = &PTR_H4d57c_00280020;
      }
                    /* WARNING: Could not recover jumptable at 0x0015427c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar2)(0xfdfc);
      return;
    }
  } while( true );
}


