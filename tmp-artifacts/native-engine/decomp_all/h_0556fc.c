// entry=0x556fc

void H5535c(void)

{
  long *plVar1;
  uint in_w8;
  byte bVar2;
  uint uVar3;
  long unaff_x19;
  byte *unaff_x20;
  byte unaff_w22;
  long lVar4;
  
  bVar2 = *unaff_x20;
  uVar3 = 0xf97b14d3 - (-(int)DAT_00275ca8 ^ 0xffffffffU);
  if (bVar2 != 0) {
    uVar3 = 0;
    do {
      uVar3 = uVar3 << 5 ^ uVar3 >> 0x1b;
      uVar3 = (uVar3 | bVar2) & (uVar3 & bVar2 ^ 0xffffffff);
      bVar2 = unaff_x20[1];
      unaff_x20 = unaff_x20 + 1;
    } while (bVar2 != 0);
  }
  if (in_w8 == uVar3) {
    plVar1 = (long *)FUN_0026eefc(&DAT_00286190);
    lVar4 = *(long *)(unaff_x19 + 0x1e8);
    *(ulong *)(lVar4 + 8) =
         (*(ulong *)(*plVar1 + 0x58) | *(ulong *)(unaff_x19 + 0x1d0)) &
         (*(ulong *)(*plVar1 + 0x58) & *(ulong *)(unaff_x19 + 0x1d0) ^ 0xffffffffffffffff);
    *(byte *)(lVar4 + 0x60) =
         *(byte *)(lVar4 + 0x60) & unaff_w22 & 1 | *(byte *)(lVar4 + 0x60) ^ unaff_w22 & 1;
                    /* WARNING: Could not recover jumptable at 0x0015e524. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027ef20)(lVar4 + 0x61);
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00159154. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027b690)();
  return;
}


