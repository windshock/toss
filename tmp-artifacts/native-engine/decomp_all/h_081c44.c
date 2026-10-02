// entry=0x81c44

void H81c44(code *param_1)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  ulong uVar5;
  ulong unaff_x21;
  int *unaff_x22;
  ulong uVar6;
  long *plVar7;
  undefined4 *unaff_x27;
  long *unaff_x28;
  long unaff_x29;
  
  (*param_1)();
  lVar1 = (unaff_x21 ^ 1) + (unaff_x21 & 1) * 2;
  iVar4 = (int)DAT_00274480;
  if (lVar1 != *(long *)(unaff_x29 + -0x1c0)) {
    if (*(long *)(*unaff_x28 + lVar1 * 0x10) == 0) {
                    /* WARNING: Could not recover jumptable at 0x0018bccc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00281528)
                ((&PTR_FUN_0027c1e0)
                 [(long)(int)(-0x6b073d0f - (-iVar4 ^ 0xffffffffU)) * 300 +
                  (long)(int)(-0x6b073c6e - (-iVar4 ^ 0xffffffffU))]);
      return;
    }
                    /* WARNING: Could not recover jumptable at 0x0018a53c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&DAT_002781d8)
              [(long)(int)((-iVar4 ^ 0x94f8c2f2U) + (-iVar4 & 0x94f8c2f2U) * 2) * 0x5b])();
    return;
  }
  if (unaff_x22 != (int *)0x0) {
    if (*unaff_x22 <= (int)((-iVar4 | 0x94f8c2f2U) + (-iVar4 & 0x94f8c2f2U))) {
                    /* WARNING: Could not recover jumptable at 0x0018d1e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00285fc0)();
      return;
    }
    uVar6 = 0;
    do {
      plVar7 = (long *)(*unaff_x28 + uVar6 * 0x10);
      if (*plVar7 != 0) {
        (*(code *)(&PTR_FUN_0027c1e0)
                  [(long)(int)((-iVar4 | 0x94f8c2f2U) + (-iVar4 & 0x94f8c2f2U)) * 300 +
                   (long)(int)((-iVar4 | 0x94f8c342U) + (-iVar4 & 0x94f8c342U))])();
        *plVar7 = 0;
                    /* WARNING: Could not recover jumptable at 0x00189c84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_0027ec70)();
        return;
      }
      uVar5 = (-DAT_00274480 | 0x99bbd15a94f8c2f3U) * 2 - (-DAT_00274480 ^ 0x99bbd15a94f8c2f3U);
      uVar6 = (uVar6 | uVar5) * 2 - (uVar6 ^ uVar5);
    } while (uVar6 != (long)*unaff_x22);
    (*(code *)(&PTR_FUN_0027c1e0)
              [(long)(int)(-0x6b073d0f - (-iVar4 ^ 0xffffffffU)) * 300 +
               (long)(int)((-iVar4 | 0x94f8c342U) + (-iVar4 & 0x94f8c342U))])(*unaff_x28);
    uVar2 = -(int)DAT_00274480;
    uVar3 = -(int)DAT_00274480;
    (*(code *)(&PTR_FUN_0027c1e0)
              [(long)(int)((uVar3 | 0x94f8c2f2) * 2 - (uVar3 ^ 0x94f8c2f2)) * 300 +
               (long)(int)((uVar2 ^ 0x94f8c342) + (uVar2 & 0x94f8c342) * 2)])
              (**(undefined8 **)(unaff_x29 + -0x148));
    uVar2 = -(int)DAT_00274480;
    (*(code *)(&PTR_FUN_0027c1e0)
              [(long)(int)((uVar2 | 0x94f8c2f2) * 2 - (uVar2 ^ 0x94f8c2f2)) * 300 +
               (long)(int)(-0x6b073cbf - (-(int)DAT_00274480 ^ 0xffffffffU))])();
                    /* WARNING: Could not recover jumptable at 0x0018923c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00285b90)((-iVar4 | 0x95080531U) + (-iVar4 & 0x95080531U));
    return;
  }
  *unaff_x27 = 999999;
  uVar2 = -(int)DAT_00274480;
  uVar3 = -(int)DAT_00274480;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar2 | 0x94f8c2f2) * 2 - (uVar2 ^ 0x94f8c2f2)) * 300 +
             (long)(int)((uVar3 | 0x94f8c342) * 2 - (uVar3 ^ 0x94f8c342))])
            (**(undefined8 **)(unaff_x29 + -0xe8));
  **(undefined4 **)(unaff_x29 + -0x90) = *unaff_x27;
  **(int **)(unaff_x29 + -0x98) =
       (-(int)DAT_00274480 | 0x94f8c2f3U) + (-(int)DAT_00274480 & 0x94f8c2f3U);
                    /* WARNING: Could not recover jumptable at 0x00180e78. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00280cf0)();
  return;
}


