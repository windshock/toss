// entry=0x44bd4

void FUN_00144bd4(undefined8 param_1)

{
  int iVar1;
  
  iVar1 = (int)DAT_00285750;
                    /* WARNING: Could not recover jumptable at 0x00144c40. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 | 0x48f9ad78U) + (-iVar1 & 0x48f9ad78U)) * 300 +
             (long)(int)((-iVar1 | 0x48f9ada0U) + (-iVar1 & 0x48f9ada0U))])
            ((-iVar1 | 0x48f9ad7bU) + (-iVar1 & 0x48f9ad7bU),
             (&PTR_FUN_0027c1e0)
             [(long)(int)((-iVar1 | 0x48f9ad78U) + (-iVar1 & 0x48f9ad78U)) * 300 +
              (long)(int)((-iVar1 | 0x48f9ada0U) + (-iVar1 & 0x48f9ada0U))],param_1);
  return;
}


