// entry=0xf5928

void Hf5928(ulong param_1,long param_2)

{
  uint uVar1;
  ulong uVar2;
  byte *pbVar3;
  undefined **ppuVar4;
  byte bVar5;
  bool bVar6;
  int iVar7;
  ulong uVar8;
  long in_x11;
  ulong in_x13;
  undefined8 *unaff_x21;
  undefined4 unaff_w22;
  int unaff_w23;
  undefined4 unaff_w24;
  undefined4 unaff_w25;
  
  bVar5 = *(byte *)(param_2 + in_x13);
  uVar8 = in_x11 << ((-DAT_00285dc0 | 0xd03U) * 2 - (-DAT_00285dc0 ^ 0xd03U) & 0x3f);
  uVar8 = (uVar8 ^ 0xfffffff80000007f) & uVar8;
  uVar2 = (in_x13 ^ 1) + (in_x13 & 1) * 2;
  bVar6 = ((uVar8 | bVar5) & (uVar8 & bVar5 ^ 0xffffffffffffffff)) != 0x489f3a7d2;
  if ((uVar2 >= 5 || !bVar6) && uVar2 < 5 == bVar6) {
    pbVar3 = (byte *)(param_2 + ((in_x13 | 0xfffffffffffffffc) * 2 - (in_x13 ^ 0xfffffffffffffffc)))
    ;
    iVar7 = (int)DAT_00285dc0;
    uVar1 = (-iVar7 ^ 0xdc75ecc1U) + (-iVar7 & 0xdc75ecc1U) * 2;
    uVar1 = ((uint)*pbVar3 * 0x1003f ^ uVar1) + ((uint)*pbVar3 * 0x1003f & uVar1) * 2;
    uVar1 = ((uVar1 | pbVar3[1]) + (uVar1 & pbVar3[1])) * 0x1003f;
    uVar1 = ((uVar1 | pbVar3[2]) + (uVar1 & pbVar3[2])) * 0x1003f;
    uVar1 = ((uVar1 ^ pbVar3[(-DAT_00285dc0 ^ 0x94d41c6bb5830cfdU) +
                             (-DAT_00285dc0 & 0x94d41c6bb5830cfdU) * 2 + 2]) +
            (uVar1 & pbVar3[(-DAT_00285dc0 ^ 0x94d41c6bb5830cfdU) +
                            (-DAT_00285dc0 & 0x94d41c6bb5830cfdU) * 2 + 2]) * 2) * 0x1003f;
    if ((uVar1 | bVar5) * 2 - (uVar1 ^ bVar5) == (-iVar7 | 0x3e730141U) + (-iVar7 & 0x3e730141U)) {
      if (unaff_w23 == (-iVar7 ^ 0xb5830cfcU) + (-iVar7 & 0xb5830cfcU) * 2) {
                    /* WARNING: Could not recover jumptable at 0x001f4b60. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_00275680)
                  (param_2,0x94d41c6bb5830cfd,(-iVar7 | 0xb5830cfcU) + (-iVar7 & 0xb5830cfcU));
        return;
      }
      *unaff_x21 = &DAT_00279b75;
      *(undefined4 *)(unaff_x21 + 1) = unaff_w22;
      unaff_x21[2] = &DAT_00279b86;
      *(undefined4 *)(unaff_x21 + 3) = unaff_w24;
      unaff_x21[4] = &DAT_00279b97;
      *(undefined4 *)(unaff_x21 + 5) = unaff_w25;
                    /* WARNING: Could not recover jumptable at 0x001f74f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00277ef8)();
      return;
    }
  }
  ppuVar4 = &PTR_LAB_0027fe10;
  if (uVar2 != param_1) {
    ppuVar4 = &PTR_Hf5928_0027dbb0;
  }
                    /* WARNING: Could not recover jumptable at 0x001f3334. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar4)();
  return;
}


