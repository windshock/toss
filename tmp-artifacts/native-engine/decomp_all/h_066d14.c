// entry=0x66d14

void H66d14(void)

{
  CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x00165838. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00280e98)
            (DAT_002862d0,
             (-DAT_00274f18 | 0xae1690869c1eff85U) * 2 - (-DAT_00274f18 ^ 0xae1690869c1eff85U));
  return;
}


