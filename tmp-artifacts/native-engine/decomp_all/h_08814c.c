// entry=0x8814c

void H8814c(void)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  int iVar4;
  ulong uVar5;
  long lVar6;
  int *unaff_x22;
  long *plVar7;
  undefined4 unaff_w26;
  long *unaff_x28;
  long unaff_x29;
  
  uVar5 = -DAT_00274480;
  lVar6 = *(long *)(unaff_x29 + -0xa0);
  uVar1 = -(int)DAT_00274480;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 300 +
             (long)(int)((uVar1 | 0x94f8c3a5) * 2 - (uVar1 ^ 0x94f8c3a5))])
            (*(undefined8 *)(unaff_x29 + -0xb8),0xc,&DAT_00276cd2);
  uVar1 = -(int)DAT_00274480;
  uVar2 = -(int)DAT_00274480;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar1 ^ 0x94f8c2f2) + (uVar1 & 0x94f8c2f2) * 2) * 300 +
             (long)(int)((uVar2 | 0x94f8c3a5) + (uVar2 & 0x94f8c3a5))])
            (lVar6 + (uVar5 | 0x99bbd15a94f8c2f2) + (uVar5 & 0x99bbd15a94f8c2f2),0xc,&DAT_00276cd2,
             unaff_w26);
  uVar1 = -(int)DAT_00274480;
  uVar2 = -(int)DAT_00274480;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar1 | 0x94f8c2f2) + (uVar1 & 0x94f8c2f2)) * 300 +
             (long)(int)((uVar2 ^ 0x94f8c393) + (uVar2 & 0x94f8c393) * 2)])();
  iVar4 = (int)DAT_00274480;
  if (*unaff_x22 <= (int)((-iVar4 | 0x94f8c2f2U) + (-iVar4 & 0x94f8c2f2U))) {
                    /* WARNING: Could not recover jumptable at 0x0018d1e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00285fc0)();
    return;
  }
  uVar5 = 0;
  do {
    plVar7 = (long *)(*unaff_x28 + uVar5 * 0x10);
    if (*plVar7 != 0) {
      (*(code *)(&PTR_FUN_0027c1e0)
                [(long)(int)((-iVar4 | 0x94f8c2f2U) + (-iVar4 & 0x94f8c2f2U)) * 300 +
                 (long)(int)((-iVar4 | 0x94f8c342U) + (-iVar4 & 0x94f8c342U))])();
      *plVar7 = 0;
                    /* WARNING: Could not recover jumptable at 0x00189c84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_H86294_0027ec70)();
      return;
    }
    uVar3 = (-DAT_00274480 | 0x99bbd15a94f8c2f3U) * 2 - (-DAT_00274480 ^ 0x99bbd15a94f8c2f3U);
    uVar5 = (uVar5 | uVar3) * 2 - (uVar5 ^ uVar3);
  } while (uVar5 != (long)*unaff_x22);
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(-0x6b073d0f - (-iVar4 ^ 0xffffffffU)) * 300 +
             (long)(int)((-iVar4 | 0x94f8c342U) + (-iVar4 & 0x94f8c342U))])(*unaff_x28);
  uVar1 = -(int)DAT_00274480;
  uVar2 = -(int)DAT_00274480;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar2 | 0x94f8c2f2) * 2 - (uVar2 ^ 0x94f8c2f2)) * 300 +
             (long)(int)((uVar1 ^ 0x94f8c342) + (uVar1 & 0x94f8c342) * 2)])
            (**(undefined8 **)(unaff_x29 + -0x148));
  uVar1 = -(int)DAT_00274480;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar1 | 0x94f8c2f2) * 2 - (uVar1 ^ 0x94f8c2f2)) * 300 +
             (long)(int)(-0x6b073cbf - (-(int)DAT_00274480 ^ 0xffffffffU))])();
                    /* WARNING: Could not recover jumptable at 0x0018923c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00285b90)(0x1c);
  return;
}


