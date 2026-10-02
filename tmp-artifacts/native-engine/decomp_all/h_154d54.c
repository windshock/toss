// entry=0x154d54

void FUN_00254d54(void)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  undefined8 uVar4;
  
  uVar4 = tpidr_el0;
  do {
    if (DAT_0029e4e0 != 0) {
      ClearExclusiveLocal();
      bVar3 = false;
      goto LAB_00257f08;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x29e4e0,0x10);
    if (bVar3) {
      DAT_0029e4e0 = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  bVar3 = true;
LAB_00257f08:
  ppuVar1 = &PTR_LAB_00285c90;
  if (!bVar3) {
    ppuVar1 = (undefined **)
              (&DAT_00278b08 + (long)(int)(-0x5f63dc0 - (-(int)DAT_00277160 ^ 0xffffffffU)) * 0x5d);
  }
                    /* WARNING: Could not recover jumptable at 0x00257f60. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


