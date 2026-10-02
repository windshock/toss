// entry=0x102ab4

void FUN_00202ab4(int param_1)

{
  undefined **ppuVar1;
  
  ppuVar1 = &PTR_LAB_002833f8;
  if (param_1 != 0) {
    ppuVar1 = &PTR_LAB_00276898;
  }
                    /* WARNING: Could not recover jumptable at 0x0020335c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


