// entry=0x1034c8

void FUN_002034c8(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  
  iVar1 = (int)DAT_00274000;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(0x7d0e19c1 - iVar1) * 300 +
             (long)(int)((-iVar1 ^ 0x7d0e1a1dU) + (-iVar1 & 0x7d0e1a1dU) * 2)])
            ((-iVar1 | 0x7d0e19c3U) * 2 - (-iVar1 ^ 0x7d0e19c3U),param_2,param_1,param_3,param_2);
  return;
}


