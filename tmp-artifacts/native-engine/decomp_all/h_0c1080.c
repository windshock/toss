// entry=0xc1080

void FUN_001c1080(undefined8 param_1)

{
  int iVar1;
  
  iVar1 = (int)DAT_00283948;
                    /* WARNING: Could not recover jumptable at 0x001c10f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 ^ 0xfe539f42U) + (-iVar1 & 0x7e539f42U) * 2) * 300 +
             (long)(int)((-iVar1 | 0xfe539feaU) * 2 - (-iVar1 ^ 0xfe539feaU))])
            ((-iVar1 ^ 0xfe539f42U) + (-iVar1 & 0x7e539f42U) * 2,
             (&PTR_FUN_0027c1e0)
             [(long)(int)((-iVar1 ^ 0xfe539f42U) + (-iVar1 & 0x7e539f42U) * 2) * 300 +
              (long)(int)((-iVar1 | 0xfe539feaU) * 2 - (-iVar1 ^ 0xfe539feaU))],param_1);
  return;
}


