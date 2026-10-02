// entry=0xfaaf0

void Hfaaf0(ulong param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  int iVar4;
  ulong uVar5;
  undefined4 in_w7;
  ulong uVar6;
  long unaff_x29;
  undefined4 uStack000000000000002c;
  
  iVar4 = (int)DAT_00281318;
  if ((param_1 & 1) == 0) {
    uStack000000000000002c = in_w7;
    (*(code *)(&DAT_0029e620)
              [(long)(int)((-iVar4 ^ 0x908a7260U) + (-iVar4 & 0x908a7260U) * 2) * 0x2b +
               (long)(int)((-iVar4 | 0x908a7287U) * 2 - (-iVar4 ^ 0x908a7287U))])();
    uVar1 = -(int)DAT_00281318;
    uVar2 = -(int)DAT_00281318;
    iVar4 = (*(code *)(&DAT_0029e620)
                      [(long)(int)((uVar2 | 0x908a7260) * 2 - (uVar2 ^ 0x908a7260)) * 0x2b +
                       (long)(int)((uVar1 | 0x908a7276) * 2 - (uVar1 ^ 0x908a7276))])();
    uVar1 = -(int)DAT_00281318;
    uVar2 = -(int)DAT_00281318;
    (*(code *)(&DAT_0029e620)
              [(long)(int)((uVar2 | 0x908a7260) * 2 - (uVar2 ^ 0x908a7260)) * 0x2b +
               (long)(int)((uVar1 | 0x908a7262) * 2 - (uVar1 ^ 0x908a7262))])();
    uVar1 = -(int)DAT_00281318;
    uVar2 = -(int)DAT_00281318;
    (*(code *)(&DAT_0029e620)
              [(long)(int)((uVar2 | 0x908a7260) + (uVar2 & 0x908a7260)) * 0x2b +
               (long)(int)((uVar1 | 0x908a726d) * 2 - (uVar1 ^ 0x908a726d))])();
    uVar1 = -(int)DAT_00281318;
    (*(code *)(&DAT_0029e620)
              [(long)(int)((uVar1 | 0x908a7260) + (uVar1 & 0x908a7260)) * 0x2b +
               (long)(int)(-0x6f758d82 - (-(int)DAT_00281318 ^ 0xffffffffU))])();
    uVar1 = -(int)DAT_00281318;
    uVar2 = -(int)DAT_00281318;
    (*(code *)(&DAT_0029e620)
              [(long)(int)((uVar1 ^ 0x908a7260) + (uVar1 & 0x908a7260) * 2) * 0x2b +
               (long)(int)((uVar2 | 0x908a727f) * 2 - (uVar2 ^ 0x908a727f))])();
    if (iVar4 != 0) {
                    /* WARNING: Could not recover jumptable at 0x001fa984. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00284050)((long)iVar4);
      return;
    }
    uVar1 = -(int)DAT_00281318;
    uVar2 = -(int)DAT_00281318;
    (*(code *)(&DAT_0029e620)
              [(long)(int)((uVar1 ^ 0x908a7260) + (uVar1 & 0x908a7260) * 2) * 0x2b +
               (long)(int)((uVar2 | 0x908a727a) + (uVar2 & 0x908a727a))])();
    uVar1 = -(int)DAT_00281318;
    uVar2 = -(int)DAT_00281318;
    (*(code *)(&DAT_0029e620)
              [(long)(int)((uVar1 | 0x908a7260) + (uVar1 & 0x908a7260)) * 0x2b +
               (long)(int)((uVar2 | 0x908a727d) * 2 - (uVar2 ^ 0x908a727d))])();
    uVar1 = -(int)DAT_00281318;
    (*(code *)(&DAT_0029e620)
              [(long)(int)((uVar1 ^ 0x908a7260) + (uVar1 & 0x908a7260) * 2) * 0x2b +
               (long)(int)(-0x6f758da1 - (-(int)DAT_00281318 ^ 0xffffffffU))])();
    uVar1 = -(int)DAT_00281318;
    uVar2 = -(int)DAT_00281318;
    (*(code *)(&DAT_0029e620)
              [(long)(int)((uVar1 | 0x908a7260) + (uVar1 & 0x908a7260)) * 0x2b +
               (long)(int)((uVar2 | 0x908a7260) * 2 - (uVar2 ^ 0x908a7260))])();
                    /* WARNING: Could not recover jumptable at 0x001fb380. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00278f58)();
    return;
  }
  uVar5 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((-iVar4 | 0x908a7260U) * 2 - (-iVar4 ^ 0x908a7260U)) * 300 +
                     (long)(int)((-iVar4 ^ 0x908a7274U) + (-iVar4 & 0x908a7274U) * 2)])(0,param_3,0)
  ;
  uVar6 = 0xe06e61727cf3e7bd - (-DAT_00281318 ^ 0xffffffffffffffffU);
  lVar3 = tpidr_el0;
  if (*(long *)(lVar3 + 0x28) == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail((uVar5 | uVar6) * 2 - (uVar5 ^ uVar6));
}


