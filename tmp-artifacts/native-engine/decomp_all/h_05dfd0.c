// entry=0x5dfd0

void H58778(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint in_w14;
  uint in_w16;
  long in_x17;
  long unaff_x19;
  
  uVar2 = 0;
  if (in_w14 != 0) {
    uVar2 = in_w16 / in_w14;
  }
  *(undefined1 *)(*(long *)(unaff_x19 + 0x280) + in_x17) =
       (&DAT_0027ad10)[(in_w16 ^ -(uVar2 * in_w14)) + (in_w16 & -(uVar2 * in_w14)) * 2];
  ppuVar1 = &PTR_LAB_00285990;
  if (in_w14 <= in_w16) {
    ppuVar1 = &PTR_H58778_0027f1f8;
  }
                    /* WARNING: Could not recover jumptable at 0x001587e4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


