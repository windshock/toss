// entry=0x102b58

void H102b58(void)

{
  uint uVar1;
  
  uVar1 = -(int)DAT_00281e20;
                    /* WARNING: Could not recover jumptable at 0x00202bd8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027d250)
            ((&PTR_FUN_0027c1e0)
             [(long)(int)((uVar1 | 0x9cf614cb) + (uVar1 & 0x9cf614cb)) * 300 +
              (long)(int)(-0x6309ea1b - (-(int)DAT_00281e20 ^ 0xffffffffU))],DAT_00286248);
  return;
}


