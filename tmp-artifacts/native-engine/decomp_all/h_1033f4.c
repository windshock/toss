// entry=0x1033f4

void H1033f4(code *param_1)

{
  undefined **ppuVar1;
  uint unaff_w19;
  
  (*param_1)();
  ppuVar1 = (undefined **)&DAT_00278740;
  if ((unaff_w19 & 1) == 0) {
    ppuVar1 = &PTR_LAB_0027aa78;
  }
                    /* WARNING: Could not recover jumptable at 0x0020341c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


