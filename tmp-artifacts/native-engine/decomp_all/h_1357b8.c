// entry=0x1357b8

void FUN_002357b8(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  int iVar1;
  
  iVar1 = (int)DAT_00282ee0;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 | 0x6775fad1U) * 2 - (-iVar1 ^ 0x6775fad1U)) * 300 +
             (long)(int)(0x6775fb10 - (-iVar1 ^ 0xffffffffU))])
            ((-iVar1 ^ 0x6775fad3U) + (-iVar1 & 0x6775fad3U) * 2,param_2,param_1,param_2,param_3,
             param_6,param_7,param_4);
                    /* WARNING: Could not recover jumptable at 0x002358b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00282550)
            [(long)(int)((-(int)DAT_00282ee0 ^ 0x6775fad1U) + (-(int)DAT_00282ee0 & 0x6775fad1U) * 2
                        ) * 0x6b])();
  return;
}


