// entry=0xca52c

void Hca52c(undefined8 param_1)

{
  ulong uVar1;
  undefined **ppuVar2;
  undefined4 uVar3;
  uint uVar4;
  char cVar5;
  bool bVar6;
  long lVar7;
  undefined8 extraout_x1;
  undefined8 uVar8;
  undefined8 extraout_x1_00;
  char *in_x9;
  int iVar9;
  ulong uVar10;
  undefined8 *unaff_x22;
  long unaff_x29;
  
  *in_x9 = (-(char)DAT_002793a8 ^ 0x77U) + (-(char)DAT_002793a8 & 0x77U) * '\x02';
  *unaff_x22 = param_1;
  *(undefined4 *)(unaff_x22 + 1) = 0;
  unaff_x22[2] = 0;
  iVar9 = (int)DAT_002793a8;
  if (DAT_002862e8 != (code *)0x0) {
    (*DAT_002862e8)((&PTR_FUN_0027c1e0)
                    [(long)(int)((-iVar9 | 0x96433677U) * 2 - (-iVar9 ^ 0x96433677U)) * 300 +
                     (long)(int)((-iVar9 | 0x96433790U) + (-iVar9 & 0x96433790U))]);
    uVar3 = *(undefined4 *)(unaff_x22 + 1);
    uVar8 = extraout_x1_00;
    if (unaff_x22[2] != 0) {
      uVar4 = -(int)DAT_002793a8;
      (*(code *)(&PTR_FUN_0027c1e0)
                [(long)(int)(-0x69bcc98a - (-(int)DAT_002793a8 ^ 0xffffffffU)) * 300 +
                 (long)(int)((uVar4 ^ 0x96433718) + (uVar4 & 0x96433718) * 2)])();
      uVar8 = extraout_x1;
    }
    iVar9 = (int)DAT_002793a8;
    uVar10 = (*(code *)(&PTR_FUN_0027c1e0)
                       [(long)(int)((-iVar9 | 0x96433677U) + (-iVar9 & 0x96433677U)) * 300 +
                        (long)(int)((-iVar9 | 0x9643368bU) * 2 - (-iVar9 ^ 0x9643368bU))])
                       ((-iVar9 | 0x96433677U) + (-iVar9 & 0x96433677U),uVar8,uVar3);
    uVar1 = (-DAT_002793a8 | 0xb7d6f09d60a1ff01U) + (-DAT_002793a8 & 0xb7d6f09d60a1ff01U);
    lVar7 = tpidr_el0;
    if (*(long *)(lVar7 + 0x28) != *(long *)(unaff_x29 + -0x48)) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail((uVar10 | uVar1) + (uVar10 & uVar1));
    }
    return;
  }
LAB_001ca210:
  do {
    if (DAT_002862c0 == 0) {
      cVar5 = '\x01';
      bVar6 = (bool)ExclusiveMonitorPass(0x2862c0,0x10);
      if (bVar6) {
        DAT_002862c0 = 1;
        cVar5 = ExclusiveMonitorsStatus();
      }
      if (cVar5 != '\0') goto LAB_001ca210;
      bVar6 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar6 = false;
    }
    if (bVar6) {
      uVar1 = (-DAT_002793a8 ^ 0xb7d6f09d96433677U) + (-DAT_002793a8 & 0xb7d6f09d96433677U) * 2;
      if (((DAT_00274eb8 ^ 0xfffffffe) & DAT_00274eb8) == 1) {
        DAT_002862c0 = 0;
        (*(code *)(&PTR_FUN_0027c1e0)
                  [(long)(int)((-iVar9 | 0x96433677U) * 2 - (-iVar9 ^ 0x96433677U)) * 300 +
                   (long)(int)(-0x69bcc954 - (-iVar9 ^ 0xffffffffU))])
                  (0,(-iVar9 | 0x96433677U) + (-iVar9 & 0x96433677U));
                    /* WARNING: Could not recover jumptable at 0x001ca0d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_Hc9994_0027d760)();
        return;
      }
      uVar10 = 0xb7d6f09d96433677 - (-DAT_002793a8 ^ 0xffffffffffffffffU);
      ppuVar2 = &PTR_LAB_0027a588;
      if ((uVar1 ^ uVar10) + (uVar1 & uVar10) * 2 !=
          (-DAT_002793a8 | 0xb7d6f09d964337dfU) * 2 - (-DAT_002793a8 ^ 0xb7d6f09d964337dfU)) {
        ppuVar2 = &PTR_LAB_002784e8;
      }
                    /* WARNING: Could not recover jumptable at 0x001c9e20. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar2)(0xffffffff,(-iVar9 | 0x964436b6U) << 1);
      return;
    }
  } while( true );
}


