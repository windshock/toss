// entry=0x1388ec

void H1388ec(void)

{
  undefined **ppuVar1;
  int in_w9;
  long unaff_x24;
  
  CallSupervisor(0);
  *(int *)(unaff_x24 + 0x104) = in_w9;
  ppuVar1 = &PTR_LAB_00283ac8;
  if (in_w9 <= (int)((-(int)DAT_00279eb0 ^ 0x8692046U) + (-(int)DAT_00279eb0 & 0x8692046U) * 2)) {
    ppuVar1 = &PTR_LAB_00275078;
  }
                    /* WARNING: Could not recover jumptable at 0x0023896c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


