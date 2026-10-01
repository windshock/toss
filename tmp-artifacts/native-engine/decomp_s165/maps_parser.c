// entry_off=b60f8 name=FUN_001b60f8 body=[[001b60f8, 001b613b] [001b7eec, 001b7f0b]]

void FUN_001b60f8(void)

{
  undefined8 uVar1;
  
  uVar1 = tpidr_el0;
                    /* WARNING: Could not recover jumptable at 0x001b7f08. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002770e8)();
  return;
}


