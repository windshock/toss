// FUN_00154174 @00154174

void FUN_00154174(void)

{
  undefined **ppuVar1;
  int iVar2;
  long unaff_x19;
  
  iVar2 = (int)DAT_00275ca8;
  *(undefined **)(unaff_x19 + 0x308) =
       (&PTR_FUN_0027c1e0)
       [(long)(int)((-iVar2 | 0xf97b14d4U) + (-iVar2 & 0xf97b14d4U)) * 300 +
        (long)(int)((-iVar2 ^ 0xf97b14dfU) + (-iVar2 & 0xf97b14dfU) * 2)];
  ppuVar1 = &PTR_LAB_0027ff68;
  if ((-iVar2 | 0xf97b14d4U) * 2 - (-iVar2 ^ 0xf97b14d4U) != 0x80) {
    ppuVar1 = &PTR_FUN_00280020;
  }
  (*(code *)*ppuVar1)(0xfdfc);
  return;
}

