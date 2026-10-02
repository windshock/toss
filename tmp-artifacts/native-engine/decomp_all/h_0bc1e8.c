// entry=0xbc1e8

void Hbc1e8(long param_1,ulong param_2)

{
  bool bVar1;
  undefined **ppuVar2;
  char cVar3;
  uint uVar4;
  uint uVar5;
  ulong uVar6;
  ulong uVar7;
  long *in_x10;
  long in_x11;
  char *in_x16;
  uint uVar8;
  long lVar9;
  uint *puVar10;
  ulong unaff_x20;
  
  puVar10 = (uint *)*in_x10;
  *in_x10 = (long)(puVar10 + 2);
  uVar8 = *puVar10;
  cVar3 = *in_x16;
  uVar4 = 0xac9a0c05 - (-(int)DAT_00281720 ^ 0xffffffffU);
  if (cVar3 != 'x') {
    uVar4 = 10;
  }
  if ((int)uVar8 < 0 != ((cVar3 == 'd') == (cVar3 == 'i')) && (int)uVar8 < 0) {
    if (unaff_x20 < param_2) {
      *(byte *)(param_1 + unaff_x20) = (-(char)DAT_00281720 | 0x23U) + (-(char)DAT_00281720 & 0x23U)
      ;
    }
                    /* WARNING: Could not recover jumptable at 0x001bdbc0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027d8c8)();
    return;
  }
  uVar6 = 0;
  do {
    uVar7 = uVar6;
    uVar5 = 0;
    if (uVar4 != 0) {
      uVar5 = uVar8 / uVar4;
    }
    *(undefined1 *)(in_x11 + uVar7) = (&DAT_0027ad10)[(uVar8 - (-(uVar5 * uVar4) ^ 0xffffffff)) - 1]
    ;
    bVar1 = uVar4 <= uVar8;
    uVar6 = (uVar7 | 1) + (uVar7 & 1);
    uVar8 = uVar5;
  } while (bVar1);
  lVar9 = (long)(uVar7 << ((-DAT_00281720 ^ 0xc16U) + (-DAT_00281720 & 0xc16U) * 2 & 0x3f)) >> 0x20;
  uVar6 = lVar9 + 1;
  if (-1 < lVar9) {
    lVar9 = 0;
  }
  ppuVar2 = &PTR_LAB_00276c18;
  if (1 < (uVar6 | -lVar9) * 2 - (uVar6 ^ -lVar9)) {
    ppuVar2 = &PTR_LAB_00279c80;
  }
                    /* WARNING: Could not recover jumptable at 0x001bc06c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


