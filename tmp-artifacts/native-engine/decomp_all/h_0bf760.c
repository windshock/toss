// entry=0xbf760

void Hbef9c(ulong param_1)

{
  undefined **ppuVar1;
  char cVar2;
  long in_x9;
  undefined4 in_w11;
  long unaff_x22;
  undefined4 *unaff_x23;
  long unaff_x28;
  
  *unaff_x23 = in_w11;
  cVar2 = *(char *)(unaff_x22 + 0x10 + (param_1 & 0xffffffff));
  *(char *)(unaff_x28 + in_x9) = cVar2;
  ppuVar1 = &PTR_LAB_002779e8;
  if (cVar2 != (byte)((-(char)DAT_00274ad8 | 0xfaU) * '\x02' - (-(char)DAT_00274ad8 ^ 0xfaU))) {
    ppuVar1 = &PTR_LAB_0027a810;
  }
                    /* WARNING: Could not recover jumptable at 0x001bf270. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


