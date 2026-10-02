// entry=0x1578c4

void H1578c4(ulong param_1)

{
  int iVar1;
  
  iVar1 = 0x38;
  if ((param_1 & 1) == 0) {
    iVar1 = (-(int)DAT_00277160 | 0xfa09c240U) + (-(int)DAT_00277160 & 0xfa09c240U);
  }
                    /* WARNING: Could not recover jumptable at 0x00257900. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00274c30)(iVar1);
  return;
}


