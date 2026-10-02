// entry=0xc4128

void Hc4128(undefined8 *param_1)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  byte *pbVar4;
  bool bVar5;
  bool bVar6;
  int iVar7;
  long lVar8;
  int iVar9;
  byte *pbVar10;
  undefined8 uVar11;
  ulong uVar12;
  int *unaff_x20;
  byte *unaff_x23;
  undefined8 *unaff_x24;
  undefined4 unaff_w25;
  long unaff_x26;
  undefined8 unaff_x28;
  long unaff_x29;
  
  uVar2 = -(int)DAT_0027a2f0;
  uVar3 = -(int)DAT_0027a2f0;
  iVar7 = (*(code *)*param_1)((&PTR_FUN_0027c1e0)
                              [(long)(int)((uVar3 | 0x8c8f2a08) + (uVar3 & 0x8c8f2a08)) * 300 +
                               (long)(int)((uVar2 | 0x8c8f2a86) + (uVar2 & 0x8c8f2a86))]);
  iVar9 = 1;
  uVar11 = *(undefined8 *)(unaff_x29 + -0x80);
  if (iVar7 == 1) {
    **(undefined8 **)(unaff_x29 + -0x70) = unaff_x28;
    *unaff_x24 = uVar11;
    lVar8 = *(long *)(unaff_x29 + -0x78);
    *(undefined4 *)(lVar8 + unaff_x26 * 0x18 + 0x10) = unaff_w25;
    pbVar4 = unaff_x23;
    do {
      pbVar10 = pbVar4;
      pbVar4 = pbVar10 + 1;
    } while (*pbVar10 != (byte)(7 - (-(char)DAT_0027a2f0 ^ 0xffU)));
    if (((ulong)pbVar10 ^ -(long)unaff_x23) + ((ulong)pbVar10 & -(long)unaff_x23) * 2 !=
        (-DAT_0027a2f0 | 0xe957d0b88c8f2a08U) + (-DAT_0027a2f0 & 0xe957d0b88c8f2a08U)) {
      uVar12 = ((-DAT_0027a2f0 | 0xe957d0b88c8f2a08U) + (-DAT_0027a2f0 & 0xe957d0b88c8f2a08U)) *
               0x10;
      uVar12 = (uVar12 ^ (-DAT_0027a2f0 ^ 0xe957d0c88c8f29f8U) +
                         (-DAT_0027a2f0 & 0xe957d0c88c8f29f8U) * 2 ^ 0xffffffffffffffff) & uVar12;
      bVar6 = ((uVar12 ^ 0xffffffffffffffff) & (ulong)*unaff_x23 |
              uVar12 & ((ulong)*unaff_x23 ^ 0xffffffffffffffff)) != 0xce6b575e5;
      bVar5 = (-DAT_0027a2f0 | 0xe957d0b88c8f2a09U) * 2 - (-DAT_0027a2f0 ^ 0xe957d0b88c8f2a09U) < 9;
      ppuVar1 = &PTR_LAB_00278a58;
      if ((!bVar5 || !bVar6) && bVar5 == bVar6) {
        ppuVar1 = &PTR_LAB_00277720;
      }
                    /* WARNING: Could not recover jumptable at 0x001c4494. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar1)();
      return;
    }
    *(undefined4 *)(lVar8 + unaff_x26 * 0x18 + 0x14) = 0;
    iVar9 = -0x7370d5f9 - (-(int)DAT_0027a2f0 ^ 0xffffffffU);
  }
  CallSupervisor(0);
  ppuVar1 = &PTR_LAB_0027e140;
  if (iVar9 != 0) {
    ppuVar1 = &PTR_LAB_00277758;
  }
                    /* WARNING: Could not recover jumptable at 0x001c3460. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)((long)*unaff_x20);
  return;
}


