// entry=0x159780

void FUN_00259780(void)

{
  undefined **ppuVar1;
  undefined8 uVar2;
  ushort uVar3;
  short extraout_w1;
  int iVar4;
  ulong uVar5;
  uint uVar6;
  short sVar7;
  ulong uVar8;
  byte *local_398;
  
  uVar2 = tpidr_el0;
  iVar4 = (int)DAT_00285720;
  uVar3 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((iVar4 * -2 | 0x97314540U) - (-iVar4 ^ 0x4b98a2a0U)) * 300 +
                     (long)(int)((iVar4 * -2 | 0x97314620U) - (-iVar4 ^ 0x4b98a310U))])();
  iVar4 = (int)DAT_00285720;
  sVar7 = (-(short)DAT_00285720 ^ 0xe86dU) + (-(short)DAT_00285720 & 0xe86dU) * 2;
  uVar5 = (-DAT_00285720 ^ 0x4e91c1194b98a2a0U) + (-DAT_00285720 & 0x4e91c1194b98a2a0U) * 2;
  uVar6 = (-iVar4 ^ 0xe86dU) + (-iVar4 & 0xe86dU) * 2;
  local_398 = (&PTR_FUN_0027c1e0)
              [(long)(int)((-iVar4 | 0x4b98a2a0U) * 2 - (-iVar4 ^ 0x4b98a2a0U)) * 300 +
               (long)(int)((-iVar4 ^ 0x4b98a349U) + (-iVar4 & 0x4b98a349U) * 2)];
  if ((uint)uVar3 != (-iVar4 ^ 0x4b98a2a0U) + (-iVar4 & 0x4b98a2a0U) * 2) {
    do {
      uVar6 = uVar6 * ((-iVar4 | 0xa2c1U) * 2 - (-iVar4 ^ 0xa2c1U));
      uVar6 = (uVar6 | *local_398) & (uVar6 & *local_398 ^ 0xffffffff);
      sVar7 = (short)uVar6;
      uVar8 = (-DAT_00285720 | 0x4e91c1194b98a2a1U) * 2 - (-DAT_00285720 ^ 0x4e91c1194b98a2a1U);
      uVar5 = (uVar5 ^ uVar8) + (uVar5 & uVar8) * 2;
      local_398 = local_398 +
                  (-DAT_00285720 | 0x4e91c1194b98a2a1U) + (-DAT_00285720 & 0x4e91c1194b98a2a1U);
    } while (uVar5 != uVar3);
  }
  ppuVar1 = &PTR_LAB_0027d8e8;
  if (sVar7 != extraout_w1) {
    ppuVar1 = &PTR_Hf8bb0_0027f7f8 + (int)((-iVar4 | 0x4b98a2fbU) + (-iVar4 & 0x4b98a2fbU));
  }
                    /* WARNING: Could not recover jumptable at 0x0025c7ac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


