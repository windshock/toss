// entry=0x78fbc

void H789e0(ulong param_1)

{
  ulong uVar1;
  long in_x9;
  long lVar2;
  long lVar3;
  ulong in_x11;
  ulong in_x12;
  
  lVar2 = in_x9 - (-in_x12 ^ 0xffffffffffffffff);
  uVar1 = (in_x12 | param_1) * 2 - (in_x12 ^ param_1);
  if (in_x11 != in_x12) {
    do {
      lVar3 = lVar2 + -1;
      (&stack0x000000e4)[uVar1] = (&stack0x000004e7)[lVar2];
      uVar1 = (uVar1 | 1) + (uVar1 & 1);
      lVar2 = lVar3;
    } while (0 < lVar3 != 0x7f < uVar1 && 0 < lVar3);
  }
                    /* WARNING: Could not recover jumptable at 0x00174cec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002764c8)();
  return;
}


