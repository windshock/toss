// entry=0xd1354

void Hd1354(void)

{
  undefined **ppuVar1;
  uint uVar2;
  long in_x9;
  long in_x11;
  char in_w12;
  
  if (in_x11 != 1) {
    ppuVar1 = &PTR_LAB_0027a890;
    if (*(char *)(in_x9 + 1) != in_w12) {
      ppuVar1 = &PTR_Hd1354_0027fbf8;
    }
                    /* WARNING: Could not recover jumptable at 0x001d01b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  uVar2 = -(int)DAT_00283df0;
                    /* WARNING: Could not recover jumptable at 0x001cf96c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027a930)
            (&PTR_FUN_0027c1e0 +
             (long)(int)(0x15b28a19 - (-(int)DAT_00283df0 ^ 0xffffffffU)) * 300 +
             (long)(int)((uVar2 | 0x15b28a6a) * 2 - (uVar2 ^ 0x15b28a6a)));
  return;
}


