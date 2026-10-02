// entry=0x147a1c

void H147a1c(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  bool bVar5;
  long in_x10;
  ulong in_x11;
  ulong in_x12;
  long unaff_x20;
  long in_stack_00000138;
  
  bVar5 = (in_x11 & in_x12 | in_x11 ^ in_x12) ==
          (-DAT_00279b20 | 0xacc6d7f8333596aeU) + (-DAT_00279b20 & 0xacc6d7f8333596aeU);
  if ((in_x10 != 0 || !bVar5) && (in_x10 == 0) == bVar5) {
                    /* WARNING: Could not recover jumptable at 0x00247ddc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002817c0)();
    return;
  }
  *(undefined4 *)(unaff_x20 + 0x28) = 0;
  uVar2 = -(int)DAT_00279b20;
  uVar3 = -(int)DAT_00279b20;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar3 ^ 0x333596ae) + (uVar3 & 0x333596ae) * 2) * 300 +
             (long)(int)((uVar2 ^ 0x333596eb) + (uVar2 & 0x333596eb) * 2)])(1);
  if (*(long *)(unaff_x20 + 0x68) != 0) {
    ppuVar1 = &PTR_LAB_00275570;
    if (*(char *)(*(long *)(unaff_x20 + 0x68) + 0x62) != '\0') {
      ppuVar1 = &PTR_LAB_002829d8;
    }
                    /* WARNING: Could not recover jumptable at 0x00246d94. Too many branches */
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


