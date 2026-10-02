// entry=0xc2710

void Hc2710(void)

{
  undefined **ppuVar1;
  int iVar2;
  uint *unaff_x24;
  
  iVar2 = (int)DAT_0027a2f0;
  ppuVar1 = &PTR_LAB_002746f8 +
            (long)(int)((-iVar2 | 0x8c8f2a08U) * 2 - (-iVar2 ^ 0x8c8f2a08U)) * 0x5d;
  if (((*unaff_x24 ^ 0x8c8f2a87 - (-iVar2 ^ 0xffffffffU) ^ 0xffffffff) & *unaff_x24) !=
      (-iVar2 | 0x8c8f2a08U) * 2 - (-iVar2 ^ 0x8c8f2a08U)) {
    ppuVar1 = &PTR_LAB_0027ff10;
  }
                    /* WARNING: Could not recover jumptable at 0x001c27b0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


