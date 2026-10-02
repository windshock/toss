// entry=0x10c064

void H1096d4(void)

{
  undefined **ppuVar1;
  uint uVar2;
  byte *unaff_x20;
  
  uVar2 = -(uint)((*unaff_x20 & 1) != 0);
  ppuVar1 = &PTR_LAB_00275760;
  if (((DAT_0029e7c8 == 1 ^ *unaff_x20 & 1 ^ 1) & DAT_0029e7c8 == 1) == 0) {
    ppuVar1 = &PTR_LAB_0027df30;
  }
  DAT_0029e7c8 = (DAT_0029e7c8 | uVar2) * 2 - (DAT_0029e7c8 ^ uVar2);
                    /* WARNING: Could not recover jumptable at 0x00209744. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


