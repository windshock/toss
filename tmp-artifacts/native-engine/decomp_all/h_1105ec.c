// entry=0x1105ec

void FUN_002105ec(undefined8 param_1,undefined8 param_2,undefined4 param_3)

{
  undefined8 uVar1;
  
  uVar1 = tpidr_el0;
                    /* WARNING: Could not recover jumptable at 0x00210848. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_0027cf58)[(int)(0x213ecc81 - (-(int)DAT_00279e80 ^ 0xffffffffU))])
            (param_3,param_1,param_2,param_1);
  return;
}


