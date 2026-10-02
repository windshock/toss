// entry=0x110ecc

void H110ecc(void)

{
  CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x0021d538. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00274fd8)();
  return;
}


