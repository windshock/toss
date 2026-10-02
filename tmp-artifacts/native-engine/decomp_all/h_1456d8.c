// entry=0x1456d8

void H1456d8(code *param_1)

{
  undefined **ppuVar1;
  long lVar2;
  int iVar3;
  long *plVar4;
  int iVar5;
  ulong *unaff_x20;
  ulong uVar6;
  long in_stack_00000138;
  
  iVar3 = (*param_1)(&DAT_0029e3d8,
                     (-(int)DAT_00279b20 ^ 0x333596afU) + (-(int)DAT_00279b20 & 0x333596afU) * 2);
  iVar5 = (int)DAT_00279b20;
  if (iVar3 == 0x333596ad - (-iVar5 ^ 0xffffffffU)) {
    uVar6 = *unaff_x20;
    plVar4 = (long *)FUN_0026eefc(&DAT_00286190);
    if (((*(ulong *)(*plVar4 + 0x50) ^ 0xffffffffffffffff) & uVar6 |
        *(ulong *)(*plVar4 + 0x50) & (uVar6 ^ 0xffffffffffffffff)) !=
        (-DAT_00279b20 | 0xacc6d7f8333596aeU) * 2 - (-DAT_00279b20 ^ 0xacc6d7f8333596aeU)) {
                    /* WARNING: Could not recover jumptable at 0x0024603c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_0027d868)();
      return;
    }
                    /* WARNING: Could not recover jumptable at 0x00246e44. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00278dd0)(unaff_x20 + 5);
    return;
  }
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar5 | 0x333596aeU) + (-iVar5 & 0x333596aeU)) * 300 +
             (long)(int)(0x333597b8 - (-iVar5 ^ 0xffffffffU))])
            ((-iVar5 | 0x333596b0U) + (-iVar5 & 0x333596b0U));
  if (unaff_x20[0xd] != 0) {
    ppuVar1 = &PTR_LAB_00275030;
    if (*(char *)(unaff_x20[0xd] + 0x62) != '\0') {
      ppuVar1 = &PTR_LAB_002747d8 +
                (int)((-(int)DAT_00279b20 ^ 0x333596fcU) + (-(int)DAT_00279b20 & 0x333596fcU) * 2);
    }
                    /* WARNING: Could not recover jumptable at 0x00246350. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  lVar2 = tpidr_el0;
  if (*(long *)(lVar2 + 0x28) == in_stack_00000138) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


