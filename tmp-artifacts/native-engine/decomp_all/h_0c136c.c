// entry=0xc136c

void FUN_001c136c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_00277cf8;
                    /* WARNING: Could not recover jumptable at 0x001c1420. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00283300)[(int)((-iVar1 ^ 0x83caf14aU) + (-iVar1 & 0x83caf14aU) * 2)])
            ((&PTR_FUN_0027c1e0)
             [(long)(int)((-iVar1 | 0x83caf110U) + (-iVar1 & 0x83caf110U)) * 300 +
              (long)(int)((-iVar1 | 0x83caf1cbU) * 2 - (-iVar1 ^ 0x83caf1cbU))],param_1,param_2,
             param_1,param_4,param_3,param_4);
  return;
}


