// entry=0xaadfc

void Haaa14(ulong param_1)

{
  ulong uVar1;
  undefined **ppuVar2;
  char cVar3;
  long in_x9;
  ulong in_x10;
  char cVar4;
  char *in_x17;
  ulong *unaff_x23;
  
  do {
    cVar3 = **(char **)(in_x9 + in_x10 * 8);
    cVar4 = '\0';
    if ((cVar3 != '\0') && (cVar4 = cVar3, cVar3 == *in_x17)) {
                    /* WARNING: Could not recover jumptable at 0x0019edcc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00275690)();
      return;
    }
    in_x10 = (in_x10 | 1) + (in_x10 & 1);
    if (cVar4 == *in_x17) {
      uVar1 = (-DAT_0027fb18 ^ 0x2e00d84656e407c0U) + (-DAT_0027fb18 & 0x2e00d84656e407c0U) * 2;
      ppuVar2 = &PTR_LAB_0027ac80;
      if (in_x17[uVar1] !=
          (byte)((-(char)DAT_0027fb18 ^ 0xc0U) + (-(char)DAT_0027fb18 & 0x40U) * '\x02')) {
        ppuVar2 = &PTR_LAB_0027a528;
      }
                    /* WARNING: Could not recover jumptable at 0x001a138c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar2)((uVar1 | 1) + (uVar1 & 1));
      return;
    }
  } while (in_x10 != param_1);
  ppuVar2 = &PTR_LAB_00279bc8;
  if (*unaff_x23 <= param_1) {
    ppuVar2 = &PTR_LAB_00277dd0;
  }
                    /* WARNING: Could not recover jumptable at 0x001ae074. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


