// entry=0x12ad60

void H127ffc(void)

{
  long in_x9;
  long in_x10;
  char *in_x11;
  char *in_x12;
  long unaff_x19;
  long unaff_x23;
  
  DAT_0029e82c = 0;
  if (in_x10 == 0) {
    if (in_x9 != 0) {
      *(BADSPACEBASE **)(unaff_x19 + 0xd8) = register0x00000008;
                    /* WARNING: Could not recover jumptable at 0x00225238. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00277230)((in_x9 - (-unaff_x23 ^ 0xffffffffffffffffU)) + -1);
      return;
    }
                    /* WARNING: Could not recover jumptable at 0x00218078. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&PTR_LAB_002751a0)
              [(long)(int)(-0x337730bf - (-(int)DAT_00281e58 ^ 0xffffffffU)) * 0x5e])();
    return;
  }
  if (*in_x12 != *in_x11) {
                    /* WARNING: Could not recover jumptable at 0x00228de8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002781d0)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00223770. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002749b0)();
  return;
}


