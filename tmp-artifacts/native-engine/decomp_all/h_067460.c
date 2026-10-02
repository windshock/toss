// entry=0x67460

void thunk_FUN_00167858(void)

{
  uint uVar1;
  uint uVar2;
  
  uVar1 = -(int)DAT_00274f18;
  uVar2 = -(int)DAT_00274f18;
                    /* WARNING: Could not recover jumptable at 0x001678c4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_0027de68)
            [(long)(int)((uVar2 | 0x9c1eff81) * 2 - (uVar2 ^ 0x9c1eff81)) * 0x78 +
             (long)(int)((uVar1 | 0x9c1eff99) + (uVar1 & 0x9c1eff99))])();
  return;
}


