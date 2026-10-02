// entry=0x68168

void FUN_00168168(int param_1)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  uint uVar6;
  short sVar7;
  int iVar8;
  ulong uVar9;
  byte *local_70;
  
  lVar4 = tpidr_el0;
  lVar4 = *(long *)(lVar4 + 0x28);
  iVar8 = (int)DAT_00276dd0;
  uVar5 = 0x2f88560a761abe8 - (-DAT_00276dd0 ^ 0xffffffffffffffffU);
  sVar7 = (-(short)DAT_00276dd0 | 0x8506U) + (-(short)DAT_00276dd0 & 0x8506U);
  uVar6 = (-iVar8 ^ 0x8506U) + (-iVar8 & 0x8506U) * 2;
  local_70 = (&PTR_FUN_0027c1e0)
             [(long)(int)(-0x589e5418 - (-iVar8 ^ 0xffffffffU)) * 300 +
              (long)(int)((-iVar8 | 0xa761acfaU) * 2 - (-iVar8 ^ 0xa761acfaU))];
  if ((-iVar8 ^ 0xa761abe9U) + (-iVar8 & 0xa761abe9U) * 2 != 0x78) {
    do {
      uVar6 = uVar6 * (-0x589e53f7 - (-iVar8 ^ 0xffffffffU));
      uVar6 = (uVar6 ^ 0xffffffff) & (uint)*local_70 | uVar6 & (*local_70 ^ 0xffffffff);
      sVar7 = (short)uVar6;
      uVar9 = (-DAT_00276dd0 | 0x2f88560a761abeaU) * 2 - (-DAT_00276dd0 ^ 0x2f88560a761abeaU);
      uVar5 = (uVar5 | uVar9) * 2 - (uVar5 ^ uVar9);
      local_70 = local_70 + (0x2f88560a761abe9 - (-DAT_00276dd0 ^ 0xffffffffffffffffU));
    } while (uVar5 != 0x78);
  }
  if (sVar7 == -0x67e3) {
    ppuVar2 = &PTR_LAB_00285a20;
    if (param_1 != 0) {
      ppuVar2 = &PTR_LAB_002746c8;
    }
    ppuVar1 = &PTR_LAB_00274608;
    if (param_1 != 1) {
      ppuVar1 = ppuVar2;
    }
    ppuVar2 = &PTR_LAB_00277f08;
    if (param_1 != 2) {
      ppuVar2 = ppuVar1;
    }
                    /* WARNING: Could not recover jumptable at 0x00169ab0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)();
    return;
  }
  *(ulong *)((ulong)&stack0xfffffffffffffff0 ^ 8) =
       (-DAT_00276dd0 | 0x2f88560a761abf5U) + (-DAT_00276dd0 & 0x2f88560a761abf5U);
  lVar3 = tpidr_el0;
  if (*(long *)(lVar3 + 0x28) != lVar4) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


