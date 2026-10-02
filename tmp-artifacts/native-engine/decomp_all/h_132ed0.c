// entry=0x132ed0

void FUN_00232ed0(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  
  iVar1 = (int)DAT_0027a360;
                    /* WARNING: Could not recover jumptable at 0x00232f50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 | 0xcea972aaU) + (-iVar1 & 0xcea972aaU)) * 300 +
             (long)(int)((-iVar1 | 0xcea972fbU) * 2 - (-iVar1 ^ 0xcea972fbU))])
            ((iVar1 * -2 | 0x9d52e554U) - (-iVar1 ^ 0xcea972aaU),param_2,param_1,param_2,param_3);
  return;
}


