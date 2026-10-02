// entry=0x16b8d4

void H16b8d4(void)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  char cVar3;
  uint uVar4;
  long in_x9;
  long in_x11;
  char *unaff_x20;
  uint *unaff_x22;
  undefined4 *unaff_x24;
  uint *unaff_x25;
  uint *unaff_x26;
  
  uVar4 = *unaff_x22;
  CallSupervisor(0);
  if (uVar4 == 0) {
                    /* WARNING: Could not recover jumptable at 0x0026e328. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027f200)(*unaff_x26 & 2 | *unaff_x26 ^ 2);
    return;
  }
  if (uVar4 < 0xfffff001) {
    *unaff_x25 = uVar4;
    cVar3 = *unaff_x20;
    *unaff_x24 = 1;
    (&stack0x00000010)[in_x9] = cVar3;
    if (cVar3 != '\n') {
      ppuVar1 = &PTR_LAB_0027ede8;
      if (in_x11 != 0x7ff) {
        ppuVar1 = &PTR_LAB_0027d380;
      }
      ppuVar2 = &PTR_LAB_0027efc8;
      if (in_x11 != (-DAT_00278300 | 0x26e4add943d12d53U) + (-DAT_00278300 & 0x26e4add943d12d53U)) {
        ppuVar2 = ppuVar1;
      }
                    /* WARNING: Could not recover jumptable at 0x0026e718. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar2)();
      return;
    }
    (&stack0x00000010)
    [((in_x11 << 0x20) >> 0x20) +
     ((-DAT_00278300 | 0x26e4add943d12d53U) * 2 - (-DAT_00278300 ^ 0x26e4add943d12d53U)) * 0x800] =
         0;
    ppuVar1 = &PTR_LAB_00281a30 +
              (long)(int)((-(int)DAT_00278300 ^ 0x43d12d53U) +
                         (-(int)DAT_00278300 & 0x43d12d53U) * 2) * 0x6c;
    if (in_x11 << 0x20 != 0) {
      ppuVar1 = &PTR_LAB_0027fc00;
    }
                    /* WARNING: Could not recover jumptable at 0x0026c324. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  uVar4 = (-(int)DAT_00278300 ^ 0x43d12d54U) + (-(int)DAT_00278300 & 0x43d12d54U) * 2;
  *unaff_x26 = *unaff_x26 & uVar4 | *unaff_x26 ^ uVar4;
                    /* WARNING: Could not recover jumptable at 0x0026c490. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_002778e0)
            [(long)(int)((-(int)DAT_00278300 | 0x43d12d53U) + (-(int)DAT_00278300 & 0x43d12d53U)) *
             0x52])();
  return;
}


