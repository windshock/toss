// entry=0xb22a0

void FUN_001b22a0(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_00276cf0;
                    /* WARNING: Could not recover jumptable at 0x001b22fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(0xc2d7bb6 - iVar1) * 300 +
             (long)(int)((-iVar1 | 0xc2d7bf6U) * 2 - (-iVar1 ^ 0xc2d7bf6U))])
            (0xc2d7bba - iVar1,param_2,param_1,param_2);
  return;
}


