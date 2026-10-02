// entry=0x137ae0

void H137ae0(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  uint uVar2;
  uint uVar3;
  bool bVar4;
  bool bVar5;
  int iVar6;
  int iVar7;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  int iVar8;
  long unaff_x22;
  ulong unaff_x24;
  
  uVar1 = unaff_x22 +
          ((-DAT_00279eb0 | 0x3f63e72908692047U) * 2 - (-DAT_00279eb0 ^ 0x3f63e72908692047U));
  iVar6 = (int)DAT_00279eb0;
  if (unaff_x24 <= uVar1) {
                    /* WARNING: Could not recover jumptable at 0x0023d1cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002824a8)(param_1,param_2,(-iVar6 ^ 0x8692046U) + (-iVar6 & 0x8692046U) * 2);
    return;
  }
  iVar6 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)(0x8692045 - (-iVar6 ^ 0xffffffffU)) * 300 +
                     (long)(int)(0x869209c - (-iVar6 ^ 0xffffffffU))])
                    (2,param_2,uVar1,(-iVar6 ^ 0x87307c4U) + (-iVar6 & 0x87307c4U) * 2,5);
  iVar7 = (int)DAT_00279eb0;
  iVar7 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)(0x8692045 - (-iVar7 ^ 0xffffffffU)) * 300 +
                     (long)(int)((-iVar7 | 0x869209dU) * 2 - (-iVar7 ^ 0x869209dU))])
                    (2,extraout_x1,uVar1,(-iVar7 | 0x87307c4U) + (-iVar7 & 0x87307c4U),8);
  bVar4 = (iVar6 == -0x4e2adead) != (iVar6 == -0xf8a950);
  bVar4 = iVar6 == -0x55b9cce1 && bVar4 || (iVar6 == -0x55b9cce1) != bVar4;
  iVar8 = (int)DAT_00279eb0;
  bVar5 = iVar6 == 0x50210b4b - (-iVar8 ^ 0xffffffffU);
  bVar4 = bVar5 && bVar4 || bVar5 != bVar4;
  bVar5 = iVar7 == (-iVar8 ^ 0xd40415c2U) + (-iVar8 & 0xd40415c2U) * 2;
  bVar4 = bVar5 && bVar4 || bVar5 != bVar4;
  bVar4 = iVar7 == 0x8c4960 && bVar4 || (iVar7 == 0x8c4960) != bVar4;
  if ((iVar7 == -0x3971de47 && bVar4 || (iVar7 == -0x3971de47) != bVar4) &&
     (iVar6 = (*(code *)(&PTR_FUN_0027c1e0)
                        [(long)(int)(0x8692045 - (-iVar8 ^ 0xffffffffU)) * 300 +
                         (long)(int)(0x869209c - (-iVar8 ^ 0xffffffffU))])
                        (0x8692047 - (-iVar8 ^ 0xffffffffU),extraout_x1_00,
                         uVar1 + (0x3f63e72908692043 - (-DAT_00279eb0 ^ 0xffffffffffffffffU)),
                         0x9e77e,7), iVar6 != -0x1e9a8b31)) {
    uVar2 = -(int)DAT_00279eb0;
    uVar3 = -(int)DAT_00279eb0;
                    /* WARNING: Could not recover jumptable at 0x0023a53c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027ee90)
              (&DAT_0029e620 +
               (long)(int)((uVar3 | 0x8692046) * 2 - (uVar3 ^ 0x8692046)) * 0x2b +
               (long)(int)((uVar2 ^ 0x869205e) + (uVar2 & 0x869205e) * 2));
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00240458. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_H137ae0_0027d430)();
  return;
}


