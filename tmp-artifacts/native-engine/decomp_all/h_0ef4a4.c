// entry=0xef4a4

void Hef4a4(void)

{
  DAT_0029e60c = 0;
                    /* WARNING: Could not recover jumptable at 0x001ef4bc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00283300)();
  return;
}


