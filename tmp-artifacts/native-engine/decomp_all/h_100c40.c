// entry=0x100c40

void FUN_001ffa70(void)

{
  undefined8 *unaff_x29;
  
  unaff_x29[1] = 0x10;
  *unaff_x29 = 4;
                    /* WARNING: Could not recover jumptable at 0x001ffd20. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027ef90)();
  return;
}


