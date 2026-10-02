// entry=0x93cd0

void FUN_00193cd0(int param_1)

{
  ulong in_x4;
  ulong in_x5;
  ulong uVar1;
  ulong uVar2;
  undefined4 in_stack_00000000;
  
  if (param_1 != 0) {
                    /* WARNING: Could not recover jumptable at 0x00193d2c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&PTR_LAB_00282ff0)[(int)(-0x4d772fa5 - (-(int)DAT_0027a358 ^ 0xffffffffU))])
              (in_stack_00000000);
    return;
  }
  uVar2 = (in_x5 | in_x4) & (in_x5 & in_x4 ^ 0xffffffffffffffff);
  uVar1 = 0x9c4fd05531d34c57 - (-DAT_0027a358 ^ 0xffffffffffffffffU);
                    /* WARNING: Could not recover jumptable at 0x00193dac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027e9c8)((uVar2 | uVar1) + (uVar2 & uVar1));
  return;
}


