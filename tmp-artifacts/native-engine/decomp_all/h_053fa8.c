// entry=0x53fa8

void thunk_FUN_0014ae5c(void)

{
  undefined **ppuVar1;
  ulong in_x14;
  
  ppuVar1 = &PTR_H525e8_0027d658;
  if (0x3ff < in_x14) {
    ppuVar1 = &PTR_LAB_00274268;
  }
                    /* WARNING: Could not recover jumptable at 0x00151da4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


