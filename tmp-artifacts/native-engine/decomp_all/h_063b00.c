// entry=0x63b00

void H63b00(ulong param_1)

{
  undefined **ppuVar1;
  undefined1 in_w9;
  long in_x11;
  
  *(undefined1 *)(in_x11 + param_1) = in_w9;
  ppuVar1 = &PTR_LAB_002759e0;
  if ((param_1 ^ 1) + (param_1 & 1) * 2 != 0x100) {
    ppuVar1 = &PTR_H63b00_0027fa18;
  }
                    /* WARNING: Could not recover jumptable at 0x00163b4c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


