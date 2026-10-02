// entry=0x93b70

void FUN_00193b70(int param_1)

{
  undefined **ppuVar1;
  
  ppuVar1 = &PTR_LAB_002801c8 + (int)(-0x32cd5214 - (-(int)DAT_002835e0 ^ 0xffffffffU));
  if (param_1 != 0) {
    ppuVar1 = &PTR_LAB_002743e8;
  }
                    /* WARNING: Could not recover jumptable at 0x00193bc4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


