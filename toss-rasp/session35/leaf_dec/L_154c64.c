// FUN_00154bf0 @00154bf0

void FUN_00154bf0(void)

{
  undefined **ppuVar1;
  bool bVar2;
  ulong in_x12;
  undefined1 in_w15;
  long in_x16;
  long unaff_x26;
  
  *(undefined1 *)(unaff_x26 + (0x642804bbf97b14d4 - DAT_00275ca8) * 0x400 + in_x12) = in_w15;
  bVar2 = (in_x12 | 1) + (in_x12 & 1) < 0x642804bbf97b18d4U - DAT_00275ca8;
  ppuVar1 = &PTR_FUN_002794b0;
  if (!bVar2 || (*(char *)(in_x16 + 1) != '\0') != bVar2) {
    ppuVar1 = &PTR_caseD_1_00276a28;
  }
                    /* WARNING: Could not recover jumptable at 0x00154c80. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(0);
  return;
}

