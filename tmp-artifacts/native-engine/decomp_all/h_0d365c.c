// entry=0xd365c

void Hd319c(void)

{
  char cVar1;
  bool bVar2;
  undefined8 uVar3;
  
  do {
    if (DAT_0029e54c != 0) {
      ClearExclusiveLocal();
      uVar3 = 0;
      goto LAB_001d0884;
    }
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0x29e54c,0x10);
    if (bVar2) {
      DAT_0029e54c = 1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  uVar3 = 1;
LAB_001d0884:
                    /* WARNING: Could not recover jumptable at 0x001d0890. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00278f10)(uVar3);
  return;
}


