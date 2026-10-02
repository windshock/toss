// entry=0x81078

void H80ff4(void)

{
  undefined **ppuVar1;
  int *unaff_x23;
  
  *unaff_x23 = 0x1f;
  ppuVar1 = &PTR_LAB_0027b980;
  if (*unaff_x23 == 0) {
    ppuVar1 = &PTR_LAB_00277778;
  }
                    /* WARNING: Could not recover jumptable at 0x0017ec1c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


