// entry=0x72154

void H72154(ulong param_1)

{
  bool bVar1;
  undefined **ppuVar2;
  uint uVar3;
  byte in_w3;
  uint uVar4;
  char in_w12;
  long lVar5;
  uint unaff_w21;
  
  uVar4 = 10;
  if (in_w12 != 'd') {
    uVar4 = 0x10;
  }
  if (((in_w3 ^ in_w12 != 'd') & in_w3 & 1) != 0) {
    (&stack0x00000468)[param_1] =
         (-(char)DAT_00276da8 | 0xcdU) * '\x02' - (-(char)DAT_00276da8 ^ 0xcdU);
                    /* WARNING: Could not recover jumptable at 0x00172d44. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00282c90)();
    return;
  }
  lVar5 = 0;
  do {
    uVar3 = 0;
    if (uVar4 != 0) {
      uVar3 = unaff_w21 / uVar4;
    }
    (&stack0x000004fc)[lVar5] =
         (&DAT_0027ad10)[(unaff_w21 ^ -(uVar3 * uVar4)) + (unaff_w21 & -(uVar3 * uVar4)) * 2];
    lVar5 = (lVar5 - ((-DAT_00276da8 | 0x1a0a294d3994d2a1U) + (-DAT_00276da8 & 0x1a0a294d3994d2a1U)
                     ^ 0xffffffffffffffff)) + -1;
    bVar1 = uVar4 <= unaff_w21;
    unaff_w21 = uVar3;
  } while (bVar1);
  ppuVar2 = &PTR_LAB_00275e28;
  if (0x7f < param_1) {
    ppuVar2 = &PTR_LAB_002797e0;
  }
                    /* WARNING: Could not recover jumptable at 0x001710a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


