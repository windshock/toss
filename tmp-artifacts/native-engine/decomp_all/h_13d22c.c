// entry=0x13d22c

void H13d22c(void)

{
  char cVar1;
  bool bVar2;
  
LAB_002372e0:
  do {
    if (DAT_0029e5ec == 0) {
      cVar1 = '\x01';
      bVar2 = (bool)ExclusiveMonitorPass(0x29e5ec,0x10);
      if (bVar2) {
        DAT_0029e5ec = 1;
        cVar1 = ExclusiveMonitorsStatus();
      }
      if (cVar1 != '\0') goto LAB_002372e0;
      bVar2 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar2 = false;
    }
    if (bVar2) {
                    /* WARNING: Could not recover jumptable at 0x0023a7a0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00276768)();
      return;
    }
  } while( true );
}


