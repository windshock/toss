// entry=0xc3ed8

void Hc3ed8(void)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  uint uVar3;
  char cVar4;
  uint in_w3;
  uint *in_x5;
  uint in_w8;
  long in_x9;
  long in_x10;
  uint *unaff_x19;
  int *unaff_x20;
  long *unaff_x23;
  long unaff_x25;
  
  uVar3 = *in_x5;
  if (uVar3 < *unaff_x19) {
    *in_x5 = (uVar3 - ((-(int)DAT_0027a2f0 | 0x8c8f2a09U) * 2 - (-(int)DAT_0027a2f0 ^ 0x8c8f2a09U) ^
                      0xffffffff)) - 1;
    cVar4 = *(char *)((long)unaff_x20 + (ulong)uVar3 + 0x10);
    *(char *)(unaff_x25 +
              ((-DAT_0027a2f0 | 0xe957d0b88c8f2a08U) * 2 - (-DAT_0027a2f0 ^ 0xe957d0b88c8f2a08U)) *
              0x800 + in_x9) = cVar4;
    if (cVar4 != (byte)('\x11' - (-(char)DAT_0027a2f0 ^ 0xffU))) {
      ppuVar1 = &PTR_LAB_00275f48;
      if (in_x10 != 0x7ff) {
        ppuVar1 = &PTR_LAB_00276a10;
      }
      ppuVar2 = &PTR_Hc2710_0027f620;
      if (in_x10 != (-DAT_0027a2f0 | 0xe957d0b88c8f2a08U) + (-DAT_0027a2f0 & 0xe957d0b88c8f2a08U)) {
        ppuVar2 = ppuVar1;
      }
                    /* WARNING: Could not recover jumptable at 0x001c31d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar2)();
      return;
    }
    *(undefined1 *)
     (unaff_x25 +
     ((in_x10 << ((-DAT_0027a2f0 ^ 0x2a28U) + (-DAT_0027a2f0 & 0x2a28U) * 2 & 0x3f)) >> 0x20)) = 0;
    *unaff_x23 = unaff_x25;
    ppuVar1 = &PTR_LAB_00279948;
    if ((in_w3 & 1) == 0) {
      ppuVar1 = &PTR_LAB_00274808;
    }
                    /* WARNING: Could not recover jumptable at 0x001c4330. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  if (((in_w8 ^ 0xfffffffd) & in_w8) != 0) {
                    /* WARNING: Could not recover jumptable at 0x001c3bd0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00278ed8)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x001c1b78. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00274aa0)((long)*unaff_x20);
  return;
}


