// entry=0x1430bc

void H142e3c(void)

{
  char cVar1;
  bool bVar2;
  undefined8 uVar3;
  
  do {
    if (DAT_002862c0 != 0) {
      ClearExclusiveLocal();
      uVar3 = 0;
      goto LAB_00242e7c;
    }
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0x2862c0,0x10);
    if (bVar2) {
      DAT_002862c0 = 1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  uVar3 = 1;
LAB_00242e7c:
                    /* WARNING: Could not recover jumptable at 0x00242e88. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027d420)(uVar3);
  return;
}


