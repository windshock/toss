// entry=0xfa060

void FUN_001fa060(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_00280ef8;
                    /* WARNING: Could not recover jumptable at 0x001fa13c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_0027d8d0)
            [(long)(int)((-iVar1 | 0x506fa3d6U) * 2 - (-iVar1 ^ 0x506fa3d6U)) * 0x5f])
            (&PTR_FUN_0027c1e0 +
             (long)(int)(0x506fa3d5 - (-iVar1 ^ 0xffffffffU)) * 300 +
             (long)(int)((-iVar1 | 0x506fa493U) + (-iVar1 & 0x506fa493U)),param_1,param_2,param_1);
  return;
}


