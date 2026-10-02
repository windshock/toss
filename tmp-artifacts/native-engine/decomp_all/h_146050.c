// entry=0x146050

void H146050(void)

{
  long unaff_x25;
  
  memset(&stack0x00000058,0,0x10);
  memset(&stack0x00000048,0,0x10);
                    /* WARNING: Could not recover jumptable at 0x002462d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002764d0)(unaff_x25 + 0x10);
  return;
}


