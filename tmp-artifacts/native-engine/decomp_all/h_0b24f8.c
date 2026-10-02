// entry=0xb24f8

void Hb24f8(void)

{
  uint uVar1;
  uint uVar2;
  
  uVar1 = -(int)DAT_00280830;
  uVar2 = -(int)DAT_00280830;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar1 | 0x115f9427) * 2 - (uVar1 ^ 0x115f9427)) * 0x2b +
             (long)(int)((uVar2 | 0x115f944c) * 2 - (uVar2 ^ 0x115f944c))])();
                    /* WARNING: Could not recover jumptable at 0x001b4d2c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027bf68)();
  return;
}


