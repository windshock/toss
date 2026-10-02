// entry=0xf7058

void Hf7058(byte *param_1)

{
  byte *pbVar1;
  undefined **ppuVar2;
  uint uVar3;
  bool bVar4;
  bool bVar5;
  ulong in_x9;
  long in_x10;
  ulong uVar6;
  
  uVar6 = in_x10 << ((-DAT_00285dc0 ^ 0xd03U) + (-DAT_00285dc0 & 0xd03U) * 2 & 0x3f);
  uVar6 = (uVar6 ^ 0xff0000000000007f) & uVar6;
  bVar5 = ((uVar6 ^ 0xffffffffffffffff) & (ulong)param_1[in_x9] |
          uVar6 & ((ulong)param_1[in_x9] ^ 0xffffffffffffffff)) != 0x5f4fcf3e9976a0;
  bVar4 = (in_x9 ^ 1) + (in_x9 & 1) * 2 <
          (-DAT_00285dc0 ^ 0x94d41c6bb5830d04U) + (-DAT_00285dc0 & 0x94d41c6bb5830d04U) * 2;
  if ((!bVar4 || !bVar5) && bVar4 == bVar5) {
    pbVar1 = param_1 + (in_x9 - ((-DAT_00285dc0 | 0x94d41c6bb5830cf5U) +
                                 (-DAT_00285dc0 & 0x94d41c6bb5830cf5U) ^ 0xffffffffffffffff)) + -1;
    uVar3 = ((uint)*pbVar1 * 0x1003f | 0xc6dff3a9) * 2 - ((uint)*pbVar1 * 0x1003f ^ 0xc6dff3a9);
    uVar3 = ((uVar3 | pbVar1[1]) + (uVar3 & pbVar1[1])) * 0x1003f;
    uVar3 = ((uVar3 ^ pbVar1[2]) + (uVar3 & pbVar1[2]) * 2) * 0x1003f;
    uVar3 = ((uVar3 | pbVar1[3]) + (uVar3 & pbVar1[3])) * 0x1003f;
    uVar3 = ((uVar3 ^ pbVar1[4]) + (uVar3 & pbVar1[4]) * 2) * 0x1003f;
    uVar3 = ((uVar3 | pbVar1[5]) + (uVar3 & pbVar1[5])) * 0x1003f;
    if (((uVar3 | pbVar1[6]) + (uVar3 & pbVar1[6])) * 0x1003f - (pbVar1[7] ^ 0xffffffff) ==
        0x50ae4fac) {
      uVar6 = ((-DAT_00285dc0 | 0x94d41c6bb5830cfcU) * 2 - (-DAT_00285dc0 ^ 0x94d41c6bb5830cfcU)) *
              0x20;
      uVar6 = (uVar6 ^ 0xf00000000000001f) & uVar6;
      bVar4 = ((uVar6 | *param_1) & (uVar6 & *param_1 ^ 0xffffffffffffffff)) ==
              0x9d6e027fbe67284e - (-DAT_00285dc0 ^ 0xffffffffffffffffU);
      ppuVar2 = &PTR_LAB_002750d0;
      if (bVar4 && !bVar4) {
        ppuVar2 = (undefined **)
                  (&DAT_00280220 +
                  (long)(int)((-(int)DAT_00285dc0 | 0xb5830cfcU) +
                             (-(int)DAT_00285dc0 & 0xb5830cfcU)) * 0x67);
      }
                    /* WARNING: Could not recover jumptable at 0x001f4034. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar2)();
      return;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x001f53a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00280588)();
  return;
}


