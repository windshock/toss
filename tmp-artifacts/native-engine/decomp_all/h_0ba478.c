// entry=0xba478

void FUN_001ba478(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  
  iVar1 = (int)DAT_00282ed0;
                    /* WARNING: Could not recover jumptable at 0x001ba4f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 ^ 0xabf772deU) + (-iVar1 & 0x2bf772deU) * 2) * 300 +
             (long)(int)((-iVar1 ^ 0xabf77330U) + (-iVar1 & 0xabf77330U) * 2)])
            ((-iVar1 ^ 0xabf772dfU) + (-iVar1 & 0xabf772dfU) * 2,param_2,param_1,
             (&PTR_FUN_0027c1e0)
             [(long)(int)((-iVar1 ^ 0xabf772deU) + (-iVar1 & 0x2bf772deU) * 2) * 300 +
              (long)(int)((-iVar1 ^ 0xabf77330U) + (-iVar1 & 0xabf77330U) * 2)],param_2,param_3);
  return;
}


