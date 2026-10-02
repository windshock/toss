// entry=0x76c2c

void H76c2c(void)

{
  size_t __n;
  undefined **ppuVar1;
  char cVar2;
  char *pcVar3;
  ulong uVar4;
  long lVar5;
  int in_w13;
  char *in_x14;
  long unaff_x19;
  ulong unaff_x20;
  ulong unaff_x28;
  
  if (in_w13 == 0xd0359aa) {
                    /* WARNING: Could not recover jumptable at 0x001773a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00281f40)();
    return;
  }
  pcVar3 = in_x14;
  if (in_x14[-1] != '\n') {
    do {
      in_x14 = pcVar3 + 1;
      cVar2 = *pcVar3;
      pcVar3 = in_x14;
    } while (cVar2 != (byte)((-(char)DAT_00276da8 ^ 0xaaU) + (-(char)DAT_00276da8 & 0x2aU) * '\x02')
            );
  }
  uVar4 = (unaff_x28 | -(long)in_x14) * 2 - (unaff_x28 ^ -(long)in_x14);
  __n = (uVar4 ^ unaff_x20) + (uVar4 & unaff_x20) * 2;
  if (__n == 0) {
    CallSupervisor(0);
    if ((int)unaff_x19 < 1) {
      lVar5 = 0;
    }
    else {
      lVar5 = (unaff_x19 << (-DAT_00276da8 & 0x3fU)) >> 0x20;
    }
    ppuVar1 = &PTR_LAB_00275ba0;
    if (lVar5 != (-DAT_00276da8 | 0x1a0a294d3994d2a0U) * 2 - (-DAT_00276da8 ^ 0x1a0a294d3994d2a0U))
    {
      ppuVar1 = &PTR_LAB_00276858;
    }
                    /* WARNING: Could not recover jumptable at 0x001718a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  memmove(&stack0x00000364,in_x14,__n);
                    /* WARNING: Could not recover jumptable at 0x00171748. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027a7b8)();
  return;
}


