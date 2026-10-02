// entry=0x756f4

void H73310(undefined8 param_1)

{
  size_t __n;
  undefined **ppuVar1;
  char cVar2;
  byte bVar3;
  char *__src;
  char *pcVar4;
  undefined8 in_x6;
  char *in_x7;
  char in_w8;
  ulong uVar5;
  long lVar6;
  long unaff_x19;
  ulong unaff_x20;
  char *unaff_x25;
  ulong unaff_x28;
  
  bVar3 = -(char)DAT_00276da8;
  __src = unaff_x25;
  if ((in_w8 != (byte)((bVar3 | 0xaa) + (bVar3 & 0xaa))) && (__src = in_x7, *unaff_x25 != '\n')) {
    ppuVar1 = &PTR_LAB_00279bf8 +
              (long)(int)((-(int)DAT_00276da8 ^ 0x3994d2a0U) +
                         (-(int)DAT_00276da8 & 0x3994d2a0U) * 2) * 0x55;
    if (*in_x7 != '\n') {
      ppuVar1 = &PTR_LAB_002857b0;
    }
                    /* WARNING: Could not recover jumptable at 0x00177890. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(param_1,in_x6);
    return;
  }
  pcVar4 = __src;
  if (__src[-1] != '\n') {
    do {
      __src = pcVar4 + 1;
      cVar2 = *pcVar4;
      bVar3 = -(char)DAT_00276da8;
      pcVar4 = __src;
    } while (cVar2 != (byte)((bVar3 ^ 0xaa) + (bVar3 & 0x2a) * '\x02'));
  }
  uVar5 = (unaff_x28 | -(long)__src) * 2 - (unaff_x28 ^ -(long)__src);
  __n = (uVar5 ^ unaff_x20) + (uVar5 & unaff_x20) * 2;
  if (__n == 0) {
    CallSupervisor(0);
    if ((int)unaff_x19 < 1) {
      lVar6 = 0;
    }
    else {
      lVar6 = (unaff_x19 << (-DAT_00276da8 & 0x3fU)) >> 0x20;
    }
    ppuVar1 = &PTR_LAB_00275ba0;
    if (lVar6 != (-DAT_00276da8 | 0x1a0a294d3994d2a0U) * 2 - (-DAT_00276da8 ^ 0x1a0a294d3994d2a0U))
    {
      ppuVar1 = &PTR_LAB_00276858;
    }
                    /* WARNING: Could not recover jumptable at 0x001718a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  memmove(&stack0x00000364,__src,__n);
                    /* WARNING: Could not recover jumptable at 0x00171748. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027a7b8)();
  return;
}


