// entry=0xc14e8

void FUN_001c14e8(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  int iVar1;
  
  iVar1 = (int)DAT_0027a340;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(0x114b6038 - iVar1) * 300 +
             (long)(int)((-iVar1 ^ 0x114b60ddU) + (-iVar1 & 0x114b60ddU) * 2)])
            (0x114b6038 - iVar1,param_2,param_1,param_2,param_3,param_4,param_5);
  return;
}


