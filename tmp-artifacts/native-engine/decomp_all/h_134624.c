// entry=0x134624

void H134624(void)

{
  undefined **ppuVar1;
  uint uVar2;
  int iVar3;
  
  uVar2 = -(int)DAT_00274ae0;
  iVar3 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)(0x5de9c897 - (-(int)DAT_00274ae0 ^ 0xffffffffU)) * 300 +
                     (long)(int)((uVar2 ^ 0x5de9c8d3) + (uVar2 & 0x5de9c8d3) * 2)])
                    (&stack0x000010e0);
  ppuVar1 = &PTR_LAB_0027f770;
  if (-1 < iVar3) {
    ppuVar1 = &PTR_LAB_002834f8;
  }
                    /* WARNING: Could not recover jumptable at 0x002346c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


