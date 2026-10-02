// entry=0x95480

void H95480(void)

{
  char cVar1;
  bool bVar2;
  
  do {
    if (DAT_0029e38c != 0) {
      ClearExclusiveLocal();
      break;
    }
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0x29e38c,0x10);
    if (bVar2) {
      DAT_0029e38c = 1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
                    /* WARNING: Could not recover jumptable at 0x0019803c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00276c10)();
  return;
}


