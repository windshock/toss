// entry=0x47940

void FUN_00147940(void)

{
  ulong uVar1;
  undefined **ppuVar2;
  uint uVar3;
  undefined8 uVar4;
  uint uVar5;
  ushort uVar6;
  short extraout_w1;
  int iVar7;
  ulong uVar8;
  int iVar9;
  short sVar10;
  byte *local_7c8;
  
  uVar4 = tpidr_el0;
  uVar3 = -(int)DAT_00275ca8;
  uVar5 = -(int)DAT_00275ca8;
  uVar6 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar3 ^ 0xf97b14d4) + (uVar3 & 0x797b14d4) * 2) * 300 +
                     (long)(int)((uVar5 ^ 0xf97b154f) + (uVar5 & 0x797b154f) * 2)])();
  iVar7 = (int)DAT_00275ca8;
  uVar8 = 0x642804bbf97b14d3 - (-DAT_00275ca8 ^ 0xffffffffffffffffU);
  iVar9 = (-iVar7 | 0x8780U) * 2 - (-iVar7 ^ 0x8780U);
  sVar10 = (-(short)DAT_00275ca8 | 0x8780U) + (-(short)DAT_00275ca8 & 0x8780U);
  local_7c8 = (&PTR_FUN_0027c1e0)
              [(long)(int)((-iVar7 | 0xf97b14d4U) + (-iVar7 & 0xf97b14d4U)) * 300 +
               (long)(int)((-iVar7 | 0xf97b1588U) + (-iVar7 & 0xf97b1588U))];
  if ((uint)uVar6 != (-iVar7 ^ 0xf97b14d4U) + (-iVar7 & 0xf97b14d4U) * 2) {
    do {
      uVar3 = iVar9 * ((-iVar7 ^ 0x1513U) + (-iVar7 & 0x1513U) * 2);
      iVar9 = (uVar3 | *local_7c8) + (uVar3 & *local_7c8);
      sVar10 = (short)iVar9;
      uVar1 = (-DAT_00275ca8 | 0x642804bbf97b14d5U) + (-DAT_00275ca8 & 0x642804bbf97b14d5U);
      uVar8 = (uVar8 | uVar1) + (uVar8 & uVar1);
      local_7c8 = local_7c8 +
                  (-DAT_00275ca8 ^ 0x642804bbf97b14d5U) + (-DAT_00275ca8 & 0x642804bbf97b14d5U) * 2;
    } while (uVar8 != uVar6);
  }
  ppuVar2 = (undefined **)(&DAT_0027eb98 + (int)((-iVar7 | 0xf97b1526U) + (-iVar7 & 0xf97b1526U)));
  if (sVar10 != extraout_w1) {
    ppuVar2 = &PTR_LAB_0027e120;
  }
                    /* WARNING: Could not recover jumptable at 0x0014bb38. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


