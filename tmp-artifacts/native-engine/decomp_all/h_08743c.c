// entry=0x8743c

void H8743c(void)

{
  undefined8 in_x5;
  undefined8 *in_x7;
  undefined8 *in_x15;
  undefined8 in_x16;
  undefined8 in_x17;
  long unaff_x29;
  
  *in_x7 = in_x5;
  *(undefined8 *)(unaff_x29 + -0xf8) = in_x16;
  *(undefined8 *)(unaff_x29 + -0xa0) = in_x17;
  **(undefined8 **)(unaff_x29 + -0x1a8) = *in_x15;
                    /* WARNING: Could not recover jumptable at 0x0018ba54. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*DAT_00280528)();
  return;
}


