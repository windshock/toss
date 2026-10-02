// entry=0x3932c

void H38d78(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  
  uVar2 = -(int)DAT_0027ba40;
  uVar3 = -(int)DAT_0027ba40;
  iVar4 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar2 ^ 0x2a074dbd) + (uVar2 & 0x2a074dbd) * 2) * 300 +
                     (long)(int)((uVar3 | 0x2a074ded) * 2 - (uVar3 ^ 0x2a074ded))])();
  ppuVar1 = &PTR_LAB_00279a48;
  if (iVar4 != 0) {
    ppuVar1 = &PTR_LAB_002753c0;
  }
                    /* WARNING: Could not recover jumptable at 0x00138e0c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


