// entry=0x52648

void H52648(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint in_w8;
  long in_x9;
  byte in_w10;
  
  uVar2 = in_w8 << 5 ^ in_w8 >> 0x1b;
  ppuVar1 = &PTR_LAB_0027d668;
  if (*(char *)(in_x9 + (-DAT_00275ca8 ^ 0x642804bbf97b14d5U) +
                        (-DAT_00275ca8 & 0x642804bbf97b14d5U) * 2) != '\0') {
    ppuVar1 = &PTR_H52648_002807e0;
  }
                    /* WARNING: Could not recover jumptable at 0x001526d4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)((uVar2 ^ 0xffffffff) & (uint)in_w10 | uVar2 & (in_w10 ^ 0xffffffff));
  return;
}


