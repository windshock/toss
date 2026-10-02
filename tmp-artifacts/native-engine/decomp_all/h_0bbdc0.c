// entry=0xbbdc0

void FUN_001bbdc0(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_00281328;
                    /* WARNING: Could not recover jumptable at 0x001bbe38. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 ^ 0x9475a360U) + (-iVar1 & 0x1475a360U) * 2) * 300 +
             (long)(int)((-iVar1 | 0x9475a421U) * 2 - (-iVar1 ^ 0x9475a421U))])
            (-0x6b8a5c9d - iVar1,param_2,param_1,param_2,param_3,param_4);
  return;
}


