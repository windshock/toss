// entry=0x146ca4

void H146ca4(void)

{
  undefined **ppuVar1;
  bool bVar2;
  ulong in_x11;
  ulong in_x12;
  long unaff_x28;
  
  bVar2 = (in_x12 & in_x11 | in_x12 ^ in_x11) ==
          (-DAT_00279b20 ^ 0xacc6d7f8333596aeU) + (-DAT_00279b20 & 0xacc6d7f8333596aeU) * 2;
  ppuVar1 = &PTR_LAB_00282dc8;
  if ((unaff_x28 != 0 || !bVar2) && (unaff_x28 == 0) == bVar2) {
    ppuVar1 = (undefined **)&DAT_00276280;
  }
                    /* WARNING: Could not recover jumptable at 0x00246d1c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


