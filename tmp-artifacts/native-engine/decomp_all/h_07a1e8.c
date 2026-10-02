// entry=0x7a1e8

void H7a1e8(void)

{
  undefined **ppuVar1;
  uint in_w8;
  uint in_w9;
  
  ppuVar1 = &PTR_LAB_002767a8;
  if (in_w8 <= in_w9) {
    ppuVar1 = &PTR_LAB_00277240;
  }
                    /* WARNING: Could not recover jumptable at 0x0017a20c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


