// entry=0x16b084

void FUN_0026b084(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_00282f00;
                    /* WARNING: Could not recover jumptable at 0x0026b104. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 ^ 0xf479647cU) + (-iVar1 & 0x7479647cU) * 2) * 300 +
             (long)(int)((-iVar1 | 0xf47964cdU) + (-iVar1 & 0xf47964cdU))])
            ((-iVar1 | 0xf4796480U) + (-iVar1 & 0xf4796480U),param_2,param_1,param_2,param_3,
             (&PTR_FUN_0027c1e0)
             [(long)(int)((-iVar1 ^ 0xf479647cU) + (-iVar1 & 0x7479647cU) * 2) * 300 +
              (long)(int)((-iVar1 | 0xf47964cdU) + (-iVar1 & 0xf47964cdU))],param_4);
  return;
}


