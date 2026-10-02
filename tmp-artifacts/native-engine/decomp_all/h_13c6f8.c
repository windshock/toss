// entry=0x13c6f8

void H13c6f8(ulong param_1)

{
  byte bVar1;
  bool bVar2;
  byte bVar3;
  undefined1 *puVar4;
  uint uVar5;
  int iVar6;
  long lVar7;
  char cVar8;
  ulong uVar9;
  uint uVar10;
  byte *pbVar11;
  ulong uVar12;
  undefined8 *unaff_x29;
  
  iVar6 = (int)DAT_00279eb0;
  if ((param_1 & 1) == 0) {
    (*(code *)(&PTR_FUN_0027c1e0)
              [(long)(int)((-iVar6 | 0x8692046U) * 2 - (-iVar6 ^ 0x8692046U)) * 300 +
               (long)(int)(0x869212a - (-iVar6 ^ 0xffffffffU))])(0x869e395 - (-iVar6 ^ 0xffffffffU))
    ;
                    /* WARNING: Could not recover jumptable at 0x00238800. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00279a70)();
    return;
  }
LAB_0023e4ac:
  do {
    if (DAT_0029e810 == 0) {
      cVar8 = '\x01';
      bVar2 = (bool)ExclusiveMonitorPass(0x29e810,0x10);
      if (bVar2) {
        DAT_0029e810 = 1;
        cVar8 = ExclusiveMonitorsStatus();
      }
      if (cVar8 != '\0') goto LAB_0023e4ac;
      bVar2 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar2 = false;
    }
    if (bVar2) {
      uVar5 = (-iVar6 | 0xb9911b6eU) * 2 - (-iVar6 ^ 0xb9911b6eU);
      uVar9 = 0x3f63e72908692045 - (-DAT_00279eb0 ^ 0xffffffffffffffffU);
      if (((DAT_0027ba98 ^ 0xfffffffe) & DAT_0027ba98) ==
          (-iVar6 | 0x8692047U) + (-iVar6 & 0x8692047U)) {
        DAT_0029e810 = 0;
        uVar9 = (-DAT_00279eb0 | 0x3f63e72908691fe2U) * 2 - (-DAT_00279eb0 ^ 0x3f63e72908691fe2U);
        lVar7 = (-DAT_00279eb0 ^ 0x3f63e72908692046U) + (-DAT_00279eb0 & 0x3f63e72908692046U) * 2;
        puVar4 = &DAT_002782e8;
        CallSupervisor(0);
        uVar12 = (long)(uVar9 << 0x20) >> (0x2065 - (-DAT_00279eb0 ^ 0xffffffffffffffffU) & 0x3f);
        if (uVar12 < 0xfffffffffffff001) {
          lVar7 = (-DAT_00279eb0 ^ 0x3f63e72908692047U) + (-DAT_00279eb0 & 0x3f63e72908692047U) * 2;
          puVar4 = &stack0x000001b8;
          CallSupervisor(0);
          CallSupervisor(0);
          uVar9 = uVar12;
        }
                    /* WARNING: Could not recover jumptable at 0x0023ef48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_00283248)
                  (uVar9,puVar4,lVar7,
                   (-DAT_00279eb0 ^ 0x3f63e72908692046U) + (-DAT_00279eb0 & 0x3f63e72908692046U) * 2
                  );
        return;
      }
      pbVar11 = &DAT_002782e8;
      do {
        uVar5 = uVar5 * ((-iVar6 ^ 0x8692067U) + (-iVar6 & 0x8692067U) * 2);
        uVar5 = (uVar5 | *pbVar11) & (uVar5 & *pbVar11 ^ 0xffffffff);
        uVar12 = (-DAT_00279eb0 | 0x3f63e72908692047U) * 2 - (-DAT_00279eb0 ^ 0x3f63e72908692047U);
        uVar9 = (uVar9 | uVar12) * 2 - (uVar9 ^ uVar12);
        pbVar11 = pbVar11 + (-DAT_00279eb0 | 0x3f63e72908692047U) +
                            (-DAT_00279eb0 & 0x3f63e72908692047U);
      } while (uVar9 != 0x3f63e7290869205d - (-DAT_00279eb0 ^ 0xffffffffffffffffU));
      if (uVar5 != 0xf4b6abb4) {
        unaff_x29[1] = 0x10;
        *unaff_x29 = 0x20;
                    /* WARNING: Could not recover jumptable at 0x0023e734. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_00285f48)();
        return;
      }
      uVar9 = 0;
      cVar8 = '\0';
      do {
        (&stack0x00000700)[uVar9] = cVar8;
        uVar9 = (uVar9 ^ 1) + (uVar9 & 1) * 2;
        cVar8 = cVar8 + '\x01';
      } while (uVar9 != 0x100);
      uVar9 = 0;
      uVar5 = 0;
      do {
        uVar5 = (uVar5 ^ 0xffffff00) & uVar5;
        bVar1 = (&stack0x00000700)[uVar9];
        uVar5 = (uVar5 | bVar1) + (uVar5 & bVar1);
        uVar5 = (uVar5 | (byte)(&DAT_0012cc50)[uVar9 % 0xb]) * 2 -
                (uVar5 ^ (byte)(&DAT_0012cc50)[uVar9 % 0xb]);
        (&stack0x00000700)[uVar9] = (&stack0x00000700)[(uVar5 ^ 0xffffff00) & uVar5];
        (&stack0x00000700)[(uVar5 ^ 0xffffff00) & uVar5] = bVar1;
        uVar9 = (uVar9 | 1) * 2 - (uVar9 ^ 1);
      } while (uVar9 != 0x100);
      uVar10 = 0;
      lVar7 = 0;
      uVar5 = 0;
      do {
        uVar5 = (uVar5 ^ 0xffffff00) & uVar5;
        uVar5 = (uVar5 | 1) * 2 - (uVar5 ^ 1);
        pbVar11 = &stack0x00000700 +
                  (ulong)((uVar5 ^ 0xffffff00) & uVar5) +
                  (0x3f63e72908692045 - (-DAT_00279eb0 ^ 0xffffffffffffffffU)) * 0x100;
        bVar1 = *pbVar11;
        uVar10 = (((uVar10 ^ (-(int)DAT_00279eb0 ^ 0x8692145U) +
                             (-(int)DAT_00279eb0 & 0x8692145U) * 2 ^ 0xffffffff) & uVar10) -
                 (bVar1 ^ 0xffffffff)) - 1;
        *pbVar11 = (&stack0x00000700)[(uVar10 ^ 0xffffff00) & uVar10];
        (&stack0x00000700)[(uVar10 ^ 0xffffff00) & uVar10] = bVar1;
        bVar3 = (*pbVar11 | bVar1) + (*pbVar11 & bVar1);
        bVar1 = (&DAT_002782e8)[lVar7];
        (&DAT_002782e8)[lVar7] = (bVar1 ^ 0xff) & bVar3 | bVar1 & (bVar3 ^ 0xff);
        lVar7 = lVar7 + 1;
      } while (lVar7 != 0x18);
                    /* WARNING: Could not recover jumptable at 0x0023ccfc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_0027abb0)();
      return;
    }
  } while( true );
}


