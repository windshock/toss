// entry=0x1356f0

void FUN_002356f0(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  uint uVar1;
  
  uVar1 = (uint)DAT_00274ed8;
                    /* WARNING: Could not recover jumptable at 0x00235754. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(~uVar1 + 0x69a0c254) * 300 + (long)(int)(0x69a0c2a4 - uVar1)])
            ((-uVar1 | 0x69a0c254) * 2 - (-uVar1 ^ 0x69a0c254),param_2,param_1,param_2,param_3,
             param_4);
  return;
}


