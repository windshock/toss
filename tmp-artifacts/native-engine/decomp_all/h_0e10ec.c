// entry=0xe10ec

void thunk_FUN_001dfa04(void)

{
  uint uVar1;
  undefined8 *unaff_x20;
  
  uVar1 = -(int)DAT_00274f48;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(-0x34078755 - (-(int)DAT_00274f48 ^ 0xffffffffU)) * 300 +
             (long)(int)((uVar1 ^ 0xcbf878fc) + (uVar1 & 0xcbf878fc) * 2)])();
  *unaff_x20 = 0;
                    /* WARNING: Could not recover jumptable at 0x001e0af4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00277fc0)();
  return;
}


