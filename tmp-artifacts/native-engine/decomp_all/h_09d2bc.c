// entry=0x9d2bc

void H9d028(void)

{
  bool bVar1;
  uint uVar2;
  undefined **ppuVar3;
  byte bVar4;
  char cVar5;
  ulong uVar6;
  ulong in_x14;
  ulong in_x15;
  ulong in_x16;
  long in_x17;
  long unaff_x19;
  long unaff_x25;
  
  if ((in_x16 & 1) == 0) {
    do {
      *(undefined1 *)(unaff_x25 + in_x14) = *(undefined1 *)(*(long *)(unaff_x19 + 0x268) + in_x15);
      in_x14 = in_x14 + 1;
      uVar6 = 0x2e00d84656e407be - (-DAT_0027fb18 ^ 0xffffffffffffffffU);
      bVar1 = (long)((-DAT_0027fb18 | 0x2e00d84656e407c0U) + (-DAT_0027fb18 & 0x2e00d84656e407c0U))
              < (long)in_x15;
      in_x15 = (in_x15 | uVar6) * 2 - (in_x15 ^ uVar6);
    } while (bVar1 != 0x3ff < in_x14 && bVar1);
  }
  if (in_x14 < 0x400 == (*(char *)(in_x17 + 1) == (byte)(-0x41 - (-(char)DAT_0027fb18 ^ 0xffU))) ||
      in_x14 >= 0x400) {
    if (0x3fe < in_x14) {
      in_x14 = 0x3ff;
    }
    *(undefined1 *)(unaff_x25 + in_x14) = 0;
    CallSupervisor(0);
    ppuVar3 = &PTR_LAB_0027d2a0;
    if ((ulong)((long)((-DAT_0027fb18 | 0x2e00d84656e4075cU) + (-DAT_0027fb18 & 0x2e00d84656e4075cU)
                      << (DAT_0027fb18 * -2 - (-DAT_0027fb18 ^ 0x7e0U) & 0x3f)) >> 0x20) <
        0xfffffffffffff001) {
      ppuVar3 = (undefined **)&DAT_00282cb8;
    }
                    /* WARNING: Could not recover jumptable at 0x0019aaa4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar3)();
    return;
  }
LAB_0019c9d8:
  do {
    if (DAT_0029e5f4 == 0) {
      cVar5 = '\x01';
      bVar1 = (bool)ExclusiveMonitorPass(0x29e5f4,0x10);
      if (bVar1) {
        DAT_0029e5f4 = 1;
        cVar5 = ExclusiveMonitorsStatus();
      }
      if (cVar5 != '\0') goto LAB_0019c9d8;
      bVar1 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar1 = false;
    }
    if (bVar1) {
      bVar4 = *(byte *)(unaff_x19 + 0x316);
      *(undefined1 *)(unaff_x19 + 0x316) = 1;
      uVar2 = (-(int)DAT_0027fb18 ^ 0x56e407c0U) + (-(int)DAT_0027fb18 & 0x56e407c0U) * 2;
      if ((bVar4 & 1) == 0) {
        uVar2 = 1;
      }
      DAT_002862a4 = (DAT_002862a4 | uVar2) + (DAT_002862a4 & uVar2);
                    /* WARNING: Could not recover jumptable at 0x001a1728. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00277508)();
      return;
    }
  } while( true );
}


