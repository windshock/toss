// entry=0x863a4

void H863a4(void)

{
  undefined **ppuVar1;
  char cVar2;
  char *in_x9;
  char *pcVar3;
  char *unaff_x26;
  
  do {
    pcVar3 = in_x9;
    in_x9 = pcVar3 + 1;
  } while (*pcVar3 != '\0');
  cVar2 = *unaff_x26;
  *pcVar3 = cVar2;
  ppuVar1 = &PTR_LAB_00274cd0;
  if (cVar2 != '\0') {
    ppuVar1 = &PTR_LAB_00281e68;
  }
                    /* WARNING: Could not recover jumptable at 0x00186f5c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


