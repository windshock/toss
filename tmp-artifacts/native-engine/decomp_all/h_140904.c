// entry=0x140904

void H13b95c(ulong param_1)

{
  undefined **ppuVar1;
  uint uVar2;
  char cVar3;
  bool bVar4;
  undefined8 uVar5;
  ulong in_stack_00000000;
  
  if ((param_1 & 1) != 0) {
    uVar2 = -(uint)((in_stack_00000000 & 0x10000) != 0);
    ppuVar1 = &PTR_LAB_00280620;
    if (((DAT_002862d8 == 1 ^ in_stack_00000000._2_1_ & 1 ^ 1) & DAT_002862d8 == 1) == 0) {
      ppuVar1 = &PTR_LAB_0027d278 +
                (int)((-(int)DAT_00279eb0 ^ 0x869205aU) + (-(int)DAT_00279eb0 & 0x869205aU) * 2);
    }
    DAT_002862d8 = (DAT_002862d8 ^ uVar2) + (DAT_002862d8 & uVar2) * 2;
                    /* WARNING: Could not recover jumptable at 0x00238698. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  do {
    if (DAT_0029e818 != 0) {
      ClearExclusiveLocal();
      uVar5 = 0;
      goto LAB_00240368;
    }
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(0x29e818,0x10);
    if (bVar4) {
      DAT_0029e818 = 1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  uVar5 = 1;
LAB_00240368:
                    /* WARNING: Could not recover jumptable at 0x00240374. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_H138c8c_0027e218)(uVar5);
  return;
}


