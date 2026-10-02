// entry=0x35858

void FUN_00135858(void)

{
  undefined8 *puVar1;
  undefined **ppuVar2;
  undefined8 uVar3;
  ulong uVar4;
  int iVar5;
  ulong uVar6;
  
  uVar3 = tpidr_el0;
  iVar5 = (int)DAT_00285dc8;
  uVar4 = (-DAT_00285dc8 | 0x2415563e26e2ead5U) * 2 - (-DAT_00285dc8 ^ 0x2415563e26e2ead5U);
  if (iVar5 != 0x26e2e6b1) {
    uVar6 = 0x2415563e26e2ead5 - (-DAT_00285dc8 ^ 0xffffffffffffffffU);
    puVar1 = &DAT_00274c00;
    if ((uVar4 | uVar6) + (uVar4 & uVar6) != 0x424) {
      puVar1 = &DAT_0027a170;
    }
                    /* WARNING: Could not recover jumptable at 0x00135c28. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*puVar1)((((-iVar5 | 0x7c623e24U) + (-iVar5 & 0x7c623e24U)) *
                        (0x26e2eaf5 - (-iVar5 ^ 0xffffffffU)) ^ 0xffffffff) &
                       (uint)(byte)*(&PTR_FUN_0027c1e0)
                                    [(long)(int)((-iVar5 ^ 0x26e2ead5U) + (-iVar5 & 0x26e2ead5U) * 2
                                                ) * 300 +
                                     (long)(int)((-iVar5 | 0x26e2eb2eU) + (-iVar5 & 0x26e2eb2eU))]);
    return;
  }
  ppuVar2 = &PTR_LAB_0027a8c0;
  if ((ushort)((-(short)DAT_00285dc8 | 0x3e24U) * 2 - (-(short)DAT_00285dc8 ^ 0x3e24U)) != -0x7a3a)
  {
    ppuVar2 = &PTR_LAB_0027a4e8;
  }
                    /* WARNING: Could not recover jumptable at 0x00137010. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


