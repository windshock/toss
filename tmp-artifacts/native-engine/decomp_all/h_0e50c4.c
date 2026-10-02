// entry=0xe50c4

void He50c4(void)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  
  do {
    if (DAT_0029e3cc != 0) {
      ClearExclusiveLocal();
      bVar3 = false;
      goto LAB_001e5104;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x29e3cc,0x10);
    if (bVar3) {
      DAT_0029e3cc = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  bVar3 = true;
LAB_001e5104:
  ppuVar1 = &PTR_LAB_00275ee8;
  if (!bVar3) {
    ppuVar1 = &PTR_He50c4_00280410;
  }
                    /* WARNING: Could not recover jumptable at 0x001e5128. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


