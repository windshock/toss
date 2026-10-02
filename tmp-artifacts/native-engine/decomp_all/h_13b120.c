// entry=0x13b120

void thunk_FUN_0024045c(void)

{
  uint uVar1;
  uint uVar2;
  
  uVar1 = -(int)DAT_00279eb0;
  uVar2 = -(int)DAT_00279eb0;
                    /* WARNING: Could not recover jumptable at 0x002404c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027b9c0)
            (&PTR_FUN_0027c1e0 +
             (long)(int)((uVar2 | 0x8692046) + (uVar2 & 0x8692046)) * 300 +
             (long)(int)((uVar1 ^ 0x8692076) + (uVar1 & 0x8692076) * 2));
  return;
}


