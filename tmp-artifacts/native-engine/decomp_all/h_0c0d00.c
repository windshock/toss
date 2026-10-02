// entry=0xc0d00

void FUN_001c0d00(void)

{
  uint uVar1;
  
  uVar1 = -(int)DAT_00280bb0;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(-0x3a6bd061 - (-(int)DAT_00280bb0 ^ 0xffffffffU)) * 300 +
             (long)(int)((uVar1 ^ 0xc5942fae) + (uVar1 & 0xc5942fae) * 2)])();
                    /* WARNING: Could not recover jumptable at 0x001c0ea4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00276340)
            [(long)(int)((-(int)DAT_00280bb0 | 0xc5942fa0U) + (-(int)DAT_00280bb0 & 0xc5942fa0U)) *
             0x6f])();
  return;
}


