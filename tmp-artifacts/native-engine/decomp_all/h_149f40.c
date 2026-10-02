// entry=0x149f40

void H1489cc(void)

{
  undefined **ppuVar1;
  uint uVar2;
  int in_w6;
  undefined **in_x12;
  int in_w13;
  ulong in_x14;
  byte *in_x15;
  ulong uVar3;
  long unaff_x22;
  ulong unaff_x26;
  
  uVar2 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
  uVar3 = (unaff_x26 | -*(long *)(unaff_x22 + 0x260)) * 2 -
          (unaff_x26 ^ -*(long *)(unaff_x22 + 0x260));
  ppuVar1 = &PTR_LAB_002785e8;
  if ((in_x14 | uVar3) + (in_x14 & uVar3) !=
      (unaff_x26 + 0x167 | -*(long *)(unaff_x22 + 0x260)) +
      (unaff_x26 + 0x167 & -*(long *)(unaff_x22 + 0x260))) {
    ppuVar1 = in_x12;
  }
                    /* WARNING: Could not recover jumptable at 0x00248a64. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)((uint)*in_x15 &
                      (in_w13 * ((in_w6 + 0x21U | uVar2) * 2 - (in_w6 + 0x21U ^ uVar2)) ^ 0xffffffff
                      ));
  return;
}


