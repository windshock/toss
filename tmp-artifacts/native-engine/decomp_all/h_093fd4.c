// entry=0x93fd4

void FUN_00193fd4(void)

{
  undefined **ppuVar1;
  undefined8 uVar2;
  uint uVar3;
  int iVar4;
  
  uVar2 = tpidr_el0;
  iVar4 = (int)DAT_00282fd0;
  uVar3 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(0x65f3fc14 - iVar4) * 300 +
                     (long)(int)((iVar4 * -2 | 0xcbe7f9baU) - (-iVar4 ^ 0x65f3fcddU))])();
  ppuVar1 = &PTR_LAB_0027afc0;
  if ((uVar3 & 0xffff) <=
      (-(int)DAT_00282fd0 | 0x65f3fc17U) * 2 - (-(int)DAT_00282fd0 ^ 0x65f3fc17U)) {
    ppuVar1 = &PTR_LAB_00275f50;
  }
                    /* WARNING: Could not recover jumptable at 0x001940e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


