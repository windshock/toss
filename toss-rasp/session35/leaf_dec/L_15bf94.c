// FUN_0015bf70 @0015bf70

void FUN_0015bf70(void)

{
  undefined **ppuVar1;
  uint uVar2;
  short in_w8;
  long in_x9;
  int in_w11;
  long in_x12;
  uint uVar3;
  long unaff_x19;
  
  do {
    uVar2 = in_w11 * ((-(int)DAT_00275ca8 | 0xf97c1513U) * 2 - (-(int)DAT_00275ca8 ^ 0xf97c1513U));
    uVar3 = (uint)**(byte **)(unaff_x19 + 0x330);
    in_w11 = (uVar2 | uVar3) * 2 - (uVar2 ^ uVar3);
    in_x12 = (in_x12 - ((-DAT_00275ca8 | 0x642804bbf97b14d5U) +
                        (-DAT_00275ca8 & 0x642804bbf97b14d5U) ^ 0xffffffffffffffff)) + -1;
    *(byte **)(unaff_x19 + 0x330) =
         *(byte **)(unaff_x19 + 0x330) +
         (-DAT_00275ca8 ^ 0x642804bbf97b14d5U) + (-DAT_00275ca8 & 0x642804bbf97b14d5U) * 2;
  } while (in_x12 != in_x9);
  uVar2 = -(int)DAT_00275ca8;
  uVar3 = -(int)DAT_00275ca8;
  ppuVar1 = &PTR_LAB_00276930 + (int)((uVar2 ^ 0xf97b14fe) + (uVar2 & 0xf97b14fe) * 2);
  if ((short)in_w11 != in_w8) {
    ppuVar1 = &PTR_LAB_00274108 + (int)((uVar3 | 0xf97b14de) + (uVar3 & 0xf97b14de));
  }
                    /* WARNING: Could not recover jumptable at 0x0015450c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}

