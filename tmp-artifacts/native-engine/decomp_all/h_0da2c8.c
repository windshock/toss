// entry=0xda2c8

void FUN_001da2c8(int param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  long lVar4;
  long lVar5;
  int iVar6;
  int iVar7;
  ulong uVar8;
  ulong uVar9;
  byte *pbVar10;
  ulong uVar11;
  
  lVar4 = tpidr_el0;
  iVar7 = (int)DAT_0027b370;
  if (param_1 == 0) {
    if ((&PTR_FUN_0027c1e0)
        [(long)(int)((-iVar7 | 0x816b4073U) + (-iVar7 & 0x816b4073U)) * 300 +
         (long)(int)((-iVar7 | 0x816b408dU) * 2 - (-iVar7 ^ 0x816b408dU))] != (undefined *)0x0) {
      (*(code *)(&PTR_FUN_0027c1e0)
                [(long)(int)((-iVar7 | 0x816b4073U) + (-iVar7 & 0x816b4073U)) * 300 +
                 (long)(int)((-iVar7 ^ 0x816b408dU) + (-iVar7 & 0x816b408dU) * 2)])
                (param_3,(&PTR_FUN_0027c1e0)
                         [(long)(int)((-iVar7 ^ 0x816b4073U) + (-iVar7 & 0x816b4073U) * 2) * 300 +
                          (long)(int)((-iVar7 ^ 0x816b40c9U) + (-iVar7 & 0x816b40c9U) * 2)],param_4)
      ;
                    /* WARNING: Could not recover jumptable at 0x001dc19c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*DAT_00281030)();
      return;
    }
    lVar5 = tpidr_el0;
    if (*(long *)(lVar5 + 0x28) != *(long *)(lVar4 + 0x28)) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
    return;
  }
  if (param_1 == 1) {
                    /* WARNING: Could not recover jumptable at 0x001dbdb0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00282560)();
    return;
  }
LAB_001da4d4:
  do {
    if (DAT_0028631c == 0) {
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(0x28631c,0x10);
      if (bVar3) {
        DAT_0028631c = 1;
        cVar2 = ExclusiveMonitorsStatus();
      }
      if (cVar2 != '\0') goto LAB_001da4d4;
      bVar3 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar3 = false;
    }
    if (bVar3) {
      uVar11 = (DAT_002747b0 ^
               (-DAT_0027b370 | 0x18fe90e5816b4072U) * 2 - (-DAT_0027b370 ^ 0x18fe90e5816b4072U) ^
               0xffffffffffffffff) & DAT_002747b0;
      uVar8 = (long)DAT_002747b0 >> ((-DAT_0027b370 | 0x4093U) + (-DAT_0027b370 & 0x4093U) & 0x3f);
      uVar9 = ((uVar8 ^ 0xffffffffffffffe0) & uVar8) + 0x3b20;
      uVar9 = (uVar9 ^ 0xffffffffffffffe0) & uVar9;
      iVar6 = -0x62370b28 - (-iVar7 ^ 0xffffffffU);
      uVar8 = (-DAT_0027b370 | 0x18fe90e4816b4073U) * 2 - (-DAT_0027b370 ^ 0x18fe90e4816b4073U);
      if ((long)((uVar11 ^ 1L << (uVar9 & 0x3f) ^ 0xffffffffffffffffU) & uVar11) >> (uVar9 & 0x3f)
          == 1) {
        DAT_0028631c = 0;
                    /* WARNING: Could not recover jumptable at 0x001dab70. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_00276338)();
        return;
      }
      pbVar10 = &DAT_00282fa0;
      do {
        iVar6 = (iVar6 * (-0x7e93bf4f - (-iVar7 ^ 0xffffffffU)) - (*pbVar10 ^ 0xffffffff)) + -1;
        uVar9 = (-DAT_0027b370 | 0x18fe90e4816b4074U) + (-DAT_0027b370 & 0x18fe90e4816b4074U);
        uVar8 = (uVar8 | uVar9) + (uVar8 & uVar9);
        pbVar10 = pbVar10 + (-DAT_0027b370 | 0x18fe90e4816b4074U) +
                            (-DAT_0027b370 & 0x18fe90e4816b4074U);
      } while (uVar8 != (-DAT_0027b370 ^ 0x18fe90e4816b4087U) +
                        (-DAT_0027b370 & 0x18fe90e4816b4087U) * 2);
      ppuVar1 = &PTR_LAB_0027ddb0;
      if (iVar6 != 0x63cdcc69) {
        ppuVar1 = &PTR_LAB_00285b40;
      }
                    /* WARNING: Could not recover jumptable at 0x001dc2f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar1)();
      return;
    }
  } while( true );
}


