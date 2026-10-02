// entry=0x4aaa0

void H4a9d8(void)

{
  char cVar1;
  uint uVar2;
  uint uVar3;
  ushort uVar4;
  int iVar5;
  ulong *puVar6;
  long *plVar7;
  ulong uVar8;
  ushort in_w8;
  int iVar9;
  long lVar10;
  uint in_w9;
  long unaff_x19;
  char *pcVar11;
  byte unaff_w22;
  undefined8 uVar12;
  byte unaff_w23;
  undefined1 unaff_w24;
  
  uVar4 = (ushort)((short)(0x14d5 - (-(short)DAT_00275ca8 ^ 0xffffU)) + -1 << (ulong)(in_w9 & 0x1f))
  ;
  DAT_00281e18 = in_w8 & uVar4 | in_w8 ^ uVar4;
  iVar5 = (int)DAT_00275ca8;
  DAT_0029e854 = (iVar5 * -2 | 0xf2f629a8U) - (-iVar5 ^ 0xf97b14d4U);
  puVar6 = (ulong *)(*(code *)(&PTR_FUN_0027c1e0)
                              [(long)(int)((iVar5 * -2 | 0xf2f629a8U) - (-iVar5 ^ 0xf97b14d4U)) *
                               300 + (long)(int)((-iVar5 ^ 0xf97b1518U) + (-iVar5 & 0x797b1518U) * 2
                                                )])(0);
  plVar7 = (long *)FUN_0026eefc(&DAT_00286190);
  lVar10 = *plVar7;
  *puVar6 = (*(ulong *)(lVar10 + 0x50) ^ 0xffffffffffffffff) & *(ulong *)(unaff_x19 + 0x1d8) |
            *(ulong *)(lVar10 + 0x50) & (*(ulong *)(unaff_x19 + 0x1d8) ^ 0xffffffffffffffff);
  puVar6[1] = (*(ulong *)(lVar10 + 0x58) | *(ulong *)(unaff_x19 + 0x1d0)) &
              (*(ulong *)(lVar10 + 0x58) & *(ulong *)(unaff_x19 + 0x1d0) ^ 0xffffffffffffffff);
  *(uint *)(puVar6 + 2) =
       (*(uint *)(lVar10 + 0x60) ^ 0xffffffff) & *(uint *)(unaff_x19 + 0x18c) |
       *(uint *)(lVar10 + 0x60) & (*(uint *)(unaff_x19 + 0x18c) ^ 0xffffffff);
  *(byte *)(puVar6 + 7) = -0x2d - (-(char)DAT_00275ca8 ^ 0xffU);
  *(byte *)(puVar6 + 10) = (-(char)DAT_00275ca8 | 0xd4U) * '\x02' - (-(char)DAT_00275ca8 ^ 0xd4U);
  *(byte *)(puVar6 + 0xc) = unaff_w22 & 1;
  *(byte *)((long)puVar6 + 0x61) = unaff_w23 & 1;
  *(undefined1 *)((long)puVar6 + 0x62) = unaff_w24;
  uVar2 = -(int)DAT_00275ca8;
  uVar3 = -(int)DAT_00275ca8;
  pcVar11 = *(char **)(unaff_x19 + 0x298);
  uVar12 = *(undefined8 *)(unaff_x19 + 0x1f0);
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar2 | 0xf97b14d4) + (uVar2 & 0xf97b14d4)) * 300 +
             (long)(int)((uVar3 | 0xf97b1597) * 2 - (uVar3 ^ 0xf97b1597))])(&DAT_00282ee8,uVar12);
  uVar2 = -(int)DAT_00275ca8;
  uVar3 = -(int)DAT_00275ca8;
  iVar5 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar3 | 0xf97b14d4) * 2 - (uVar3 ^ 0xf97b14d4)) * 300 +
                     (long)(int)((uVar2 | 0xf97b14f8) * 2 - (uVar2 ^ 0xf97b14f8))])(uVar12);
  iVar9 = (int)DAT_00275ca8;
  if (iVar5 < (int)(-0x684eb15 - (-iVar9 ^ 0xffffffffU))) {
    uVar8 = (*(code *)(&PTR_FUN_0027c1e0)
                      [(long)(int)(-0x684eb2d - (-iVar9 ^ 0xffffffffU)) * 300 +
                       (long)(int)((-iVar9 | 0xf97b150aU) + (-iVar9 & 0xf97b150aU))])(pcVar11,4);
    puVar6[3] = uVar8;
                    /* WARNING: Could not recover jumptable at 0x0014a144. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002857f8)(0);
    return;
  }
  do {
    cVar1 = *pcVar11;
    pcVar11 = pcVar11 + 1;
  } while (cVar1 != (byte)((-(char)DAT_00275ca8 | 0xd4U) * '\x02' - (-(char)DAT_00275ca8 ^ 0xd4U)));
                    /* WARNING: Could not recover jumptable at 0x0015eb54. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00280918)();
  return;
}


