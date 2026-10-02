// entry=0x16b170

void FUN_0026b170(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4)

{
  uint uVar1;
  
  uVar1 = -(int)DAT_0027e458;
                    /* WARNING: Could not recover jumptable at 0x0026b238. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00274ca8)
            (&PTR_FUN_0027c1e0 +
             (long)(int)((uVar1 | 0x2c91403e) + (uVar1 & 0x2c91403e)) * 300 +
             (long)(int)(0x2c914081 - (-(int)DAT_0027e458 ^ 0xffffffffU)),param_1,param_2,param_1,
             param_4,param_3,param_4);
  return;
}


