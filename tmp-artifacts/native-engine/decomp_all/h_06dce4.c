// entry=0x6dce4

void H6dce4(undefined8 param_1,ulong param_2)

{
  undefined **ppuVar1;
  
  ppuVar1 = &PTR_LAB_00282748;
  if (0x1ff < param_2) {
    ppuVar1 = &PTR_H6c5c8_002801d8;
  }
                    /* WARNING: Could not recover jumptable at 0x0016dd08. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


