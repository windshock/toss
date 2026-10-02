// entry=0x12b2b8

void H12b2b8(void)

{
  long in_x9;
  long in_x10;
  ulong in_x11;
  
  do {
    *(undefined1 *)(in_x9 + in_x11) = *(undefined1 *)(in_x10 + in_x11);
    in_x11 = (in_x11 | 1) + (in_x11 & 1);
  } while (in_x11 != 4);
                    /* WARNING: Could not recover jumptable at 0x0021908c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&DAT_0027bf58)
            [(long)(int)((-(int)DAT_00281e58 | 0xcc88cf42U) + (-(int)DAT_00281e58 & 0xcc88cf42U)) *
             99])();
  return;
}


