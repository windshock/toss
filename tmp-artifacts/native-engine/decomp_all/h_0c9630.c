// entry=0xc9630

void Hc9630(void)

{
  CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x001c96c0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027b4e0)();
  return;
}


