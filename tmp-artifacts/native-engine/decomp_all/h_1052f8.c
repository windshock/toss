// entry=0x1052f8

void thunk_FUN_00204968(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  int in_w8;
  
  uVar3 = -(int)DAT_00278630;
  uVar2 = -(int)DAT_00278630;
  ppuVar1 = &PTR_LAB_00278818;
  if ((uVar3 | 0x8c9152e4) + (uVar3 & 0x8c9152e4) != in_w8) {
    ppuVar1 = &PTR_LAB_0027f460 + (int)((uVar2 | 0xf5eef2b3) * 2 - (uVar2 ^ 0xf5eef2b3));
  }
                    /* WARNING: Could not recover jumptable at 0x00203ea0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


