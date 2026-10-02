// entry=0x44ab8

void FUN_00144ab8(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
                 undefined8 param_5,undefined4 param_6,undefined8 param_7,undefined8 param_8,
                 undefined8 param_9)

{
  int iVar1;
  
  iVar1 = (int)DAT_00276d40;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((iVar1 * -2 | 0xfe0dcad0U) - (-iVar1 ^ 0xff06e568U)) * 300 +
             (long)(int)((-iVar1 | 0xff06e605U) + (-iVar1 & 0xff06e605U))])
            ((-iVar1 | 0xff06e568U) + (-iVar1 & 0xff06e568U),param_2,param_1,param_2,param_3,param_4
             ,param_5,param_6,param_7,param_8,param_9);
  return;
}


