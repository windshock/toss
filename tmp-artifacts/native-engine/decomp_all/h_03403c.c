// entry=0x3403c

void FUN_0013403c(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_0027e238;
                    /* WARNING: Could not recover jumptable at 0x001340b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 ^ 0xf747640bU) + (-iVar1 & 0x7747640bU) * 2) * 300 +
             (long)(int)((-iVar1 | 0xf747650cU) * 2 - (-iVar1 ^ 0xf747650cU))])
            ((-iVar1 ^ 0xf747640fU) + (-iVar1 & 0xf747640fU) * 2,param_2,param_1,param_2);
  return;
}


