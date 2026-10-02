// entry=0x102d6c

void H102d6c(void)

{
  uint uVar1;
  undefined **ppuVar2;
  undefined **ppuVar3;
  uint uVar4;
  uint in_w8;
  
  uVar1 = (in_w8 | 5) & (in_w8 & 5 ^ 0xffffffff);
  ppuVar3 = &PTR_LAB_00283b38;
  if (uVar1 != 0x9cf617ca - (-(int)DAT_00281e20 ^ 0xffffffffU)) {
    ppuVar3 = (undefined **)&DAT_00278228;
  }
  uVar4 = -(int)DAT_00281e20;
  ppuVar2 = &PTR_LAB_00283b38 + (long)(int)((uVar4 ^ 0x9cf614cb) + (uVar4 & 0x9cf614cb) * 2) * 0x6d;
  if (uVar1 != 0x200) {
    ppuVar2 = ppuVar3;
  }
  ppuVar3 = &PTR_LAB_00283b38;
  if (uVar1 != 0x100) {
    ppuVar3 = ppuVar2;
  }
                    /* WARNING: Could not recover jumptable at 0x002033f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)();
  return;
}


