// entry=0x38398

void H38398(void)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  undefined8 uVar4;
  byte *unaff_x20;
  
  if (*unaff_x20 != 0) {
    ppuVar1 = &PTR_LAB_00279278;
    if ((&stack0x0000005d)
        [((-DAT_0027ba40 ^ 0x517618022a074dbdU) + (-DAT_0027ba40 & 0x517618022a074dbdU) * 2) * 0x5c]
        != '\0') {
      ppuVar1 = &PTR_LAB_0027d210;
    }
                    /* WARNING: Could not recover jumptable at 0x0013ad38. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(((uint)*unaff_x20 -
                        ((0x2a074dbc - (-(int)DAT_0027ba40 ^ 0xffffffffU)) * 10 ^ 0xffffffff)) +
                        -0x31);
    return;
  }
  do {
    if (DAT_00286318 != 0) {
      ClearExclusiveLocal();
      uVar4 = 0;
      goto LAB_00138754;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x286318,0x10);
    if (bVar3) {
      DAT_00286318 = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  uVar4 = 1;
LAB_00138754:
                    /* WARNING: Could not recover jumptable at 0x0013c980. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00281ab8)[(int)(0x2a074dff - (-(int)DAT_0027ba40 ^ 0xffffffffU))])(uVar4);
  return;
}


