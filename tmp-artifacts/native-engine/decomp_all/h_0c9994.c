// entry=0xc9994

void Hc9994(undefined8 param_1)

{
  undefined **ppuVar1;
  uint uVar2;
  
  uVar2 = -(int)DAT_002793a8;
  DAT_002862e8 = (*(code *)(&PTR_FUN_0027c1e0)
                           [(long)(int)(-0x69bcc98a - (-(int)DAT_002793a8 ^ 0xffffffffU)) * 300 +
                            (long)(int)((uVar2 ^ 0x96433777) + (uVar2 & 0x96433777) * 2)])
                           (param_1,&DAT_00282828);
  ppuVar1 = &PTR_thunk_FUN_001c9fe4_0027f8b8;
  if (DAT_002862e8 != 0) {
    ppuVar1 = &PTR_LAB_00276f78 +
              (long)(int)((-(int)DAT_002793a8 | 0x96433677U) * 2 -
                         (-(int)DAT_002793a8 ^ 0x96433677U)) * 0x6f;
  }
                    /* WARNING: Could not recover jumptable at 0x001ca2f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


