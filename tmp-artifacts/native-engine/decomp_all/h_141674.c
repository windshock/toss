// entry=0x141674

void FUN_00241674(undefined8 param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_002765e0;
                    /* WARNING: Could not recover jumptable at 0x0024174c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_002773f8)
            [(long)(int)((-iVar1 ^ 0x1f16d7c3U) + (-iVar1 & 0x1f16d7c3U) * 2) * 0x66])
            (&PTR_FUN_0027c1e0 +
             (long)(int)(0x1f16d7c2 - (-iVar1 ^ 0xffffffffU)) * 300 +
             (long)(int)((-iVar1 | 0x1f16d8c4U) + (-iVar1 & 0x1f16d8c4U)),param_1,param_2,param_1,
             param_4,param_3,param_4);
  return;
}


