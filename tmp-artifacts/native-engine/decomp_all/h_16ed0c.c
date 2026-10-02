// entry=0x16ed0c

void FUN_0026ed0c(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  
  iVar1 = (int)DAT_00285748;
                    /* WARNING: Could not recover jumptable at 0x0026ed80. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 ^ 0x422b8647U) + (-iVar1 & 0x422b8647U) * 2) * 300 +
             (long)(int)((-iVar1 | 0x422b8764U) + (-iVar1 & 0x422b8764U))])
            ((-iVar1 ^ 0x422b8649U) + (-iVar1 & 0x422b8649U) * 2,param_2,param_1,param_2,param_3);
  return;
}


