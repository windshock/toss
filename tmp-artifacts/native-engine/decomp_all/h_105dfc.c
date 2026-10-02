// entry=0x105dfc

void H105dfc(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint in_w10;
  uint in_w11;
  long in_x13;
  long unaff_x19;
  
  uVar2 = 0;
  if (in_w10 != 0) {
    uVar2 = in_w11 / in_w10;
  }
  *(undefined1 *)(unaff_x19 + in_x13) =
       (&DAT_0027ad10)[(in_w11 | -(uVar2 * in_w10)) * 2 - (in_w11 ^ -(uVar2 * in_w10))];
  ppuVar1 = &PTR_LAB_00285dd8 +
            (int)((-(int)DAT_00280ba0 | 0x9603494aU) + (-(int)DAT_00280ba0 & 0x9603494aU));
  if (in_w10 <= in_w11) {
    ppuVar1 = &PTR_H105dfc_0027fb60;
  }
                    /* WARNING: Could not recover jumptable at 0x00205ebc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


