// entry=0xc28b4

void Hc28b4(void)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  
  do {
    if (DAT_002862c0 != 0) {
      ClearExclusiveLocal();
      bVar3 = false;
      goto LAB_001c28f4;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x2862c0,0x10);
    if (bVar3) {
      DAT_002862c0 = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  bVar3 = true;
LAB_001c28f4:
  ppuVar1 = &PTR_LAB_00285a38;
  if (!bVar3) {
    ppuVar1 = &PTR_Hc28b4_00280388;
  }
                    /* WARNING: Could not recover jumptable at 0x001c2918. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


