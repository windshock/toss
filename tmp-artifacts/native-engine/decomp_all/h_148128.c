// entry=0x148128

void FUN_00248128(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
                 undefined4 param_5,undefined8 param_6)

{
  int iVar1;
  
  iVar1 = (int)DAT_00282218;
                    /* WARNING: Could not recover jumptable at 0x00248194. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)[(long)(-0x523f856d - iVar1) * 300 + (long)(-0x523f852d - iVar1)])
            ((iVar1 * -2 | 0x5b80f526U) - (-iVar1 ^ 0xadc07a93U),param_2,param_1,param_2,param_3,
             param_4,param_5,param_6);
  return;
}


