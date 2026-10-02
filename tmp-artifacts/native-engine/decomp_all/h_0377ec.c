// entry=0x377ec

void thunk_FUN_001371dc(void)

{
  int iVar1;
  
  iVar1 = (int)DAT_00285dc8;
                    /* WARNING: Could not recover jumptable at 0x00137278. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00278340)[(int)((-iVar1 | 0x26e2eb07U) * 2 - (-iVar1 ^ 0x26e2eb07U))])
            (&PTR_FUN_0027c1e0 +
             (long)(int)((-iVar1 | 0x26e2ead5U) + (-iVar1 & 0x26e2ead5U)) * 300 +
             (long)(int)(0x26e2ebe9 - (-iVar1 ^ 0xffffffffU)));
  return;
}


