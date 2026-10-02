// entry=0xc1188

void FUN_001c1188(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_0027eb68;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 | 0xfbd3aef8U) + (-iVar1 & 0xfbd3aef8U)) * 300 +
             (long)(int)((-iVar1 | 0xfbd3af77U) * 2 - (-iVar1 ^ 0xfbd3af77U))])
            ((-iVar1 | 0xfbd3aefbU) + (-iVar1 & 0xfbd3aefbU),param_2,param_1);
                    /* WARNING: Could not recover jumptable at 0x001c1270. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00276ad8)
            [(long)(int)((-(int)DAT_0027eb68 | 0xfbd3aef8U) * 2 - (-(int)DAT_0027eb68 ^ 0xfbd3aef8U)
                        ) * 99])();
  return;
}


