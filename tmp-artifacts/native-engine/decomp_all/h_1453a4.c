// entry=0x1453a4

void H1453a4(int *param_1)

{
  uint uVar1;
  uint uVar2;
  
  *param_1 = (-(int)DAT_00279b20 | 0x333596b0U) * 2 - (-(int)DAT_00279b20 ^ 0x333596b0U);
  uVar1 = -(int)DAT_00279b20;
  uVar2 = -(int)DAT_00279b20;
                    /* WARNING: Could not recover jumptable at 0x0024543c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00276720)
            (&PTR_FUN_0027c1e0 +
             (long)(int)((uVar2 | 0x333596ae) * 2 - (uVar2 ^ 0x333596ae)) * 300 +
             (long)(int)((uVar1 | 0x333597c3) * 2 - (uVar1 ^ 0x333597c3)));
  return;
}


