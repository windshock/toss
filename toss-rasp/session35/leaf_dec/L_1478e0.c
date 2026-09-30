// FUN_001478a4 @001478a4

void FUN_001478a4(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  int iVar1;
  
  iVar1 = (int)DAT_00279b30;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 ^ 0xcab39724U) + (-iVar1 & 0x4ab39724U) * 2) * 300 +
             (long)(int)((-iVar1 ^ 0xcab397a1U) + (-iVar1 & 0xcab397a1U) * 2)])
            ((-iVar1 ^ 0xcab39725U) + (-iVar1 & 0xcab39725U) * 2,param_2,param_1,param_2,param_3,
             param_4,param_5);
  return;
}

