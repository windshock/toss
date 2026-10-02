// entry=0xf0c20

void FUN_001f0c20(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_00280500;
                    /* WARNING: Could not recover jumptable at 0x001f0c84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(0x57b9a794 - iVar1) * 300 +
             (long)(int)((-iVar1 ^ 0x57b9a7d4U) + (-iVar1 & 0x57b9a7d4U) * 2)])
            ((-iVar1 ^ 0x57b9a797U) + (-iVar1 & 0x57b9a797U) * 2,param_2,param_1,param_2);
  return;
}


