// entry=0x70a2c

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void H70184(long param_1)

{
  undefined **ppuVar1;
  ulong in_x9;
  long in_x12;
  long in_x13;
  undefined1 auVar2 [16];
  
  auVar2 = a64_TBL(ZEXT816(0),
                   *(undefined1 (*) [16])
                    (&stack0x000004d9 + (in_x9 ^ -in_x13) + (in_x9 & -in_x13) * 2),_DAT_0012c6c0);
  *(long *)(&stack0x000000ec + in_x13 + param_1) = auVar2._8_8_;
  *(long *)(&stack0x000000e4 + in_x13 + param_1) = auVar2._0_8_;
  ppuVar1 = &PTR_LAB_0027f2c8;
  if (in_x13 + 0x10 != in_x12) {
    ppuVar1 = &PTR_LAB_0027f148 +
              (int)((-(int)DAT_00276da8 | 0x3994d2e9U) * 2 - (-(int)DAT_00276da8 ^ 0x3994d2e9U));
  }
                    /* WARNING: Could not recover jumptable at 0x0017021c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


