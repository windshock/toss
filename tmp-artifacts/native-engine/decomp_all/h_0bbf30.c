// entry=0xbbf30

void FUN_001bbf30(void)

{
  undefined8 uVar1;
  
  uVar1 = tpidr_el0;
                    /* WARNING: Could not recover jumptable at 0x001bbfa0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002753d0)();
  return;
}


