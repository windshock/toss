// entry=0xf3ea8

/* WARNING: Removing unreachable block (ram,0x001f59c4) */
/* WARNING: Removing unreachable block (ram,0x001f711c) */
/* WARNING: Removing unreachable block (ram,0x001f4b54) */
/* WARNING: Removing unreachable block (ram,0x001f7164) */
/* WARNING: Removing unreachable block (ram,0x001f5c38) */

void Hf36dc(ulong param_1,long param_2)

{
  byte *pbVar1;
  byte *pbVar2;
  undefined **ppuVar3;
  uint uVar4;
  bool bVar5;
  bool bVar6;
  long in_x9;
  ulong uVar7;
  ulong in_x10;
  ulong in_x12;
  int iVar8;
  undefined8 *unaff_x21;
  undefined4 unaff_w22;
  undefined4 unaff_w24;
  undefined4 unaff_w25;
  
  pbVar1 = (byte *)(param_2 + ((in_x12 | 0xfffffffffffffff5) * 2 - (in_x12 ^ 0xfffffffffffffff5)));
  pbVar2 = pbVar1 + ((-DAT_00285dc0 | 0x94d41c6bb5830cfdU) * 2 -
                    (-DAT_00285dc0 ^ 0x94d41c6bb5830cfdU)) + 1;
  iVar8 = (int)DAT_00285dc0;
  uVar4 = (uint)*pbVar1 * ((-iVar8 | 0xb5840d3bU) * 2 - (-iVar8 ^ 0xb5840d3bU));
  uVar4 = (uVar4 | 0xce27d24f) + (uVar4 & 0xce27d24f);
  uVar4 = ((uVar4 ^ pbVar1[1]) + (uVar4 & pbVar1[1]) * 2) * 0x1003f;
  pbVar1 = pbVar2 + (-DAT_00285dc0 | 0x94d41c6bb5830cfdU) + (-DAT_00285dc0 & 0x94d41c6bb5830cfdU) +
                    1;
  uVar4 = ((uVar4 | *pbVar2) + (uVar4 & *pbVar2)) * (-0x4a7bf2c6 - (-iVar8 ^ 0xffffffffU));
  uVar4 = ((uVar4 | pbVar2[1]) + (uVar4 & pbVar2[1])) *
          ((-iVar8 ^ 0xb5840d3bU) + (-iVar8 & 0xb5840d3bU) * 2);
  uVar4 = ((((uVar4 | *pbVar1) + (uVar4 & *pbVar1)) *
            ((-iVar8 ^ 0xb5840d3bU) + (-iVar8 & 0xb5840d3bU) * 2) - (pbVar1[1] ^ 0xffffffff)) + -1)
          * ((-iVar8 | 0xb5840d3bU) + (-iVar8 & 0xb5840d3bU));
  pbVar2 = pbVar1 + (-0x6b2be3944a7cf300 - (-DAT_00285dc0 ^ 0xffffffffffffffffU));
  uVar4 = ((((uVar4 | pbVar1[2]) + (uVar4 & pbVar1[2])) * 0x1003f - (pbVar1[3] ^ 0xffffffff)) + -1)
          * 0x1003f;
  uVar4 = ((uVar4 | pbVar1[4]) * 2 - (uVar4 ^ pbVar1[4])) *
          ((-iVar8 ^ 0xb5840d3bU) + (-iVar8 & 0xb5840d3bU) * 2);
  uVar4 = ((((uVar4 ^ *pbVar2) + (uVar4 & *pbVar2) * 2) *
            ((-iVar8 | 0xb5840d3bU) + (-iVar8 & 0xb5840d3bU)) - (pbVar2[1] ^ 0xffffffff)) + -1) *
          0x1003f;
  if ((uVar4 | pbVar2[(-DAT_00285dc0 | 0x94d41c6bb5830cfdU) + (-DAT_00285dc0 & 0x94d41c6bb5830cfdU)
                      + 1]) * 2 -
      (uVar4 ^ pbVar2[(-DAT_00285dc0 | 0x94d41c6bb5830cfdU) + (-DAT_00285dc0 & 0x94d41c6bb5830cfdU)
                      + 1]) == -0x23b062f7) {
    ppuVar3 = &PTR_LAB_0027fe10;
    if (param_1 != 1) {
      ppuVar3 = &PTR_LAB_0027dbb0;
    }
                    /* WARNING: Could not recover jumptable at 0x001f3334. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar3)();
    return;
  }
  if (in_x10 == param_1) {
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
  uVar7 = (in_x9 << 5 ^ 0xf00000000000001fU) & in_x9 << 5;
  bVar6 = ((uVar7 | *(byte *)(param_2 + in_x10)) &
          (uVar7 & *(byte *)(param_2 + in_x10) ^ 0xffffffffffffffff)) !=
          0x9d6e027fbe67284e - (-DAT_00285dc0 ^ 0xffffffffffffffffU);
  bVar5 = (in_x10 | 1) * 2 - (in_x10 ^ 1) < 0xc;
  ppuVar3 = &PTR_LAB_002750d0;
  if ((!bVar5 || !bVar6) && bVar5 == bVar6) {
    ppuVar3 = (undefined **)
              (&DAT_00280220 + (long)(int)((-iVar8 | 0xb5830cfcU) + (-iVar8 & 0xb5830cfcU)) * 0x67);
  }
                    /* WARNING: Could not recover jumptable at 0x001f4034. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)();
  return;
}


