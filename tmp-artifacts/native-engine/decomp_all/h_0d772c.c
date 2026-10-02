// entry=0xd772c

void FUN_001d8070(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  undefined4 *puVar5;
  undefined8 in_x3;
  undefined8 in_x4;
  undefined8 in_x6;
  undefined8 in_x7;
  int iVar6;
  long unaff_x29;
  
  *(undefined8 *)(unaff_x29 + -0x138) = in_x7;
  *(undefined8 *)(unaff_x29 + -0x80) = in_x6;
  *(undefined8 *)(unaff_x29 + -0x88) = in_x4;
  *(undefined8 *)(unaff_x29 + -0x68) = in_x3;
  uVar2 = -(int)DAT_0027db08;
  uVar3 = -(int)DAT_0027db08;
  puVar5 = (undefined4 *)
           (*(code *)(&PTR_FUN_0027c1e0)
                     [(long)(int)((uVar2 | 0x65ce6968) + (uVar2 & 0x65ce6968)) * 300 +
                      (long)(int)((uVar3 ^ 0x65ce6a0f) + (uVar3 & 0x65ce6a0f) * 2)])();
  if (DAT_00286210 == 0) {
    iVar6 = (int)DAT_0027db08;
                    /* WARNING: Could not recover jumptable at 0x001d4dc0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&PTR_LAB_00278658)[(int)((-iVar6 | 0x65ce6970U) * 2 - (-iVar6 ^ 0x65ce6970U))])
              (&PTR_FUN_0027c1e0 +
               (long)(int)(0x65ce6967 - (-iVar6 ^ 0xffffffffU)) * 300 +
               (long)(int)((-iVar6 | 0x65ce6982U) * 2 - (-iVar6 ^ 0x65ce6982U)),puVar5,
               *(undefined8 *)(unaff_x29 + -0x138));
    return;
  }
  if (DAT_00286210 != 0x5f555e38) {
    ppuVar1 = &PTR_LAB_002761b0;
    if (DAT_00286310 != 0) {
      ppuVar1 = &PTR_LAB_0027ae70;
    }
                    /* WARNING: Could not recover jumptable at 0x001d4d1c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  *puVar5 = *puVar5;
  lVar4 = tpidr_el0;
  if (*(long *)(lVar4 + 0x28) == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(1);
}


