// entry=0x85044

void H85044(undefined1 *param_1)

{
  undefined **ppuVar1;
  char cVar2;
  undefined1 *in_x9;
  char *pcVar3;
  char *unaff_x25;
  char *unaff_x28;
  
  *param_1 = 0x20;
  *in_x9 = 0;
  do {
    pcVar3 = unaff_x28;
    unaff_x28 = pcVar3 + 1;
  } while (*pcVar3 != '\0');
  cVar2 = *unaff_x25;
  *pcVar3 = cVar2;
  ppuVar1 = &PTR_LAB_0027f5e8;
  if (cVar2 != (byte)((-(char)DAT_00274480 | 0xf2U) * '\x02' - (-(char)DAT_00274480 ^ 0xf2U))) {
    ppuVar1 = &PTR_LAB_00279220;
  }
                    /* WARNING: Could not recover jumptable at 0x0017e288. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


