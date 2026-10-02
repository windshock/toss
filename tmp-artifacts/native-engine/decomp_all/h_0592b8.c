// entry=0x592b8

void H592b8(ulong param_1)

{
  undefined **ppuVar1;
  long unaff_x20;
  
  ppuVar1 = &PTR_LAB_00284098;
  if (0x642804bbf97b14dc - (-DAT_00275ca8 ^ 0xffffffffffffffffU) <=
      (param_1 | -unaff_x20) * 2 - (param_1 ^ -unaff_x20)) {
    ppuVar1 = (undefined **)&DAT_00276910;
  }
                    /* WARNING: Could not recover jumptable at 0x00159320. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


