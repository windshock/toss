// entry=0x66dac

void H66dac(void)

{
  undefined **ppuVar1;
  uint uVar2;
  long lVar3;
  bool bVar4;
  bool bVar5;
  bool bVar6;
  uint in_w8;
  uint *in_x9;
  int iVar7;
  long unaff_x19;
  long unaff_x29;
  
  uVar2 = *in_x9;
  iVar7 = (int)DAT_00274f18;
  if (((uVar2 ^ 0x40ffffff) & uVar2) != 0xb41eff80 - (-iVar7 ^ 0xffffffffU)) {
    bVar4 = ((uVar2 ^ 0x401ff3ff) & uVar2) == 0xb8400400;
    bVar5 = ((uVar2 ^ 0x403ff3ff) & uVar2) == 0xb8400c00;
    bVar6 = ((uVar2 ^ 0x403fffff) & uVar2) == 0xb9400000;
    ppuVar1 = &PTR_LAB_00282118;
    if ((!bVar6 || (!bVar4 || !bVar5) && bVar4 == bVar5) &&
        bVar6 == (bVar4 && bVar5 || bVar4 != bVar5)) {
      ppuVar1 = &PTR_LAB_0027b7e8;
    }
                    /* WARNING: Could not recover jumptable at 0x0016727c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  if (((*(uint *)(unaff_x19 + 0xc) ^ 0x9c1efb9f - (-iVar7 ^ 0xffffffffU) ^ 0xffffffff) &
      *(uint *)(unaff_x19 + 0xc)) != 0xd61f0000) {
                    /* WARNING: Could not recover jumptable at 0x001668f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&PTR_LAB_00276268)[(int)((-iVar7 ^ 0x9c1effb5U) + (-iVar7 & 0x9c1effb5U) * 2)])
              (((in_w8 ^ 0x803fffff) & in_w8) == (-iVar7 | 0xc59eff81U) + (-iVar7 & 0xc59eff81U));
    return;
  }
  lVar3 = tpidr_el0;
  if (*(long *)(lVar3 + 0x28) == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(1);
}


