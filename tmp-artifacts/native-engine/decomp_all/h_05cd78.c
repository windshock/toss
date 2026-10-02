// entry=0x5cd78

void H5cd78(void)

{
  long in_x13;
  long in_x14;
  ulong in_x15;
  long unaff_x19;
  
  do {
    *(undefined1 *)(in_x13 + in_x15) = *(undefined1 *)(in_x14 + in_x15);
    in_x15 = (in_x15 | 1) + (in_x15 & 1);
  } while (in_x15 != 4);
  *(undefined4 *)(unaff_x19 + 0x864) = 0;
  *(undefined4 *)(unaff_x19 + 0x868) = 0;
  *(undefined4 *)(unaff_x19 + 0x86c) = 0;
                    /* WARNING: Could not recover jumptable at 0x0015c4e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00285fd8)();
  return;
}


