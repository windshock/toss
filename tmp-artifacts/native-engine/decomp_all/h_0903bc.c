// entry=0x903bc

void FUN_001903bc(undefined8 param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_00276db8;
                    /* WARNING: Could not recover jumptable at 0x00190488. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_0027b718)[(int)((-iVar1 | 0xf650c54bU) + (-iVar1 & 0xf650c54bU))])
            (param_1,param_2,param_1,param_4,param_3,
             (&PTR_FUN_0027c1e0)
             [(long)(int)((-iVar1 | 0xf650c51fU) * 2 - (-iVar1 ^ 0xf650c51fU)) * 300 +
              (long)(int)((-iVar1 ^ 0xf650c5b1U) + (-iVar1 & 0xf650c5b1U) * 2)]);
  return;
}


