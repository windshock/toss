// entry=0x90254

void FUN_00190254(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_00283628;
                    /* WARNING: Could not recover jumptable at 0x00190330. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_0027f148)[(int)(-0xc1b084d - (-iVar1 ^ 0xffffffffU))])
            (&PTR_FUN_0027c1e0 +
             (long)(int)((-iVar1 | 0xf3e4f76fU) * 2 - (-iVar1 ^ 0xf3e4f76fU)) * 300 +
             (long)(int)((-iVar1 | 0xf3e4f7a1U) + (-iVar1 & 0xf3e4f7a1U)),param_1,param_2,param_1);
  return;
}


