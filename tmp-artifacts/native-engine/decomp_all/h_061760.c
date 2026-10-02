// entry=0x61760

void H60b84(void)

{
  char cVar1;
  bool bVar2;
  undefined8 uVar3;
  
  do {
    if (DAT_002862c0 != 0) {
      ClearExclusiveLocal();
      uVar3 = 0;
      goto LAB_0015f0bc;
    }
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0x2862c0,0x10);
    if (bVar2) {
      DAT_002862c0 = 1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  uVar3 = 1;
LAB_0015f0bc:
                    /* WARNING: Could not recover jumptable at 0x0015f0c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00277930)(uVar3);
  return;
}


