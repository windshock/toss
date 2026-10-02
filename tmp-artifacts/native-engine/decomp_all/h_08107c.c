// entry=0x8107c

void H8107c(undefined8 param_1,undefined8 param_2)

{
  undefined *puVar1;
  undefined4 uVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  undefined8 extraout_x1;
  long in_x9;
  int iVar6;
  long lVar7;
  long *unaff_x19;
  undefined8 uVar8;
  undefined8 unaff_x20;
  undefined4 *unaff_x21;
  undefined8 unaff_x22;
  undefined8 *unaff_x24;
  undefined8 uVar9;
  undefined4 *unaff_x25;
  long lVar10;
  int *piVar11;
  int *piVar12;
  long unaff_x29;
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  
  uVar2 = *(undefined4 *)(in_x9 + 8);
  *(undefined8 *)(unaff_x29 + -0x110) = unaff_x20;
  *(undefined8 *)(unaff_x29 + -0x100) = unaff_x22;
  piVar12 = *(int **)(unaff_x29 + -0x98);
  *unaff_x21 = uVar2;
  iVar6 = **(int **)(unaff_x29 + -0x138);
  lVar10 = **(long **)(unaff_x29 + -400);
  lVar7 = *unaff_x19;
  uVar8 = *unaff_x24;
  uVar2 = *unaff_x25;
  uVar3 = -(int)DAT_00274480;
  auVar13 = (*(code *)(&PTR_FUN_0027c1e0)
                      [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 300 +
                       (long)(int)((uVar3 ^ 0x94f8c32a) + (uVar3 & 0x94f8c32a) * 2)])
                      (2,param_2,lVar10 + 0xc,0x14);
  iVar5 = (int)DAT_00274480;
  uVar3 = -iVar5 & 0x94f8c2f4;
  auVar13 = (*(code *)(&PTR_FUN_0027c1e0)
                      [(long)(int)((-iVar5 | 0x94f8c2f2U) * 2 - (-iVar5 ^ 0x94f8c2f2U)) * 300 +
                       (long)(int)((-iVar5 | 0x94f8c3eaU) + (-iVar5 & 0x94f8c3eaU))])
                      ((-iVar5 | 0x94f8c2f4U) + uVar3,auVar13._8_8_,auVar13._0_8_,(char)uVar3,
                       *(undefined4 *)(lVar7 + 0x10),(long)*(int *)(lVar7 + 0xc));
  uVar3 = -(int)DAT_00274480;
  uVar4 = -(int)DAT_00274480;
  iVar5 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar4 | 0x94f8c2f2) * 2 - (uVar4 ^ 0x94f8c2f2)) * 300 +
                     (long)(int)((uVar3 | 0x94f8c3ea) * 2 - (uVar3 ^ 0x94f8c3ea))])
                    (2,auVar13._8_8_,auVar13._0_8_,
                     (ulong)(&PTR_FUN_0027c1e0)
                            [(long)(int)((uVar4 | 0x94f8c2f2) * 2 - (uVar4 ^ 0x94f8c2f2)) * 300 +
                             (long)(int)((uVar3 | 0x94f8c3ea) * 2 - (uVar3 ^ 0x94f8c3ea))] & 0xff,
                     uVar2,*(undefined4 *)(lVar10 + 0x2c));
  piVar11 = *(int **)(unaff_x29 + -0x178);
  *piVar11 = iVar5;
  if (iVar6 != 1) {
    uVar3 = -(int)DAT_00274480;
    uVar4 = -(int)DAT_00274480;
    auVar13 = (*(code *)(&PTR_FUN_0027c1e0)
                        [(long)(int)((uVar3 | 0x94f8c2f2) * 2 - (uVar3 ^ 0x94f8c2f2)) * 300 +
                         (long)(int)((uVar4 | 0x94f8c3d2) + (uVar4 & 0x94f8c3d2))])
                        (2,extraout_x1,lVar7 + 0x18);
    uVar3 = -(int)DAT_00274480;
    auVar14 = (*(code *)(&PTR_FUN_0027c1e0)
                        [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 300 +
                         (long)(int)((uVar3 ^ 0x94f8c3d2) + (uVar3 & 0x94f8c3d2) * 2)])
                        (2,auVar13._8_8_,lVar10 + 0xc);
    iVar6 = (int)DAT_00274480;
    auVar15 = (*(code *)(&PTR_FUN_0027c1e0)
                        [(long)(int)((-iVar6 ^ 0x94f8c2f2U) + (-iVar6 & 0x94f8c2f2U) * 2) * 300 +
                         (long)(int)((-iVar6 | 0x94f8c3d2U) + (-iVar6 & 0x94f8c3d2U))])
                        ((-iVar6 ^ 0x94f8c2f4U) + (-iVar6 & 0x94f8c2f4U) * 2,auVar14._8_8_,piVar11);
    iVar6 = (int)DAT_00274480;
    auVar13 = (*(code *)(&PTR_FUN_0027c1e0)
                        [(long)(int)((-iVar6 | 0x94f8c2f2U) + (-iVar6 & 0x94f8c2f2U)) * 300 +
                         (long)(int)(-0x6b073c17 - (-iVar6 ^ 0xffffffffU))])
                        (-(-iVar6 ^ 0xffffffffU) + -0x6b073d0e,auVar15._8_8_,
                         auVar13._0_8_ & 0xffffffff,(char)-(-iVar6 ^ 0xffffffffU) + -0xd,
                         auVar15._0_8_,4);
    uVar3 = -(int)DAT_00274480;
    auVar13 = (*(code *)(&PTR_FUN_0027c1e0)
                        [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 300 +
                         (long)(int)((uVar3 | 0x94f8c3ea) * 2 - (uVar3 ^ 0x94f8c3ea))])
                        (1,auVar13._8_8_,auVar13._0_8_,
                         (ulong)(&PTR_FUN_0027c1e0)
                                [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 300
                                 + (long)(int)((uVar3 | 0x94f8c3ea) * 2 - (uVar3 ^ 0x94f8c3ea))] &
                         0xff,auVar14._0_8_ & 0xffffffff,0x14);
    uVar3 = -(int)DAT_00274480;
    uVar4 = -(int)DAT_00274480;
    auVar14 = (*(code *)(&PTR_FUN_0027c1e0)
                        [(long)(int)((uVar3 | 0x94f8c2f2) + (uVar3 & 0x94f8c2f2)) * 300 +
                         (long)(int)((uVar4 ^ 0x94f8c3d2) + (uVar4 & 0x94f8c3d2) * 2)])
                        (2,auVar13._8_8_,uVar8);
    iVar6 = (int)DAT_00274480;
    uVar3 = -iVar6 ^ 0x94f8c2f3;
    auVar13 = (*(code *)(&PTR_FUN_0027c1e0)
                        [(long)(int)(-0x6b073d0f - (-iVar6 ^ 0xffffffffU)) * 300 +
                         (long)(int)(-0x6b073c17 - (-iVar6 ^ 0xffffffffU))])
                        ((-iVar6 | 0x94f8c2f3U) * 2 - uVar3,auVar14._8_8_,auVar13._0_8_ & 0xffffffff
                         ,(char)uVar3,*(undefined4 *)(lVar7 + 0x14),(long)*(int *)(lVar7 + 0xc));
    iVar6 = (int)DAT_00274480;
    (*(code *)(&PTR_FUN_0027c1e0)
              [(long)(int)((-iVar6 | 0x94f8c2f2U) * 2 - (-iVar6 ^ 0x94f8c2f2U)) * 300 +
               (long)(int)(-0x6b073c17 - (-iVar6 ^ 0xffffffffU))])
              (-(-iVar6 ^ 0xffffffffU) + -0x6b073d0e,auVar13._8_8_,auVar13._0_8_,
               (char)-(-iVar6 ^ 0xffffffffU) + -0xd,auVar14._0_8_ & 0xffffffff,
               *(undefined4 *)(lVar10 + 0x2c));
                    /* WARNING: Could not recover jumptable at 0x00183364. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002779d8)();
    return;
  }
  piVar11 = *(int **)(unaff_x29 + -0x188);
  *piVar11 = iVar5;
  if (**(int **)(unaff_x29 + -0x180) == *piVar11) {
                    /* WARNING: Could not recover jumptable at 0x0017d4f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00275bc8)();
    return;
  }
  uVar8 = **(undefined8 **)(unaff_x29 + -200);
  uVar9 = **(undefined8 **)(unaff_x29 + -0xc0);
  iVar6 = **(int **)(unaff_x29 + -0x138);
  iVar5 = **(int **)(unaff_x29 + -0x180);
  lVar10 = *(long *)(unaff_x29 + -0xa0) +
           (-0x66442ea56b073d0f - (-DAT_00274480 ^ 0xffffffffffffffffU)) * 0xc;
  lVar7 = *(long *)(unaff_x29 + -0xb8) +
          (-DAT_00274480 | 0x99bbd15a94f8c2f2U) + (-DAT_00274480 & 0x99bbd15a94f8c2f2U);
  uVar3 = -(int)DAT_00274480;
  uVar4 = -(int)DAT_00274480;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar4 ^ 0x94f8c2f2) + (uVar4 & 0x94f8c2f2) * 2) * 300 +
             (long)(int)((uVar3 ^ 0x94f8c3a5) + (uVar3 & 0x94f8c3a5) * 2)])
            (lVar10,0xc,&DAT_00276cd2,*piVar11);
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 300 +
             (long)(int)(-0x6b073c5c - (-(int)DAT_00274480 ^ 0xffffffffU))])
            (lVar7,(-DAT_00274480 | 0x99bbd15a94f8c2feU) * 2 - (-DAT_00274480 ^ 0x99bbd15a94f8c2feU)
             ,&DAT_00276cd2,iVar5);
  iVar5 = (int)DAT_00274480;
  puVar1 = (undefined *)0x279f82;
  if (iVar6 != (-iVar5 | 0x94f8c2f3U) + (-iVar5 & 0x94f8c2f3U)) {
    puVar1 = &DAT_00279f28;
  }
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar5 | 0x94f8c2f2U) + (-iVar5 & 0x94f8c2f2U)) * 300 +
             (long)(int)((-iVar5 | 0x94f8c393U) * 2 - (-iVar5 ^ 0x94f8c393U))])
            (uVar8,uVar9,3,puVar1,lVar10,lVar7);
  **(int **)(unaff_x29 + -0x90) =
       (-(int)DAT_00274480 | 0x94f8c30eU) * 2 - (-(int)DAT_00274480 ^ 0x94f8c30eU);
  *piVar12 = (-(int)DAT_00274480 | 0x94f8c2f3U) + (-(int)DAT_00274480 & 0x94f8c2f3U);
                    /* WARNING: Could not recover jumptable at 0x00181610. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002749d8)();
  return;
}


