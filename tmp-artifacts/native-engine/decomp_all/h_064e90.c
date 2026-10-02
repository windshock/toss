// entry=0x64e90

void FUN_00164e90(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
                 undefined8 param_5,undefined8 param_6)

{
  int iVar1;
  
  iVar1 = (int)DAT_00282928;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 ^ 0x98b8c21U) + (-iVar1 & 0x98b8c21U) * 2) * 300 +
             (long)(0x98b8d49 - iVar1)])
            ((-iVar1 | 0x98b8c24U) + (-iVar1 & 0x98b8c24U),param_2,param_1,param_2,param_3,param_6,
             param_4);
  return;
}


