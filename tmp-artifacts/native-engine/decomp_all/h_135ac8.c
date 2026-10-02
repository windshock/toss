// entry=0x135ac8

undefined8 FUN_00235ac8(undefined8 param_1,undefined8 *param_2,int param_3)

{
  undefined8 uVar1;
  
  if (param_3 != 0x2fc3e745 - (-(int)DAT_002835f8 ^ 0xffffffffU)) {
                    /* WARNING: Could not recover jumptable at 0x00235c40. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar1 = (*(code *)PTR_LAB_0027e940)(*param_2);
    return uVar1;
  }
  return 0;
}


