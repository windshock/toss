// entry=0x13f360

void H13f360(void)

{
  DAT_0029e818 = 0x8692045 - (-(int)DAT_00279eb0 ^ 0xffffffffU);
                    /* WARNING: Could not recover jumptable at 0x0023f3a0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_H13d22c_0027f9a0)();
  return;
}


