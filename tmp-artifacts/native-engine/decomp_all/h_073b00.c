// entry=0x73b00

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void H73b00(ulong param_1,ulong param_2,ulong param_3,undefined8 param_4,uint param_5,uint param_6)

{
  byte *pbVar1;
  undefined **ppuVar2;
  byte bVar3;
  uint uVar4;
  int iVar5;
  bool bVar6;
  long lVar7;
  uint uVar8;
  uint uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  char *in_x10;
  byte in_w11;
  ulong in_x14;
  byte in_w15;
  ulong uVar13;
  char cVar14;
  long in_x16;
  char in_w17;
  char *pcVar15;
  undefined1 auVar16 [16];
  
  do {
    param_5 = (param_5 ^ 0xffffff00) & param_5;
    param_5 = (param_5 | 1) * 2 - (param_5 ^ 1);
    param_6 = (param_6 ^ 0xffffff00) & param_6;
    pbVar1 = &stack0x00000610 + ((param_5 ^ 0xffffff00) & param_5);
    bVar3 = *pbVar1;
    param_6 = (param_6 ^ bVar3) + (param_6 & bVar3) * 2;
    *pbVar1 = (&stack0x00000610)[(param_6 ^ 0xffffff00) & param_6];
    (&stack0x00000610)[(param_6 ^ 0xffffff00) & param_6] = bVar3;
    cVar14 = *pbVar1 - (bVar3 ^ 0xff);
    bVar3 = (&DAT_0027ad10)[param_3];
    (&DAT_0027ad10)[param_3] = (bVar3 | cVar14 - 1U) & (bVar3 & cVar14 - 1U ^ 0xff);
    param_3 = (param_3 | 1) + (param_3 & 1);
  } while (param_3 != 0x10);
  iVar5 = (int)DAT_00276da8;
  bVar3 = (byte)DAT_00276da8;
  DAT_00285da8 = (bVar3 & 1 ^ DAT_00285da8 ^ 1) & bVar3 & 1;
  DAT_00286268 = (-iVar5 | 0x3994d2a0U) + (-iVar5 & 0x3994d2a0U);
  if (((in_w17 == '%' ^ (in_w15 | 1) & (in_w15 & 1 ^ 1) ^ 1) & in_w17 == '%') == 0) {
    (&stack0x00000468)
    [in_x14 + ((-DAT_00276da8 | 0x1a0a294d3994d2a0U) + (-DAT_00276da8 & 0x1a0a294d3994d2a0U)) * 0x80
    ] = in_w17;
                    /* WARNING: Could not recover jumptable at 0x00170084. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002806e8)(param_2,in_x14 | 1);
    return;
  }
  pcVar15 = (char *)(in_x16 + (-DAT_00276da8 ^ 0x1a0a294d3994d2a1U) +
                              (-DAT_00276da8 & 0x1a0a294d3994d2a1U) * 2);
  cVar14 = *pcVar15;
  switch(cVar14) {
  case 'd':
  case 'x':
    bVar6 = cVar14 != (byte)((-bVar3 & 0x7f | 4) * '\x02' - (-bVar3 ^ 4));
    uVar9 = 10;
    if (bVar6) {
      uVar9 = 0x10;
    }
    if (((in_w11 ^ bVar6) & in_w11 & 1) != 0) {
      (&stack0x00000468)[in_x14] = 0x2d;
                    /* WARNING: Could not recover jumptable at 0x001754bc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00282670)();
      return;
    }
    param_2 = param_2 & 0xffffffff;
    uVar10 = 0;
    do {
      uVar4 = 0;
      uVar8 = (uint)param_2;
      if (uVar9 != 0) {
        uVar4 = uVar8 / uVar9;
      }
      (&stack0x000004fc)[uVar10] =
           (&DAT_0027ad10)[(uVar8 ^ -(uVar4 * uVar9)) + (uVar8 & -(uVar4 * uVar9)) * 2];
      uVar13 = (-DAT_00276da8 ^ 0x1a0a294d3994d2a1U) + (-DAT_00276da8 & 0x1a0a294d3994d2a1U) * 2;
      uVar10 = (uVar10 | uVar13) + (uVar10 & uVar13);
      param_2 = (ulong)uVar4;
    } while (uVar9 <= uVar8);
    if (in_x14 < 0x80) {
                    /* WARNING: Could not recover jumptable at 0x00172dec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00275660)();
      return;
    }
    break;
  case 'l':
    pcVar15 = (char *)(in_x16 + 3);
    bVar6 = *(char *)(in_x16 + 3) != 'd';
    if (((in_w11 ^ bVar6) & in_w11 & 1) != 0) {
      (&stack0x00000468)[in_x14] = 0x2d;
      if (in_x14 <= 0x1a0a294d3994d31d - (-DAT_00276da8 ^ 0xffffffffffffffffU)) {
                    /* WARNING: Could not recover jumptable at 0x00175364. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_002793d8)();
        return;
      }
      (&stack0x000004e7)
      [((-DAT_00276da8 | 0x1a0a294d3994d2a0U) + (-DAT_00276da8 & 0x1a0a294d3994d2a0U)) * 0x80] = 0;
      lVar7 = 0x1a0a294d3994d23b - (-DAT_00276da8 ^ 0xffffffffffffffffU);
      CallSupervisor(0);
      ppuVar2 = &PTR_LAB_0027c0f8 +
                (long)(int)((-iVar5 | 0x3994d2a0U) * 2 - (-iVar5 ^ 0x3994d2a0U)) * 99;
      if ((ulong)((lVar7 << 0x20) >> (-DAT_00276da8 & 0x3fU)) < 0xfffffffffffff001) {
        ppuVar2 = &PTR_LAB_002751b8;
      }
                    /* WARNING: Could not recover jumptable at 0x00171dd4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar2)(lVar7,&stack0x00000468,
                          (-DAT_00276da8 | 0x1a0a294d3994d2a0U) +
                          (-DAT_00276da8 & 0x1a0a294d3994d2a0U),
                          0x1a0a294d3994d29f - (-DAT_00276da8 ^ 0xffffffffffffffffU));
      return;
    }
    uVar10 = (-DAT_00276da8 | 0x1a0a294d3994d2aaU) + (-DAT_00276da8 & 0x1a0a294d3994d2aaU);
    if (bVar6) {
      uVar10 = (-DAT_00276da8 | 0x1a0a294d3994d2b0U) + (-DAT_00276da8 & 0x1a0a294d3994d2b0U);
    }
    uVar13 = 0;
    do {
      uVar12 = uVar13;
      uVar11 = 0;
      if (uVar10 != 0) {
        uVar11 = param_1 / uVar10;
      }
      (&stack0x000004e8)[uVar12] =
           (&DAT_0027ad10)
           [(param_1 | -(uVar11 * uVar10)) + (param_1 & -(uVar11 * uVar10)) +
            (0x1a0a294d3994d29f - (-DAT_00276da8 ^ 0xffffffffffffffffU)) * 0x10];
      bVar6 = uVar10 <= param_1;
      uVar13 = (uVar12 | 1) + (uVar12 & 1);
      param_1 = uVar11;
    } while (bVar6);
    if (in_x14 < 0x80) {
      uVar13 = (long)(uVar12 << (-DAT_00276da8 & 0x3fU)) >> 0x20;
      uVar10 = uVar13;
      if (-1 < (long)uVar13) {
        uVar10 = 0;
      }
      uVar10 = (uVar13 ^ -uVar10) + (uVar13 & -uVar10) * 2;
      uVar11 = (-in_x14 ^ 0x7f) + (-in_x14 & 0x7f) * 2;
      if (uVar11 <= uVar10) {
        uVar10 = uVar11;
      }
      uVar10 = uVar10 + 1;
      if (uVar10 < 0x1a0a294d3994d2af - (-DAT_00276da8 ^ 0xffffffffffffffffU)) {
                    /* WARNING: Could not recover jumptable at 0x00170734. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)(&PTR_LAB_0027baa0)[(int)(0x3994d303 - (-iVar5 ^ 0xffffffffU))])();
        return;
      }
      uVar11 = 0;
      do {
        auVar16 = a64_TBL(ZEXT816(0),
                          *(undefined1 (*) [16])
                           (&stack0x1a0a294d3994d779 +
                           (((uVar13 ^ -uVar11) + (uVar13 & -uVar11) * 2) - DAT_00276da8)),
                          _DAT_0012c6c0);
        *(long *)((long)(&stack0x00000468 +
                        (uVar11 | in_x14) + (uVar11 & in_x14) +
                        ((-DAT_00276da8 | 0xa294d3994d2a0U) + (-DAT_00276da8 & 0xa294d3994d2a0U)) *
                        0x80) + 8) = auVar16._8_8_;
        *(long *)(&stack0x00000468 +
                 (uVar11 | in_x14) + (uVar11 & in_x14) +
                 ((-DAT_00276da8 | 0xa294d3994d2a0U) + (-DAT_00276da8 & 0xa294d3994d2a0U)) * 0x80) =
             auVar16._0_8_;
        uVar11 = (uVar11 ^ 0x10) + (uVar11 & 0x10) * 2;
      } while (uVar11 != ((uVar10 ^ 0xf) & uVar10));
                    /* WARNING: Could not recover jumptable at 0x001756c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_0027a210)();
      return;
    }
    break;
  case 's':
    cVar14 = *in_x10;
    if (cVar14 != (byte)((-bVar3 | 0xa0) + (-bVar3 & 0xa0))) {
      do {
        (&stack0x00000468)[in_x14] = cVar14;
        uVar10 = (-DAT_00276da8 | 0x1a0a294d3994d2a1U) + (-DAT_00276da8 & 0x1a0a294d3994d2a1U);
        in_x14 = (in_x14 ^ uVar10) + (in_x14 & uVar10) * 2;
        cVar14 = in_x10[1];
        bVar6 = in_x14 < (-DAT_00276da8 | 0x1a0a294d3994d320U) +
                         (-DAT_00276da8 & 0x1a0a294d3994d320U);
        in_x10 = in_x10 + 1;
      } while (bVar6 != (cVar14 == (byte)((-bVar3 | 0xa0) + (-bVar3 & 0xa0))) && bVar6);
    }
  }
  bVar6 = in_x14 < (-DAT_00276da8 | 0x1a0a294d3994d320U) * 2 - (-DAT_00276da8 ^ 0x1a0a294d3994d320U)
  ;
  ppuVar2 = &PTR_LAB_0027d718;
  if (bVar6 == (pcVar15[1] == '\0') || !bVar6) {
    ppuVar2 = &PTR_LAB_00280c38;
  }
                    /* WARNING: Could not recover jumptable at 0x00178e2c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


