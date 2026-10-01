// req=0x101920 entry=0x101920

void HND_101920(uint param_1)

{
  undefined4 in_w8;
  undefined4 *in_x9;
  
  *in_x9 = in_w8;
  DAT_002862c0 = 0;
                    /* WARNING: Could not recover jumptable at 0x0020298c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_001ff648 + (ulong)*(ushort *)(&DAT_0012ca4e + (ulong)param_1 * 2) * 4))();
  return;
}


