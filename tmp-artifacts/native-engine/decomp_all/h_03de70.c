// entry=0x3de70

void FUN_0013de70(undefined8 param_1)

{
  int iVar1;
  
  iVar1 = (int)DAT_0027beb0;
                    /* WARNING: Could not recover jumptable at 0x0013dee8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((iVar1 * -2 | 0x29827b16U) - (-iVar1 ^ 0x94c13d8bU)) * 300 +
             (long)(int)((-iVar1 | 0x94c13e33U) + (-iVar1 & 0x94c13e33U))])
            ((-iVar1 | 0x94c13d8cU) * 2 - (-iVar1 ^ 0x94c13d8cU),
             (&PTR_FUN_0027c1e0)
             [(long)(int)((iVar1 * -2 | 0x29827b16U) - (-iVar1 ^ 0x94c13d8bU)) * 300 +
              (long)(int)((-iVar1 | 0x94c13e33U) + (-iVar1 & 0x94c13e33U))],param_1);
  return;
}


