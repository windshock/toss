// entry=0xb902c

void Hb902c(ulong param_1)

{
  undefined **ppuVar1;
  ulong in_x9;
  byte in_w10;
  
  ppuVar1 = &PTR_LAB_00281ec8;
  if ((in_x9 < param_1 & in_w10) == 0 && ((in_x9 < param_1 ^ in_w10) & 1) == 0) {
    ppuVar1 = &PTR_LAB_00280100;
  }
                    /* WARNING: Could not recover jumptable at 0x001b9064. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


