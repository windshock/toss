// entry=0x6a8f8

void H6a8f8(void)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  
  do {
    if (DAT_0029e610 != 0) {
      ClearExclusiveLocal();
      bVar3 = false;
      goto LAB_0016a938;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x29e610,0x10);
    if (bVar3) {
      DAT_0029e610 = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  bVar3 = true;
LAB_0016a938:
  ppuVar1 = &PTR_LAB_00278bd8;
  if (!bVar3) {
    ppuVar1 = &PTR_H6a8f8_0027ecf8;
  }
                    /* WARNING: Could not recover jumptable at 0x0016a95c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


