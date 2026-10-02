// entry=0xcece0

void FUN_001cece0(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_0027a6c0;
                    /* WARNING: Could not recover jumptable at 0x001ced54. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 ^ 0x72a83838U) + (-iVar1 & 0x72a83838U) * 2) * 300 +
             (long)(int)((-iVar1 ^ 0x72a83881U) + (-iVar1 & 0x72a83881U) * 2)])
            ((-iVar1 | 0x72a8383bU) * 2 - (-iVar1 ^ 0x72a8383bU),param_2,param_1,param_2);
  return;
}


