// entry=0xb7ab4

void Hb7ab4(ulong param_1)

{
  uint uVar1;
  byte *pbVar2;
  ulong uVar3;
  ushort uVar4;
  byte bVar5;
  uint uVar6;
  char cVar7;
  bool bVar8;
  long lVar9;
  ushort uVar10;
  uint uVar11;
  int iVar12;
  undefined8 uVar13;
  ulong uVar14;
  long unaff_x19;
  long unaff_x27;
  long *unaff_x29;
  
  if ((param_1 & 1) != 0) {
    uVar4 = (DAT_00281e18 ^ 0x8ba7 - (-(short)DAT_0027acf8 ^ 0xffffU) ^ 0xffff) & DAT_00281e18;
    cVar7 = (char)(DAT_00281e18 >> 8);
    uVar10 = ((short)cVar7 ^ 0xfff8U) & (short)cVar7;
    uVar1 = (int)(short)(uVar10 | 0x41c8) + (int)(short)(uVar10 & 0x41c8);
    uVar1 = (uVar1 ^ 0xfff8) & 0xffff & uVar1;
    uVar10 = -(short)DAT_0027acf8;
    uVar14 = 0xc2e3e36336dd8aa8 - (-DAT_0027acf8 ^ 0xffffffffffffffffU);
    iVar12 = (int)DAT_0027acf8;
    uVar11 = (-iVar12 | 0x1a8e8eb3U) + (-iVar12 & 0x1a8e8eb3U);
    if ((short)((int)(short)((uVar4 ^ (ushort)(1 << (ulong)(uVar1 & 0x1f)) ^ 0xffff) & uVar4) >>
               (uVar1 & 0x1f)) == (ushort)((uVar10 ^ 0x8aaa) + (uVar10 & 0xaaa) * 2)) {
      DAT_0029e854 = 0;
      memset((void *)(unaff_x27 + (-0x3d1c1c9cc9227558 - (-DAT_0027acf8 ^ 0xffffffffffffffffU))),0,
             0x5c);
                    /* WARNING: Could not recover jumptable at 0x001b64b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00275b10)();
      return;
    }
    do {
      pbVar2 = &DAT_00282ee8 +
               (uVar14 << (0xc2e3e36336dd8aaa - (-DAT_0027acf8 ^ 0xffffffffffffffffU) & 0x3f));
      uVar1 = (uint)pbVar2[(-DAT_0027acf8 | 0xc2e3e36336dd8aaaU) +
                           (-DAT_0027acf8 & 0xc2e3e36336dd8aaaU)] <<
              (ulong)((-iVar12 ^ 0x36dd8ab1U) + (-iVar12 & 0x36dd8ab1U) * 2 & 0x1f);
      uVar6 = uVar1 & *pbVar2 | uVar1 ^ *pbVar2;
      uVar1 = (uint)pbVar2[-0x3d1c1c9cc9227556 - (-DAT_0027acf8 ^ 0xffffffffffffffffU)] <<
              (ulong)((-iVar12 | 0x8ab9U) + (-iVar12 & 0x8ab9U) & 0x1f);
      uVar6 = uVar6 & uVar1 | uVar6 ^ uVar1;
      uVar1 = (uint)pbVar2[(-DAT_0027acf8 | 0xc2e3e36336dd8aacU) * 2 -
                           (-DAT_0027acf8 ^ 0xc2e3e36336dd8aacU)] <<
              (ulong)((-iVar12 | 0x8ac1U) + (-iVar12 & 0x8ac1U) & 0x1f);
      uVar6 = (uVar6 & uVar1 | uVar6 ^ uVar1) * ((-iVar12 | 0x92af743eU) + (-iVar12 & 0x92af743eU));
      uVar1 = uVar6 >> (ulong)(0x8ac0 - (-iVar12 ^ 0xffffffffU) & 0x1f);
      uVar1 = ((uVar1 ^ 0xffffffff) & uVar6 | uVar1 & (uVar6 ^ 0xffffffff)) *
              ((-iVar12 ^ 0x92af743eU) + (-iVar12 & 0x92af743eU) * 2);
      uVar11 = uVar11 * ((-iVar12 | 0x92af743eU) + (-iVar12 & 0x92af743eU));
      uVar11 = (uVar1 | uVar11) & (uVar1 & uVar11 ^ 0xffffffff);
      uVar3 = (-DAT_0027acf8 ^ 0xc2e3e36336dd8aaaU) + (-DAT_0027acf8 & 0xc2e3e36336dd8aaaU) * 2;
      uVar14 = (uVar14 | uVar3) * 2 - (uVar14 ^ uVar3);
    } while (uVar14 != (-DAT_0027acf8 | 0xc2e3e36336dd8aaeU) + (-DAT_0027acf8 & 0xc2e3e36336dd8aaeU)
            );
    uVar1 = (-iVar12 | 0x36dd8aa9U) + (-iVar12 & 0x36dd8aa9U);
    uVar6 = ((uVar1 | DAT_00282efc) & (uVar1 & DAT_00282efc ^ 0xffffffff)) *
            (-0x6d508bc3 - (-iVar12 ^ 0xffffffffU));
    uVar1 = uVar6 >> (ulong)((-iVar12 ^ 0x8ac1U) + (-iVar12 & 0x8ac1U) * 2 & 0x1f);
    uVar1 = ((uVar1 | uVar6) & (uVar1 & uVar6 ^ 0xffffffff)) *
            (-0x6d508bc3 - (-iVar12 ^ 0xffffffffU));
    uVar11 = uVar11 * ((-iVar12 ^ 0x92af743eU) + (-iVar12 & 0x92af743eU) * 2);
    uVar11 = ((uVar1 | uVar11) & (uVar1 & uVar11 ^ 0xffffffff)) *
             ((-iVar12 | 0x92af743eU) * 2 - (-iVar12 ^ 0x92af743eU));
    uVar1 = (-iVar12 | 0x9200e7aeU) + (-iVar12 & 0x9200e7aeU);
    uVar11 = (uVar11 ^ 0xffffffff) & uVar1 | uVar11 & (uVar1 ^ 0xffffffff);
    uVar1 = uVar11 >> (ulong)((-iVar12 | 0x8ab6U) * 2 - (-iVar12 ^ 0x8ab6U) & 0x1f);
    uVar11 = ((uVar1 | uVar11) & (uVar1 & uVar11 ^ 0xffffffff)) *
             ((-iVar12 ^ 0x92af743eU) + (-iVar12 & 0x92af743eU) * 2);
    uVar1 = uVar11 >> (ulong)((-iVar12 ^ 0x8ab8U) + (-iVar12 & 0x8ab8U) * 2 & 0x1f);
    if (((uVar1 ^ 0xffffffff) & uVar11 | uVar1 & (uVar11 ^ 0xffffffff)) != 0x6251edc7) {
      *(undefined8 *)(((ulong)unaff_x29 ^ 8) + ((ulong)unaff_x29 & 8) * 2) = 0x10;
      *unaff_x29 = -0x3d1c1c9cc9227544 - (-DAT_0027acf8 ^ 0xffffffffffffffffU);
      lVar9 = tpidr_el0;
      if (*(long *)(lVar9 + 0x28) == unaff_x29[-0xc]) {
        return;
      }
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
    uVar14 = 0;
    bVar5 = 0;
    do {
      *(byte *)(unaff_x19 + 0x20 +
                (-0x3d1c1c9cc9227558 - (-DAT_0027acf8 ^ 0xffffffffffffffffU)) * 0x100 + uVar14) =
           bVar5;
      uVar14 = (uVar14 ^ 1) + (uVar14 & 1) * 2;
      bVar5 = (bVar5 | 1) * '\x02' - (bVar5 ^ 1);
    } while (uVar14 != 0x100);
    pbVar2 = (byte *)(unaff_x19 + 0x20);
    bVar5 = *pbVar2;
    uVar1 = bVar5 + 0x86;
    *pbVar2 = pbVar2[(uVar1 ^ 0xffffff00) & uVar1];
    pbVar2[(uVar1 ^ 0xffffff00) & uVar1] = bVar5;
                    /* WARNING: Could not recover jumptable at 0x001b7fc0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027abf8)(0);
    return;
  }
  do {
    if (DAT_0029e854 != 0) {
      ClearExclusiveLocal();
      uVar13 = 0;
      goto LAB_001b77d0;
    }
    cVar7 = '\x01';
    bVar8 = (bool)ExclusiveMonitorPass(0x29e854,0x10);
    if (bVar8) {
      DAT_0029e854 = 1;
      cVar7 = ExclusiveMonitorsStatus();
    }
  } while (cVar7 != '\0');
  uVar13 = 1;
LAB_001b77d0:
                    /* WARNING: Could not recover jumptable at 0x001b77dc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00283240)(uVar13);
  return;
}


