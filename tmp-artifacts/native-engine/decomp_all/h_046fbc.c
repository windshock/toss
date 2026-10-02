// entry=0x46fbc

void H46fbc(long param_1)

{
  undefined2 *puVar1;
  undefined1 *puVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  long lVar8;
  uint in_w9;
  uint in_w10;
  uint uVar9;
  uint uVar10;
  ulong uVar11;
  
  uVar6 = in_w9 & in_w10 | in_w9 ^ in_w10;
  uVar9 = (uint)DAT_00283cf2 << (ulong)(0x3dce - (-(int)DAT_002752d0 ^ 0xffffffffU) & 0x1f);
  uVar9 = uVar6 & uVar9 | uVar6 ^ uVar9;
  uVar9 = uVar9 & (uint)DAT_00283cf3 << 0x18 | uVar9 ^ (uint)DAT_00283cf3 << 0x18;
  uVar11 = 0x35;
  do {
    uVar10 = (uint)uVar11;
    uVar6 = (uVar10 ^ 0xffffffff) + uVar10 * 2;
    uVar7 = *(uint *)(&DAT_00283cf0 + (ulong)uVar6 * 4);
    lVar8 = uVar11 * 4;
    puVar1 = (undefined2 *)(&DAT_00283cf0 + lVar8);
    puVar2 = (undefined1 *)
             ((long)puVar1 +
             (-DAT_002752d0 | 0x4b4da246918d3dc1U) + (-DAT_002752d0 & 0x4b4da246918d3dc1U));
    uVar4 = CONCAT13((&DAT_00283cf3)[lVar8],CONCAT12(*puVar2,*puVar1));
    uVar5 = (uVar7 >> 5 ^ 0xffffffff) & uVar9 << 2 | uVar7 >> 5 & (uVar9 << 2 ^ 0xffffffff);
    uVar3 = (uVar7 << 4 | uVar9 >> 3) & (uVar7 << 4 & uVar9 >> 3 ^ 0xffffffff);
    uVar5 = (uVar5 | uVar3) * 2 - (uVar5 ^ uVar3);
    uVar9 = (uVar9 | 0xb54cda56) & (uVar9 & 0xb54cda56 ^ 0xffffffff);
    uVar10 = (uVar10 ^ 0xfffffffc) & uVar10;
    uVar3 = *(uint *)(param_1 + (ulong)((uVar10 | 1) & (uVar10 & 1 ^ 0xffffffff)) * 4);
    uVar3 = (uVar3 ^ 0xffffffff) & uVar7 | uVar3 & (uVar7 ^ 0xffffffff);
    uVar9 = (uVar3 | uVar9) + (uVar3 & uVar9);
    uVar9 = -((uVar9 ^ 0xffffffff) & uVar5 | uVar9 & (uVar5 ^ 0xffffffff));
    uVar9 = (uVar4 | uVar9) + (uVar4 & uVar9);
    *(char *)puVar1 = (char)uVar9;
    (&DAT_00283cf1)[lVar8] = (char)(uVar9 >> 8);
    *puVar2 = (char)(uVar9 >> 0x10);
    (&DAT_00283cf3)[lVar8] = (char)(uVar9 >> 0x18);
    uVar11 = -(uVar11 ^ 0xffffffffffffffff) - 2;
  } while (uVar6 != 0);
                    /* WARNING: Could not recover jumptable at 0x00145458. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027b628)(0,0);
  return;
}


