// entry=0x140f28

ulong FUN_00240f28(int param_1,undefined8 param_2,long *param_3,byte param_4,undefined8 param_5,
                  undefined8 *param_6)

{
  undefined8 *puVar1;
  uint uVar2;
  bool bVar3;
  bool bVar4;
  long lVar5;
  ulong uVar6;
  byte *pbVar7;
  byte bVar8;
  uint uVar9;
  byte *pbVar10;
  ulong uVar11;
  byte *pbVar12;
  
  if (param_1 == 0) {
    *param_3 = 0;
                    /* WARNING: Could not recover jumptable at 0x002412fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar11 = (*(code *)PTR_LAB_00282428)(param_3 + 1);
    return uVar11;
  }
  if (param_1 == 1) {
    pbVar10 = (byte *)*param_3;
    pbVar7 = pbVar10 + (-0x3d2851959fed53e7 - (-DAT_0027c1d0 ^ 0xffffffffffffffffU));
    *param_3 = (long)pbVar7;
    bVar8 = *pbVar10;
    uVar11 = (ulong)((-(int)DAT_0027c1d0 | 0x6012ac19U) + (-(int)DAT_0027c1d0 & 0x6012ac19U));
    if (bVar8 != param_4) {
      uVar11 = 0;
      do {
        uVar9 = (uint)uVar11 << 5;
        uVar2 = (uint)uVar11 >>
                (ulong)((-(int)DAT_0027c1d0 | 0xac34U) + (-(int)DAT_0027c1d0 & 0xac34U) & 0x1f);
        uVar9 = uVar9 & uVar2 | uVar9 ^ uVar2;
        uVar11 = (ulong)((uVar9 ^ 0xffffffff) & (uint)bVar8 | uVar9 & (bVar8 ^ 0xffffffff));
        uVar6 = -DAT_0027c1d0;
        *param_3 = (long)(pbVar7 + (-0x3d2851959fed53e7 - (uVar6 ^ 0xffffffffffffffff)));
        bVar8 = *pbVar7;
        pbVar7 = pbVar7 + (-0x3d2851959fed53e7 - (uVar6 ^ 0xffffffffffffffff));
      } while (bVar8 != param_4);
    }
    return uVar11;
  }
  pbVar7 = (byte *)param_3[1];
  if (pbVar7 != (byte *)0x0) {
    uVar9 = (uint)*(byte *)((long)param_6 +
                           (-DAT_0027c1d0 ^ 0xc2d7ae6a6012ac25U) +
                           (-DAT_0027c1d0 & 0xc2d7ae6a6012ac25U) * 2);
    uVar9 = (uVar9 | 1) & (uVar9 & 1 ^ 0xff);
    uVar11 = (ulong)uVar9;
    uVar2 = *(uint *)((long *)*param_6 + 1);
    pbVar10 = pbVar7;
    if (uVar9 < uVar2) {
      do {
        do {
          pbVar12 = pbVar10;
          pbVar10 = pbVar12 + 1;
        } while (*pbVar12 != 0);
        lVar5 = *(long *)*param_6;
        if ((long)pbVar12 - (-(long)pbVar7 ^ 0xffffffffffffffffU) != 1) {
          uVar6 = (-DAT_0027c1d0 | 0xc2d7ae6a6012ac19U) * 2 - (-DAT_0027c1d0 ^ 0xc2d7ae6a6012ac19U)
                  << ((ulong)*(uint *)(lVar5 + uVar11 * 0x30) & 0x3f);
          uVar6 = (uVar6 | *pbVar7) & (uVar6 & *pbVar7 ^ 0xffffffffffffffff);
          bVar4 = ((uVar6 ^ *(ulong *)(lVar5 + uVar11 * 0x30 + 8) ^ 0xffffffffffffffff) & uVar6) !=
                  *(ulong *)(lVar5 + uVar11 * 0x30 + 0x18);
          bVar3 = 1 < *(ulong *)(lVar5 + uVar11 * 0x30 + 0x20) >> 0x20;
          puVar1 = (undefined8 *)
                   ((long)(int)((-(int)DAT_0027c1d0 | 0x6012ac3cU) * 2 -
                               (-(int)DAT_0027c1d0 ^ 0x6012ac3cU)) * 8 + 0x274b00);
          if ((!bVar3 || !bVar4) && bVar3 == bVar4) {
            puVar1 = &DAT_002857a8;
          }
                    /* WARNING: Could not recover jumptable at 0x002411f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar11 = (*(code *)*puVar1)();
          return uVar11;
        }
        uVar11 = (uVar11 | 1) * 2 - (uVar11 ^ 1);
        pbVar10 = pbVar7;
      } while (uVar11 != uVar2);
    }
  }
  return 0;
}


