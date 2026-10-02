// entry=0x13ecdc

void H13ecdc(void)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  
  DAT_0029e818 = 0;
  do {
    if (DAT_0029e5ec != 0) {
      ClearExclusiveLocal();
      bVar3 = false;
      goto LAB_002373b4;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x29e5ec,0x10);
    if (bVar3) {
      DAT_0029e5ec = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  bVar3 = true;
LAB_002373b4:
  ppuVar1 = &PTR_LAB_00285900;
  if (!bVar3) {
    ppuVar1 = &PTR_LAB_00275f30;
  }
                    /* WARNING: Could not recover jumptable at 0x002373d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


