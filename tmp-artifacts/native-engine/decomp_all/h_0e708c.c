// entry=0xe708c

void He708c(ulong param_1)

{
  undefined **ppuVar1;
  ulong in_x12;
  
  ppuVar1 = &PTR_LAB_0027f418;
  if ((in_x12 ^ param_1) + (in_x12 & param_1) * 2 !=
      (-DAT_002765f0 ^ 0xeb98be6e7b9ee79eU) + (-DAT_002765f0 & 0xeb98be6e7b9ee79eU) * 2) {
    ppuVar1 = &PTR_He6560_0027fca8;
  }
                    /* WARNING: Could not recover jumptable at 0x001e59f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


