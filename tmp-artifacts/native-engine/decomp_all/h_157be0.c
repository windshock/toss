// entry=0x157be0

undefined8 H1570a8(void)

{
  uint uVar1;
  uint uVar2;
  char cVar3;
  long lVar4;
  bool bVar5;
  long *plVar6;
  undefined8 uVar7;
  int iVar8;
  int iVar9;
  int unaff_w22;
  byte *unaff_x27;
  long unaff_x29;
  
  iVar8 = (int)DAT_00277160;
  if (unaff_w22 == -0x5f63dbf - (-iVar8 ^ 0xffffffffU)) {
    (*(code *)(&DAT_0029e620)
              [(long)(int)((-iVar8 | 0xfa09c241U) * 2 - (-iVar8 ^ 0xfa09c241U)) * 0x2b +
               (long)(int)((-iVar8 ^ 0xfa09c261U) + (-iVar8 & 0xfa09c261U) * 2)])();
                    /* WARNING: Could not recover jumptable at 0x002552cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar7 = (*(code *)PTR_LAB_0027ea08)();
    return uVar7;
  }
  plVar6 = (long *)FUN_0026eefc(&DAT_002861d0);
  iVar8 = (int)DAT_00277160;
  if (*plVar6 == 0) {
    (*(code *)(&DAT_0029e620)
              [(long)(int)(-0x5f63dc0 - (-iVar8 ^ 0xffffffffU)) * 0x2b +
               (long)(int)((-iVar8 | 0xfa09c248U) + (-iVar8 & 0xfa09c248U))])();
    uVar1 = -(int)DAT_00277160;
    (*(code *)(&DAT_0029e620)
              [(long)(int)(-0x5f63dc0 - (-(int)DAT_00277160 ^ 0xffffffffU)) * 0x2b +
               (long)(int)((uVar1 ^ 0xfa09c256) + (uVar1 & 0xfa09c256) * 2)])();
    uVar1 = -(int)DAT_00277160;
    (*(code *)(&DAT_0029e620)
              [(long)(int)((uVar1 | 0xfa09c241) + (uVar1 & 0xfa09c241)) * 0x2b +
               (long)(int)(-0x5f63db2 - (-(int)DAT_00277160 ^ 0xffffffffU))])();
    uVar1 = -(int)DAT_00277160;
    uVar2 = -(int)DAT_00277160;
    uVar7 = (*(code *)(&DAT_0029e620)
                      [(long)(int)((uVar1 | 0xfa09c241) + (uVar1 & 0xfa09c241)) * 0x2b +
                       (long)(int)((uVar2 ^ 0xfa09c248) + (uVar2 & 0xfa09c248) * 2)])();
    uVar1 = -(int)DAT_00277160;
    uVar2 = -(int)DAT_00277160;
                    /* WARNING: Could not recover jumptable at 0x002575b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar7 = (*(code *)PTR_LAB_00277750)
                      (&DAT_0029e620 +
                       (long)(int)((uVar2 ^ 0xfa09c241) + (uVar2 & 0xfa09c241) * 2) * 0x2b +
                       (long)(int)((uVar1 | 0xfa09c256) * 2 - (uVar1 ^ 0xfa09c256)),uVar7,uVar7);
    return uVar7;
  }
  uVar7 = (*(code *)(&DAT_0029e620)
                    [(long)(int)((-iVar8 | 0xfa09c241U) * 2 - (-iVar8 ^ 0xfa09c241U)) * 0x2b +
                     (long)(int)((-iVar8 | 0xfa09c25fU) + (-iVar8 & 0xfa09c25fU))])();
  uVar1 = DAT_0029e860;
LAB_00258c6c:
  do {
    if (DAT_00286240 == 0) {
      cVar3 = '\x01';
      bVar5 = (bool)ExclusiveMonitorPass(0x286240,0x10);
      if (bVar5) {
        DAT_00286240 = 1;
        cVar3 = ExclusiveMonitorsStatus();
      }
      if (cVar3 != '\0') goto LAB_00258c6c;
      bVar5 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar5 = false;
    }
    if (bVar5) {
      iVar9 = (int)DAT_00277160;
      iVar8 = (-iVar9 | 0xfa09c242U) + (-iVar9 & 0xfa09c242U);
      if ((*unaff_x27 & 1) == 0) {
        iVar8 = 0;
      }
      DAT_0029e860 = (DAT_0029e860 | -iVar8) * 2 - (DAT_0029e860 ^ -iVar8);
      bVar5 = uVar1 == (-iVar9 | 0xfa09c242U) + (-iVar9 & 0xfa09c242U);
      if (((bVar5 ^ *unaff_x27 & 1 ^ 1) & bVar5) != 0) {
                    /* WARNING: Could not recover jumptable at 0x00256a80. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar7 = (*(code *)PTR_LAB_00277308)();
        return uVar7;
      }
      DAT_00286240 = (-iVar9 | 0xfa09c241U) * 2 - (-iVar9 ^ 0xfa09c241U);
      lVar4 = tpidr_el0;
      if (*(long *)(lVar4 + 0x28) != *(long *)(unaff_x29 + -0x58)) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return uVar7;
    }
  } while( true );
}


