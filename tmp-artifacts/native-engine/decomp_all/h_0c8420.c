// entry=0xc8420

void FUN_001c8420(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_00276608;
                    /* WARNING: Could not recover jumptable at 0x001c8480. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(-0x1d18e03 - iVar1) * 300 +
             (long)(int)((-iVar1 ^ 0xfe2e723dU) + (-iVar1 & 0x7e2e723dU) * 2)])
            (-0x1d18e02 - iVar1,param_2,param_1,param_2);
  return;
}


