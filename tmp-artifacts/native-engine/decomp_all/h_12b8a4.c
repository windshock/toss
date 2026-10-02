// entry=0x12b8a4

void H12b8a4(void)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  
  do {
    if (DAT_002862c0 != 0) {
      ClearExclusiveLocal();
      bVar3 = false;
      goto LAB_0022b8e4;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x2862c0,0x10);
    if (bVar3) {
      DAT_002862c0 = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  bVar3 = true;
LAB_0022b8e4:
  ppuVar1 = &PTR_LAB_00274c40;
  if (!bVar3) {
    ppuVar1 = &PTR_H12b8a4_002807d0;
  }
                    /* WARNING: Could not recover jumptable at 0x0022b908. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


