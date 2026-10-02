// entry=0xfbd7c

void Hfbd7c(long param_1)

{
  undefined **ppuVar1;
  long in_x9;
  ulong uVar2;
  long unaff_x19;
  long unaff_x20;
  
  uVar2 = (in_x9 - (0xe5eb2050b52367f1 - (-DAT_00280f50 ^ 0xffffffffffffffffU) ^ 0xffffffffffffffff)
          ) - 1;
  if (uVar2 == 0x400) {
                    /* WARNING: Could not recover jumptable at 0x001fbfd0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00280b08)(unaff_x19 + 0x10);
    return;
  }
  if (*(char *)(unaff_x20 + uVar2) != '\0') {
    *(char *)(param_1 + uVar2) = *(char *)(unaff_x20 + uVar2);
                    /* WARNING: Could not recover jumptable at 0x001fd26c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_Hfbd7c_0027f1d8)();
    return;
  }
  ppuVar1 = &PTR_LAB_0027b860;
  if (0x3ff < uVar2) {
    ppuVar1 = &PTR_LAB_002799e0;
  }
                    /* WARNING: Could not recover jumptable at 0x001fc108. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


