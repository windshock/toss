// entry=0x10a2f8

void H108b2c(void)

{
  char cVar1;
  bool bVar2;
  
  do {
    if (DAT_00286238 != 0) {
      ClearExclusiveLocal();
      break;
    }
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0x286238,0x10);
    if (bVar2) {
      DAT_00286238 = 1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
                    /* WARNING: Could not recover jumptable at 0x0020bc80. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00279520)();
  return;
}


