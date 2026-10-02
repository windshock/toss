// entry=0x34f84

void FUN_00134f84(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_00280b78;
                    /* WARNING: Could not recover jumptable at 0x00134ff4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 ^ 0x3011bb59U) + (-iVar1 & 0x3011bb59U) * 2) * 300 +
             (long)(int)((-iVar1 ^ 0x3011bc1aU) + (-iVar1 & 0x3011bc1aU) * 2)])
            ((-iVar1 ^ 0x3011bb5bU) + (-iVar1 & 0x3011bb5bU) * 2,param_2,param_1,param_2);
  return;
}


