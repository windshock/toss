// entry=0x110934

void FUN_00210934(int param_1)

{
  ulong in_x7;
  ulong uVar1;
  ulong uVar2;
  ulong in_stack_00000000;
  
  if (param_1 != 0) {
    uVar1 = (-DAT_00275290 | 0x772c82476fccd84cU) + (-DAT_00275290 & 0x772c82476fccd84cU);
    uVar1 = (in_x7 | uVar1) + (in_x7 & uVar1);
    uVar1 = (uVar1 ^ in_stack_00000000) + (uVar1 & in_stack_00000000) * 2;
    uVar1 = (((long)uVar1 >> 0x1e | uVar1) & ((long)uVar1 >> 0x1e & uVar1 ^ 0xffffffffffffffff)) *
            ((-DAT_00275290 | 0x984d4ffb0d6741f0U) + (-DAT_00275290 & 0x984d4ffb0d6741f0U));
    uVar2 = (long)uVar1 >> (0x5c51 - (-DAT_00275290 ^ 0xffffffffffffffffU) & 0x3f);
                    /* WARNING: Could not recover jumptable at 0x00210a14. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027eee8)
              (((uVar2 | uVar1) & (uVar2 & uVar1 ^ 0xffffffffffffffff)) *
               ((-DAT_00275290 | 0x6dc5524903b36e22U) * 2 - (-DAT_00275290 ^ 0x6dc5524903b36e22U)));
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00210b7c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00276ee8)();
  return;
}


