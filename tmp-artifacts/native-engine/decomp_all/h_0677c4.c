// entry=0x677c4

void H677c4(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  long unaff_x19;
  
  uVar2 = *(uint *)(unaff_x19 +
                   ((-DAT_00274f18 ^ 0xae1690869c1eff82U) +
                   (-DAT_00274f18 & 0xae1690869c1eff82U) * 2) * 4);
  uVar3 = -(int)DAT_00274f18;
  ppuVar1 = &PTR_thunk_FUN_00165f78_0027f1d0;
  if (((uVar2 ^ 0x1b9eff80 - (-(int)DAT_00274f18 ^ 0xffffffffU) ^ 0xffffffff) & uVar2) !=
      (uVar3 | 0xee9eff81) + (uVar3 & 0xee9eff81)) {
    ppuVar1 = &PTR_LAB_00283fe8;
  }
                    /* WARNING: Could not recover jumptable at 0x001667d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


