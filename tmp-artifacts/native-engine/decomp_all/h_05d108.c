// entry=0x5d108

void H5d108(void)

{
  uint uVar1;
  byte *pbVar2;
  byte *pbVar3;
  undefined **ppuVar4;
  uint uVar5;
  int iVar6;
  long in_x9;
  ulong in_x10;
  int iVar7;
  long in_x11;
  ulong uVar8;
  ulong uVar9;
  ulong in_x13;
  
  uVar8 = (in_x11 << 2 ^ 0xffffffff00000000U) & in_x11 << 2;
  uVar9 = (uVar8 | *(byte *)(in_x9 + in_x13)) &
          (uVar8 & *(byte *)(in_x9 + in_x13) ^ 0xffffffffffffffff);
  uVar8 = (in_x13 ^ 1) + (in_x13 & 1) * 2;
  iVar7 = (int)uVar9;
  iVar6 = (int)DAT_00275ca8;
  if (iVar7 == 0xc37b3) {
    if (7 < uVar8) {
      pbVar2 = (byte *)(in_x9 + (in_x13 ^ 0xfffffffffffffff9) + (in_x13 & 0xfffffffffffffff9) * 2);
      pbVar3 = pbVar2 + (-DAT_00275ca8 | 0x642804bbf97b14d5U) +
                        (-DAT_00275ca8 & 0x642804bbf97b14d5U) + 1;
      uVar1 = (uint)*pbVar2 * 0x1003f + 0x5f2b8554;
      uVar1 = ((uVar1 ^ pbVar2[1]) + (uVar1 & pbVar2[1]) * 2) *
              ((-iVar6 | 0xf97c1513U) + (-iVar6 & 0xf97c1513U));
      pbVar2 = pbVar3 + (0x642804bbf97b14d5 - (-DAT_00275ca8 ^ 0xffffffffffffffffU));
      uVar1 = ((uVar1 | *pbVar3) + (uVar1 & *pbVar3)) * 0x1003f;
      uVar1 = ((uVar1 ^ pbVar3[1]) + (uVar1 & pbVar3[1]) * 2) *
              ((-iVar6 ^ 0xf97c1513U) + (-iVar6 & 0xf97c1513U) * 2);
      uVar1 = ((uVar1 ^ *pbVar2) + (uVar1 & *pbVar2) * 2) * 0x1003f;
      uVar1 = ((uVar1 | pbVar2[1]) * 2 - (uVar1 ^ pbVar2[1])) * 0x1003f;
      uVar1 = ((uVar1 | pbVar2[2]) + (uVar1 & pbVar2[2])) * 0x1003f;
      if ((uVar1 ^ pbVar2[3]) + (uVar1 & pbVar2[3]) * 2 == 0x2d0f7194) goto LAB_0015bc7c;
    }
  }
  else {
    if (iVar7 == 0xc6813) {
      ppuVar4 = &PTR_LAB_00276810;
      if (7 < uVar8) {
        ppuVar4 = &PTR_LAB_00274758;
      }
                    /* WARNING: Could not recover jumptable at 0x001542b0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar4)();
      return;
    }
    if (iVar7 == 0xd4417) {
                    /* WARNING: Could not recover jumptable at 0x0014fc58. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_0027dfd0)();
      return;
    }
    if (iVar7 == 0xd7dcb) {
      if ((-DAT_00275ca8 | 0x642804bbf97b14dcU) + (-DAT_00275ca8 & 0x642804bbf97b14dcU) <= uVar8) {
        pbVar2 = (byte *)(in_x9 + ((in_x13 | 0xfffffffffffffff9) * 2 - (in_x13 ^ 0xfffffffffffffff9)
                                  ));
        uVar1 = (uint)*pbVar2 * ((-iVar6 | 0xf97c1513U) + (-iVar6 & 0xf97c1513U));
        uVar1 = (uVar1 | 0x5f2b8554) * 2 - (uVar1 ^ 0x5f2b8554);
        pbVar3 = pbVar2 + ((-DAT_00275ca8 | 0x642804bbf97b14d5U) * 2 -
                          (-DAT_00275ca8 ^ 0x642804bbf97b14d5U)) + 2;
        uVar1 = ((uVar1 | pbVar2[1]) + (uVar1 & pbVar2[1])) * 0x1003f;
        uVar1 = ((uVar1 | pbVar2[2]) + (uVar1 & pbVar2[2])) * 0x1003f;
        uVar1 = ((uVar1 | *pbVar3) + (uVar1 & *pbVar3)) * (-0x683eaee - (-iVar6 ^ 0xffffffffU));
        uVar1 = ((uVar1 | pbVar3[1]) + (uVar1 & pbVar3[1])) * 0x1003f;
        uVar1 = ((((uVar1 | pbVar3[2]) + (uVar1 & pbVar3[2])) * 0x1003f - (pbVar3[3] ^ 0xffffffff))
                + -1) * 0x1003f;
        ppuVar4 = &PTR_LAB_0027af88;
        if ((uVar1 | pbVar3[4]) + (uVar1 & pbVar3[4]) != -0x12647efb) {
          ppuVar4 = &PTR_LAB_00276810;
        }
                    /* WARNING: Could not recover jumptable at 0x0014e6b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)*ppuVar4)();
        return;
      }
    }
    else {
      if (iVar7 == 0x35e28f) {
                    /* WARNING: Could not recover jumptable at 0x0014f654. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_0027d200)();
        return;
      }
      if ((iVar7 == 0xd7da43f) &&
         (0x642804bbf97b14df - (-DAT_00275ca8 ^ 0xffffffffffffffffU) <= uVar8)) {
        pbVar2 = (byte *)(in_x9 + (in_x13 ^ 0xfffffffffffffff5) + (in_x13 & 0xfffffffffffffff5) * 2)
        ;
        pbVar3 = pbVar2 + ((-DAT_00275ca8 | 0x642804bbf97b14d5U) * 2 -
                          (-DAT_00275ca8 ^ 0x642804bbf97b14d5U));
        uVar5 = (uint)*pbVar2 * 0x1003f;
        uVar1 = (-iVar6 ^ 0x58a69a28U) + (-iVar6 & 0x58a69a28U) * 2;
        uVar1 = ((((uVar5 | uVar1) + (uVar5 & uVar1)) - (*pbVar3 ^ 0xffffffff)) + -1) * 0x1003f;
        pbVar2 = pbVar3 + (-DAT_00275ca8 ^ 0x642804bbf97b14d5U) +
                          (-DAT_00275ca8 & 0x642804bbf97b14d5U) * 2 + 2;
        uVar1 = ((((uVar1 | pbVar3[1]) * 2 - (uVar1 ^ pbVar3[1])) * 0x1003f -
                 (pbVar3[2] ^ 0xffffffff)) + -1) *
                ((-iVar6 | 0xf97c1513U) * 2 - (-iVar6 ^ 0xf97c1513U));
        pbVar3 = pbVar2 + (-DAT_00275ca8 | 0x642804bbf97b14d5U) +
                          (-DAT_00275ca8 & 0x642804bbf97b14d5U) +
                 (0x642804bbf97b14d4 - (-DAT_00275ca8 ^ 0xffffffffffffffffU));
        uVar1 = ((uVar1 | *pbVar2) * 2 - (uVar1 ^ *pbVar2)) * 0x1003f;
        uVar5 = (uint)pbVar2[(-DAT_00275ca8 | 0x642804bbf97b14d5U) +
                             (-DAT_00275ca8 & 0x642804bbf97b14d5U)];
        uVar1 = ((uVar1 | uVar5) + (uVar1 & uVar5)) *
                ((-iVar6 ^ 0xf97c1513U) + (-iVar6 & 0xf97c1513U) * 2);
        uVar1 = ((uVar1 | *pbVar3) * 2 - (uVar1 ^ *pbVar3)) *
                ((-iVar6 ^ 0xf97c1513U) + (-iVar6 & 0xf97c1513U) * 2);
        uVar1 = ((((uVar1 ^ pbVar3[1]) + (uVar1 & pbVar3[1]) * 2) * 0x1003f -
                 (pbVar3[2] ^ 0xffffffff)) + -1) * (-0x683eaee - (-iVar6 ^ 0xffffffffU));
        uVar1 = ((uVar1 ^ pbVar3[3]) + (uVar1 & pbVar3[3]) * 2) * 0x1003f;
        if (((uVar1 | pbVar3[4]) * 2 - (uVar1 ^ pbVar3[4])) * 0x1003f -
            (pbVar3[((-DAT_00275ca8 | 0x642804bbf97b14d5U) * 2 -
                    (-DAT_00275ca8 ^ 0x642804bbf97b14d5U)) + 4] ^ 0xffffffff) != 0x3525e8c4) {
          ppuVar4 = &PTR_LAB_00274c58;
          if (uVar9 != (-DAT_00275ca8 ^ 0x642804bbf9b0f763U) +
                       (-DAT_00275ca8 & 0x642804bbf9b0f763U) * 2) {
            ppuVar4 = &PTR_LAB_00276810;
          }
                    /* WARNING: Could not recover jumptable at 0x0015d84c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)*ppuVar4)();
          return;
        }
LAB_0015bc7c:
                    /* WARNING: Could not recover jumptable at 0x0015bccc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_002858d8)();
        return;
      }
    }
  }
  ppuVar4 = &PTR_LAB_00280820;
  if (uVar8 != in_x10) {
    ppuVar4 = &PTR_H5d108_0027ec58;
  }
                    /* WARNING: Could not recover jumptable at 0x00150844. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar4)();
  return;
}


