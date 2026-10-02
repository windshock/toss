// entry=0x72004

void H72004(void)

{
  memset(&DAT_0027e7b4,0,7);
                    /* WARNING: Could not recover jumptable at 0x00172024. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00277d60)();
  return;
}


