// entry=0x16d7cc

void H16d7cc(void)

{
  undefined **ppuVar1;
  ulong uVar2;
  ulong uVar3;
  int in_w8;
  ulong unaff_x19;
  ulong unaff_x21;
  
  if (in_w8 != 0) {
    uVar2 = (unaff_x19 << 1 | 0x20) - (unaff_x19 ^ 0x10);
    uVar3 = 0;
    if (unaff_x21 != 0) {
      uVar3 = uVar2 / unaff_x21;
    }
    ppuVar1 = &PTR_LAB_0027aef8;
    if (uVar2 != uVar3 * unaff_x21) {
      ppuVar1 = &PTR_LAB_0027aa40;
    }
                    /* WARNING: Could not recover jumptable at 0x0026d7a0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0026c4d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002769c8)();
  return;
}


