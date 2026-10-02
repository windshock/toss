// entry=0xc96e4

void FUN_001c96e4(void)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  ushort uVar4;
  short extraout_w1;
  long lVar5;
  int iVar6;
  int iVar7;
  ulong uVar8;
  short sVar9;
  ulong uVar10;
  byte *local_160;
  
  lVar5 = tpidr_el0;
  lVar5 = *(long *)(lVar5 + 0x28);
  uVar2 = -(int)DAT_002793a8;
  uVar3 = -(int)DAT_002793a8;
  uVar4 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar3 ^ 0x96433677) + (uVar3 & 0x16433677) * 2) * 300 +
                     (long)(int)((uVar2 ^ 0x964336c6) + (uVar2 & 0x164336c6) * 2)])();
  iVar6 = (int)DAT_002793a8;
  sVar9 = (-(short)DAT_002793a8 | 0xbeb6U) * 2 - (-(short)DAT_002793a8 ^ 0xbeb6U);
  iVar7 = 0xbeb5 - (-iVar6 ^ 0xffffffffU);
  uVar8 = (-DAT_002793a8 | 0xb7d6f09d96433677U) + (-DAT_002793a8 & 0xb7d6f09d96433677U);
  local_160 = (&PTR_FUN_0027c1e0)
              [(long)(int)((-iVar6 ^ 0x96433677U) + (-iVar6 & 0x96433677U) * 2) * 300 +
               (long)(int)((-iVar6 | 0x96433723U) * 2 - (-iVar6 ^ 0x96433723U))];
  if ((uint)uVar4 != (-iVar6 | 0x96433677U) + (-iVar6 & 0x96433677U)) {
    do {
      iVar7 = (iVar7 * ((-iVar6 | 0x36b6U) * 2 - (-iVar6 ^ 0x36b6U)) - (*local_160 ^ 0xffffffff)) +
              -1;
      sVar9 = (short)iVar7;
      uVar10 = (-DAT_002793a8 | 0xb7d6f09d96433678U) * 2 - (-DAT_002793a8 ^ 0xb7d6f09d96433678U);
      uVar8 = (uVar8 | uVar10) * 2 - (uVar8 ^ uVar10);
      local_160 = local_160 +
                  (-DAT_002793a8 ^ 0xb7d6f09d96433678U) + (-DAT_002793a8 & 0xb7d6f09d96433678U) * 2;
    } while (uVar8 != uVar4);
  }
  if (sVar9 == extraout_w1) {
                    /* WARNING: Could not recover jumptable at 0x001c9c88. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00283e08)
              (&PTR_FUN_0027c1e0 +
               (long)(int)((-iVar6 ^ 0x96433677U) + (-iVar6 & 0x96433677U) * 2) * 300 +
               (long)(int)((-iVar6 | 0x964336a9U) * 2 - (-iVar6 ^ 0x964336a9U)));
    return;
  }
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) != lVar5) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


