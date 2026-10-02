// entry=0xe709c

void He709c(void)

{
  undefined **ppuVar1;
  char cVar2;
  int in_w3;
  uint in_w8;
  uint in_w11;
  long in_x17;
  long unaff_x19;
  int *unaff_x20;
  
  *unaff_x20 = (in_w8 ^ 1) + (in_w8 & 1) * 2;
  cVar2 = *(char *)(*(long *)(unaff_x19 + 0xb0) + 0x10 + (ulong)in_w8);
  *(char *)(*(long *)(unaff_x19 + 0xa8) +
            ((-DAT_002765f0 ^ 0xeb98be6e7b9ee79eU) + (-DAT_002765f0 & 0xeb98be6e7b9ee79eU) * 2) *
            0x800 + in_x17) = cVar2;
  if (cVar2 != (byte)(-0x59 - (-(char)DAT_002765f0 ^ 0xffU))) {
                    /* WARNING: Could not recover jumptable at 0x001e50c0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027e718)();
    return;
  }
  *(undefined1 *)(*(long *)(unaff_x19 + 0xa8) + (long)in_w3) = 0;
  ppuVar1 = &PTR_LAB_002808b0;
  if ((in_w11 & 1) == 0) {
    ppuVar1 = &PTR_LAB_00278038 +
              (long)(int)((-(int)DAT_002765f0 | 0x7b9ee79eU) + (-(int)DAT_002765f0 & 0x7b9ee79eU)) *
              0x5b;
  }
                    /* WARNING: Could not recover jumptable at 0x001e9610. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


