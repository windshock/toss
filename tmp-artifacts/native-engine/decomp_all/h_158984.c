// entry=0x158984

void H158984(long param_1)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  long lVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  ulong uVar11;
  
  *(undefined4 *)(param_1 + 4) = 0;
  *(undefined4 *)(param_1 + 8) = 0;
  *(undefined4 *)(param_1 + 0xc) = 0;
  uVar9 = CONCAT13(DAT_00279ed3,CONCAT12(DAT_00279ed2,CONCAT11(DAT_00279ed1,DAT_00279ed0)));
  uVar8 = 0xb54cda56;
  do {
    uVar2 = (uVar8 >> 2 ^ 0xfffffffc) & uVar8 >> 2;
    uVar11 = 0x47;
    do {
      uVar10 = (uint)uVar11;
      uVar1 = (uVar10 ^ 0xffffffff) + uVar10 * 2;
      lVar7 = (ulong)uVar1 * 4;
      uVar3 = -(int)DAT_00277160;
      uVar3 = (uint)(byte)(&DAT_00279ed3)[lVar7] <<
              (ulong)((uVar3 | 0xc259) * 2 - (uVar3 ^ 0xc259) & 0x1f);
      uVar4 = *(uint3 *)(&DAT_00279ed0 + lVar7) & uVar3 | *(uint3 *)(&DAT_00279ed0 + lVar7) ^ uVar3;
      lVar7 = uVar11 * 4;
      uVar6 = *(uint *)(&DAT_00279ed0 + lVar7);
      uVar3 = uVar9 << (ulong)(0xc242 - (-(int)DAT_00277160 ^ 0xffffffffU) & 0x1f);
      uVar3 = (uVar4 >> 5 | uVar3) & (uVar4 >> 5 & uVar3 ^ 0xffffffff);
      uVar5 = (uVar4 << 4 ^ 0xffffffff) & uVar9 >> 3 | uVar4 << 4 & (uVar9 >> 3 ^ 0xffffffff);
      uVar5 = (uVar3 | uVar5) * 2 - (uVar3 ^ uVar5);
      uVar9 = (uVar9 | uVar8) & (uVar9 & uVar8 ^ 0xffffffff);
      uVar10 = (uVar10 ^ 0xfffffffc) & uVar10;
      uVar3 = *(uint *)(param_1 +
                       (ulong)((uVar10 ^ 0xffffffff) & uVar2 | uVar10 & (uVar2 ^ 0xffffffff)) * 4);
      uVar3 = (uVar3 ^ 0xffffffff) & uVar4 | uVar3 & (uVar4 ^ 0xffffffff);
      uVar9 = (uVar3 ^ uVar9) + (uVar3 & uVar9) * 2;
      uVar9 = -((uVar9 ^ 0xffffffff) & uVar5 | uVar9 & (uVar5 ^ 0xffffffff));
      uVar9 = (uVar6 ^ uVar9) + (uVar6 & uVar9) * 2;
      (&DAT_00279ed0)[lVar7] = (char)uVar9;
      (&DAT_00279ed1)[lVar7] = (char)(uVar9 >> 8);
      (&DAT_00279ed2)[lVar7] = (char)(uVar9 >> 0x10);
      (&DAT_00279ed3)[lVar7] = (char)(uVar9 >> 0x18);
      uVar11 = (uVar11 ^ 0xffffffffffffffff) + uVar11 * 2;
    } while (uVar1 != 0);
    uVar3 = CONCAT13(DAT_00279fef,CONCAT12(DAT_00279fee,CONCAT11(DAT_00279fed,DAT_00279fec)));
    uVar10 = CONCAT13(DAT_00279ed3,CONCAT12(DAT_00279ed2,CONCAT11(DAT_00279ed1,DAT_00279ed0)));
    uVar1 = (uVar3 >> 5 ^ 0xffffffff) & uVar9 * 4 | uVar3 >> 5 & (uVar9 * 4 ^ 0xffffffff);
    uVar4 = (uVar3 << 4 ^ 0xffffffff) & uVar9 >> 3 | uVar3 << 4 & (uVar9 >> 3 ^ 0xffffffff);
    uVar1 = (uVar1 | uVar4) + (uVar1 & uVar4);
    uVar2 = *(uint *)(param_1 + (ulong)uVar2 * 4);
    uVar9 = (((uVar2 | uVar3) & (uVar2 & uVar3 ^ 0xffffffff)) -
            (((uVar9 ^ 0xffffffff) & uVar8 | uVar9 & (uVar8 ^ 0xffffffff)) ^ 0xffffffff)) - 1;
    uVar9 = -((uVar9 ^ 0xffffffff) & uVar1 | uVar9 & (uVar1 ^ 0xffffffff));
    uVar9 = (uVar10 | uVar9) + (uVar10 & uVar9);
    DAT_00279ed0 = (undefined1)uVar9;
    DAT_00279ed1 = (undefined1)(uVar9 >> 8);
    DAT_00279ed2 = (undefined1)(uVar9 >> 0x10);
    DAT_00279ed3 = (undefined1)(uVar9 >> 0x18);
    uVar8 = uVar8 + 0x61c88647;
  } while (uVar8 != 0);
  DAT_00283630 = DAT_00283630 & 0x40 | DAT_00283630 ^ 0x40;
                    /* WARNING: Could not recover jumptable at 0x0025947c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002783a8)();
  return;
}


