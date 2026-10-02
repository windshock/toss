// entry=0x1343f8

void H1340e8(void)

{
  uint uVar1;
  
  uVar1 = -(int)DAT_00274ae0;
                    /* WARNING: Could not recover jumptable at 0x002333a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027d180)
            ((&PTR_FUN_0027c1e0)
             [(long)(int)(0x5de9c897 - (-(int)DAT_00274ae0 ^ 0xffffffffU)) * 300 +
              (long)(int)((uVar1 | 0x5de9c8c8) * 2 - (uVar1 ^ 0x5de9c8c8))]);
  return;
}


