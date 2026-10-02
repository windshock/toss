// entry=0x1594dc

void H1594dc(void)

{
  uint uVar1;
  uint uVar2;
  undefined **ppuVar3;
  uint uVar4;
  uint uVar5;
  int iVar6;
  uint uVar7;
  long in_x9;
  uint in_w11;
  uint in_w14;
  uint uVar8;
  long lVar9;
  
  uVar2 = (in_w11 >> 2 ^ 0xfffffffc) & in_w11 >> 2;
  lVar9 = -0x33a796c405f63d81 - (-DAT_00277160 ^ 0xffffffffffffffffU);
  uVar8 = (uint)lVar9;
  uVar7 = *(uint *)(&DAT_00274008 + (ulong)(uVar8 - 1) * 4);
  lVar9 = lVar9 * 4;
  uVar4 = uVar7 >> (ulong)((-(int)DAT_00277160 ^ 0xc246U) + (-(int)DAT_00277160 & 0xc246U) * 2 &
                          0x1f);
  uVar5 = (uVar4 ^ 0xffffffff) & in_w14 << 2 | uVar4 & (in_w14 << 2 ^ 0xffffffff);
  uVar4 = (uVar7 << 4 | in_w14 >> 3) & (uVar7 << 4 & in_w14 >> 3 ^ 0xffffffff);
  uVar4 = (uVar5 | uVar4) + (uVar5 & uVar4);
  uVar5 = (in_w14 | in_w11) & (in_w14 & in_w11 ^ 0xffffffff);
  uVar1 = (uVar8 ^ 0xfffffffc) & uVar8;
  uVar1 = *(uint *)(in_x9 + (ulong)((uVar1 | uVar2) & (uVar1 & uVar2 ^ 0xffffffff)) * 4);
  uVar1 = (uVar1 ^ 0xffffffff) & uVar7 | uVar1 & (uVar7 ^ 0xffffffff);
  uVar5 = (uVar1 ^ uVar5) + (uVar1 & uVar5) * 2;
  iVar6 = (*(int *)(&DAT_00274008 + lVar9) -
          (-((uVar5 | uVar4) & (uVar5 & uVar4 ^ 0xffffffff)) ^ 0xffffffff)) + -1;
  (&DAT_00274008)[lVar9] = (char)iVar6;
  (&DAT_00274009)[lVar9] = (char)((uint)iVar6 >> 8);
  (&DAT_0027400a)[lVar9] = (char)((uint)iVar6 >> 0x10);
  (&DAT_0027400b)[lVar9] = (char)((uint)iVar6 >> 0x18);
  ppuVar3 = &PTR_LAB_00281078;
  if (uVar8 - 1 != 0) {
    ppuVar3 = &PTR_LAB_00279c10;
  }
                    /* WARNING: Could not recover jumptable at 0x00255a6c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)();
  return;
}


