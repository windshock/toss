// entry=0x132e4c

void FUN_00232e4c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
                 undefined8 param_5,undefined8 param_6)

{
  uint uVar1;
  
  uVar1 = (uint)DAT_002752c8;
                    /* WARNING: Could not recover jumptable at 0x00232ecc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(~uVar1 + 0xad535b48) * 300 +
             (long)(int)((-uVar1 | 0xad535c04) * 2 - (-uVar1 ^ 0xad535c04))])
            ((-uVar1 ^ 0xad535b48) + (-uVar1 & 0x2d535b48) * 2,param_2,param_1,param_2,param_3,
             param_4,param_5,param_6);
  return;
}


