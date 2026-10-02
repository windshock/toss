// entry=0x77510

void H77510(void)

{
  undefined **ppuVar1;
  bool bVar2;
  ulong in_x14;
  long in_x16;
  
  bVar2 = in_x14 < (-DAT_00276da8 | 0x1a0a294d3994d320U) * 2 - (-DAT_00276da8 ^ 0x1a0a294d3994d320U)
  ;
  ppuVar1 = &PTR_LAB_0027d718;
  if (bVar2 == (*(char *)(in_x16 + 1) == '\0') || !bVar2) {
    ppuVar1 = &PTR_LAB_00280c38;
  }
                    /* WARNING: Could not recover jumptable at 0x00178e2c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


