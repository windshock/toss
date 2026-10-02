// entry=0x13b210

void H13b210(void)

{
  char cVar1;
  bool bVar2;
  undefined8 uVar3;
  
  do {
    if (DAT_0029e818 != 0) {
      ClearExclusiveLocal();
      uVar3 = 0;
      goto LAB_00240a8c;
    }
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0x29e818,0x10);
    if (bVar2) {
      DAT_0029e818 = 1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  uVar3 = 1;
LAB_00240a8c:
                    /* WARNING: Could not recover jumptable at 0x00240ac8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00283300)
            [(int)((-(int)DAT_00279eb0 ^ 0x8692086U) + (-(int)DAT_00279eb0 & 0x8692086U) * 2)])
            (uVar3);
  return;
}


