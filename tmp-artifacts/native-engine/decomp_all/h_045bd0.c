// entry=0x45bd0

void H45bd0(long param_1)

{
  long in_x9;
  ulong in_x10;
  
  do {
    *(undefined1 *)(param_1 + in_x10) = *(undefined1 *)(in_x9 + in_x10);
    in_x10 = (in_x10 | 1) + (in_x10 & 1);
  } while (in_x10 != 4);
  *(undefined4 *)(param_1 + 4) = 0;
  *(undefined4 *)(param_1 + 8) = 0;
  *(undefined4 *)(param_1 + 0xc) = 0;
                    /* WARNING: Could not recover jumptable at 0x00145e20. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00280488)();
  return;
}


