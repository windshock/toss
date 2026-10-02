// entry=0x6c3f0

void FUN_0016c3f0(void)

{
  undefined **ppuVar1;
  undefined8 uVar2;
  uint uVar3;
  int iVar4;
  
  uVar2 = tpidr_el0;
  iVar4 = (int)DAT_00283670;
  uVar3 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((-iVar4 | 0x2bc9ebe3U) + (-iVar4 & 0x2bc9ebe3U)) * 300 +
                     (long)(int)((iVar4 * -2 | 0x5793d8e2U) - (-iVar4 ^ 0x2bc9ec71U))])();
  ppuVar1 = &PTR_LAB_002744c8;
  if ((uVar3 & 0xffff) <= 0x2bc9ebe5 - (-(int)DAT_00283670 ^ 0xffffffffU)) {
    ppuVar1 = &PTR_LAB_0027b660;
  }
                    /* WARNING: Could not recover jumptable at 0x0016c508. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


