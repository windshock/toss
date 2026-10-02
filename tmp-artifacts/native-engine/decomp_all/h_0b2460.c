// entry=0xb2460

void FUN_001b2460(void)

{
  undefined8 uVar1;
  
  uVar1 = tpidr_el0;
                    /* WARNING: Could not recover jumptable at 0x001b24d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027b838)();
  return;
}


