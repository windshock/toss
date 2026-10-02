// entry=0xf9af8

void FUN_001f9af8(undefined8 param_1,undefined8 param_2,byte *param_3,long param_4)

{
  undefined **ppuVar1;
  uint in_w8;
  
  ppuVar1 = &PTR_LAB_00282e00;
  if (param_4 != 1) {
    ppuVar1 = &PTR_FUN_0027ffd8 +
              (long)(int)(-0x5e354577 - (-(int)DAT_00280b88 ^ 0xffffffffU)) * 0x69;
  }
                    /* WARNING: Could not recover jumptable at 0x001f9b88. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)((in_w8 ^ *param_3) + (in_w8 & *param_3) * 2,param_1,param_2,param_3 + 1);
  return;
}


