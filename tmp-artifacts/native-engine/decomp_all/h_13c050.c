// entry=0x13c050

void H13c050(undefined8 *param_1)

{
  undefined **ppuVar1;
  byte bVar2;
  bool bVar3;
  byte bVar4;
  int iVar5;
  undefined1 *puVar6;
  uint uVar7;
  long lVar8;
  char cVar9;
  ulong uVar10;
  uint uVar11;
  byte *pbVar12;
  ulong uVar13;
  undefined8 *unaff_x29;
  
  (*(code *)*param_1)((-(int)DAT_00279eb0 | 0x869e396U) * 2 - (-(int)DAT_00279eb0 ^ 0x869e396U));
  uVar7 = -(int)DAT_00279eb0;
  uVar11 = -(int)DAT_00279eb0;
  iVar5 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar7 ^ 0x8692046) + (uVar7 & 0x8692046) * 2) * 300 +
                     (long)(int)((uVar11 | 0x8692088) * 2 - (uVar11 ^ 0x8692088))])();
  if (iVar5 != 1) {
    uVar7 = -(int)DAT_00279eb0;
    (*(code *)(&PTR_FUN_0027c1e0)
              [(long)(int)((uVar7 | 0x8692046) + (uVar7 & 0x8692046)) * 300 +
               (long)(int)(0x869212a - (-(int)DAT_00279eb0 ^ 0xffffffffU))])(50000);
    uVar7 = -(int)DAT_00279eb0;
    uVar11 = -(int)DAT_00279eb0;
    iVar5 = (*(code *)(&PTR_FUN_0027c1e0)
                      [(long)(int)((uVar11 | 0x8692046) * 2 - (uVar11 ^ 0x8692046)) * 300 +
                       (long)(int)((uVar7 | 0x8692088) * 2 - (uVar7 ^ 0x8692088))])();
    if (iVar5 != 1) {
      uVar7 = -(int)DAT_00279eb0;
      (*(code *)(&PTR_FUN_0027c1e0)
                [(long)(int)((uVar7 | 0x8692046) + (uVar7 & 0x8692046)) * 300 +
                 (long)(int)(0x869212a - (-(int)DAT_00279eb0 ^ 0xffffffffU))])(50000);
      uVar7 = -(int)DAT_00279eb0;
      uVar11 = -(int)DAT_00279eb0;
      iVar5 = (*(code *)(&PTR_FUN_0027c1e0)
                        [(long)(int)((uVar7 ^ 0x8692046) + (uVar7 & 0x8692046) * 2) * 300 +
                         (long)(int)((uVar11 | 0x8692088) + (uVar11 & 0x8692088))])();
      ppuVar1 = &PTR_LAB_00275998;
      if (iVar5 != 1) {
        ppuVar1 = &PTR_LAB_0027b098 +
                  (long)(int)((-(int)DAT_00279eb0 | 0x8692046U) * 2 -
                             (-(int)DAT_00279eb0 ^ 0x8692046U)) * 0x71;
      }
                    /* WARNING: Could not recover jumptable at 0x0023c5e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar1)();
      return;
    }
  }
LAB_0023e4ac:
  do {
    if (DAT_0029e810 == 0) {
      cVar9 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(0x29e810,0x10);
      if (bVar3) {
        DAT_0029e810 = 1;
        cVar9 = ExclusiveMonitorsStatus();
      }
      if (cVar9 != '\0') goto LAB_0023e4ac;
      bVar3 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar3 = false;
    }
    if (bVar3) {
      iVar5 = (int)DAT_00279eb0;
      uVar7 = (-iVar5 | 0xb9911b6eU) * 2 - (-iVar5 ^ 0xb9911b6eU);
      uVar10 = 0x3f63e72908692045 - (-DAT_00279eb0 ^ 0xffffffffffffffffU);
      if (((DAT_0027ba98 ^ 0xfffffffe) & DAT_0027ba98) ==
          (-iVar5 | 0x8692047U) + (-iVar5 & 0x8692047U)) {
        DAT_0029e810 = 0;
        uVar10 = (-DAT_00279eb0 | 0x3f63e72908691fe2U) * 2 - (-DAT_00279eb0 ^ 0x3f63e72908691fe2U);
        lVar8 = (-DAT_00279eb0 ^ 0x3f63e72908692046U) + (-DAT_00279eb0 & 0x3f63e72908692046U) * 2;
        puVar6 = &DAT_002782e8;
        CallSupervisor(0);
        uVar13 = (long)(uVar10 << 0x20) >> (0x2065 - (-DAT_00279eb0 ^ 0xffffffffffffffffU) & 0x3f);
        if (uVar13 < 0xfffffffffffff001) {
          lVar8 = (-DAT_00279eb0 ^ 0x3f63e72908692047U) + (-DAT_00279eb0 & 0x3f63e72908692047U) * 2;
          puVar6 = &stack0x000001b8;
          CallSupervisor(0);
          CallSupervisor(0);
          uVar10 = uVar13;
        }
                    /* WARNING: Could not recover jumptable at 0x0023ef48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_00283248)
                  (uVar10,puVar6,lVar8,
                   (-DAT_00279eb0 ^ 0x3f63e72908692046U) + (-DAT_00279eb0 & 0x3f63e72908692046U) * 2
                  );
        return;
      }
      pbVar12 = &DAT_002782e8;
      do {
        uVar7 = uVar7 * ((-iVar5 ^ 0x8692067U) + (-iVar5 & 0x8692067U) * 2);
        uVar7 = (uVar7 | *pbVar12) & (uVar7 & *pbVar12 ^ 0xffffffff);
        uVar13 = (-DAT_00279eb0 | 0x3f63e72908692047U) * 2 - (-DAT_00279eb0 ^ 0x3f63e72908692047U);
        uVar10 = (uVar10 | uVar13) * 2 - (uVar10 ^ uVar13);
        pbVar12 = pbVar12 + (-DAT_00279eb0 | 0x3f63e72908692047U) +
                            (-DAT_00279eb0 & 0x3f63e72908692047U);
      } while (uVar10 != 0x3f63e7290869205d - (-DAT_00279eb0 ^ 0xffffffffffffffffU));
      if (uVar7 != 0xf4b6abb4) {
        unaff_x29[1] = 0x10;
        *unaff_x29 = 0x20;
                    /* WARNING: Could not recover jumptable at 0x0023e734. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_00285f48)();
        return;
      }
      uVar10 = 0;
      cVar9 = '\0';
      do {
        (&stack0x00000700)[uVar10] = cVar9;
        uVar10 = (uVar10 ^ 1) + (uVar10 & 1) * 2;
        cVar9 = cVar9 + '\x01';
      } while (uVar10 != 0x100);
      uVar10 = 0;
      uVar7 = 0;
      do {
        uVar7 = (uVar7 ^ 0xffffff00) & uVar7;
        bVar2 = (&stack0x00000700)[uVar10];
        uVar7 = (uVar7 | bVar2) + (uVar7 & bVar2);
        uVar7 = (uVar7 | (byte)(&DAT_0012cc50)[uVar10 % 0xb]) * 2 -
                (uVar7 ^ (byte)(&DAT_0012cc50)[uVar10 % 0xb]);
        (&stack0x00000700)[uVar10] = (&stack0x00000700)[(uVar7 ^ 0xffffff00) & uVar7];
        (&stack0x00000700)[(uVar7 ^ 0xffffff00) & uVar7] = bVar2;
        uVar10 = (uVar10 | 1) * 2 - (uVar10 ^ 1);
      } while (uVar10 != 0x100);
      uVar11 = 0;
      lVar8 = 0;
      uVar7 = 0;
      do {
        uVar7 = (uVar7 ^ 0xffffff00) & uVar7;
        uVar7 = (uVar7 | 1) * 2 - (uVar7 ^ 1);
        pbVar12 = &stack0x00000700 +
                  (ulong)((uVar7 ^ 0xffffff00) & uVar7) +
                  (0x3f63e72908692045 - (-DAT_00279eb0 ^ 0xffffffffffffffffU)) * 0x100;
        bVar2 = *pbVar12;
        uVar11 = (((uVar11 ^ (-(int)DAT_00279eb0 ^ 0x8692145U) +
                             (-(int)DAT_00279eb0 & 0x8692145U) * 2 ^ 0xffffffff) & uVar11) -
                 (bVar2 ^ 0xffffffff)) - 1;
        *pbVar12 = (&stack0x00000700)[(uVar11 ^ 0xffffff00) & uVar11];
        (&stack0x00000700)[(uVar11 ^ 0xffffff00) & uVar11] = bVar2;
        bVar4 = (*pbVar12 | bVar2) + (*pbVar12 & bVar2);
        bVar2 = (&DAT_002782e8)[lVar8];
        (&DAT_002782e8)[lVar8] = (bVar2 ^ 0xff) & bVar4 | bVar2 & (bVar4 ^ 0xff);
        lVar8 = lVar8 + 1;
      } while (lVar8 != 0x18);
                    /* WARNING: Could not recover jumptable at 0x0023ccfc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_0027abb0)();
      return;
    }
  } while( true );
}


