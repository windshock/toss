// entry=0x120564

void H120564(undefined8 param_1)

{
  undefined **ppuVar1;
  ulong in_x14;
  ulong in_x15;
  long unaff_x19;
  long unaff_x26;
  
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


