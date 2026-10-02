// entry=0x60aa4

void H5f40c(void)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  
LAB_0015f410:
  do {
    if (DAT_0029e3a0 == 0) {
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(0x29e3a0,0x10);
      if (bVar3) {
        DAT_0029e3a0 = 1;
        cVar2 = ExclusiveMonitorsStatus();
      }
      if (cVar2 != '\0') goto LAB_0015f410;
      bVar3 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar3 = false;
    }
    if (bVar3) {
      ppuVar1 = &PTR_LAB_0027c108;
      if (-(DAT_00279ff8 & 1) == -(-((int)DAT_00274ad0 + 1U & 1) & 1)) {
        ppuVar1 = &PTR_LAB_00277398;
      }
                    /* WARNING: Could not recover jumptable at 0x001615c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar1)(&DAT_00283678);
      return;
    }
  } while( true );
}


