// entry=0x10bf58

void H1087cc(void)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  ulong in_x9;
  long in_x10;
  long in_x11;
  ulong uVar4;
  long unaff_x24;
  long unaff_x27;
  
  if (in_x10 != (-DAT_00280ba0 | 0x915e2a0196034a46U) + (-DAT_00280ba0 & 0x915e2a0196034a46U)) {
    uVar4 = in_x11 << ((-DAT_00280ba0 | 0x494bU) + (-DAT_00280ba0 & 0x494bU) & 0x3f);
    uVar4 = (uVar4 ^ 0xffffffff0000001f) & uVar4;
    if ((in_x9 & 1) != 0) {
                    /* WARNING: Could not recover jumptable at 0x0020afbc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_H1087cc_0027e518)();
      return;
    }
    if (((uVar4 ^ 0xffffffffffffffff) & (ulong)*(byte *)(unaff_x27 + in_x10) |
        uVar4 & ((ulong)*(byte *)(unaff_x27 + in_x10) ^ 0xffffffffffffffff)) ==
        *(ulong *)(unaff_x24 +
                  ((-DAT_00280ba0 | 0x915e2a0196034946U) + (-DAT_00280ba0 & 0x915e2a0196034946U)) *
                  0x10)) {
                    /* WARNING: Could not recover jumptable at 0x0020e528. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_0027b200)();
      return;
    }
                    /* WARNING: Could not recover jumptable at 0x0020c7b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027b2a8)();
    return;
  }
  do {
    if (DAT_0029e818 != 0) {
      ClearExclusiveLocal();
      bVar3 = false;
      goto LAB_0020b8a8;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x29e818,0x10);
    if (bVar3) {
      DAT_0029e818 = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  bVar3 = true;
LAB_0020b8a8:
  ppuVar1 = &PTR_LAB_00278f00;
  if (!bVar3) {
    ppuVar1 = &PTR_LAB_002793d0 + (int)(-0x69fcb69d - (-(int)DAT_00280ba0 ^ 0xffffffffU));
  }
                    /* WARNING: Could not recover jumptable at 0x0020e3e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


