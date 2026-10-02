// entry=0xbab98

void Hbab98(void)

{
  int in_w8;
  ulong unaff_x29;
  
  if ((-(int)DAT_0027b358 | 0xd8babfefU) * 2 - (-(int)DAT_0027b358 ^ 0xd8babfefU) != in_w8) {
    *(undefined8 *)((unaff_x29 | 8) + (unaff_x29 & 8)) = 0x20;
                    /* WARNING: Could not recover jumptable at 0x001bb444. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027f8a8)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x001bb990. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00275710)();
  return;
}


