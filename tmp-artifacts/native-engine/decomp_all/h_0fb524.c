// entry=0xfb524

void Hfb524(void)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  
  do {
    if (DAT_002862c0 != 0) {
      ClearExclusiveLocal();
      bVar3 = false;
      goto LAB_001fb564;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x2862c0,0x10);
    if (bVar3) {
      DAT_002862c0 = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  bVar3 = true;
LAB_001fb564:
  ppuVar1 = &PTR_LAB_0027c0e0 +
            (long)(int)((-(int)DAT_00281318 | 0x908a7260U) + (-(int)DAT_00281318 & 0x908a7260U)) *
            99;
  if (!bVar3) {
    ppuVar1 = (undefined **)&DAT_0027f6b0;
  }
                    /* WARNING: Could not recover jumptable at 0x001fb5b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


