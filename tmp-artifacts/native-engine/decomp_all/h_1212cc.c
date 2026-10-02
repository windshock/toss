// entry=0x1212cc

void H1212cc(void)

{
  undefined1 *puVar1;
  ushort uVar2;
  uint uVar3;
  void *__s;
  ulong uVar4;
  ulong uVar5;
  char *pcVar6;
  long unaff_x19;
  char *unaff_x20;
  long lVar7;
  int *unaff_x23;
  undefined8 unaff_x24;
  long unaff_x26;
  
  do {
    pcVar6 = unaff_x20;
    unaff_x20 = pcVar6 + 1;
  } while (*pcVar6 != '\0');
  lVar7 = *(long *)(unaff_x19 + 0x528);
  *(undefined8 *)(unaff_x19 + 0x7f8) = unaff_x24;
  puVar1 = (undefined1 *)(unaff_x26 + (int)(((int)pcVar6 - (-(int)unaff_x26 ^ 0xffffffffU)) + -1));
  *puVar1 = 0x25;
  puVar1[1] = 0x73;
  puVar1[2] = 0;
  __s = (void *)(lVar7 + (0x42c7e286cc88cf41 - (-DAT_00281e58 ^ 0xffffffffffffffffU)) * 0x400);
  *(void **)(unaff_x19 + 800) = __s;
  memset(__s,0,0x400);
  uVar4 = *(ulong *)(unaff_x23 + 2);
  if (uVar4 != 0) {
    lVar7 = *(long *)(unaff_x23 + 4);
    uVar2 = *(ushort *)(lVar7 + 0x10);
    *(ulong *)(unaff_x23 + 4) = lVar7 + (ulong)uVar2;
    uVar5 = -(ulong)uVar2;
    *(ulong *)(unaff_x23 + 2) = (uVar4 | uVar5) * 2 - (uVar4 ^ uVar5);
    *(undefined8 *)(unaff_x23 + 0x420) = *(undefined8 *)(lVar7 + 8);
    if (lVar7 == 0) {
      CallSupervisor(0);
      uVar3 = -(int)DAT_00281e58;
      (*(code *)(&PTR_FUN_0027c1e0)
                [(long)(int)((uVar3 ^ 0xcc88cf42) + (uVar3 & 0xcc88cf42) * 2) * 300 +
                 (long)(int)(-0x3377306f - (-(int)DAT_00281e58 ^ 0xffffffffU))])();
                    /* WARNING: Could not recover jumptable at 0x00232c78. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00281c68)();
      return;
    }
                    /* WARNING: Could not recover jumptable at 0x00218e94. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027a500)();
    return;
  }
  CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x0021c5fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00283020)
            (((long)*unaff_x23 << 0x20) >>
             ((-DAT_00281e58 ^ 0xcf62U) + (-DAT_00281e58 & 0xcf62U) * 2 & 0x3f),(long)*unaff_x23,
             unaff_x23 + 6,0x42c7e286cc88dfa9 - (-DAT_00281e58 ^ 0xffffffffffffffffU));
  return;
}


