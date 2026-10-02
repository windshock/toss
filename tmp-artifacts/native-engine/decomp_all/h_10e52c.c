// entry=0x10e52c

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void H10e52c(ulong param_1)

{
  undefined8 *puVar1;
  ulong uVar2;
  undefined **ppuVar3;
  char cVar4;
  bool bVar5;
  long in_x9;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  int in_w12;
  ulong uVar9;
  long unaff_x29;
  undefined1 auVar10 [16];
  
  if (param_1 < 0x80) {
    uVar6 = (ulong)in_w12;
    uVar8 = uVar6;
    if (-1 < (long)uVar6) {
      uVar8 = (-DAT_00280ba0 | 0x915e2a0196034946U) * 2 - (-DAT_00280ba0 ^ 0x915e2a0196034946U);
    }
    uVar8 = (uVar6 ^ -uVar8) + (uVar6 & -uVar8) * 2;
    uVar7 = (-DAT_00280ba0 ^ 0x915e2a01960349c5U) + (-DAT_00280ba0 & 0x915e2a01960349c5U) * 2;
    uVar7 = (uVar7 ^ -param_1) + (uVar7 & -param_1) * 2;
    if (uVar7 <= uVar8) {
      uVar8 = uVar7;
    }
    uVar7 = 0x915e2a0196034946 - (-DAT_00280ba0 ^ 0xffffffffffffffffU);
    uVar8 = (uVar8 | uVar7) * 2 - (uVar8 ^ uVar7);
    if (0xf < uVar8) {
      uVar9 = (uVar8 ^ (-DAT_00280ba0 ^ 0x915e2a0196034936U) +
                       (-DAT_00280ba0 & 0x915e2a0196034936U) * 2 ^ 0xffffffffffffffff) & uVar8;
      uVar7 = (long)&DAT_915e2a0196034945 - (-DAT_00280ba0 ^ 0xffffffffffffffffU);
      do {
        auVar10 = a64_TBL(ZEXT816(0),
                          *(undefined1 (*) [16])
                           (*(long *)(unaff_x29 + -0x90) + ((uVar6 | -uVar7) * 2 - (uVar6 ^ -uVar7))
                           + (-DAT_00280ba0 ^ 0x915e2a0196034937U) +
                             (-DAT_00280ba0 & 0x115e2a0196034937U) * 2),_DAT_0012c6c0);
        puVar1 = (undefined8 *)
                 (*(long *)(unaff_x29 + -0x88) + ((uVar7 | param_1) * 2 - (uVar7 ^ param_1)));
        puVar1[1] = auVar10._8_8_;
        *puVar1 = auVar10._0_8_;
        uVar2 = (-DAT_00280ba0 | 0x915e2a0196034956U) + (-DAT_00280ba0 & 0x915e2a0196034956U);
        uVar7 = (uVar7 ^ uVar2) + (uVar7 & uVar2) * 2;
      } while (uVar7 != uVar9);
      uVar6 = (uVar6 | -uVar9) + (uVar6 & -uVar9);
      param_1 = (uVar9 | param_1) * 2 - (uVar9 ^ param_1);
      if (uVar8 == uVar9) goto LAB_0020751c;
    }
    *(undefined1 *)(*(long *)(unaff_x29 + -0x88) + param_1) =
         *(undefined1 *)(*(long *)(unaff_x29 + -0x90) + uVar6);
    ppuVar3 = &PTR_LAB_00279a20;
    if (0 < (long)uVar6 ==
        (-DAT_00280ba0 | 0x915e2a01960349c6U) * 2 - (-DAT_00280ba0 ^ 0x915e2a01960349c6U) <=
        (param_1 | 1) + (param_1 & 1) || (long)uVar6 < 1) {
      ppuVar3 = &PTR_LAB_002741c8;
    }
                    /* WARNING: Could not recover jumptable at 0x002064f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar3)();
    return;
  }
LAB_0020751c:
  bVar5 = param_1 < (-DAT_00280ba0 | 0x915e2a01960349c6U) + (-DAT_00280ba0 & 0x915e2a01960349c6U);
  if (bVar5 == (*(char *)(in_x9 + 1) ==
               (byte)((-(char)DAT_00280ba0 & 0x7fU | 0x46) * '\x02' - (-(char)DAT_00280ba0 ^ 0x46U))
               ) || !bVar5) {
    if ((-DAT_00280ba0 | 0x915e2a01960349c5U) * 2 - (-DAT_00280ba0 ^ 0x915e2a01960349c5U) <= param_1
       ) {
      param_1 = 0x7f;
    }
                    /* WARNING: Could not recover jumptable at 0x0020c118. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00278ac8)(param_1);
    return;
  }
LAB_0020e1d4:
  do {
    if (DAT_0029e5ec == 0) {
      cVar4 = '\x01';
      bVar5 = (bool)ExclusiveMonitorPass(0x29e5ec,0x10);
      if (bVar5) {
        DAT_0029e5ec = 1;
        cVar4 = ExclusiveMonitorsStatus();
      }
      if (cVar4 != '\0') goto LAB_0020e1d4;
      bVar5 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar5 = false;
    }
    if (bVar5) {
                    /* WARNING: Could not recover jumptable at 0x00206324. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00275860)();
      return;
    }
  } while( true );
}


