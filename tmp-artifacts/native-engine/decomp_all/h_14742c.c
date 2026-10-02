// entry=0x14742c

void H14742c(void)

{
  undefined **ppuVar1;
  long lVar2;
  int iVar3;
  long unaff_x20;
  long in_stack_00000138;
  
  iVar3 = (int)DAT_00279b20;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar3 | 0x333596aeU) + (-iVar3 & 0x333596aeU)) * 300 +
             (long)(int)(0x333597b8 - (-iVar3 ^ 0xffffffffU))])
            ((-iVar3 | 0x333596b0U) + (-iVar3 & 0x333596b0U));
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
  lVar2 = tpidr_el0;
  if (*(long *)(lVar2 + 0x28) == in_stack_00000138) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


