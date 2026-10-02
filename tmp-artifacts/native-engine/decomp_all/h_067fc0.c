// entry=0x67fc0

void FUN_00167fc0(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined4 param_5,undefined4 param_6,undefined8 param_7,undefined8 param_8,
                 undefined4 param_9,undefined4 param_10,undefined8 param_11,undefined4 param_12,
                 undefined8 param_13)

{
  int iVar1;
  
  iVar1 = (int)DAT_00276d70;
  (*(code *)(&PTR_FUN_0027c1e0)[(long)(0x28dc20a8 - iVar1) * 300 + (long)(0x28dc20d2 - iVar1)])
            ((-iVar1 | 0x28dc20a8U) + (-iVar1 & 0x28dc20a8U),param_2,param_1,param_2,param_3,param_4
             ,param_5,param_6,param_7,param_8,param_9,param_10,param_11,param_12,param_13);
  return;
}


