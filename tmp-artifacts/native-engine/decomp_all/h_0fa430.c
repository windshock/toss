// entry=0xfa430

void FUN_001fa430(int param_1)

{
  undefined **ppuVar1;
  undefined8 uVar2;
  
  uVar2 = tpidr_el0;
  ppuVar1 = &PTR_LAB_00284008;
  if (param_1 != 0) {
    ppuVar1 = (undefined **)&DAT_0027f6b0;
  }
                    /* WARNING: Could not recover jumptable at 0x001fa494. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


