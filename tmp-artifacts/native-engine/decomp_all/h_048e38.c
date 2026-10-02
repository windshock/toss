// entry=0x48e38

void H48e38(void)

{
  undefined **ppuVar1;
  ushort in_w10;
  int iVar2;
  long unaff_x19;
  
  iVar2 = (int)DAT_00275ca8;
  *(undefined **)(unaff_x19 + 0x310) =
       (&PTR_FUN_0027c1e0)
       [(long)(int)((-iVar2 | 0xf97b14d4U) * 2 - (-iVar2 ^ 0xf97b14d4U)) * 300 +
        (long)(int)((-iVar2 ^ 0xf97b14f6U) + (-iVar2 & 0xf97b14f6U) * 2)];
  ppuVar1 = &PTR_LAB_00275778;
  if ((uint)in_w10 != (-iVar2 ^ 0xf97b14d4U) + (-iVar2 & 0xf97b14d4U) * 2) {
    ppuVar1 = &PTR_LAB_00285a08 +
              (long)(int)(-0x684eb2d - (-(int)DAT_00275ca8 ^ 0xffffffffU)) * 0x79;
  }
                    /* WARNING: Could not recover jumptable at 0x001571f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


