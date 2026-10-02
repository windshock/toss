// entry=0x147530

void H147530(long param_1)

{
  undefined **ppuVar1;
  ulong in_x9;
  
  ppuVar1 = &PTR_H145f30_0027faa0;
  if (in_x9 <= param_1 + ((-DAT_00279b20 ^ 0xacc6d7f8333596afU) +
                         (-DAT_00279b20 & 0xacc6d7f8333596afU) * 2) * 0x10) {
    ppuVar1 = &PTR_H146ca4_0027f3d0;
  }
                    /* WARNING: Could not recover jumptable at 0x00247588. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


