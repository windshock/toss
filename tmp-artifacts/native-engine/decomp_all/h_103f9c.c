// entry=0x103f9c

void H103f9c(ulong param_1)

{
  undefined **ppuVar1;
  undefined1 in_w9;
  
  (&stack0x00000010)[param_1] = in_w9;
  ppuVar1 = &PTR_H10361c_0027d960;
  if ((param_1 ^ 1) + (param_1 & 1) * 2 != 0x100) {
    ppuVar1 = &PTR_H103f9c_0027eeb0;
  }
                    /* WARNING: Could not recover jumptable at 0x00203fec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


