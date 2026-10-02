// entry=0xc1cdc

void Hc190c(ulong param_1)

{
  undefined **ppuVar1;
  bool bVar2;
  char in_w9;
  ulong unaff_x19;
  
  bVar2 = in_w9 == (byte)((-(char)DAT_0027a2f0 ^ 0x28U) + (-(char)DAT_0027a2f0 & 0x28U) * '\x02');
  ppuVar1 = &PTR_LAB_0027e0a8 +
            (long)(int)((-(int)DAT_0027a2f0 ^ 0x8c8f2a08U) + (-(int)DAT_0027a2f0 & 0x8c8f2a08U) * 2)
            * 0x78;
  if ((unaff_x19 > param_1 || !bVar2) && unaff_x19 <= param_1 == bVar2) {
    ppuVar1 = &PTR_LAB_00275ce0;
  }
                    /* WARNING: Could not recover jumptable at 0x001c19e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


