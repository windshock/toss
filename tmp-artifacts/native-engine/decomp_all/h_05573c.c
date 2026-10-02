// entry=0x5573c

void H5573c(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  long unaff_x19;
  undefined8 unaff_x21;
  undefined4 unaff_w23;
  long unaff_x24;
  long unaff_x26;
  ulong unaff_x27;
  
  *(undefined8 *)(unaff_x24 + 0x68) = unaff_x21;
  *(undefined4 *)(unaff_x19 + 0x1cc) = 1;
  uVar2 = -(int)DAT_00275ca8;
  uVar3 = -(int)DAT_00275ca8;
  iVar4 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar3 | 0xf97b14d4) * 2 - (uVar3 ^ 0xf97b14d4)) * 300 +
                     (long)(int)((uVar2 ^ 0xf97b15e6) + (uVar2 & 0xf97b15e6) * 2)])
                    (unaff_w23,unaff_x26 + unaff_x27,(-unaff_x27 | 0x800) + (-unaff_x27 & 0x800));
  if ((int)((-(int)DAT_00275ca8 ^ 0xf97b14d4U) + (-(int)DAT_00275ca8 & 0xf97b14d4U) * 2) < iVar4) {
    unaff_x27 = ((long)iVar4 | unaff_x27) + ((long)iVar4 & unaff_x27);
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


