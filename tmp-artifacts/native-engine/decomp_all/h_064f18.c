// entry=0x64f18

void FUN_00164f18(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_00279ea8;
                    /* WARNING: Could not recover jumptable at 0x00164f98. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 ^ 0xc998599cU) + (-iVar1 & 0x4998599cU) * 2) * 300 +
             (long)(int)((-iVar1 | 0xc9985a71U) * 2 - (-iVar1 ^ 0xc9985a71U))])
            ((-iVar1 ^ 0xc998599cU) + (-iVar1 & 0x4998599cU) * 2,param_2,param_1,param_2,param_3,
             param_4);
  return;
}


