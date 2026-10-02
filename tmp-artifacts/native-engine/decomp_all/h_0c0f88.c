// entry=0xc0f88

void FUN_001c0f88(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_00285db8;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(-0x3248ba69 - (-iVar1 ^ 0xffffffffU)) * 300 +
             (long)(int)((-iVar1 | 0xcdb74615U) + (-iVar1 & 0xcdb74615U))])
            ((-iVar1 ^ 0xcdb74598U) + (-iVar1 & 0xcdb74598U) * 2,param_2,param_1,param_2);
                    /* WARNING: Could not recover jumptable at 0x001c107c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00283df8)[(int)(-0x3248ba49 - (-(int)DAT_00285db8 ^ 0xffffffffU))])();
  return;
}


