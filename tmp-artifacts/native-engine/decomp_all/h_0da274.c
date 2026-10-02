// entry=0xda274

void FUN_001da274(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  
  iVar1 = (int)DAT_0027f140;
                    /* WARNING: Could not recover jumptable at 0x001da2c4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)[(long)(-0x2df57a2b - iVar1) * 300 + (long)(-0x2df57970 - iVar1)])
            (-0x2df57a2a - iVar1,param_2,param_1,param_2,param_3);
  return;
}


