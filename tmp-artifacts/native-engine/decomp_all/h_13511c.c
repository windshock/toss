// entry=0x13511c

char * H1346cc(void)

{
  undefined8 *puVar1;
  undefined **ppuVar2;
  uint uVar3;
  bool bVar4;
  int iVar5;
  uint uVar6;
  char *pcVar7;
  long lVar8;
  int iVar9;
  undefined4 unaff_w20;
  long unaff_x21;
  int *unaff_x23;
  long unaff_x29;
  int iStack000000000000001c;
  
  CallSupervisor(0);
  CallSupervisor(0);
  iVar5 = *unaff_x23;
  uVar3 = -(int)DAT_00274ae0;
  uVar6 = -(int)DAT_00274ae0;
  uVar6 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar6 | 0x5de9c898) + (uVar6 & 0x5de9c898)) * 300 +
                     (long)(int)((uVar3 | 0x5de9c8de) + (uVar3 & 0x5de9c8de))])(iVar5,3);
  iVar9 = (int)DAT_00274ae0;
  uVar3 = (-iVar9 ^ 0x5de9d098U) + (-iVar9 & 0x5de9d098U) * 2;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar9 | 0x5de9c898U) + (-iVar9 & 0x5de9c898U)) * 300 +
             (long)(int)((-iVar9 | 0x5de9c8deU) + (-iVar9 & 0x5de9c8deU))])
            (iVar5,4,uVar6 & uVar3 | uVar6 ^ uVar3);
  uVar3 = -(int)DAT_00274ae0;
  uVar6 = -(int)DAT_00274ae0;
  pcVar7 = (char *)(*(code *)(&PTR_FUN_0027c1e0)
                             [(long)(int)((uVar6 ^ 0x5de9c898) + (uVar6 & 0x5de9c898) * 2) * 300 +
                              (long)(int)((uVar3 | 0x5de9c9ad) * 2 - (uVar3 ^ 0x5de9c9ad))])(0x1000)
  ;
  iVar5 = *unaff_x23;
  CallSupervisor(0);
  lVar8 = (long)iVar5 << 0x20;
  if ((ulong)(lVar8 >> 0x20) < 0xfffffffffffff001) {
    puVar1 = &DAT_00285ba0;
    if (iVar5 != 0) {
      puVar1 = &DAT_00285d88;
    }
                    /* WARNING: Could not recover jumptable at 0x002341f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    pcVar7 = (char *)(*(code *)*puVar1)();
    return pcVar7;
  }
  bVar4 = iVar5 == 0x5de9c897 - (-(int)DAT_00274ae0 ^ 0xffffffffU);
  if ((lVar8 == -0xb00000000 || !bVar4) && (lVar8 != -0xb00000000) == bVar4) {
    if (iVar5 < 1) {
      uVar3 = -(int)DAT_00274ae0;
      ppuVar2 = &PTR_LAB_00281b90;
      if (unaff_x21 != -1) {
        ppuVar2 = &PTR_LAB_00276510 +
                  (long)(int)((uVar3 ^ 0x5de9c898) + (uVar3 & 0x5de9c898) * 2) * 0x6f;
      }
                    /* WARNING: Could not recover jumptable at 0x002343f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      pcVar7 = (char *)(*(code *)*ppuVar2)();
      return pcVar7;
    }
                    /* WARNING: Could not recover jumptable at 0x00234b28. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    pcVar7 = (char *)(*(code *)PTR_LAB_00280d10)
                               ((long)iVar5,&stack0x000000c0,
                                (-DAT_00274ae0 | 0x4a3031a05de9d897U) * 2 -
                                (-DAT_00274ae0 ^ 0x4a3031a05de9d897U));
    return pcVar7;
  }
  *pcVar7 = -0x69 - (-(char)DAT_00274ae0 ^ 0xffU);
  CallSupervisor(0);
  uVar3 = -(int)DAT_00274ae0;
  iVar5 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar3 | 0x5de9c898) + (uVar3 & 0x5de9c898)) * 300 +
                     (long)(int)(0x5de9c8ef - (-(int)DAT_00274ae0 ^ 0xffffffffU))])(unaff_w20,9);
  if (iVar5 == 0) {
    iVar5 = (int)DAT_00274ae0;
    iStack000000000000001c = (-iVar5 | 0x5de9c898U) * 2 - (-iVar5 ^ 0x5de9c898U);
                    /* WARNING: Could not recover jumptable at 0x00234acc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    pcVar7 = (char *)(*(code *)(&PTR_LAB_0027d800)
                               [(long)(int)((-iVar5 | 0x5de9c898U) * 2 - (-iVar5 ^ 0x5de9c898U)) *
                                0x5f])(&PTR_FUN_0027c1e0 +
                                       (long)(int)((-iVar5 | 0x5de9c898U) + (-iVar5 & 0x5de9c898U))
                                       * 300 + (long)(int)((-iVar5 | 0x5de9c8d9U) * 2 -
                                                          (-iVar5 ^ 0x5de9c8d9U)));
    return pcVar7;
  }
  lVar8 = tpidr_el0;
  if (*(long *)(lVar8 + 0x28) == *(long *)(unaff_x29 + -0x68)) {
    return pcVar7;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


