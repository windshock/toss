// entry=0x43b80

void FUN_00143b80(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  
  iVar1 = (int)DAT_002821b8;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 ^ 0x3e70ca98U) + (-iVar1 & 0x3e70ca98U) * 2) * 300 +
             (long)(int)((-iVar1 | 0x3e70cb20U) + (-iVar1 & 0x3e70cb20U))])
            ((-iVar1 | 0x3e70ca99U) + (-iVar1 & 0x3e70ca99U),param_2,param_1,param_2,
             (&PTR_FUN_0027c1e0)
             [(long)(int)((-iVar1 ^ 0x3e70ca98U) + (-iVar1 & 0x3e70ca98U) * 2) * 300 +
              (long)(int)((-iVar1 | 0x3e70cb20U) + (-iVar1 & 0x3e70cb20U))],param_3);
  return;
}


