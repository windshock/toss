// entry=0x155eb8

void H155d7c(undefined8 param_1)

{
  int iVar1;
  undefined **ppuVar2;
  uint uVar3;
  char cVar4;
  bool bVar5;
  undefined8 in_x11;
  byte *unaff_x27;
  
LAB_0025890c:
  do {
    if (DAT_00286240 == 0) {
      cVar4 = '\x01';
      bVar5 = (bool)ExclusiveMonitorPass(0x286240,0x10);
      if (bVar5) {
        DAT_00286240 = 1;
        cVar4 = ExclusiveMonitorsStatus();
      }
      if (cVar4 != '\0') goto LAB_0025890c;
      bVar5 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar5 = false;
    }
    if (bVar5) {
      uVar3 = -(int)DAT_00277160;
      iVar1 = 1;
      if ((*unaff_x27 & 1) == 0) {
        iVar1 = (uVar3 | 0xfa09c241) + (uVar3 & 0xfa09c241);
      }
      uVar3 = -(int)DAT_00277160;
      ppuVar2 = &PTR_LAB_00274440;
      if (((DAT_0029e860 == 1 ^ *unaff_x27 & 1 ^ 1) & DAT_0029e860 == 1) == 0) {
        ppuVar2 = &PTR_LAB_00276268 + (int)((uVar3 ^ 0xfa09c249) + (uVar3 & 0xfa09c249) * 2);
      }
      DAT_00286258 = in_x11;
      DAT_0029e788 = param_1;
      DAT_0029e7a8 = in_x11;
      DAT_0029e860 = (DAT_0029e860 ^ -iVar1) + (DAT_0029e860 & -iVar1) * 2;
                    /* WARNING: Could not recover jumptable at 0x002553dc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar2)();
      return;
    }
  } while( true );
}


