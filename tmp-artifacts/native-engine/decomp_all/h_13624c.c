// entry=0x13624c

void H135ef0(void)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  byte bVar4;
  long in_x11;
  char in_w12;
  
  if ((((in_w12 == 'o') && (*(char *)(in_x11 + 0x13) == (byte)('V' - (-(char)DAT_00274ea8 ^ 0xffU)))
       ) && (bVar4 = -(char)DAT_00274ea8,
            *(char *)(in_x11 + 0x14) == (byte)((bVar4 | 0x5f) + (bVar4 & 0x5f)))) &&
     (*(char *)(in_x11 + 0x15) == ' ')) {
    ppuVar1 = &PTR_LAB_00280398;
    if (*(char *)(in_x11 + 0x16) != '4') {
      ppuVar1 = (undefined **)&DAT_002785c0;
    }
                    /* WARNING: Could not recover jumptable at 0x00236be8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  do {
    if (DAT_0029e77c != 0) {
      ClearExclusiveLocal();
      bVar3 = false;
      goto LAB_002362a0;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x29e77c,0x10);
    if (bVar3) {
      DAT_0029e77c = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  bVar3 = true;
LAB_002362a0:
  ppuVar1 = &PTR_LAB_00275e58;
  if (!bVar3) {
    ppuVar1 = &PTR_LAB_0027eba8;
  }
                    /* WARNING: Could not recover jumptable at 0x002362c4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


