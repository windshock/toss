// entry=0xd4310

void Hd4310(void)

{
  char cVar1;
  bool bVar2;
  int iVar3;
  undefined4 *unaff_x20;
  undefined4 unaff_w21;
  byte *unaff_x25;
  
  *unaff_x20 = unaff_w21;
LAB_001d2ac0:
  do {
    if (DAT_0029e328 == 0) {
      cVar1 = '\x01';
      bVar2 = (bool)ExclusiveMonitorPass(0x29e328,0x10);
      if (bVar2) {
        DAT_0029e328 = 1;
        cVar1 = ExclusiveMonitorsStatus();
      }
      if (cVar1 != '\0') goto LAB_001d2ac0;
      bVar2 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar2 = false;
    }
    if (bVar2) {
      iVar3 = 1;
      if ((*unaff_x25 & 1) == 0) {
        iVar3 = (-(int)DAT_00283df0 | 0x15b28a1aU) * 2 - (-(int)DAT_00283df0 ^ 0x15b28a1aU);
      }
      iVar3 = (DAT_0029e814 - (-iVar3 ^ 0xffffffffU)) + -1;
      if (((DAT_0029e814 == 1 ^ *unaff_x25 & 1 ^ 1) & DAT_0029e814 == 1) != 0) {
        DAT_0029e814 = iVar3;
        memset(&DAT_00280ff8,0,0xb);
                    /* WARNING: Could not recover jumptable at 0x001cfcd8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_00283b48)();
        return;
      }
      DAT_0029e814 = iVar3;
                    /* WARNING: Could not recover jumptable at 0x001d02d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_FUN_00275ba8)();
      return;
    }
  } while( true );
}


