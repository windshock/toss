// entry=0x141ca4

void FUN_00241ca4(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  
  iVar1 = (int)DAT_00286128;
                    /* WARNING: Could not recover jumptable at 0x00241d0c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 | 0x32f0a38aU) * 2 - (-iVar1 ^ 0x32f0a38aU)) * 300 +
             (long)(0x32f0a3ea - iVar1)])
            ((-iVar1 ^ 0x32f0a38eU) + (-iVar1 & 0x32f0a38eU) * 2,param_2,param_3,param_1,param_2);
  return;
}


