// entry=0xca67c

void FUN_001ca67c(uint param_1)

{
  undefined **ppuVar1;
  undefined8 uVar2;
  
  uVar2 = tpidr_el0;
  ppuVar1 = (undefined **)&DAT_00280b28;
  if ((-(int)DAT_00281748 | 0xde8ac508U) + (-(int)DAT_00281748 & 0xde8ac508U) <= param_1) {
    ppuVar1 = &PTR_LAB_0027f808;
  }
                    /* WARNING: Could not recover jumptable at 0x001ca6f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


