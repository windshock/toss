// entry=0xfe184

void FUN_001fe184(void)

{
  char cVar1;
  bool bVar2;
  undefined8 uVar3;
  
  uVar3 = tpidr_el0;
  do {
    if (DAT_002862c0 != 0) {
      ClearExclusiveLocal();
      uVar3 = 0;
      goto LAB_00200f40;
    }
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0x2862c0,0x10);
    if (bVar2) {
      DAT_002862c0 = 1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  uVar3 = 1;
LAB_00200f40:
                    /* WARNING: Could not recover jumptable at 0x00200f4c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*DAT_0027e570)(uVar3);
  return;
}


