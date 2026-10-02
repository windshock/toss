// entry=0x8ce58

void H8ce58(long param_1)

{
  long in_x9;
  ulong in_x10;
  
  do {
    *(undefined1 *)(param_1 + in_x10) = *(undefined1 *)(in_x9 + in_x10);
    in_x10 = (in_x10 | 1) * 2 - (in_x10 ^ 1);
  } while (in_x10 != 0x99bbd15a94f8c2f5 - (-DAT_00274480 ^ 0xffffffffffffffffU));
  *(undefined4 *)(param_1 + 4) = 0;
  *(undefined4 *)(param_1 + 8) = 0;
  *(undefined4 *)(param_1 + 0xc) = 0;
                    /* WARNING: Could not recover jumptable at 0x0017ae2c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00281198)();
  return;
}


