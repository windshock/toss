// entry=0xb0b88

void FUN_001b0b88(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_00274e88;
                    /* WARNING: Could not recover jumptable at 0x001b0bd0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(&DAT_00275cc0 + (long)(int)((-iVar1 | 0xb91c22ebU) * 2 - (-iVar1 ^ 0xb91c22ebU)) * 8)
  )(param_1,param_2,param_1,param_4,
    (&PTR_FUN_0027c1e0)
    [(long)(int)(-0x46e3dd48 - (-iVar1 ^ 0xffffffffU)) * 300 +
     (long)(int)((-iVar1 ^ 0xb91c23a1U) + (-iVar1 & 0xb91c23a1U) * 2)]);
  return;
}


