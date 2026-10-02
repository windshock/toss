// entry=0x8215c

void H8215c(void)

{
  uint uVar1;
  undefined **ppuVar2;
  byte bVar3;
  char cVar4;
  bool bVar5;
  ulong in_x17;
  byte *unaff_x24;
  
  if ((in_x17 & 1) != 0) {
    bVar3 = *unaff_x24;
    *unaff_x24 = 1;
    uVar1 = 0;
    if ((bVar3 & 1) == 0) {
      uVar1 = 0x94f8c2f2 - (-(int)DAT_00274480 ^ 0xffffffffU);
    }
    ppuVar2 = &PTR_LAB_00275ee0 +
              (long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 0x59;
    if (DAT_0029e3ac != 0) {
      ppuVar2 = &PTR_LAB_00283388;
    }
    DAT_0029e3ac = (DAT_0029e3ac | uVar1) + (DAT_0029e3ac & uVar1);
                    /* WARNING: Could not recover jumptable at 0x0017bad8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)();
    return;
  }
  do {
    if (DAT_0029e780 != 0) {
      ClearExclusiveLocal();
      break;
    }
    cVar4 = '\x01';
    bVar5 = (bool)ExclusiveMonitorPass(0x29e780,0x10);
    if (bVar5) {
      DAT_0029e780 = 1;
      cVar4 = ExclusiveMonitorsStatus();
    }
  } while (cVar4 != '\0');
                    /* WARNING: Could not recover jumptable at 0x0018979c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_H8215c_0027d1a8)();
  return;
}


