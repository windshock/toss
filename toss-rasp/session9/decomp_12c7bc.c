// entry_off=110d7c name=FUN_00210d7c body=[[00210d7c, 00210ecb]]

void FUN_00210d7c(void)

{
  undefined **ppuVar1;
  undefined8 uVar2;
  uint uVar3;
  uint uVar4;
  
  uVar2 = tpidr_el0;
  uVar4 = -(int)DAT_00281e58;
  uVar3 = -(int)DAT_00281e58;
  uVar4 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar4 ^ 0xcc88cf42) + (uVar4 & 0x4c88cf42) * 2) * 300 +
                     (long)(int)((uVar3 ^ 0xcc88cfe8) + (uVar3 & 0x4c88cfe8) * 2)])();
  ppuVar1 = &PTR_LAB_00275b80;
  if ((uVar4 & 0xffff) <=
      (-(int)DAT_00281e58 ^ 0xcc88cf45U) + (-(int)DAT_00281e58 & 0xcc88cf45U) * 2) {
    ppuVar1 = &PTR_LAB_00274770;
  }
                    /* WARNING: Could not recover jumptable at 0x00210ec8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


