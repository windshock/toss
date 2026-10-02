// entry=0x71b50

void H71b50(void)

{
  uint uVar1;
  undefined **ppuVar2;
  uint uVar3;
  uint in_w8;
  int iVar4;
  
  iVar4 = (int)DAT_00276da8;
  uVar1 = (-iVar4 | 0x85cfbf05U) + (-iVar4 & 0x85cfbf05U);
  uVar3 = (in_w8 ^ 0xffffffff) & uVar1 | in_w8 & (uVar1 ^ 0xffffffff);
  uVar1 = uVar3 >> (ulong)(0xd2ac - (-iVar4 ^ 0xffffffffU) & 0x1f);
  uVar3 = ((uVar1 ^ 0xffffffff) & uVar3 | uVar1 & (uVar3 ^ 0xffffffff)) *
          ((-iVar4 | 0x9566bc35U) + (-iVar4 & 0x9566bc35U));
  uVar1 = uVar3 >> (ulong)((-iVar4 ^ 0xd2afU) + (-iVar4 & 0xd2afU) * 2 & 0x1f);
  ppuVar2 = &PTR_LAB_0027dda0;
  if (((uVar1 ^ 0xffffffff) & uVar3 | uVar1 & (uVar3 ^ 0xffffffff)) != 0x61a86f49) {
    ppuVar2 = &PTR_LAB_00281758 + (int)((-iVar4 | 0x3994d2e4U) + (-iVar4 & 0x3994d2e4U));
  }
                    /* WARNING: Could not recover jumptable at 0x00173f38. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


