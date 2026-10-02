// entry=0x35344

void FUN_00135344(undefined8 param_1,undefined8 param_2)

{
  uint uVar1;
  
  uVar1 = (uint)DAT_00279b50;
                    /* WARNING: Could not recover jumptable at 0x001353b0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(~uVar1 + 0xfe9866c8) * 300 +
             (long)(int)((-uVar1 | 0xfe986711) + (-uVar1 & 0xfe986711))])
            ((-uVar1 ^ 0xfe9866c8) + (-uVar1 & 0x7e9866c8) * 2,param_2,param_1,param_2);
  return;
}


