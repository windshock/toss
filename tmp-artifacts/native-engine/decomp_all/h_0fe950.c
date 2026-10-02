// entry=0xfe950

void Hfe950(void)

{
  uint uVar1;
  uint uVar2;
  undefined8 uVar3;
  int iVar4;
  int unaff_w25;
  long lVar5;
  long unaff_x28;
  
  if (0 < unaff_w25) {
    lVar5 = 0;
    do {
      uVar1 = -(int)DAT_00280ba8;
      (*(code *)(&DAT_0029e620)
                [(long)(int)(-0x4b38a603 - (-(int)DAT_00280ba8 ^ 0xffffffffU)) * 0x2b +
                 (long)(int)((uVar1 | 0xb4c75a10) * 2 - (uVar1 ^ 0xb4c75a10))])();
      uVar1 = -(int)DAT_00280ba8;
      uVar2 = -(int)DAT_00280ba8;
      uVar3 = (*(code *)(&DAT_0029e620)
                        [(long)(int)((uVar2 | 0xb4c759fe) + (uVar2 & 0xb4c759fe)) * 0x2b +
                         (long)(int)((uVar1 ^ 0xb4c75a25) + (uVar1 & 0xb4c75a25) * 2)])();
      *(undefined8 *)(&stack0x00000000 + (lVar5 * 8 - (unaff_x28 * 8 + 0xfU & 0xfffffffffffffff0)))
           = uVar3;
      lVar5 = lVar5 + 1;
    } while (lVar5 != unaff_x28);
    iVar4 = (int)DAT_00280ba8;
                    /* WARNING: Could not recover jumptable at 0x002007ac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&PTR_LAB_0027a6e0)[(int)((-iVar4 ^ 0xb4c75a20U) + (-iVar4 & 0xb4c75a20U) * 2)])
              (&PTR_FUN_0027c1e0 +
               (long)(int)((-iVar4 ^ 0xb4c759feU) + (-iVar4 & 0xb4c759feU) * 2) * 300 +
               (long)(int)((-iVar4 | 0xb4c75ad6U) * 2 - (-iVar4 ^ 0xb4c75ad6U)));
    return;
  }
  uVar1 = -(int)DAT_00280ba8;
  uVar2 = -(int)DAT_00280ba8;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar1 | 0xb4c759fe) * 2 - (uVar1 ^ 0xb4c759fe)) * 300 +
             (long)(int)((uVar2 | 0xb4c75ad6) + (uVar2 & 0xb4c75ad6))])();
                    /* WARNING: Could not recover jumptable at 0x00200898. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00279e20)();
  return;
}


