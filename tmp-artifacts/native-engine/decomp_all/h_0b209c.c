// entry=0xb209c

void FUN_001b209c(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_00275268;
                    /* WARNING: Could not recover jumptable at 0x001b2108. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((iVar1 * -2 | 0xfd78b6d0U) - (-iVar1 ^ 0xfebc5b68U)) * 300 +
             (long)(int)((-iVar1 ^ 0xfebc5b93U) + (-iVar1 & 0xfebc5b93U) * 2)])
            (-0x143a496 - iVar1,param_2,param_1,param_2);
  return;
}


