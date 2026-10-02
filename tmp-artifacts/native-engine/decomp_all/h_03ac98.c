// entry=0x3ac98

void H3ac98(void)

{
  undefined **ppuVar1;
  int in_w8;
  ulong in_x9;
  byte in_w10;
  
  ppuVar1 = &PTR_LAB_00279278;
  if ((&stack0x0000005c)
      [(in_x9 ^ 1) + (in_x9 & 1) * 2 +
       ((-DAT_0027ba40 ^ 0x517618022a074dbdU) + (-DAT_0027ba40 & 0x517618022a074dbdU) * 2) * 0x5c]
      != '\0') {
    ppuVar1 = &PTR_H3ac98_0027d210;
  }
                    /* WARNING: Could not recover jumptable at 0x0013ad38. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(((uint)in_w10 - (in_w8 * 10 ^ 0xffffffffU)) + -0x31);
  return;
}


