// entry=0xe621c

void He621c(void)

{
  ulong unaff_x29;
  
  *(undefined8 *)((unaff_x29 ^ 8) + (unaff_x29 & 8) * 2) = 0x20;
                    /* WARNING: Could not recover jumptable at 0x001e623c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_He5070_0027f040)();
  return;
}


