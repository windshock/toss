// entry=0x141570

void FUN_00241570(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined4 param_6)

{
  int iVar1;
  
  iVar1 = (int)DAT_00276d80;
                    /* WARNING: Could not recover jumptable at 0x002415f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(-0x6355d7a8 - iVar1) * 300 +
             (long)(int)((-iVar1 ^ 0x9caa28a3U) + (-iVar1 & 0x9caa28a3U) * 2)])
            ((iVar1 * -2 | 0x395450b6U) - (-iVar1 ^ 0x9caa285bU),param_2,param_1,param_2,param_6,
             param_3,param_4,param_5);
  return;
}


