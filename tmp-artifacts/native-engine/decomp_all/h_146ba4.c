// entry=0x146ba4

void H146ba4(long *param_1)

{
  undefined **ppuVar1;
  char cVar2;
  undefined8 *in_x9;
  char *pcVar3;
  
  if (*(int *)(*param_1 + 0x3c) == 0) {
    pcVar3 = (char *)*in_x9;
    do {
      cVar2 = *pcVar3;
      pcVar3 = pcVar3 + 1;
    } while (cVar2 != '\0');
                    /* WARNING: Could not recover jumptable at 0x00247df8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00279a00)();
    return;
  }
  ppuVar1 = &PTR_LAB_0027f0d8;
  if (param_1[1] != 0) {
    ppuVar1 = &PTR_LAB_002805a8;
  }
                    /* WARNING: Could not recover jumptable at 0x00245504. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


