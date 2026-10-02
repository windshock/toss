// entry=0x137690

void H137690(void)

{
  char cVar1;
  bool bVar2;
  
LAB_0023f100:
  do {
    if (DAT_0029e818 == 0) {
      cVar1 = '\x01';
      bVar2 = (bool)ExclusiveMonitorPass(0x29e818,0x10);
      if (bVar2) {
        DAT_0029e818 = 1;
        cVar1 = ExclusiveMonitorsStatus();
      }
      if (cVar1 != '\0') goto LAB_0023f100;
      bVar2 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar2 = false;
    }
    if (bVar2) {
                    /* WARNING: Could not recover jumptable at 0x0023e428. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00279848)();
      return;
    }
  } while( true );
}


