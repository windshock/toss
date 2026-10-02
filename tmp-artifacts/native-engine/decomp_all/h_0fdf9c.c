// entry=0xfdf9c

void FUN_001fdf9c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  int iVar1;
  
  iVar1 = (int)DAT_00281750;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 | 0x577b52U) * 2 - (-iVar1 ^ 0x577b52U)) * 300 +
             (long)(int)((-iVar1 ^ 0x577b59U) + (-iVar1 & 0x577b59U) * 2)])
            ((-iVar1 | 0x577b53U) + (-iVar1 & 0x577b53U),param_2,param_1,param_4,param_5,param_2,
             param_3);
  return;
}


