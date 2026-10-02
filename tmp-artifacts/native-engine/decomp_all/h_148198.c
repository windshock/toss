// entry=0x148198

void FUN_00248198(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_00274ec0;
                    /* WARNING: Could not recover jumptable at 0x002481e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&DAT_0027fe78)[(int)((-iVar1 ^ 0x148d918cU) + (-iVar1 & 0x148d918cU) * 2)])
            (param_1,param_2,param_1,param_4,param_3,param_4,
             (&PTR_FUN_0027c1e0)
             [(long)(int)((-iVar1 | 0x148d9146U) * 2 - (-iVar1 ^ 0x148d9146U)) * 300 +
              (long)(int)((-iVar1 | 0x148d918fU) + (-iVar1 & 0x148d918fU))]);
  return;
}


