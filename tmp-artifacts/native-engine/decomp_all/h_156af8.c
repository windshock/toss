// entry=0x156af8

void H1566bc(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  char *pcVar4;
  
  uVar2 = -(int)DAT_00277160;
  uVar3 = -(int)DAT_00277160;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar2 | 0xfa09c241) + (uVar2 & 0xfa09c241)) * 0x2b +
             (long)(int)((uVar3 ^ 0xfa09c253) + (uVar3 & 0xfa09c253) * 2)])();
  (*(code *)(&DAT_0029e620)
            [(long)(int)(-0x5f63dc0 - (-(int)DAT_00277160 ^ 0xffffffffU)) * 0x2b +
             (long)(int)(-0x5f63db2 - (-(int)DAT_00277160 ^ 0xffffffffU))])();
  pcVar4 = (char *)(*(code *)(&DAT_0029e620)
                             [(long)(int)(-0x5f63dc0 - (-(int)DAT_00277160 ^ 0xffffffffU)) * 0x2b +
                              (long)(int)(-0x5f63d99 - (-(int)DAT_00277160 ^ 0xffffffffU))])();
  ppuVar1 = &PTR_LAB_00277468;
  if (*pcVar4 != 'a') {
    ppuVar1 = &PTR_H156344_0027e5f8;
  }
                    /* WARNING: Could not recover jumptable at 0x0025687c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


