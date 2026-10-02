// entry=0x78ffc

void H78ffc(void)

{
  size_t __n;
  undefined **ppuVar1;
  char cVar2;
  byte bVar3;
  uint uVar4;
  char *pcVar5;
  uint in_w8;
  ulong uVar6;
  long lVar7;
  uint uVar8;
  ulong in_x9;
  byte in_w10;
  uint uVar9;
  int in_w13;
  long unaff_x19;
  ulong unaff_x20;
  char *in_stack_00000000;
  byte *in_stack_00000008;
  
  uVar9 = -(int)DAT_00276da8;
  uVar9 = in_w8 >> (ulong)((uVar9 | 0xd2a7) * 2 - (uVar9 ^ 0xd2a7) & 0x1f);
  uVar9 = (uVar9 ^ 0xffffffe0) & uVar9;
  uVar9 = in_w13 << 5 & uVar9 | in_w13 << 5 ^ uVar9;
  uVar9 = (uVar9 | in_w10) & (uVar9 & in_w10 ^ 0xffffffff);
  bVar3 = *in_stack_00000008;
  if (bVar3 != 10) {
    uVar8 = (uint)(in_x9 >> 7) & 0x1ffffff;
    uVar4 = -(int)DAT_00276da8;
    uVar8 = (uVar8 ^ (uVar4 | 0x3994d2bf) + (uVar4 & 0x3994d2bf) ^ 0xffffffff) & uVar8;
    uVar9 = uVar9 << 5 & uVar8 | uVar9 << 5 ^ uVar8;
    uVar9 = (uVar9 ^ 0xffffffff) & (uint)bVar3 | uVar9 & (bVar3 ^ 0xffffffff);
  }
  if (uVar9 == 0xd0359aa) {
                    /* WARNING: Could not recover jumptable at 0x001773a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00281f40)();
    return;
  }
  pcVar5 = in_stack_00000000;
  if (in_stack_00000000[-1] != '\n') {
    do {
      in_stack_00000000 = pcVar5 + 1;
      cVar2 = *pcVar5;
      pcVar5 = in_stack_00000000;
    } while (cVar2 != (byte)((-(char)DAT_00276da8 ^ 0xaaU) + (-(char)DAT_00276da8 & 0x2aU) * '\x02')
            );
  }
  uVar6 = ((ulong)&stack0x00000364 | -(long)in_stack_00000000) * 2 -
          ((ulong)&stack0x00000364 ^ -(long)in_stack_00000000);
  __n = (uVar6 ^ unaff_x20) + (uVar6 & unaff_x20) * 2;
  if (__n == 0) {
    CallSupervisor(0);
    if ((int)unaff_x19 < 1) {
      lVar7 = 0;
    }
    else {
      lVar7 = (unaff_x19 << (-DAT_00276da8 & 0x3fU)) >> 0x20;
    }
    ppuVar1 = &PTR_LAB_00275ba0;
    if (lVar7 != (-DAT_00276da8 | 0x1a0a294d3994d2a0U) * 2 - (-DAT_00276da8 ^ 0x1a0a294d3994d2a0U))
    {
      ppuVar1 = &PTR_LAB_00276858;
    }
                    /* WARNING: Could not recover jumptable at 0x001718a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  memmove(&stack0x00000364,in_stack_00000000,__n);
                    /* WARNING: Could not recover jumptable at 0x00171748. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027a7b8)();
  return;
}


