// entry=0xf6d9c

void Hf6d9c(long param_1)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  long in_x9;
  ulong uVar3;
  long in_x12;
  
  uVar3 = (in_x9 << 7 ^ 0xfffffc000000007fU) & in_x9 << 7;
  uVar3 = (uVar3 | *(byte *)(param_1 + in_x12)) &
          (uVar3 & *(byte *)(param_1 + in_x12) ^ 0xffffffffffffffff);
  ppuVar1 = &PTR_LAB_0027b718;
  if (uVar3 != 0x2475c3df2e9) {
    ppuVar1 = &PTR_LAB_0027ad30;
  }
  ppuVar2 = &PTR_LAB_00275db8 +
            (long)(int)((-(int)DAT_00285dc0 | 0xb5830cfcU) * 2 - (-(int)DAT_00285dc0 ^ 0xb5830cfcU))
            * 0x59;
  if (uVar3 != (-DAT_00285dc0 ^ 0x94d41eb10db8efc5U) + (-DAT_00285dc0 & 0x94d41eb10db8efc5U) * 2) {
    ppuVar2 = ppuVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x001f6e74. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


