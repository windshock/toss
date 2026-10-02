// entry=0xf8b98

void FUN_001f8b98(undefined8 param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_002765f8;
                    /* WARNING: Could not recover jumptable at 0x001f8c28. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_0027f7f8)[(long)(int)(0x4f2ec9d6 - (-iVar1 ^ 0xffffffffU)) * 100])
            ((&PTR_FUN_0027c1e0)
             [(long)(int)((-iVar1 | 0x4f2ec9d7U) * 2 - (-iVar1 ^ 0x4f2ec9d7U)) * 300 +
              (long)(int)((-iVar1 ^ 0x4f2eca22U) + (-iVar1 & 0x4f2eca22U) * 2)],param_1,param_2,
             param_1,param_4,param_3);
  return;
}


