// entry=0x34390

void FUN_00134390(undefined8 param_1,undefined8 param_2,uint param_3,uint param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_00281310;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 | 0x6f5a52a5U) + (-iVar1 & 0x6f5a52a5U)) * 300 +
             (long)(int)((-iVar1 | 0x6f5a5355U) * 2 - (-iVar1 ^ 0x6f5a5355U))])
            (2,param_2,param_3,(param_3 | 0x77f9b5f8) & (~param_3 | 0x88064a07),
             (param_4 | 0xe754089dU - iVar1) & (param_4 & 0xe754089dU - iVar1 ^ 0xffffffff));
  return;
}


