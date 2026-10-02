// entry=0x16c208

void H16bed8(ulong param_1)

{
  undefined **ppuVar1;
  
  ppuVar1 = &PTR_LAB_002858b8;
  if ((param_1 & 1) == 0) {
    ppuVar1 = &PTR_LAB_00275198;
  }
                    /* WARNING: Could not recover jumptable at 0x0026befc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


