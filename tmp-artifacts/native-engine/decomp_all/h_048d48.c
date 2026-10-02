// entry=0x48d48

void H48834(void)

{
  undefined **ppuVar1;
  bool bVar2;
  ulong in_x14;
  long in_x17;
  
  bVar2 = in_x14 < (-DAT_00275ca8 | 0x642804bbf97b18d4U) * 2 - (-DAT_00275ca8 ^ 0x642804bbf97b18d4U)
  ;
  ppuVar1 = &PTR_LAB_00280408;
  if (bVar2 == (*(char *)(in_x17 + ((-DAT_00275ca8 | 0x642804bbf97b14d5U) * 2 -
                                   (-DAT_00275ca8 ^ 0x642804bbf97b14d5U))) == '\0') || !bVar2) {
    ppuVar1 = (undefined **)&DAT_00285d58;
  }
                    /* WARNING: Could not recover jumptable at 0x0014959c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


