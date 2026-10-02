// entry=0x77818

void thunk_FUN_00175cd8(void)

{
  undefined **ppuVar1;
  bool bVar2;
  ulong uVar3;
  ulong in_x14;
  long in_x15;
  long in_x17;
  
  do {
    (&stack0x00000468)[in_x14] = (&stack0x000004fc)[in_x15];
    uVar3 = (-DAT_00276da8 | 0x1a0a294d3994d2a1U) * 2 - (-DAT_00276da8 ^ 0x1a0a294d3994d2a1U);
    in_x14 = (in_x14 | uVar3) * 2 - (in_x14 ^ uVar3);
    bVar2 = 0 < in_x15;
    in_x15 = in_x15 + -1;
  } while (bVar2 != (-DAT_00276da8 | 0x1a0a294d3994d320U) + (-DAT_00276da8 & 0x1a0a294d3994d320U) <=
                    in_x14 && bVar2);
  bVar2 = in_x14 < (-DAT_00276da8 | 0x1a0a294d3994d320U) * 2 - (-DAT_00276da8 ^ 0x1a0a294d3994d320U)
  ;
  ppuVar1 = &PTR_LAB_0027d718;
  if (bVar2 == (*(char *)(in_x17 + 1) == '\0') || !bVar2) {
    ppuVar1 = &PTR_LAB_00280c38;
  }
                    /* WARNING: Could not recover jumptable at 0x00178e2c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


