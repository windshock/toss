// req=0xd1d30 entry=0xd1d30

void HND_d1d30(ulong param_1)

{
  undefined8 *puVar1;
  long in_x11;
  long in_x12;
  undefined1 *in_x13;
  undefined1 in_w14;
  
  *in_x13 = in_w14;
  puVar1 = (undefined8 *)(in_x12 + 0xb0);
  if ((param_1 | 1) + (param_1 & 1) != 0x33) {
    puVar1 = (undefined8 *)(in_x11 + 0x248);
  }
                    /* WARNING: Could not recover jumptable at 0x001d1d54. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*puVar1)();
  return;
}


