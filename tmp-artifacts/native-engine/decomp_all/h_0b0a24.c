// entry=0xb0a24

void FUN_001b0a24(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  
  iVar1 = (int)DAT_0027a6d8;
                    /* WARNING: Could not recover jumptable at 0x001b0a98. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 ^ 0x2db74d1aU) + (-iVar1 & 0x2db74d1aU) * 2) * 300 +
             (long)(int)((-iVar1 | 0x2db74d45U) + (-iVar1 & 0x2db74d45U))])
            ((-iVar1 | 0x2db74d1aU) * 2 - (-iVar1 ^ 0x2db74d1aU),param_2,param_1,param_2,param_3);
  return;
}


