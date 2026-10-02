// entry=0x3d354

void H3c85c(ulong param_1)

{
  ulong uVar1;
  undefined **ppuVar2;
  
  uVar1 = (-DAT_0027ba40 | 0x517618022a074dbeU) + (-DAT_0027ba40 & 0x517618022a074dbeU);
  ppuVar2 = &PTR_LAB_00279490;
  if ((param_1 ^ uVar1) + (param_1 & uVar1) * 2 !=
      (-DAT_0027ba40 | 0x517618022a074dcdU) * 2 - (-DAT_0027ba40 ^ 0x517618022a074dcdU)) {
    ppuVar2 = &PTR_H3c85c_0027e020;
  }
                    /* WARNING: Could not recover jumptable at 0x0013c93c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)(-(int)DAT_0027ba40 | 0x2a074dde);
  return;
}


