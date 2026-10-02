// entry=0x1547e4

void FUN_002547e4(undefined8 param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_0027cb40;
                    /* WARNING: Could not recover jumptable at 0x00254890. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00283df8)[(int)((-iVar1 ^ 0x4a773058U) + (-iVar1 & 0x4a773058U) * 2)])
            ((&PTR_FUN_0027c1e0)
             [(long)(int)((-iVar1 ^ 0x4a77302cU) + (-iVar1 & 0x4a77302cU) * 2) * 300 +
              (long)(int)((-iVar1 ^ 0x4a773077U) + (-iVar1 & 0x4a773077U) * 2)],param_1,param_2,
             param_1,param_4,param_3);
  return;
}


