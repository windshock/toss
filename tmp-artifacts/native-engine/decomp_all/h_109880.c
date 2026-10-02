// entry=0x109880

void H109880(ulong param_1)

{
  bool bVar1;
  undefined **ppuVar2;
  long in_x6;
  long in_x9;
  ulong in_x10;
  ulong in_x12;
  long unaff_x23;
  
  if ((in_x12 & 1) == 0) {
                    /* WARNING: Could not recover jumptable at 0x0020bc30. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_H107740_0027d378)();
    return;
  }
  do {
    *(undefined1 *)
     (unaff_x23 +
      ((-DAT_00280ba0 ^ 0x915e2a0196034946U) + (-DAT_00280ba0 & 0x915e2a0196034946U) * 2) * 0x80 +
     param_1) = *(undefined1 *)(in_x6 + in_x10);
    param_1 = (param_1 | 1) + (param_1 & 1);
    bVar1 = 0 < (long)in_x10;
    in_x10 = -(in_x10 ^ 0xffffffffffffffff) - 2;
  } while (bVar1 != 0x7f < param_1 && bVar1);
  ppuVar2 = &PTR_LAB_00278ba8;
  if (param_1 < 0x80 ==
      (*(char *)(in_x9 + (-DAT_00280ba0 | 0x915e2a0196034947U) +
                         (-DAT_00280ba0 & 0x915e2a0196034947U)) == '\0') || param_1 >= 0x80) {
    ppuVar2 = (undefined **)&DAT_00278258;
  }
                    /* WARNING: Could not recover jumptable at 0x0020ecb0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


