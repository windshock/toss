// entry=0x8dc6c

void FUN_0018dc6c(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_0027a6d0;
                    /* WARNING: Could not recover jumptable at 0x0018dcd4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(0x50388c13 - iVar1) * 300 +
             (long)(int)((-iVar1 ^ 0x50388c64U) + (-iVar1 & 0x50388c64U) * 2)])
            ((-iVar1 | 0x50388c16U) * 2 - (-iVar1 ^ 0x50388c16U),param_2,param_1,param_2);
  return;
}


