// entry=0x4a698

void H496f8(void)

{
  undefined **ppuVar1;
  bool bVar2;
  ulong in_x12;
  long in_x13;
  
  bVar2 = in_x12 < (-DAT_00275ca8 ^ 0x642804bbf97b18d4U) + (-DAT_00275ca8 & 0x642804bbf97b18d4U) * 2
  ;
  ppuVar1 = &PTR_LAB_00282c48;
  if (bVar2 == (*(char *)(in_x13 + (0x642804bbf97b14d4 - (-DAT_00275ca8 ^ 0xffffffffffffffffU))) ==
               '\0') || !bVar2) {
    ppuVar1 = &PTR_LAB_0027e5b8;
  }
                    /* WARNING: Could not recover jumptable at 0x0015c6ec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


