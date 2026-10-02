// entry=0x126c38

void H126c38(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  bool bVar1;
  undefined **ppuVar2;
  ulong uVar3;
  ulong in_x14;
  ulong uVar4;
  ulong in_x15;
  ulong uVar5;
  ulong in_x16;
  long in_x17;
  long unaff_x19;
  long unaff_x26;
  
  do {
    uVar4 = param_3;
    uVar3 = 0;
    if (in_x16 != 0) {
      uVar3 = in_x15 / in_x16;
    }
    *(undefined1 *)
     (*(long *)(unaff_x19 + 0x530) +
      ((-DAT_00281e58 ^ 0x42c7e286cc88cf42U) + (-DAT_00281e58 & 0x42c7e286cc88cf42U) * 2) * 0x14 +
     uVar4) = (&DAT_0027ad10)
              [(in_x15 ^ -(uVar3 * in_x16)) + (in_x15 & -(uVar3 * in_x16)) * 2 +
               ((-DAT_00281e58 ^ 0x42c7e286cc88cf42U) + (-DAT_00281e58 & 0x42c7e286cc88cf42U) * 2) *
               0x10];
    bVar1 = in_x16 <= in_x15;
    param_3 = (uVar4 | 1) * 2 - (uVar4 ^ 1);
    in_x15 = uVar3;
  } while (bVar1);
  if (in_x14 < 0x400) {
    uVar4 = (long)(uVar4 << 0x20) >>
            ((-DAT_00281e58 ^ 0xcf62U) + (-DAT_00281e58 & 0xcf62U) * 2 & 0x3f);
    uVar3 = uVar4;
    if ((long)((-DAT_00281e58 | 0x42c7e286cc88cf42U) + (-DAT_00281e58 & 0x42c7e286cc88cf42U)) <=
        (long)uVar4) {
      uVar3 = 0;
    }
    uVar5 = (uVar4 | -uVar3) * 2 - (uVar4 ^ -uVar3);
    uVar3 = (-DAT_00281e58 | 0x42c7e286cc88d341U) * 2 - (-DAT_00281e58 ^ 0x42c7e286cc88d341U);
    uVar3 = (uVar3 | -in_x14) + (uVar3 & -in_x14);
    if (uVar3 <= uVar5) {
      uVar5 = uVar3;
    }
    uVar3 = (uVar5 | 1) * 2 - (uVar5 ^ 1);
    if ((-DAT_00281e58 | 0x42c7e286cc88cf52U) + (-DAT_00281e58 & 0x42c7e286cc88cf52U) <= uVar3) {
                    /* WARNING: Could not recover jumptable at 0x00216ea8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_002771e8)
                (param_1,(uVar3 ^ 0x42c7e286cc88cf31 - (-DAT_00281e58 ^ 0xffffffffffffffffU) ^
                                  0xffffffffffffffff) & uVar3);
      return;
    }
    *(undefined1 *)(unaff_x26 + in_x14) = *(undefined1 *)(*(long *)(unaff_x19 + 0x530) + uVar4);
    ppuVar2 = &PTR_LAB_00281610;
    if (0 < (long)uVar4 ==
        (-DAT_00281e58 | 0x42c7e286cc88d342U) * 2 - (-DAT_00281e58 ^ 0x42c7e286cc88d342U) <=
        (in_x14 ^ 1) + (in_x14 & 1) * 2 || 0 >= (long)uVar4) {
      ppuVar2 = &PTR_LAB_0027a3d8;
    }
                    /* WARNING: Could not recover jumptable at 0x00212fcc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)();
    return;
  }
  if (in_x14 < 0x400 ==
      (*(char *)(in_x17 + (-DAT_00281e58 | 0x42c7e286cc88cf43U) +
                          (-DAT_00281e58 & 0x42c7e286cc88cf43U)) == '\0') || in_x14 >= 0x400) {
    if (0x3fe < in_x14) {
      in_x14 = 0x3ff;
    }
                    /* WARNING: Could not recover jumptable at 0x00217020. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00275110)(param_1,in_x14);
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0021cdd4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027a548)();
  return;
}


