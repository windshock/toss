// entry=0xbeb14

void FUN_001beb14(undefined8 param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  int iVar1;
  
  iVar1 = (int)DAT_0027eb70;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(0x19d31feb - (-iVar1 ^ 0xffffffffU)) * 300 +
             (long)(int)((-iVar1 ^ 0x19d32074U) + (-iVar1 & 0x19d32074U) * 2)])
            ((-iVar1 | 0x19d31fecU) + (-iVar1 & 0x19d31fecU),param_2,param_1,param_2,param_3,param_4
             ,param_5);
                    /* WARNING: Could not recover jumptable at 0x001bec0c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00279648)[(long)(int)(0x19d31feb - (-(int)DAT_0027eb70 ^ 0xffffffffU)) * 0x6e]
  )();
  return;
}


