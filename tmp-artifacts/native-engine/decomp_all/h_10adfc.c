// entry=0x10adfc

void H10a34c(undefined8 param_1)

{
  undefined **ppuVar1;
  char in_w11;
  long unaff_x29;
  
  ppuVar1 = (undefined **)
            (&DAT_00279078 + (long)(int)(-0x69fcb6bb - (-(int)DAT_00280ba0 ^ 0xffffffffU)) * 0x6a);
  if (in_w11 != '\n') {
    ppuVar1 = &PTR_LAB_0027bf98;
  }
                    /* WARNING: Could not recover jumptable at 0x0020b294. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(param_1,*(undefined8 *)(unaff_x29 + -0xb8));
  return;
}


