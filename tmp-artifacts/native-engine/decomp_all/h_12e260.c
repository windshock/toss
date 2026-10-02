// entry=0x12e260

void H12e260(undefined8 param_1)

{
  undefined **ppuVar1;
  ulong in_x14;
  ulong in_x15;
  ulong in_x16;
  long in_x17;
  long unaff_x19;
  long unaff_x26;
  
  if ((in_x16 & 1) == 0) {
    *(undefined1 *)(unaff_x26 + in_x14) =
         *(undefined1 *)
          (*(long *)(unaff_x19 + 0x538) +
           ((-DAT_00281e58 | 0x42c7e286cc88cf42U) + (-DAT_00281e58 & 0x42c7e286cc88cf42U)) * 0x14 +
          in_x15);
    ppuVar1 = &PTR_H120564_00280690;
    if (0 < (long)in_x15 == 0x3ff < (in_x14 | 1) * 2 - (in_x14 ^ 1) || (long)in_x15 < 1) {
      ppuVar1 = &PTR_H11cc80_00280770;
    }
                    /* WARNING: Could not recover jumptable at 0x0022060c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(param_1,-2 - (in_x15 ^ 0xffffffffffffffff));
    return;
  }
  if (in_x14 < 0x400 !=
      (*(char *)(in_x17 + (-DAT_00281e58 | 0x42c7e286cc88cf43U) +
                          (-DAT_00281e58 & 0x42c7e286cc88cf43U)) == '\0') && in_x14 < 0x400) {
                    /* WARNING: Could not recover jumptable at 0x0021cdd4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027a548)();
    return;
  }
  if (0x3fe < in_x14) {
    in_x14 = 0x3ff;
  }
                    /* WARNING: Could not recover jumptable at 0x00217020. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00275110)(param_1,in_x14);
  return;
}


