// entry=0x16eb1c

void H16eb1c(void)

{
  int iVar1;
  
  iVar1 = (int)DAT_0027a9b8;
                    /* WARNING: Could not recover jumptable at 0x0026ebb4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_0027a5c8)[(long)(int)(-0x10076051 - (-iVar1 ^ 0xffffffffU)) * 0x65])
            ((&PTR_FUN_0027c1e0)
             [(long)(int)(-0x10076051 - (-iVar1 ^ 0xffffffffU)) * 300 +
              (long)(int)((-iVar1 | 0xeff89ff4U) + (-iVar1 & 0xeff89ff4U))]);
  return;
}


