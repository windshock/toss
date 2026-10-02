// entry=0x11e03c

void H11d7e0(ulong param_1,undefined4 param_2)

{
  undefined **ppuVar1;
  int iVar2;
  byte in_w9;
  uint in_w10;
  byte in_w11;
  uint uVar3;
  long unaff_x19;
  long unaff_x28;
  
  uVar3 = (uint)DAT_00281e58;
  if (in_w10 != in_w9) {
    if ((0xffffffff - (uVar3 & 1) & 1) != 0) {
                    /* WARNING: Could not recover jumptable at 0x002225ec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_002830c0)();
      return;
    }
    if ((-uVar3 | 0xcc88cf71) + (-uVar3 & 0xcc88cf71) != (uint)in_w11) {
      iVar2 = (*(code *)(&PTR_FUN_0027c1e0)
                        [(long)(int)((-uVar3 | 0xcc88cf42) * 2 - (-uVar3 ^ 0xcc88cf42)) * 300 +
                         (long)(int)(-0x33772fe3 - (-uVar3 ^ 0xffffffff))])
                        (param_2,*(long *)(unaff_x19 + 0x808) + unaff_x28,
                         (-unaff_x28 ^ 0x800U) + (-unaff_x28 & 0x800U) * 2);
      if (iVar2 <= (int)((-(int)DAT_00281e58 ^ 0xcc88cf42U) + (-(int)DAT_00281e58 & 0xcc88cf42U) * 2
                        )) {
                    /* WARNING: Could not recover jumptable at 0x0022015c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_002756c8)(unaff_x28 == 0);
        return;
      }
                    /* WARNING: Could not recover jumptable at 0x0022d590. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00279270)();
      return;
    }
  }
  ppuVar1 = &PTR_LAB_00274a30;
  if ((param_1 & 1) == 0) {
    ppuVar1 = &PTR_LAB_002768d8;
  }
                    /* WARNING: Could not recover jumptable at 0x0021d164. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(*(undefined8 *)(unaff_x19 + 0x410));
  return;
}


