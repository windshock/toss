// entry=0x110c7c

void H110c7c(void)

{
  undefined **ppuVar1;
  int in_w3;
  int in_w8;
  
  ppuVar1 = &PTR_LAB_00274108 +
            (int)((-(int)DAT_00275290 | 0xf0825c70U) + (-(int)DAT_00275290 & 0xf0825c70U));
  if (in_w8 != in_w3) {
    ppuVar1 = &PTR_LAB_002826f0;
  }
                    /* WARNING: Could not recover jumptable at 0x00210a6c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(0);
  return;
}


