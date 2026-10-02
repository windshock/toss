// entry=0x4eb54

void H4eb54(void)

{
  ulong uVar1;
  uint uVar2;
  int in_w8;
  ulong in_x9;
  byte *in_x10;
  
  do {
    uVar2 = in_w8 * ((-(int)DAT_00275ca8 | 0xf97c1513U) + (-(int)DAT_00275ca8 & 0xf97c1513U));
    in_w8 = (uVar2 | *in_x10) + (uVar2 & *in_x10);
    uVar1 = (-DAT_00275ca8 | 0x642804bbf97b14d5U) + (-DAT_00275ca8 & 0x642804bbf97b14d5U);
    in_x9 = (in_x9 | uVar1) + (in_x9 & uVar1);
    in_x10 = in_x10 + ((-DAT_00275ca8 | 0x642804bbf97b14d5U) * 2 -
                      (-DAT_00275ca8 ^ 0x642804bbf97b14d5U));
  } while (in_x9 != (-DAT_00275ca8 | 0x642804bbf97b14dbU) + (-DAT_00275ca8 & 0x642804bbf97b14dbU));
                    /* WARNING: Could not recover jumptable at 0x001518d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00280e70)(in_w8);
  return;
}


