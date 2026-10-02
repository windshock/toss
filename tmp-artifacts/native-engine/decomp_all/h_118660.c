// entry=0x118660

void H1171b0(ulong param_1)

{
  char *pcVar1;
  long unaff_x21;
  
  do {
    pcVar1 = (char *)(unaff_x21 + param_1);
    param_1 = (param_1 | 1) * 2 - (param_1 ^ 1);
  } while (*pcVar1 != '\0');
                    /* WARNING: Could not recover jumptable at 0x0021ec20. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00283e00)
            ((&PTR_FUN_0027c1e0)
             [(long)(int)(-0x337730bf - (-(int)DAT_00281e58 ^ 0xffffffffU)) * 300 +
              (long)(int)(-0x33772faa - (-(int)DAT_00281e58 ^ 0xffffffffU))]);
  return;
}


