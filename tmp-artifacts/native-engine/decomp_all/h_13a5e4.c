// entry=0x13a5e4

void H13a5e4(undefined8 *param_1)

{
  undefined1 auVar1 [16];
  
  auVar1 = (*(code *)*param_1)();
                    /* WARNING: Could not recover jumptable at 0x0023d1cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002824a8)(auVar1._0_8_,auVar1._8_8_,1);
  return;
}


