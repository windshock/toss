// entry=0x110a70

void H110a70(ulong param_1)

{
  ulong uVar1;
  ulong in_x9;
  
  uVar1 = ((in_x9 | param_1) & (in_x9 & param_1 ^ 0xffffffffffffffff)) *
          ((-DAT_00275290 | 0x984d4ffb0d6741f0U) * 2 - (-DAT_00275290 ^ 0x984d4ffb0d6741f0U));
  uVar1 = (((long)uVar1 >> 0x1b ^ 0xffffffffffffffffU) & uVar1 |
          (long)uVar1 >> 0x1b & (uVar1 ^ 0xffffffffffffffff)) *
          ((-DAT_00275290 | 0x6dc5524903b36e22U) + (-DAT_00275290 & 0x6dc5524903b36e22U));
                    /* WARNING: Could not recover jumptable at 0x00210b6c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00285fc8)
            ((((long)uVar1 >> 0x1f | uVar1) & ((long)uVar1 >> 0x1f & uVar1 ^ 0xffffffffffffffff)) *
             ((-DAT_00275290 | 0xd8f5088df0825eb7U) + (-DAT_00275290 & 0xd8f5088df0825eb7U)));
  return;
}


