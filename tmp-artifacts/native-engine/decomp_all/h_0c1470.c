// entry=0xc1470

void FUN_001c1470(undefined8 param_1,undefined8 param_2)

{
  uint uVar1;
  
  uVar1 = (uint)DAT_00278000;
                    /* WARNING: Could not recover jumptable at 0x001c14d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(~uVar1 + 0xed23fc33) * 300 +
             (long)(int)((-uVar1 | 0xed23fd33) * 2 - (-uVar1 ^ 0xed23fd33))])
            ((-uVar1 | 0xed23fc33) + (-uVar1 & 0xed23fc33),param_2,param_1,param_2);
  return;
}


