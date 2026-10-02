// entry=0xc83a4

void FUN_001c83a4(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  
  iVar1 = (int)DAT_00283dc8;
                    /* WARNING: Could not recover jumptable at 0x001c841c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 | 0x619c0f47U) * 2 - (-iVar1 ^ 0x619c0f47U)) * 300 +
             (long)(int)((-iVar1 | 0x619c1008U) + (-iVar1 & 0x619c1008U))])
            ((-iVar1 | 0x619c0f48U) + (-iVar1 & 0x619c0f48U),param_2,param_1,param_2,param_3);
  return;
}


