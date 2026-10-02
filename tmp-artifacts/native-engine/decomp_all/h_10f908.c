// entry=0x10f908

void H10f908(ulong param_1)

{
  undefined **ppuVar1;
  
  ppuVar1 = &PTR_LAB_00280a98;
  if ((param_1 & 1) == 0) {
    ppuVar1 = &PTR_H10f3d8_0027e0d8;
  }
                    /* WARNING: Could not recover jumptable at 0x0020f92c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


