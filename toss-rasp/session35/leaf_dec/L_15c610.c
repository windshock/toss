// FUN_0015c5d4 @0015c5d4

void FUN_0015c5d4(void)

{
  undefined **ppuVar1;
  byte *in_x12;
  int in_w13;
  
  ppuVar1 = &PTR_FUN_00275420;
  if ((in_w13 * 0x1003f | (uint)*in_x12) + (in_w13 * 0x1003f & (uint)*in_x12) != -0x7dc9cd85) {
    ppuVar1 = &PTR_thunk_FUN_0015cf50_0027f148;
  }
                    /* WARNING: Could not recover jumptable at 0x0015c618. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}

