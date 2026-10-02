// entry=0xd0670

void FUN_001d440c(void)

{
  undefined **ppuVar1;
  long in_x10;
  ulong in_x11;
  ulong uVar2;
  
  uVar2 = (-DAT_00283df0 ^ 0x76c1d50315b28a1bU) + (-DAT_00283df0 & 0x76c1d50315b28a1bU) * 2;
  uVar2 = (uVar2 | -in_x10) * 2 - (uVar2 ^ -in_x10);
  ppuVar1 = &PTR_LAB_00279d68;
  if ((in_x11 | uVar2) * 2 - (in_x11 ^ uVar2) !=
      0x76c1d50315b28a19 - (-DAT_00283df0 ^ 0xffffffffffffffffU)) {
    ppuVar1 = (undefined **)&DAT_0027fb58;
  }
                    /* WARNING: Could not recover jumptable at 0x001d35d4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


