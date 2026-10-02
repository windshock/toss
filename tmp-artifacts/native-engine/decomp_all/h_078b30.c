// entry=0x78b30

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void H78b30(void)

{
  undefined **ppuVar1;
  bool bVar2;
  ulong uVar3;
  ulong uVar4;
  ulong in_x14;
  long lVar5;
  ulong in_x15;
  ulong in_x16;
  long in_x17;
  undefined1 auVar6 [16];
  
  uVar3 = (in_x16 ^ 0xf) & in_x16;
  uVar4 = 0;
  do {
    auVar6 = a64_TBL(ZEXT816(0),*(undefined1 (*) [16])(&stack0x000004ed + (in_x15 - uVar4)),
                     _DAT_0012c6c0);
    *(long *)((long)(&stack0x00000468 +
                    (uVar4 | in_x14) + (uVar4 & in_x14) + (0x1a0a294d3994d2a0 - DAT_00276da8) * 0x80
                    ) + 8) = auVar6._8_8_;
    *(long *)(&stack0x00000468 +
             (uVar4 | in_x14) + (uVar4 & in_x14) + (0x1a0a294d3994d2a0 - DAT_00276da8) * 0x80) =
         auVar6._0_8_;
    uVar4 = (uVar4 - ((-DAT_00276da8 | 0x1a0a294d3994d2b0U) + (-DAT_00276da8 & 0x1a0a294d3994d2b0U)
                     ^ 0xffffffffffffffff)) - 1;
  } while (uVar4 != uVar3);
  lVar5 = (in_x15 | -uVar3) + (in_x15 & -uVar3);
  uVar4 = (uVar3 | in_x14) * 2 - (uVar3 ^ in_x14);
  if (in_x16 != uVar3) {
    do {
      (&stack0x00000468)[uVar4] = (&stack0x000004fc)[lVar5];
      uVar3 = (-DAT_00276da8 | 0x1a0a294d3994d2a1U) * 2 - (-DAT_00276da8 ^ 0x1a0a294d3994d2a1U);
      uVar4 = (uVar4 | uVar3) * 2 - (uVar4 ^ uVar3);
      bVar2 = 0 < lVar5;
      lVar5 = lVar5 + -1;
    } while (bVar2 != (-DAT_00276da8 | 0x1a0a294d3994d320U) + (-DAT_00276da8 & 0x1a0a294d3994d320U)
                      <= uVar4 && bVar2);
  }
  bVar2 = uVar4 < (-DAT_00276da8 | 0x1a0a294d3994d320U) * 2 - (-DAT_00276da8 ^ 0x1a0a294d3994d320U);
  ppuVar1 = &PTR_LAB_0027d718;
  if (bVar2 == (*(char *)(in_x17 + 1) == '\0') || !bVar2) {
    ppuVar1 = &PTR_LAB_00280c38;
  }
                    /* WARNING: Could not recover jumptable at 0x00178e2c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


