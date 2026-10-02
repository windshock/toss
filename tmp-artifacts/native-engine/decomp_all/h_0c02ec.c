// entry=0xc02ec

void Hc02ec(undefined8 *param_1)

{
  undefined8 *unaff_x29;
  
  *param_1 = 0x28;
  *unaff_x29 = 0x24;
                    /* WARNING: Could not recover jumptable at 0x001c0308. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00279250)();
  return;
}


