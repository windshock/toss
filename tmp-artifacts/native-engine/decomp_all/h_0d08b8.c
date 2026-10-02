// entry=0xd08b8

void Hd08b8(void)

{
  undefined **ppuVar1;
  char *in_x9;
  long in_x10;
  char *unaff_x21;
  long unaff_x22;
  
  if (in_x10 != 0) {
                    /* WARNING: Could not recover jumptable at 0x001d0c00. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00276988)();
    return;
  }
  if (in_x9 != unaff_x21) {
    ppuVar1 = &PTR_LAB_0027f148 +
              (int)((-(int)DAT_00283df0 | 0x15b28a61U) * 2 - (-(int)DAT_00283df0 ^ 0x15b28a61U));
    if (*unaff_x21 != (byte)((-(char)DAT_00283df0 ^ 0x1aU) + (-(char)DAT_00283df0 & 0x1aU) * '\x02')
       ) {
      ppuVar1 = &PTR_LAB_00277388;
    }
                    /* WARNING: Could not recover jumptable at 0x001cf4b0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  memset((void *)(unaff_x22 +
                 ((-DAT_00283df0 | 0x76c1d50315b28a1aU) + (-DAT_00283df0 & 0x76c1d50315b28a1aU)) *
                 0x400),0,0x400);
  CallSupervisor(0);
  ppuVar1 = &PTR_LAB_00279370;
  if ((-DAT_00283df0 ^ 0x76c1d50315b289b6U) + (-DAT_00283df0 & 0x76c1d50315b289b6U) * 2 <
      0xfffffffffffff001) {
    ppuVar1 = &PTR_LAB_00276690;
  }
                    /* WARNING: Could not recover jumptable at 0x001d0f50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


