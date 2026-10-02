// entry=0x119410

void H119410(void)

{
  char cVar1;
  ushort uVar2;
  bool bVar3;
  ulong uVar4;
  ulong uVar5;
  ulong in_x10;
  long in_x13;
  uint uVar6;
  ulong in_x14;
  long unaff_x19;
  int *unaff_x23;
  long lVar7;
  ulong *unaff_x26;
  long *unaff_x27;
  undefined8 *unaff_x30;
  
  do {
    *(undefined1 *)
     (*(long *)(unaff_x19 + 0x528) +
      (0x42c7e286cc88cf41 - (-DAT_00281e58 ^ 0xffffffffffffffffU)) * 0x400 + in_x10) =
         *(undefined1 *)(*(long *)(unaff_x19 + 0x530) + in_x14);
    in_x10 = (in_x10 ^ 1) + (in_x10 & 1) * 2;
    bVar3 = 0 < (long)in_x14;
    in_x14 = (in_x14 ^ 0xffffffffffffffff) + in_x14 * 2;
  } while (bVar3 != 0x3ff < in_x10 && bVar3);
  uVar6 = (uint)DAT_00281e58;
  while( true ) {
    cVar1 = *(char *)(in_x13 + 1);
    bVar3 = in_x10 < (-DAT_00281e58 ^ 0x42c7e286cc88d342U) +
                     (-DAT_00281e58 & 0x42c7e286cc88d342U) * 2;
    if (bVar3 == (cVar1 == (byte)((-(char)DAT_00281e58 | 0x42U) + (-(char)DAT_00281e58 & 0x42U))) ||
        !bVar3) break;
    if ((((uint)(cVar1 == '%') ^ (uVar6 ^ 1) & 1) & (uint)(cVar1 == '%')) != 0) {
                    /* WARNING: Could not recover jumptable at 0x00229f50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00278960)();
      return;
    }
    *(char *)(*(long *)(unaff_x19 + 0x528) + in_x10) = cVar1;
    uVar4 = (-DAT_00281e58 ^ 0x42c7e286cc88cf43U) + (-DAT_00281e58 & 0x42c7e286cc88cf43U) * 2;
    in_x10 = (in_x10 ^ uVar4) + (in_x10 & uVar4) * 2;
    in_x13 = in_x13 + 1;
  }
  if (in_x10 < (-DAT_00281e58 ^ 0x42c7e286cc88d341U) + (-DAT_00281e58 & 0x42c7e286cc88d341U) * 2) {
                    /* WARNING: Could not recover jumptable at 0x0022466c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00280148)();
    return;
  }
  *(undefined1 *)(*(long *)(unaff_x19 + 0x528) + 0x3ff) = 0;
  CallSupervisor(0);
  if ((-DAT_00281e58 | 0x42c7e286cc88cedeU) + (-DAT_00281e58 & 0x42c7e286cc88cedeU) <
      0xfffffffffffff001) {
                    /* WARNING: Could not recover jumptable at 0x00227d38. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00280098)();
    return;
  }
  uVar4 = *unaff_x26;
  if (uVar4 == 0) {
    CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x0021c5fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00283020)
              (((long)*unaff_x23 << 0x20) >>
               ((-DAT_00281e58 ^ 0xcf62U) + (-DAT_00281e58 & 0xcf62U) * 2 & 0x3f));
    return;
  }
  lVar7 = *unaff_x27;
  uVar2 = *(ushort *)(lVar7 + 0x10);
  *unaff_x27 = lVar7 + (ulong)uVar2;
  uVar5 = -(ulong)uVar2;
  *unaff_x26 = (uVar4 | uVar5) * 2 - (uVar4 ^ uVar5);
  *unaff_x30 = *(undefined8 *)(lVar7 + 8);
  if (lVar7 != 0) {
                    /* WARNING: Could not recover jumptable at 0x00218e94. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027a500)();
    return;
  }
  CallSupervisor(0);
  uVar6 = -(int)DAT_00281e58;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar6 ^ 0xcc88cf42) + (uVar6 & 0xcc88cf42) * 2) * 300 +
             (long)(int)(-0x3377306f - (-(int)DAT_00281e58 ^ 0xffffffffU))])();
                    /* WARNING: Could not recover jumptable at 0x00232c78. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00281c68)();
  return;
}


