// entry=0x71494

void thunk_FUN_001707c4(void)

{
  uint uVar1;
  
  memset(&DAT_00283608,0,9);
  uVar1 = -(int)DAT_00276da8;
  DAT_0029e5ec = (uVar1 | 0x3994d2a0) + (uVar1 & 0x3994d2a0);
                    /* WARNING: Could not recover jumptable at 0x00170f18. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_002790a8)[(long)(int)(0x3994d29f - (-(int)DAT_00276da8 ^ 0xffffffffU)) * 0x6a]
  )();
  return;
}


