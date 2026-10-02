// entry=0x5b794

void H5b794(ulong param_1)

{
  undefined **ppuVar1;
  int iVar2;
  long *plVar3;
  ulong uVar4;
  char in_w10;
  uint uVar5;
  char cVar6;
  uint uVar7;
  uint in_w13;
  long in_x14;
  byte in_w15;
  long unaff_x19;
  ulong *puVar8;
  ulong unaff_x21;
  undefined4 unaff_w23;
  long unaff_x26;
  ulong unaff_x27;
  
  do {
    uVar7 = (uint)DAT_00275ca8;
    uVar5 = in_w13 << (ulong)((-uVar7 ^ 0x14d9) + (-uVar7 & 0x14d9) * 2 & 0x1f);
    uVar5 = (uVar5 ^ 0xf98b14b3 - (-uVar7 ^ 0xffffffff) ^ 0xffffffff) & uVar5;
    in_w13 = (uVar5 | in_w15) & (uVar5 & in_w15 ^ 0xffffffff);
    in_w15 = *(byte *)(in_x14 + 1);
    in_x14 = in_x14 + 1;
  } while (in_w15 != 0);
  if (in_w13 == 0x68a6b) {
    puVar8 = (ulong *)**(undefined8 **)(unaff_x19 + 0x2a8);
    if (puVar8 == (ulong *)0x0) {
      iVar2 = (*(code *)(&PTR_FUN_0027c1e0)
                        [(long)(int)((-uVar7 | 0xf97b14d4) * 2 - (-uVar7 ^ 0xf97b14d4)) * 300 +
                         (long)(int)((-uVar7 ^ 0xf97b15e6) + (-uVar7 & 0xf97b15e6) * 2)])
                        (unaff_w23,unaff_x26 + unaff_x27,(-unaff_x27 | 0x800) + (-unaff_x27 & 0x800)
                        );
      if ((int)((-(int)DAT_00275ca8 ^ 0xf97b14d4U) + (-(int)DAT_00275ca8 & 0xf97b14d4U) * 2) < iVar2
         ) {
        unaff_x27 = ((long)iVar2 | unaff_x27) + ((long)iVar2 & unaff_x27);
      }
      ppuVar1 = &PTR_LAB_00274a98;
      if (unaff_x27 != 0) {
        ppuVar1 = &PTR_LAB_0027e8f8;
      }
                    /* WARNING: Could not recover jumptable at 0x0014d924. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar1)();
      return;
    }
    plVar3 = (long *)FUN_0026eefc(&DAT_00286190);
    uVar4 = *(ulong *)(*plVar3 + 0x50);
    if ((((*puVar8 | uVar4) & (*puVar8 & uVar4 ^ 0xffffffffffffffff)) <=
         *(ulong *)(unaff_x19 + 0x1d8)) &&
       (uVar4 = *(ulong *)(*plVar3 + 0x58),
       *(ulong *)(unaff_x19 + 0x1d0) <=
       ((uVar4 | puVar8[1]) & (uVar4 & puVar8[1] ^ 0xffffffffffffffff)))) {
      ppuVar1 = &PTR_LAB_00285ac0;
      if ((unaff_x21 & 1) == 0) {
        ppuVar1 = &PTR_LAB_0027d8c0;
      }
                    /* WARNING: Could not recover jumptable at 0x0015d3d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar1)();
      return;
    }
                    /* WARNING: Could not recover jumptable at 0x0014c59c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*DAT_0027eea0)();
    return;
  }
  uVar5 = -(uVar7 & 1);
  cVar6 = '/';
  if (in_w10 == '/') {
    in_w10 = **(char **)(unaff_x19 + 0x238);
    uVar5 = 0xffffffff - (uVar7 & 1);
    cVar6 = 'd';
    if (in_w10 == 'd') {
      in_w10 = **(char **)(unaff_x19 + 0x230);
      cVar6 = 'a';
      uVar5 = 1;
      if (in_w10 == 'a') {
                    /* WARNING: Could not recover jumptable at 0x0014a558. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_00274508)();
        return;
      }
    }
  }
  if (cVar6 == in_w10) {
    ppuVar1 = &PTR_H592b8_0027d6f8;
    if ((param_1 & 1) == 0) {
      ppuVar1 = &PTR_LAB_00275c40;
    }
                    /* WARNING: Could not recover jumptable at 0x0015d1e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  ppuVar1 = &PTR_LAB_00277f60;
  if ((uVar5 & 1) == 0) {
    ppuVar1 = &PTR_LAB_00277820 + (long)(int)(-0x684eb2d - (-uVar7 ^ 0xffffffff)) * 0x52;
  }
                    /* WARNING: Could not recover jumptable at 0x00153750. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


