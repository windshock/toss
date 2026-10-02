// entry=0xdf480

void Hde6a8(void)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  
  do {
    if (DAT_00286268 != 0) {
      ClearExclusiveLocal();
      bVar3 = false;
      goto LAB_001df28c;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x286268,0x10);
    if (bVar3) {
      DAT_00286268 = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  bVar3 = true;
LAB_001df28c:
  ppuVar1 = &PTR_LAB_00282740;
  if (!bVar3) {
    ppuVar1 = &PTR_Hde6a8_0027d950;
  }
                    /* WARNING: Could not recover jumptable at 0x001e1180. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


