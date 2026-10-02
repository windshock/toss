// entry=0x119888

void H119888(void)

{
  undefined *UNRECOVERED_JUMPTABLE;
  long unaff_x19;
  
  UNRECOVERED_JUMPTABLE = PTR_LAB_00277868;
  *(undefined4 *)(unaff_x19 + 0x39c) = 0;
                    /* WARNING: Could not recover jumptable at 0x002198a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)UNRECOVERED_JUMPTABLE)();
  return;
}


