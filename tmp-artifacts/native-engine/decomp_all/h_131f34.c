// entry=0x131f34

void H131f34(code *param_1)

{
  uint uVar1;
  undefined **ppuVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  ushort uVar6;
  ushort uVar7;
  undefined8 *in_x9;
  ushort in_w10;
  int in_w11;
  int in_w12;
  uint in_w13;
  int iVar8;
  long unaff_x19;
  long *plVar9;
  undefined8 unaff_x25;
  ulong unaff_x29;
  
  iVar8 = (int)DAT_00281e58;
  uVar1 = (-iVar8 | 0xcc88cf44U) + (-iVar8 & 0xcc88cf44U);
  uVar3 = (uint)(byte)(&PTR_FUN_0027c1e0)
                      [(long)(int)((-iVar8 | 0xcc88cf42U) + (-iVar8 & 0xcc88cf42U)) * 300 +
                       (long)(int)((-iVar8 | 0xcc88cf64U) + (-iVar8 & 0xcc88cf64U))]
                      [in_w13 & uVar1 | in_w13 ^ uVar1] <<
          (ulong)((-iVar8 | 0xcf52U) * 2 - (-iVar8 ^ 0xcf52U) & 0x1f);
  uVar1 = 0xcc88cf42 - (-iVar8 ^ 0xffffffffU);
  uVar1 = (uint)(byte)(&PTR_FUN_0027c1e0)
                      [(long)(int)(-0x337730bf - (-iVar8 ^ 0xffffffffU)) * 300 +
                       (long)(int)((-iVar8 | 0xcc88cf64U) * 2 - (-iVar8 ^ 0xcc88cf64U))]
                      [in_w13 & uVar1 | in_w13 ^ uVar1] <<
          (ulong)((-iVar8 ^ 0xcf4aU) + (-iVar8 & 0xcf4aU) * 2 & 0x1f);
  uVar1 = uVar1 & uVar3 | uVar1 ^ uVar3;
  uVar3 = ((uVar1 | (byte)(&PTR_FUN_0027c1e0)
                          [(long)(int)((-iVar8 | 0xcc88cf42U) * 2 - (-iVar8 ^ 0xcc88cf42U)) * 300 +
                           (long)(int)((-iVar8 | 0xcc88cf64U) * 2 - (-iVar8 ^ 0xcc88cf64U))][in_w13]
           ) & (uVar1 & (byte)(&PTR_FUN_0027c1e0)
                              [(long)(int)((-iVar8 | 0xcc88cf42U) * 2 - (-iVar8 ^ 0xcc88cf42U)) *
                               300 + (long)(int)((-iVar8 | 0xcc88cf64U) * 2 - (-iVar8 ^ 0xcc88cf64U)
                                                )][in_w13] ^ 0xffffffff)) *
          ((-iVar8 ^ 0x285ab8d7U) + (-iVar8 & 0x285ab8d7U) * 2);
  uVar1 = uVar3 >> (ulong)((-iVar8 | 0xcc88cf5aU) * 2 - (-iVar8 ^ 0xcc88cf5aU) & 0x1f);
  uVar3 = ((uVar1 | uVar3) & (uVar1 & uVar3 ^ 0xffffffff)) *
          ((-iVar8 ^ 0x285ab8d7U) + (-iVar8 & 0x285ab8d7U) * 2);
  uVar4 = in_w12 * ((-iVar8 | 0x285ab8d7U) * 2 - (-iVar8 ^ 0x285ab8d7U));
  uVar5 = in_w11 * ((-iVar8 | 0x285ab8d7U) + (-iVar8 & 0x285ab8d7U));
  uVar1 = uVar5 >> (ulong)((-iVar8 ^ 0xcc88cf5aU) + (-iVar8 & 0xcc88cf5aU) * 2 & 0x1f);
  uVar1 = ((uVar1 | uVar5) & (uVar1 & uVar5 ^ 0xffffffff)) *
          ((-iVar8 | 0x285ab8d7U) * 2 - (-iVar8 ^ 0x285ab8d7U));
  uVar3 = ((uVar3 ^ 0xffffffff) & uVar4 | uVar3 & (uVar4 ^ 0xffffffff)) *
          ((-iVar8 ^ 0x285ab8d7U) + (-iVar8 & 0x285ab8d7U) * 2);
  uVar3 = (uVar3 ^ 0xffffffff) & uVar1 | uVar3 & (uVar1 ^ 0xffffffff);
  uVar1 = uVar3 >> (ulong)((-iVar8 ^ 0xcf4fU) + (-iVar8 & 0xcf4fU) * 2 & 0x1f);
  uVar1 = ((uVar1 | uVar3) & (uVar1 & uVar3 ^ 0xffffffff)) *
          ((-iVar8 | 0x285ab8d7U) + (-iVar8 & 0x285ab8d7U));
  uVar6 = (ushort)(uVar1 >> (ulong)(0xcf50 - (-iVar8 ^ 0xffffffffU) & 0x1f));
  uVar7 = (ushort)uVar1;
  if ((ushort)((uVar6 | uVar7) & (uVar6 & uVar7 ^ 0xffff)) != in_w10) {
                    /* WARNING: Could not recover jumptable at 0x00221648. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_H128f9c_0027f4f0)((unaff_x29 ^ 8) + (unaff_x29 & 8) * 2);
    return;
  }
  *in_x9 = unaff_x25;
  uVar1 = -(int)DAT_00281e58;
  uVar3 = -(int)DAT_00281e58;
  plVar9 = *(long **)(unaff_x19 + 0x520);
  (*param_1)((&PTR_FUN_0027c1e0)
             [(long)(int)((uVar3 | 0xcc88cf42) + (uVar3 & 0xcc88cf42)) * 300 +
              (long)(int)((uVar1 | 0xcc88d03d) + (uVar1 & 0xcc88d03d))],plVar9);
  ppuVar2 = (undefined **)&DAT_0027d0e0;
  if (*plVar9 != 0) {
    ppuVar2 = &PTR_LAB_002762c0;
  }
                    /* WARNING: Could not recover jumptable at 0x002116f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


