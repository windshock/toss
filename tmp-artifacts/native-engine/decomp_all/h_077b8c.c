// entry=0x77b8c

void H772dc(undefined8 param_1)

{
  size_t __n;
  undefined **ppuVar1;
  char cVar2;
  byte bVar3;
  char *pcVar4;
  undefined8 in_x6;
  char *in_x7;
  ulong uVar5;
  long lVar6;
  ulong in_x10;
  long unaff_x19;
  ulong unaff_x20;
  char *unaff_x25;
  ulong unaff_x28;
  
  if (((in_x10 & 1) == 0) &&
     (cVar2 = *unaff_x25, bVar3 = -(char)DAT_00276da8, unaff_x25 = in_x7,
     cVar2 != (byte)((bVar3 ^ 0xaa) + (bVar3 & 0x2a) * '\x02'))) {
    ppuVar1 = &PTR_LAB_00279bf8;
    if (*in_x7 != '\n') {
      ppuVar1 = &PTR_LAB_00275010;
    }
                    /* WARNING: Could not recover jumptable at 0x001764b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(param_1,in_x6);
    return;
  }
  pcVar4 = unaff_x25;
  if (unaff_x25[-1] != '\n') {
    do {
      unaff_x25 = pcVar4 + 1;
      cVar2 = *pcVar4;
      bVar3 = -(char)DAT_00276da8;
      pcVar4 = unaff_x25;
    } while (cVar2 != (byte)((bVar3 ^ 0xaa) + (bVar3 & 0x2a) * '\x02'));
  }
  uVar5 = (unaff_x28 | -(long)unaff_x25) * 2 - (unaff_x28 ^ -(long)unaff_x25);
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
  memmove(&stack0x00000364,unaff_x25,__n);
                    /* WARNING: Could not recover jumptable at 0x00171748. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027a7b8)();
  return;
}


