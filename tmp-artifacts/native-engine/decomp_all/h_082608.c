// entry=0x82608

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void H82608(void)

{
  undefined1 *puVar1;
  uint uVar2;
  undefined **ppuVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  int iVar7;
  uint uVar8;
  uint uVar9;
  uint in_w9;
  uint in_w11;
  uint uVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  long unaff_x29;
  
  uVar2 = (in_w9 >> 2 ^ 0xfffffffc) & in_w9 >> 2;
  lVar11 = 0x47;
  do {
    uVar10 = (uint)lVar11;
    uVar9 = *(uint *)(&DAT_00279ed0 + (ulong)(uVar10 - 1) * 4);
    lVar12 = lVar11 * 4;
    puVar1 = &DAT_00279ed0 + lVar12;
    uVar13 = -DAT_00274480;
    uVar4 = CONCAT13((&DAT_00279ed3)[lVar12],
                     CONCAT12((&DAT_00279ed2)[lVar12],
                              CONCAT11(puVar1[(uVar13 ^ 0x99bbd15a94f8c2f3) +
                                              (uVar13 & 0x99bbd15a94f8c2f3) * 2],*puVar1)));
    uVar5 = -(int)DAT_00274480;
    uVar5 = in_w11 << (ulong)((uVar5 | 0xc2f4) * 2 - (uVar5 ^ 0xc2f4) & 0x1f);
    uVar5 = (uVar9 >> 5 | uVar5) & (uVar9 >> 5 & uVar5 ^ 0xffffffff);
    uVar6 = (uVar9 << 4 ^ 0xffffffff) & in_w11 >> 3 | uVar9 << 4 & (in_w11 >> 3 ^ 0xffffffff);
    uVar8 = (uVar5 | uVar6) * 2 - (uVar5 ^ uVar6);
    uVar5 = (in_w11 | in_w9) & (in_w11 & in_w9 ^ 0xffffffff);
    uVar6 = (uVar10 ^ 0x94f8c2f4 - (-(int)DAT_00274480 ^ 0xffffffffU) ^ 0xffffffff) & uVar10;
    uVar6 = *(uint *)(unaff_x29 + -0x70 +
                     (ulong)((uVar6 ^ 0xffffffff) & uVar2 | uVar6 & (uVar2 ^ 0xffffffff)) * 4);
    uVar6 = (uVar6 ^ 0xffffffff) & uVar9 | uVar6 & (uVar9 ^ 0xffffffff);
    uVar5 = (uVar6 | uVar5) + (uVar6 & uVar5);
    uVar5 = -((uVar5 | uVar8) & (uVar5 & uVar8 ^ 0xffffffff));
    in_w11 = (uVar4 ^ uVar5) + (uVar4 & uVar5) * 2;
    *puVar1 = (char)in_w11;
    puVar1[(uVar13 ^ 0x99bbd15a94f8c2f3) + (uVar13 & 0x99bbd15a94f8c2f3) * 2] = (char)(in_w11 >> 8);
    (&DAT_00279ed2)[lVar12] = (char)(in_w11 >> 0x10);
    (&DAT_00279ed3)[lVar12] = (char)(in_w11 >> 0x18);
    lVar11 = lVar11 + -1;
  } while (uVar10 - 1 != 0);
  uVar5 = CONCAT13(DAT_00279fef,CONCAT12(DAT_00279fee,_DAT_00279fec));
  uVar6 = (((uVar5 >> 5 ^ 0xffffffff) & in_w11 * 4 | uVar5 >> 5 & (in_w11 * 4 ^ 0xffffffff)) -
          ((uVar5 << 4 | in_w11 >> 3) & (uVar5 << 4 & in_w11 >> 3 ^ 0xffffffff) ^ 0xffffffff)) - 1;
  uVar2 = *(uint *)(unaff_x29 + -0x70 + (ulong)uVar2 * 4);
  uVar2 = (((uVar2 | uVar5) & (uVar2 & uVar5 ^ 0xffffffff)) -
          ((in_w11 | in_w9) & (in_w11 & in_w9 ^ 0xffffffff) ^ 0xffffffff)) - 1;
  iVar7 = (CONCAT13(DAT_00279ed3,CONCAT12(DAT_00279ed2,_DAT_00279ed0)) -
          (-((uVar2 | uVar6) & (uVar2 & uVar6 ^ 0xffffffff)) ^ 0xffffffff)) + -1;
  _DAT_00279ed0 = (undefined2)iVar7;
  DAT_00279ed2 = (undefined1)((uint)iVar7 >> 0x10);
  DAT_00279ed3 = (undefined1)((uint)iVar7 >> 0x18);
  ppuVar3 = &PTR_LAB_0027a1c0;
  if (in_w9 != 0x9e3779b9) {
    ppuVar3 = (undefined **)&DAT_0027f520;
  }
                    /* WARNING: Could not recover jumptable at 0x0017c220. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)();
  return;
}


