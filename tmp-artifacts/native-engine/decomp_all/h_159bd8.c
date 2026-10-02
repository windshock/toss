// entry=0x159bd8

void H159bd8(void)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  
  do {
    if (DAT_002862cc != 0) {
      ClearExclusiveLocal();
      bVar3 = false;
      goto LAB_0025b42c;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x2862cc,0x10);
    if (bVar3) {
      DAT_002862cc = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  bVar3 = true;
LAB_0025b42c:
  ppuVar1 = &PTR_LAB_002796c0;
  if (!bVar3) {
    ppuVar1 = &PTR_LAB_0027eef0;
  }
                    /* WARNING: Could not recover jumptable at 0x0025b450. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


