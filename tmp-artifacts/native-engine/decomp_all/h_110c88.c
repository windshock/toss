// entry=0x110c88

void FUN_00210c88(undefined8 param_1,undefined8 param_2,undefined4 param_3,undefined4 param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_002835f0;
                    /* WARNING: Could not recover jumptable at 0x00210d04. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 | 0x47c3fc75U) * 2 - (-iVar1 ^ 0x47c3fc75U)) * 300 +
             (long)(int)((-iVar1 ^ 0x47c3fc9dU) + (-iVar1 & 0x47c3fc9dU) * 2)])
            ((-iVar1 ^ 0x47c3fc79U) + (-iVar1 & 0x47c3fc79U) * 2,param_2,param_1,param_2,param_3,
             param_4);
  return;
}


