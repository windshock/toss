// entry=0x790e0

void H77dc8(undefined8 param_1,uint param_2,uint param_3,uint param_4,long param_5)

{
  uint uVar1;
  undefined1 *puVar2;
  undefined **ppuVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  int iVar8;
  long lVar9;
  uint uVar10;
  ulong uVar11;
  
  uVar10 = (uint)param_5;
  uVar1 = (uVar10 ^ 0xffffffff) + uVar10 * 2;
  lVar9 = (ulong)uVar1 * 4;
  uVar5 = (uint)(byte)(&DAT_0027daca)[lVar9] <<
          (ulong)((int)DAT_00276da8 * -2 - (-(int)DAT_00276da8 ^ 0xd2b0U) & 0x1f);
  uVar4 = *(ushort *)(&DAT_0027dac8 + lVar9) ^ uVar5;
  uVar6 = uVar4 & (uint)(byte)(&DAT_0027dacb)[lVar9] << 0x18 |
          (*(ushort *)(&DAT_0027dac8 + lVar9) & uVar5 | uVar4) ^
          (uint)(byte)(&DAT_0027dacb)[lVar9] << 0x18;
  param_5 = param_5 * 4;
  puVar2 = &DAT_0027dac8 + param_5;
  uVar11 = -DAT_00276da8;
  uVar5 = CONCAT13((&DAT_0027dacb)[param_5],
                   CONCAT12((&DAT_0027daca)[param_5],
                            CONCAT11(puVar2[0x1a0a294d3994d2a0 - (uVar11 ^ 0xffffffffffffffff)],
                                     *puVar2)));
  uVar4 = (uVar6 >> 5 | param_3 << 2) & (uVar6 >> 5 & param_3 << 2 ^ 0xffffffff);
  uVar7 = (uVar6 << 4 ^ 0xffffffff) & param_3 >> 3 | uVar6 << 4 & (param_3 >> 3 ^ 0xffffffff);
  uVar4 = (uVar4 | uVar7) + (uVar4 & uVar7);
  uVar7 = (param_3 ^ 0xffffffff) & param_2 | param_3 & (param_2 ^ 0xffffffff);
  uVar10 = (uVar10 ^ 0xfffffffc) & uVar10;
  uVar10 = (*(uint *)(&stack0x00000710 +
                     (ulong)((uVar10 | param_4) & (uVar10 & param_4 ^ 0xffffffff)) * 4) ^ 0xffffffff
           ) & uVar6 |
           *(uint *)(&stack0x00000710 +
                    (ulong)((uVar10 | param_4) & (uVar10 & param_4 ^ 0xffffffff)) * 4) &
           (uVar6 ^ 0xffffffff);
  uVar10 = (uVar10 | uVar7) * 2 - (uVar10 ^ uVar7);
  uVar4 = -((uVar10 | uVar4) & (uVar10 & uVar4 ^ 0xffffffff));
  iVar8 = (uVar5 | uVar4) * 2 - (uVar5 ^ uVar4);
  *puVar2 = (char)iVar8;
  puVar2[0x1a0a294d3994d2a0 - (uVar11 ^ 0xffffffffffffffff)] = (char)((uint)iVar8 >> 8);
  (&DAT_0027daca)[param_5] = (char)((uint)iVar8 >> 0x10);
  (&DAT_0027dacb)[param_5] = (char)((uint)iVar8 >> 0x18);
  ppuVar3 = &PTR_LAB_00274470;
  if (uVar1 != 0) {
    ppuVar3 = &PTR_H77dc8_0027ff38;
  }
                    /* WARNING: Could not recover jumptable at 0x00177fe0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)();
  return;
}


