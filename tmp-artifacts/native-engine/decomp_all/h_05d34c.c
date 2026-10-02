// entry=0x5d34c

/* WARNING: Removing unreachable block (ram,0x00153740) */

void H5d34c(ulong param_1)

{
  undefined **ppuVar1;
  byte in_w9;
  uint in_w12;
  long unaff_x19;
  
  if (in_w12 == in_w9) {
    ppuVar1 = &PTR_H592b8_0027d6f8;
    if ((param_1 & 1) == 0) {
      ppuVar1 = &PTR_LAB_00275c40;
    }
                    /* WARNING: Could not recover jumptable at 0x0015d1e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(*(undefined8 *)(unaff_x19 + 0x298));
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00153750. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00277f60)();
  return;
}


