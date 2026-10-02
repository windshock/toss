// entry=0x72aa0

void thunk_FUN_00173400(void)

{
  char cVar1;
  bool bVar2;
  
LAB_00173404:
  do {
    if (DAT_0029e7f8 == 0) {
      cVar1 = '\x01';
      bVar2 = (bool)ExclusiveMonitorPass(0x29e7f8,0x10);
      if (bVar2) {
        DAT_0029e7f8 = 1;
        cVar1 = ExclusiveMonitorsStatus();
      }
      if (cVar1 != '\0') goto LAB_00173404;
      bVar2 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar2 = false;
    }
    if (bVar2) {
                    /* WARNING: Could not recover jumptable at 0x0016fc38. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_0027e1d0)();
      return;
    }
  } while( true );
}


