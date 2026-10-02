// entry=0x8d928

void FUN_0018d928(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  
  iVar1 = (int)DAT_00283de8;
                    /* WARNING: Could not recover jumptable at 0x0018d998. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((iVar1 * -2 | 0x7fde74f8U) - (-iVar1 ^ 0xbfef3a7cU)) * 300 +
             (long)(int)((-iVar1 ^ 0xbfef3aa7U) + (-iVar1 & 0xbfef3aa7U) * 2)])
            (-0x4010c583 - iVar1,param_2,param_1,param_2,param_3);
  return;
}


