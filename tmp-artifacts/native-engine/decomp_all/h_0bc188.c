// entry=0xbc188

void Hbc188(undefined8 param_1,undefined8 param_2,uint param_3,undefined8 param_4,undefined8 param_5
           ,ulong param_6)

{
  undefined **ppuVar1;
  long in_x9;
  
  *(char *)(in_x9 + param_6) = (char)param_3;
  ppuVar1 = &PTR_LAB_00279788;
  if ((param_6 | 1) + (param_6 & 1) != 0x100) {
    ppuVar1 = &PTR_Hbc188_0027d870;
  }
                    /* WARNING: Could not recover jumptable at 0x001bc1d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(param_1,param_2,(param_3 | 1) * 2 - (param_3 ^ 1),0,0);
  return;
}


