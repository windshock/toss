// entry=0x16af64

void FUN_0026af64(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_002752a8;
                    /* WARNING: Could not recover jumptable at 0x0026afdc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 | 0xddf3e98cU) + (-iVar1 & 0xddf3e98cU)) * 300 +
             (long)(int)((-iVar1 ^ 0xddf3ea58U) + (-iVar1 & 0xddf3ea58U) * 2)])
            ((-iVar1 | 0xddf3e98fU) + (-iVar1 & 0xddf3e98fU),param_2,param_3,param_1,param_2,param_3
             ,param_4);
  return;
}


