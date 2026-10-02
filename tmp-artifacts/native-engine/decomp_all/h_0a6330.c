// entry=0xa6330

void Ha6330(void)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  
  do {
    if (DAT_0029e82c != 0) {
      ClearExclusiveLocal();
      bVar3 = false;
      goto LAB_0019f9f0;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x29e82c,0x10);
    if (bVar3) {
      DAT_0029e82c = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  bVar3 = true;
LAB_0019f9f0:
  ppuVar1 = &PTR_LAB_0027b1c0;
  if (!bVar3) {
    ppuVar1 = &PTR_LAB_00275770;
  }
                    /* WARNING: Could not recover jumptable at 0x001a6b38. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


