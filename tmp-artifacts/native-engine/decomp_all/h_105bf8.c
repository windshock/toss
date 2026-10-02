// entry=0x105bf8

void H105bf8(void)

{
  char cVar1;
  bool bVar2;
  undefined8 uVar3;
  
  do {
    if (DAT_0029e7f8 != 0) {
      ClearExclusiveLocal();
      uVar3 = 0;
      goto LAB_00207504;
    }
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0x29e7f8,0x10);
    if (bVar2) {
      DAT_0029e7f8 = 1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  uVar3 = 1;
LAB_00207504:
                    /* WARNING: Could not recover jumptable at 0x00207510. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027da78)(uVar3);
  return;
}


