// entry=0x156f84

void thunk_FUN_00256a84(void)

{
  uint uVar1;
  
  uVar1 = -(int)DAT_00277160;
                    /* WARNING: Could not recover jumptable at 0x00256af4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00275658)
            [(long)(int)(-0x5f63dc0 - (-(int)DAT_00277160 ^ 0xffffffffU)) * 0x57 +
             (long)(int)((uVar1 ^ 0xfa09c247) + (uVar1 & 0xfa09c247) * 2)])();
  return;
}


