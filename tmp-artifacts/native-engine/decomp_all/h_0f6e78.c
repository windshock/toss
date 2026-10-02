// entry=0xf6e78

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void Hf6e78(ulong param_1)

{
  bool bVar1;
  undefined8 *puVar2;
  ulong uVar3;
  uint uVar4;
  ulong uVar5;
  ulong in_x13;
  uint in_w15;
  ulong uVar6;
  uint in_w17;
  ulong uVar7;
  long *unaff_x19;
  undefined1 auVar8 [16];
  
  do {
    uVar6 = param_1;
    uVar4 = 0;
    if (in_w15 != 0) {
      uVar4 = in_w17 / in_w15;
    }
    *(undefined1 *)(unaff_x19[2] + uVar6) =
         (&DAT_0027ad10)
         [(ulong)((in_w17 ^ -(uVar4 * in_w15)) + (in_w17 & -(uVar4 * in_w15)) * 2) +
          ((-DAT_00285dc0 | 0x94d41c6bb5830cfcU) + (-DAT_00285dc0 & 0x94d41c6bb5830cfcU)) * 0x10];
    bVar1 = in_w15 <= in_w17;
    param_1 = (uVar6 | 1) + (uVar6 & 1);
    in_w17 = uVar4;
  } while (bVar1);
  if (in_x13 < 0x94d41c6bb5830dfb - (-DAT_00285dc0 ^ 0xffffffffffffffffU)) {
    uVar6 = (long)(uVar6 << (0xd1b - (-DAT_00285dc0 ^ 0xffffffffffffffffU) & 0x3f)) >> 0x20;
    uVar3 = uVar6;
    if (-1 < (long)uVar6) {
      uVar3 = 0;
    }
    uVar3 = (uVar6 | -uVar3) + (uVar6 & -uVar3);
    uVar5 = (-DAT_00285dc0 ^ 0x94d41c6bb5830dfbU) + (-DAT_00285dc0 & 0x94d41c6bb5830dfbU) * 2;
    uVar5 = (uVar5 ^ -in_x13) + (uVar5 & -in_x13) * 2;
    if (uVar5 <= uVar3) {
      uVar3 = uVar5;
    }
    uVar5 = (-DAT_00285dc0 ^ 0x94d41c6bb5830cfdU) + (-DAT_00285dc0 & 0x94d41c6bb5830cfdU) * 2;
    uVar3 = (uVar3 ^ uVar5) + (uVar3 & uVar5) * 2;
    if (0xf < uVar3) {
      uVar7 = (uVar3 ^ 0xf) & uVar3;
      uVar5 = 0;
      do {
        puVar2 = (undefined8 *)(uVar5 + in_x13 + *unaff_x19);
        auVar8 = a64_TBL(ZEXT816(0),*(undefined1 (*) [16])((uVar6 - uVar5) + unaff_x19[2] + -0xf),
                         _DAT_0012c6c0);
        puVar2[1] = auVar8._8_8_;
        *puVar2 = auVar8._0_8_;
        uVar5 = (uVar5 | 0x10) * 2 - (uVar5 ^ 0x10);
      } while (uVar5 != uVar7);
      uVar6 = (uVar6 | -uVar7) + (uVar6 & -uVar7);
      in_x13 = (uVar7 ^ in_x13) + (uVar7 & in_x13) * 2;
      if (uVar3 == uVar7) goto LAB_001f554c;
    }
    do {
      *(undefined1 *)
       (*unaff_x19 +
        ((-DAT_00285dc0 | 0x94d41c6bb5830cfcU) * 2 - (-DAT_00285dc0 ^ 0x94d41c6bb5830cfcU)) * 0x100
       + in_x13) = *(undefined1 *)(unaff_x19[2] + uVar6);
      in_x13 = (in_x13 | 1) + (in_x13 & 1);
      bVar1 = 0 < (long)uVar6;
      uVar6 = (uVar6 - (0x94d41c6bb5830cfa - (-DAT_00285dc0 ^ 0xffffffffffffffffU) ^
                       0xffffffffffffffff)) - 1;
    } while (bVar1 != 0xff < in_x13 && bVar1);
  }
LAB_001f554c:
                    /* WARNING: Could not recover jumptable at 0x001f5570. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00278180)();
  return;
}


