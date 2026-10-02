// entry=0xe7040

void He7040(ulong param_1,undefined8 param_2,undefined8 param_3)

{
  undefined **ppuVar1;
  ulong uVar2;
  long in_x9;
  long in_x12;
  char in_w14;
  char *in_x15;
  
  if (in_w14 != *in_x15) {
                    /* WARNING: Could not recover jumptable at 0x001e7f84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027aa10)();
    return;
  }
  uVar2 = *(ulong *)(in_x9 + in_x12 * 0x18 + 8);
  ppuVar1 = &PTR_LAB_0027f4c8;
  if ((uVar2 | param_1) * 2 - (uVar2 ^ param_1) != 0) {
    ppuVar1 = &PTR_He6560_0027fca8;
  }
                    /* WARNING: Could not recover jumptable at 0x001e62b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(param_2,param_3,0);
  return;
}


