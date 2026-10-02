// entry=0xc8f24

void Hc8ecc(void)

{
  CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x001c8f08. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027eec8)();
  return;
}


