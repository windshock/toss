// entry=0xe7534

void He7534(void)

{
  char cVar1;
  bool bVar2;
  undefined8 uVar3;
  int iVar4;
  
  iVar4 = (int)DAT_002765f0;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar4 | 0x7b9ee79eU) * 2 - (-iVar4 ^ 0x7b9ee79eU)) * 300 +
             (long)(int)((-iVar4 | 0x7b9ee7b2U) + (-iVar4 & 0x7b9ee7b2U))])
            ((-iVar4 | 0x7b9ee79eU) * 2 - (-iVar4 ^ 0x7b9ee79eU));
  do {
    if (DAT_0029e60c != 0) {
      ClearExclusiveLocal();
      uVar3 = 0;
      goto LAB_001e7c80;
    }
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0x29e60c,0x10);
    if (bVar2) {
      DAT_0029e60c = 1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  uVar3 = 1;
LAB_001e7c80:
                    /* WARNING: Could not recover jumptable at 0x001efc24. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027e720)(uVar3);
  return;
}


