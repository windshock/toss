// entry=0x87ce4

void H87ce4(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined **ppuVar1;
  int *unaff_x23;
  
  (*(code *)*param_1)(param_2,param_3,3,&DAT_00276c7c,&DAT_0012ce22,&DAT_0012ce22);
  *unaff_x23 = 0x1f;
  ppuVar1 = &PTR_LAB_0027b980;
  if (*unaff_x23 == 0) {
    ppuVar1 = &PTR_LAB_00277778;
  }
                    /* WARNING: Could not recover jumptable at 0x0017ec1c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


