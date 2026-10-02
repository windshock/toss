// entry=0x1100dc

void H10f7ac(void)

{
  undefined **ppuVar1;
  ulong in_x5;
  
  ppuVar1 = &PTR_LAB_00283050;
  if (((in_x5 ^ (-DAT_00283618 ^ 0x8f244a8fb151f092U) + (-DAT_00283618 & 0x8f244a8fb151f092U) * 2 ^
                0xffffffffffffffff) & in_x5) != 0) {
    ppuVar1 = &PTR_LAB_002794b8;
  }
                    /* WARNING: Could not recover jumptable at 0x0020f80c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


