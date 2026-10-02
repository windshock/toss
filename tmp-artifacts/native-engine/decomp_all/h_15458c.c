// entry=0x15458c

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void H154178(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  char cVar5;
  bool bVar6;
  bool bVar7;
  int iVar8;
  undefined8 uVar9;
  long in_x10;
  long unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  code *pcVar10;
  long unaff_x22;
  undefined8 *unaff_x23;
  long unaff_x24;
  long lVar11;
  undefined8 unaff_x27;
  long unaff_x28;
  undefined1 auVar12 [16];
  
  *(long *)(in_x10 + 0x68) = unaff_x20;
  *(undefined8 *)(unaff_x20 + 0x68) = unaff_x27;
  if (unaff_x24 != 0) {
    if (*(char *)(unaff_x24 + 0x50) != '\0') {
      unaff_x21 = unaff_x23;
    }
                    /* WARNING: Could not recover jumptable at 0x002541bc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*unaff_x21)();
    return;
  }
  CallSupervisor(0);
  uVar4 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
  pcVar10 = *(code **)(unaff_x28 +
                       (long)(0x143a5e89 - (int)*(undefined8 *)(unaff_x22 + 0x260)) * 0x960 +
                      (long)(int)((uVar4 | 0x143a5f31) * 2 - (uVar4 ^ 0x143a5f31)) * 8);
  auVar12 = FUN_0026eefc(&DAT_00286150);
  (*pcVar10)(1,auVar12._8_8_,auVar12._0_8_);
  uVar4 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
  pcVar10 = *(code **)(unaff_x28 +
                       (long)(0x143a5e89 - (int)*(undefined8 *)(unaff_x22 + 0x260)) * 0x960 +
                      (long)(int)((uVar4 ^ 0x143a5ed3) + (uVar4 & 0x143a5ed3) * 2) * 8);
  uVar9 = *(undefined8 *)(unaff_x22 + 0x260);
  auVar12 = FUN_0026eefc(&DAT_00286150);
  (*pcVar10)(0x143a5e89 - (int)uVar9,auVar12._8_8_,auVar12._0_8_);
  for (lVar11 = *auVar12._0_8_; lVar11 != 0; lVar11 = *(long *)(lVar11 + 0x68)) {
    uVar4 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
    (**(code **)(unaff_x28 + (long)(0x143a5e89 - (int)*(undefined8 *)(unaff_x22 + 0x260)) * 0x960 +
                (long)(int)((uVar4 | 0x143a5f94) + (uVar4 & 0x143a5f94)) * 8))(3);
    uVar4 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
    uVar2 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
    uVar3 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
    iVar8 = (**(code **)(unaff_x28 +
                         (long)(int)((uVar4 ^ 0x143a5e89) + (uVar4 & 0x143a5e89) * 2) * 0x960 +
                        (long)(int)((uVar2 | 0x143a5f83) + (uVar2 & 0x143a5f83)) * 8))
                      (&DAT_0029e3d8,(uVar3 | 0x143a5e8a) + (uVar3 & 0x143a5e8a));
    if (iVar8 == 0) {
      ppuVar1 = (undefined **)&DAT_00281048;
      if (*(int *)(lVar11 + 0x28) != 2) {
        ppuVar1 = &PTR_LAB_00274408;
      }
                    /* WARNING: Could not recover jumptable at 0x00250e90. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar1)();
      return;
    }
    uVar4 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
    (**(code **)(unaff_x28 + (long)(int)((uVar4 | 0x143a5e89) * 2 - (uVar4 ^ 0x143a5e89)) * 0x960 +
                (long)(0x143a5f94 - (int)*(undefined8 *)(unaff_x22 + 0x260)) * 8))(2);
  }
  do {
    while (DAT_0029e82c != 0) {
      ClearExclusiveLocal();
    }
    cVar5 = '\x01';
    bVar6 = (bool)ExclusiveMonitorPass(0x29e82c,0x10);
    if (bVar6) {
      DAT_0029e82c = 1;
      cVar5 = ExclusiveMonitorsStatus();
    }
  } while (cVar5 != '\0');
  iVar8 = 0;
  if (*(byte *)(unaff_x19 + 0x308) != 0) {
    iVar8 = 0x143a5e8a - (int)*(undefined8 *)(unaff_x22 + 0x260);
  }
  if (((*(byte *)(unaff_x19 + 0x308) ^ DAT_0029e824 == 1) != 1) && (DAT_0029e824 == 1)) {
    _DAT_00281700 = 0;
  }
  DAT_0029e82c = 0;
  do {
    if (DAT_0029e818 != 0) {
      ClearExclusiveLocal();
      bVar6 = false;
      break;
    }
    bVar6 = true;
    cVar5 = '\x01';
    bVar7 = (bool)ExclusiveMonitorPass(0x29e818,0x10);
    if (bVar7) {
      DAT_0029e818 = 1;
      cVar5 = ExclusiveMonitorsStatus();
    }
  } while (cVar5 != '\0');
  ppuVar1 = &PTR_LAB_0027f0a0;
  if (!bVar6) {
    ppuVar1 = &PTR_LAB_00279038;
  }
  DAT_0029e824 = DAT_0029e824 - iVar8;
                    /* WARNING: Could not recover jumptable at 0x00254564. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(&DAT_0027e7c8,&DAT_0027e7b4,&DAT_0029e82c,&DAT_0029e000,&PTR_LAB_0027b380,
                      &PTR_LAB_0027f460);
  return;
}


