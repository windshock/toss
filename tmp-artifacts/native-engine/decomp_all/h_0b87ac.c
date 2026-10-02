// entry=0xb87ac

void FUN_001b87ac(undefined8 param_1,undefined8 param_2,undefined4 param_3)

{
  int iVar1;
  
  iVar1 = (int)DAT_0027d798;
                    /* WARNING: Could not recover jumptable at 0x001b881c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 ^ 0x4882b938U) + (-iVar1 & 0x4882b938U) * 2) * 300 +
             (long)(int)((-iVar1 ^ 0x4882ba3bU) + (-iVar1 & 0x4882ba3bU) * 2)])
            ((-iVar1 ^ 0x4882b938U) + (-iVar1 & 0x4882b938U) * 2,param_2,param_1,param_2,param_3);
  return;
}


