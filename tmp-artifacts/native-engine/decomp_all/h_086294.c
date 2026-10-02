// entry=0x86294

void H86294(void)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  int iVar4;
  undefined4 unaff_w19;
  ulong unaff_x20;
  long unaff_x21;
  ulong unaff_x23;
  long *plVar5;
  long unaff_x29;
  
  do {
    uVar3 = (-DAT_00274480 | 0x99bbd15a94f8c2f3U) * 2 - (-DAT_00274480 ^ 0x99bbd15a94f8c2f3U);
    unaff_x23 = (unaff_x23 | uVar3) * 2 - (unaff_x23 ^ uVar3);
    iVar4 = (int)DAT_00274480;
    if (unaff_x23 == unaff_x20) {
      (*(code *)(&PTR_FUN_0027c1e0)
                [(long)(int)(-0x6b073d0f - (-iVar4 ^ 0xffffffffU)) * 300 +
                 (long)(int)((-iVar4 | 0x94f8c342U) + (-iVar4 & 0x94f8c342U))])();
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
      (*(code *)PTR_LAB_00285b90)(unaff_w19);
      return;
    }
    plVar5 = (long *)(unaff_x21 + unaff_x23 * 0x10);
  } while (*plVar5 == 0);
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar4 | 0x94f8c2f2U) + (-iVar4 & 0x94f8c2f2U)) * 300 +
             (long)(int)((-iVar4 | 0x94f8c342U) + (-iVar4 & 0x94f8c342U))])();
  *plVar5 = 0;
                    /* WARNING: Could not recover jumptable at 0x00189c84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_H86294_0027ec70)();
  return;
}


