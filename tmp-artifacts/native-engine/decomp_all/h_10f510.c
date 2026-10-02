// entry=0x10f510

void H10f510(ulong param_1)

{
  if ((param_1 & 1) != 0) {
    memset(&DAT_00282f08,0,0x80);
  }
  DAT_0029e358 = 0;
                    /* WARNING: Could not recover jumptable at 0x0020fd1c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*DAT_0027ea40)();
  return;
}


