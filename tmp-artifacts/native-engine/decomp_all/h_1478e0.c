// entry=0x1478e0

void H1478e0(undefined1 *param_1)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  undefined4 uVar5;
  int iVar6;
  long unaff_x19;
  long unaff_x20;
  long in_stack_00000138;
  
  *param_1 = 1;
  uVar2 = -(int)DAT_00279b20;
  uVar3 = -(int)DAT_00279b20;
  uVar5 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar3 | 0x333596ae) * 2 - (uVar3 ^ 0x333596ae)) * 300 +
                     (long)(int)((uVar2 | 0x333596e6) * 2 - (uVar2 ^ 0x333596e6))])(3);
  *(undefined4 *)(unaff_x19 + 0xb0) = uVar5;
  iVar6 = (int)DAT_00279b20;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar6 | 0x333596aeU) + (-iVar6 & 0x333596aeU)) * 300 +
             (long)(int)(0x333597b8 - (-iVar6 ^ 0xffffffffU))])
            ((-iVar6 | 0x333596b0U) + (-iVar6 & 0x333596b0U));
  if (*(long *)(unaff_x20 + 0x68) != 0) {
    ppuVar1 = &PTR_LAB_00275030;
    if (*(char *)(*(long *)(unaff_x20 + 0x68) + 0x62) != '\0') {
      ppuVar1 = &PTR_LAB_002747d8 +
                (int)((-(int)DAT_00279b20 ^ 0x333596fcU) + (-(int)DAT_00279b20 & 0x333596fcU) * 2);
    }
                    /* WARNING: Could not recover jumptable at 0x00246350. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  lVar4 = tpidr_el0;
  if (*(long *)(lVar4 + 0x28) == in_stack_00000138) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


