// entry=0x12266c

void H11e560(void)

{
  undefined **ppuVar1;
  char *unaff_x22;
  
  ppuVar1 = &PTR_LAB_00277948;
  if (*unaff_x22 != ':') {
    ppuVar1 = &PTR_H11e560_0027dd78;
  }
                    /* WARNING: Could not recover jumptable at 0x0021e630. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


