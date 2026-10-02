// entry=0x563c0

void H563c0(void)

{
  undefined **ppuVar1;
  int iVar2;
  long unaff_x19;
  
  iVar2 = (int)DAT_00275ca8;
  *(undefined **)(unaff_x19 + 0x318) =
       (&PTR_FUN_0027c1e0)
       [(long)(int)((-iVar2 ^ 0xf97b14d4U) + (-iVar2 & 0xf97b14d4U) * 2) * 300 +
        (long)(int)(-0x684eb0b - (-iVar2 ^ 0xffffffffU))];
  ppuVar1 = (undefined **)&DAT_00280e88;
  if (iVar2 != -0x6851eac) {
    ppuVar1 = &PTR_LAB_00282a60;
  }
                    /* WARNING: Could not recover jumptable at 0x001564c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


