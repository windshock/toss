// entry=0013e0b8 name=FUN_0013e0b8

void FUN_0013e0b8(int param_1)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  undefined8 uVar3;
  
  uVar3 = tpidr_el0;
  ppuVar2 = &PTR_LAB_00275a48;
  if (param_1 != 0) {
    ppuVar2 = &PTR_LAB_00280c68;
  }
  ppuVar1 = &PTR_LAB_00274350 + (long)(int)(-0x5d1f482 - (-(int)DAT_00274488 ^ 0xffffffffU)) * 0x6f;
  if (param_1 != 1) {
    ppuVar1 = ppuVar2;
  }
  ppuVar2 = &PTR_LAB_002747e8;
  if (param_1 != 2) {
    ppuVar2 = ppuVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x0013e178. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}

