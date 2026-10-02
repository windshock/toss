// entry=0x6cf38

void H6cf38(undefined8 param_1,long param_2,undefined8 param_3,ulong param_4,long param_5)

{
  ulong uVar1;
  ulong uVar2;
  undefined **ppuVar3;
  
  uVar1 = (param_4 ^ -param_5) + (param_4 & -param_5) * 2;
  uVar2 = (-param_2 | 0x1ffU) + (-param_2 & 0x1ffU);
  if (uVar2 <= uVar1) {
    uVar1 = uVar2;
  }
  uVar2 = (-DAT_00283670 ^ 0xcc01dc932bc9ebe4U) + (-DAT_00283670 & 0xcc01dc932bc9ebe4U) * 2;
  ppuVar3 = &PTR_LAB_00283df8 +
            (int)((-(int)DAT_00283670 ^ 0x2bc9ec33U) + (-(int)DAT_00283670 & 0x2bc9ec33U) * 2);
  if (0xf < (uVar1 | uVar2) * 2 - (uVar1 ^ uVar2)) {
    ppuVar3 = &PTR_LAB_002814e0;
  }
                    /* WARNING: Could not recover jumptable at 0x0016d5a0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)();
  return;
}


