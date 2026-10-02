// entry=0xb8694

void FUN_001b8694(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
                 undefined4 param_5,undefined8 param_6)

{
  int iVar1;
  
  iVar1 = (int)DAT_002752b8;
                    /* WARNING: Could not recover jumptable at 0x001b86fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 | 0x96e6fe6U) + (-iVar1 & 0x96e6fe6U)) * 300 +
             (long)(0x96e7011 - iVar1)])
            (0x96e6fe9 - iVar1,param_2,param_1,param_2,param_3,param_4,param_5,param_6);
  return;
}


