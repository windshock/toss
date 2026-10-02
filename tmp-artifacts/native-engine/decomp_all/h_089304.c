// entry=0x89304

void H82390(void)

{
  long unaff_x29;
  
  *(undefined4 *)(unaff_x29 + -0x74) = 0x7161fde5;
                    /* WARNING: Could not recover jumptable at 0x001823ac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00275f10)();
  return;
}


