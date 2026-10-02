// entry=0x109bf8

void H109bf8(ulong param_1)

{
  bool bVar1;
  ulong in_x10;
  ulong in_x12;
  long unaff_x19;
  long unaff_x29;
  
  if ((in_x12 & 1) == 0) {
                    /* WARNING: Could not recover jumptable at 0x0020b048. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00283488)();
    return;
  }
  do {
    *(undefined1 *)
     (*(long *)(unaff_x29 + -0x88) +
      ((long)&DAT_915e2a0196034945 - (-DAT_00280ba0 ^ 0xffffffffffffffffU)) * 0x80 + param_1) =
         *(undefined1 *)(unaff_x19 + in_x10);
    param_1 = param_1 + 1;
    bVar1 = (long)((-DAT_00280ba0 ^ 0x915e2a0196034946U) + (-DAT_00280ba0 & 0x915e2a0196034946U) * 2
                  ) < (long)in_x10;
    in_x10 = -(in_x10 ^ 0xffffffffffffffff) - 2;
  } while (bVar1 != 0x7f < param_1 && bVar1);
                    /* WARNING: Could not recover jumptable at 0x0020c350. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00282bd8)();
  return;
}


