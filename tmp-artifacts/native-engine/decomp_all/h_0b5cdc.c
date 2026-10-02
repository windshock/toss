// entry=0xb5cdc

void FUN_001b5cdc(void)

{
  uint uVar1;
  uint uVar2;
  
  uVar1 = -(int)DAT_00282eb0;
  uVar2 = -(int)DAT_00282eb0;
                    /* WARNING: Could not recover jumptable at 0x001b5dd4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002750b8)
            ((&PTR_FUN_0027c1e0)
             [(long)(int)((uVar2 ^ 0xa3e8dd9e) + (uVar2 & 0xa3e8dd9e) * 2) * 300 +
              (long)(int)((uVar1 ^ 0xa3e8de6a) + (uVar1 & 0xa3e8de6a) * 2)]);
  return;
}


