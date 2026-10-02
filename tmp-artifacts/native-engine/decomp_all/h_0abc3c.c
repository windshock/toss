// entry=0xabc3c

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void Ha9df0(ulong param_1)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  undefined **ppuVar4;
  uint uVar5;
  int iVar6;
  long unaff_x19;
  void *unaff_x25;
  
  *(undefined1 *)(unaff_x19 + 0x315) = 1;
  iVar6 = (int)DAT_0027fb18;
  uVar5 = 0;
  if ((param_1 & 1) == 0) {
    uVar5 = (-iVar6 ^ 0x56e407c1U) + (-iVar6 & 0x56e407c1U) * 2;
  }
  iVar1 = (DAT_002862d8 ^ uVar5) + (DAT_002862d8 & uVar5) * 2;
  if (DAT_002862d8 != 0) {
    DAT_0029e818 = 0;
    DAT_002862d8 = iVar1;
    memset(unaff_x25,0,0x400);
    CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x001ae2f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&PTR_LAB_00279bb8)
              [(int)((-(int)DAT_0027fb18 ^ 0x56e407e3U) + (-(int)DAT_0027fb18 & 0x56e407e3U) * 2)])
              ();
    return;
  }
  _DAT_0027e7b4 = 0xbad1fe5a;
  DAT_0027e7b8 = 0xd905;
  DAT_0027e7ba = 0x57;
  uVar3 = (-DAT_0027fb18 | 0x2e00d84656e407c0U) + (-DAT_0027fb18 & 0x2e00d84656e407c0U);
  uVar5 = (-0x68d31ae5 - (-iVar6 ^ 0xffffffffU)) *
          ((-iVar6 | 0x56e407e1U) * 2 - (-iVar6 ^ 0x56e407e1U));
  uVar2 = (-DAT_0027fb18 ^ 0x2e00d84656e407c1U) + (-DAT_0027fb18 & 0x2e00d84656e407c1U) * 2;
  ppuVar4 = (undefined **)&DAT_00276020;
  if ((uVar3 | uVar2) * 2 - (uVar3 ^ uVar2) !=
      (-DAT_0027fb18 | 0x2e00d84656e407c7U) + (-DAT_0027fb18 & 0x2e00d84656e407c7U)) {
    ppuVar4 = &PTR_LAB_00274108 + (int)((-iVar6 | 0x56e40811U) + (-iVar6 & 0x56e40811U));
  }
  DAT_002862d8 = iVar1;
                    /* WARNING: Could not recover jumptable at 0x00196c98. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar4)((uVar5 | 0x5a) & (uVar5 & 0x5a ^ 0xffffffff));
  return;
}


