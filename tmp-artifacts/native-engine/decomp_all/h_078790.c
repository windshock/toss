// entry=0x78790

void H78790(ulong param_1)

{
  char cVar1;
  bool bVar2;
  long in_x9;
  ulong in_x10;
  ulong uVar3;
  
  do {
    (&stack0x00000468)[param_1] = (&stack0x000004e8)[in_x10];
    uVar3 = (-DAT_00276da8 | 0x1a0a294d3994d2a1U) * 2 - (-DAT_00276da8 ^ 0x1a0a294d3994d2a1U);
    param_1 = (param_1 | uVar3) * 2 - (param_1 ^ uVar3);
    bVar2 = 0 < (long)in_x10;
    in_x10 = -(in_x10 ^ 0xffffffffffffffff) - 2;
  } while (bVar2 != 0x7f < param_1 && bVar2);
  while( true ) {
    cVar1 = *(char *)(in_x9 + 1);
    bVar2 = param_1 < 0x1a0a294d3994d31f - (-DAT_00276da8 ^ 0xffffffffffffffffU);
    if (bVar2 == (cVar1 == '\0') || !bVar2) {
                    /* WARNING: Could not recover jumptable at 0x00176388. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*DAT_0027f388)();
      return;
    }
    bVar2 = cVar1 == (byte)((-(char)DAT_00276da8 ^ 0xc5U) + (-(char)DAT_00276da8 & 0x45U) * '\x02');
    if (!bVar2 && bVar2) break;
    (&stack0x00000468)[param_1] = cVar1;
    param_1 = (param_1 | 1) + (param_1 & 1);
    in_x9 = in_x9 + 1;
  }
                    /* WARNING: Could not recover jumptable at 0x00172e60. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027a718)();
  return;
}


