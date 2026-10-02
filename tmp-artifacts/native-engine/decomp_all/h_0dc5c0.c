// entry=0xdc5c0

void FUN_001dc5c0(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_00280b90;
                    /* WARNING: Could not recover jumptable at 0x001dc6a0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&DAT_00281e60)[(int)((-iVar1 | 0xf4db568fU) + (-iVar1 & 0xf4db568fU))])
            ((&PTR_FUN_0027c1e0)
             [(long)(int)((-iVar1 ^ 0xf4db5634U) + (-iVar1 & 0xf4db5634U) * 2) * 300 +
              (long)(int)((-iVar1 | 0xf4db56caU) + (-iVar1 & 0xf4db56caU))],param_1,param_2,param_1,
             param_4,param_3);
  return;
}


