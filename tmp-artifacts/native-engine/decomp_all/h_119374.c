// entry=0x119374

void H119374(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined **ppuVar1;
  undefined4 uVar2;
  uint uVar3;
  int iVar4;
  undefined8 extraout_x1;
  uint uVar5;
  long unaff_x19;
  long unaff_x20;
  long lVar6;
  undefined8 *unaff_x23;
  
  lVar6 = *(long *)(unaff_x20 + 0x10);
  iVar4 = (int)DAT_00281e58;
  if (lVar6 != 0) {
    iVar4 = (*(code *)(&PTR_FUN_0027c1e0)
                      [(long)(int)((-iVar4 | 0xcc88cf42U) * 2 - (-iVar4 ^ 0xcc88cf42U)) * 300 +
                       (long)(int)(-0x33773087 - (-iVar4 ^ 0xffffffffU))])
                      ((-iVar4 ^ 0xcc88cf45U) + (-iVar4 & 0xcc88cf45U) * 2,param_2,lVar6,param_4,
                       (-iVar4 ^ 0xcc88e609U) + (-iVar4 & 0xcc88e609U) * 2,0x20);
    ppuVar1 = &PTR_H119374_00280760;
    if (iVar4 != *(int *)(lVar6 + 0x20)) {
      ppuVar1 = &PTR_LAB_00279350;
    }
                    /* WARNING: Could not recover jumptable at 0x00216b7c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)((-(int)DAT_00281e58 | 0xcc88cf51U) * 2 - (-(int)DAT_00281e58 ^ 0xcc88cf51U))
    ;
    return;
  }
  if (*(int *)*unaff_x23 == *(int *)(unaff_x23 + 1)) {
    ppuVar1 = &PTR_LAB_00285b10;
    if (unaff_x23[2] != 0) {
      ppuVar1 = &PTR_LAB_00274910;
    }
                    /* WARNING: Could not recover jumptable at 0x002225dc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  iVar4 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((-iVar4 ^ 0xcc88cf42U) + (-iVar4 & 0xcc88cf42U) * 2) * 300 +
                     (long)(int)((-iVar4 | 0xcc88d060U) * 2 - (-iVar4 ^ 0xcc88d060U))])
                    ((int *)*unaff_x23,*(undefined8 *)(unaff_x19 + 0x868));
  if (iVar4 == 0) {
    uVar2 = *(undefined4 *)*unaff_x23;
    iVar4 = (int)DAT_00281e58;
    uVar3 = (-iVar4 | 0x6705cc35U) * 2 - (-iVar4 ^ 0x6705cc35U);
    lVar6 = *(long *)(unaff_x19 + 0x550);
    uVar5 = (uint)*(undefined8 *)(unaff_x19 + 0x8e0);
    (*(code *)(&PTR_FUN_0027c1e0)
              [(long)(int)((-iVar4 | 0xcc88cf42U) + (-iVar4 & 0xcc88cf42U)) * 300 +
               (long)(int)(-0x33772ff3 - (-iVar4 ^ 0xffffffffU))])
              (0,extraout_x1,
               (long)(int)((uVar3 ^ 0xffffffff) & uVar5 | uVar3 & (uVar5 ^ 0xffffffff)));
    uVar3 = -(int)DAT_00281e58;
    uVar5 = -(int)DAT_00281e58;
    (*(code *)(&PTR_FUN_0027c1e0)
              [(long)(int)((uVar5 ^ 0xcc88cf42) + (uVar5 & 0xcc88cf42) * 2) * 300 +
               (long)(int)((uVar3 ^ 0xcc88d060) + (uVar3 & 0xcc88d060) * 2)])
              (uVar2,*(undefined8 *)(unaff_x19 + 0x8c8));
    ppuVar1 = &PTR_LAB_002816a8;
    if (lVar6 != 0) {
      ppuVar1 = &PTR_LAB_00279410;
    }
                    /* WARNING: Could not recover jumptable at 0x00229f14. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  ppuVar1 = &PTR_LAB_00275038;
  if (**(long **)(unaff_x19 + 0x7e8) != 0) {
    ppuVar1 = &PTR_LAB_002783b8;
  }
                    /* WARNING: Could not recover jumptable at 0x00228d70. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


