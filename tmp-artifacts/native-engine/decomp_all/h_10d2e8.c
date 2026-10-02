// entry=0x10d2e8

void H10a5e8(ulong param_1)

{
  undefined **ppuVar1;
  char cVar2;
  uint uVar3;
  uint uVar4;
  bool bVar5;
  char *pcVar6;
  undefined8 uVar7;
  long in_x9;
  ulong in_x10;
  long in_x11;
  long in_x12;
  long unaff_x24;
  char *unaff_x25;
  
  cVar2 = *(char *)(in_x12 + 1);
  pcVar6 = (char *)(in_x11 + (-0x6ea1d5fe69fcb6ba - (-DAT_00280ba0 ^ 0xffffffffffffffffU)));
  while( true ) {
    if (cVar2 != '\0') {
      ppuVar1 = &PTR_H10a5e8_0027e100;
      if (cVar2 != *pcVar6) {
        ppuVar1 = &PTR_LAB_00275cf0;
      }
                    /* WARNING: Could not recover jumptable at 0x0020c520. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar1)();
      return;
    }
    in_x10 = (in_x10 << 1 | 2) - (in_x10 ^ 1);
    if (*pcVar6 == '\0') break;
    if (in_x10 == param_1) {
      if (*(ulong *)(unaff_x24 + 0x10) <= param_1) {
                    /* WARNING: Could not recover jumptable at 0x00208ca8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_00278588)((double)*(ulong *)(unaff_x24 + 0x10) * 1.5);
        return;
      }
      uVar3 = -(int)DAT_00280ba0;
      uVar4 = -(int)DAT_00280ba0;
      ppuVar1 = &PTR_LAB_00276af0 + (long)(int)((uVar3 | 0x96034946) + (uVar3 & 0x96034946)) * 99;
      if (*unaff_x25 != (byte)((-(char)DAT_00280ba0 | 0x46U) + (-(char)DAT_00280ba0 & 0x46U))) {
        ppuVar1 = &PTR_LAB_00281ad0 +
                  (long)(int)((uVar4 ^ 0x96034946) + (uVar4 & 0x96034946) * 2) * 0x6c;
      }
                    /* WARNING: Could not recover jumptable at 0x0020e50c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar1)(1);
      return;
    }
    cVar2 = **(char **)(in_x9 + in_x10 * 8);
    pcVar6 = unaff_x25;
  }
  do {
    if (DAT_0029e818 != 0) {
      ClearExclusiveLocal();
      uVar7 = 0;
      goto LAB_002073f0;
    }
    cVar2 = '\x01';
    bVar5 = (bool)ExclusiveMonitorPass(0x29e818,0x10);
    if (bVar5) {
      DAT_0029e818 = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  uVar7 = 1;
LAB_002073f0:
                    /* WARNING: Could not recover jumptable at 0x002073fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002772e0)(uVar7);
  return;
}


