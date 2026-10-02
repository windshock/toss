// entry=0x126b60

void H126b60(void)

{
  undefined **ppuVar1;
  ushort uVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong in_x10;
  undefined4 in_w11;
  char in_w14;
  long unaff_x19;
  ulong unaff_x21;
  int *unaff_x23;
  long lVar6;
  ulong *unaff_x26;
  long *unaff_x27;
  byte unaff_w28;
  undefined8 *unaff_x30;
  
  if (((unaff_w28 ^ in_w14 != 'd') & unaff_w28 & 1) == 0) {
    *(undefined4 *)(unaff_x19 + 0x23c) = in_w11;
  }
  else {
    *(undefined1 *)(*(long *)(unaff_x19 + 0x528) + in_x10) = 0x2d;
    if ((-DAT_00281e58 | 0x42c7e286cc88d340U) + (-DAT_00281e58 & 0x42c7e286cc88d340U) < in_x10) {
      *(undefined1 *)
       (*(long *)(unaff_x19 + 0x528) +
       (-DAT_00281e58 ^ 0x42c7e286cc88d341U) + (-DAT_00281e58 & 0x42c7e286cc88d341U) * 2) = 0;
      CallSupervisor(0);
      if ((-DAT_00281e58 | 0x42c7e286cc88cedeU) + (-DAT_00281e58 & 0x42c7e286cc88cedeU) <
          0xfffffffffffff001) {
                    /* WARNING: Could not recover jumptable at 0x00227d38. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_H120860_00280098)();
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
      lVar6 = *unaff_x27;
      uVar2 = *(ushort *)(lVar6 + 0x10);
      *unaff_x27 = lVar6 + (ulong)uVar2;
      uVar5 = -(ulong)uVar2;
      *unaff_x26 = (uVar4 | uVar5) * 2 - (uVar4 ^ uVar5);
      *unaff_x30 = *(undefined8 *)(lVar6 + 8);
      if (lVar6 != 0) {
                    /* WARNING: Could not recover jumptable at 0x00218e94. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_0027a500)();
        return;
      }
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
    *(undefined4 *)(unaff_x19 + 0x23c) = in_w11;
    unaff_x21 = *(ulong *)(unaff_x19 + 0x248);
  }
  uVar4 = 10;
  if (in_w14 != 'd') {
    uVar4 = 0x10;
  }
  uVar5 = 0;
  if (uVar4 != 0) {
    uVar5 = unaff_x21 / uVar4;
  }
  *(undefined1 *)
   (*(long *)(unaff_x19 + 0x530) +
   ((-DAT_00281e58 ^ 0x42c7e286cc88cf42U) + (-DAT_00281e58 & 0x42c7e286cc88cf42U) * 2) * 0x14) =
       (&DAT_0027ad10)
       [(unaff_x21 ^ -(uVar5 * uVar4)) + (unaff_x21 & -(uVar5 * uVar4)) * 2 +
        (0x42c7e286cc88cf41 - (-DAT_00281e58 ^ 0xffffffffffffffffU)) * 0x10];
  ppuVar1 = &PTR_LAB_0027af38;
  if (uVar4 <= unaff_x21) {
    ppuVar1 = &PTR_LAB_00275310;
  }
                    /* WARNING: Could not recover jumptable at 0x002213b0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


