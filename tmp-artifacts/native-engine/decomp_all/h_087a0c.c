// entry=0x87a0c

void H87a0c(void)

{
  long lVar1;
  undefined **ppuVar2;
  uint uVar3;
  uint uVar4;
  char cVar5;
  undefined8 uVar6;
  ulong uVar7;
  int iVar8;
  undefined8 *puVar9;
  undefined4 *puVar10;
  ulong unaff_x21;
  int *unaff_x22;
  undefined4 *puVar11;
  long unaff_x29;
  
  uVar3 = -(int)DAT_00274480;
  uVar4 = -(int)DAT_00274480;
  cVar5 = (*(code *)(&DAT_0029e620)
                    [(long)(int)((uVar3 | 0x94f8c2f2) + (uVar3 & 0x94f8c2f2)) * 0x2b +
                     (long)(int)((uVar4 | 0x94f8c318) + (uVar4 & 0x94f8c318))])
                    (*(undefined8 *)(unaff_x29 + -0x130));
  iVar8 = (int)DAT_00274480;
  if (cVar5 != '\0') {
    (*(code *)(&DAT_0029e620)
              [(long)(int)((-iVar8 | 0x94f8c2f2U) * 2 - (-iVar8 ^ 0x94f8c2f2U)) * 0x2b +
               (long)(int)((-iVar8 ^ 0x94f8c2faU) + (-iVar8 & 0x94f8c2faU) * 2)])
              (*(undefined8 *)(unaff_x29 + -0x130));
    uVar3 = -(int)DAT_00274480;
    uVar4 = -(int)DAT_00274480;
    uVar6 = (*(code *)(&DAT_0029e620)
                      [(long)(int)((uVar4 ^ 0x94f8c2f2) + (uVar4 & 0x94f8c2f2) * 2) * 0x2b +
                       (long)(int)((uVar3 | 0x94f8c2f9) * 2 - (uVar3 ^ 0x94f8c2f9))])
                      (*(undefined8 *)(unaff_x29 + -0x130),&DAT_00279ef1);
                    /* WARNING: Could not recover jumptable at 0x0017ac1c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00276770)(uVar6,uVar6);
    return;
  }
  uVar7 = (*(code *)(&DAT_0029e620)
                    [(long)(-0x6b073d0e - iVar8) * 0x2b +
                     (long)(int)((-iVar8 ^ 0x94f8c310U) + (-iVar8 & 0x14f8c310U) * 2)])
                    (*(undefined8 *)(unaff_x29 + -0x130));
  uVar7 = uVar7 & ((-DAT_00274480 | 0x99bcd15a94f8c2f1U) + (-DAT_00274480 & 0x99bcd15a94f8c2f1U) ^
                   uVar7 ^ 0xffffffffffffffff);
  if (uVar7 == 0) {
    ppuVar2 = &PTR_LAB_00282d08;
    if (*(char *)(**(long **)(unaff_x29 + -0x168) + unaff_x21 * 0x10 + 8) != '\0') {
      ppuVar2 = &PTR_LAB_00281800;
    }
                    /* WARNING: Could not recover jumptable at 0x00179a1c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)();
    return;
  }
  if (uVar7 != 0x19) {
                    /* WARNING: Could not recover jumptable at 0x00187570. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00280c88)();
    return;
  }
  iVar8 = (int)DAT_00274480;
  if (*(char *)(**(long **)(unaff_x29 + -0x168) + unaff_x21 * 0x10 + 8) == '\0') {
    puVar10 = *(undefined4 **)(unaff_x29 + -0x90);
    puVar11 = *(undefined4 **)(unaff_x29 + -0xd0);
    if (*unaff_x22 < 1) {
      (*(code *)(&PTR_FUN_0027c1e0)
                [(long)(int)((-iVar8 ^ 0x94f8c2f2U) + (-iVar8 & 0x94f8c2f2U) * 2) * 300 +
                 (long)(int)((-iVar8 | 0x94f8c342U) * 2 - (-iVar8 ^ 0x94f8c342U))])
                (**(undefined8 **)(unaff_x29 + -0x168));
      uVar3 = -(int)DAT_00274480;
      (*(code *)(&PTR_FUN_0027c1e0)
                [(long)(int)((uVar3 | 0x94f8c2f2) + (uVar3 & 0x94f8c2f2)) * 300 +
                 (long)(int)(-0x6b073cbf - (-(int)DAT_00274480 ^ 0xffffffffU))])
                (**(undefined8 **)(unaff_x29 + -0x150));
      uVar3 = -(int)DAT_00274480;
      (*(code *)(&PTR_FUN_0027c1e0)
                [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 300 +
                 (long)(int)((uVar3 | 0x94f8c342) * 2 - (uVar3 ^ 0x94f8c342))])();
      puVar9 = *(undefined8 **)(unaff_x29 + -0xd8);
      *puVar11 = 0x19;
      uVar3 = -(int)DAT_00274480;
      uVar4 = -(int)DAT_00274480;
      (*(code *)(&PTR_FUN_0027c1e0)
                [(long)(int)((uVar3 | 0x94f8c2f2) * 2 - (uVar3 ^ 0x94f8c2f2)) * 300 +
                 (long)(int)((uVar4 ^ 0x94f8c342) + (uVar4 & 0x94f8c342) * 2)])(*puVar9);
      *puVar10 = *puVar11;
      **(int **)(unaff_x29 + -0x98) = -0x6b073d0e - (-(int)DAT_00274480 ^ 0xffffffffU);
                    /* WARNING: Could not recover jumptable at 0x0017cd08. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)(&PTR_LAB_0027ad20)
                [(int)((-(int)DAT_00274480 | 0x94f8c320U) * 2 - (-(int)DAT_00274480 ^ 0x94f8c320U))]
      )();
      return;
    }
    ppuVar2 = &PTR_LAB_00276610 + (int)((-iVar8 | 0x94f8c2fcU) * 2 - (-iVar8 ^ 0x94f8c2fcU));
    if (*(long *)(**(long **)(unaff_x29 + -0x168) +
                 ((-DAT_00274480 | 0x99bbd15a94f8c2f2U) * 2 - (-DAT_00274480 ^ 0x99bbd15a94f8c2f2U))
                 * 0x10) != 0) {
      ppuVar2 = &PTR_LAB_002753f8;
    }
                    /* WARNING: Could not recover jumptable at 0x00188ae4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)();
    return;
  }
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar8 ^ 0x94f8c2f2U) + (-iVar8 & 0x94f8c2f2U) * 2) * 300 +
             (long)(int)((-iVar8 ^ 0x94f8c393U) + (-iVar8 & 0x94f8c393U) * 2)])
            (*(undefined8 *)(unaff_x29 + -0x130),*(undefined8 *)(unaff_x29 + -0x140),
             (-iVar8 | 0x94f8c2f5U) + (-iVar8 & 0x94f8c2f5U),&DAT_0012ce22,&DAT_0012ce22,
             &DAT_0012ce22);
  lVar1 = (unaff_x21 | 1) + (unaff_x21 & 1);
  if (lVar1 != *(long *)(unaff_x29 + -0x1d0)) {
    ppuVar2 = &PTR_LAB_00283568;
    if (*(long *)(**(long **)(unaff_x29 + -0x168) + lVar1 * 0x10) != 0) {
      ppuVar2 = &PTR_LAB_00278e28;
    }
                    /* WARNING: Could not recover jumptable at 0x0018d684. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)();
    return;
  }
  ppuVar2 = &PTR_LAB_0027ff20;
  if (unaff_x22 != (int *)0x0) {
    ppuVar2 = &PTR_LAB_00282d08;
  }
                    /* WARNING: Could not recover jumptable at 0x00183e14. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


