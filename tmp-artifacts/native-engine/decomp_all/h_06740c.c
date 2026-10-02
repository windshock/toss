// entry=0x6740c

void H6740c(ulong param_1)

{
  long in_x9;
  int iVar1;
  ulong uVar2;
  undefined1 auVar3 [16];
  
  if (in_x9 < 0) {
    uVar2 = -((long)((-in_x9 | 999999999U) + (-in_x9 & 999999999U)) / 1000000000);
                    /* WARNING: Could not recover jumptable at 0x001669c0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002744e0)((param_1 | uVar2) * 2 - (param_1 ^ uVar2));
    return;
  }
  iVar1 = (int)DAT_00274f18;
  if (5 < (long)param_1) {
    auVar3 = (*(code *)(&DAT_0029e620)
                       [(long)(int)((-iVar1 | 0x9c1eff81U) * 2 - (-iVar1 ^ 0x9c1eff81U)) * 0x2b +
                        (long)(int)(-0x63e10079 - (-iVar1 ^ 0xffffffffU))])();
                    /* WARNING: Could not recover jumptable at 0x00167854. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&PTR_LAB_0027beb8)[(int)(-0x63e10059 - (-(int)DAT_00274f18 ^ 0xffffffffU))])
              (auVar3._0_8_,auVar3._8_8_,auVar3._0_8_);
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x001664e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00285c78)[(long)(int)(-0x63e10080 - (-iVar1 ^ 0xffffffffU)) * 0x79])();
  return;
}


