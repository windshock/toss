// entry=0xb0e48

void FUN_001b0e48(void)

{
  char cVar1;
  bool bVar2;
  undefined8 uVar3;
  
  uVar3 = tpidr_el0;
LAB_001b12ec:
  do {
    if (DAT_0029e4e0 == 0) {
      cVar1 = '\x01';
      bVar2 = (bool)ExclusiveMonitorPass(0x29e4e0,0x10);
      if (bVar2) {
        DAT_0029e4e0 = 1;
        cVar1 = ExclusiveMonitorsStatus();
      }
      if (cVar1 != '\0') goto LAB_001b12ec;
      bVar2 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar2 = false;
    }
    if (bVar2) {
                    /* WARNING: Could not recover jumptable at 0x001b1210. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)(&PTR_LAB_00276dd8)
                [(int)((-(int)DAT_00282920 | 0x70e257adU) + (-(int)DAT_00282920 & 0x70e257adU))])
                (DAT_00283630);
      return;
    }
  } while( true );
}


