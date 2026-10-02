// entry=0x11cc80

void H11cc80(undefined8 param_1)

{
  ulong in_x14;
  long in_x17;
  
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


