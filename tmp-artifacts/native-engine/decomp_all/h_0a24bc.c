// entry=0xa24bc

void Ha226c(code *param_1)

{
  ulong uVar1;
  uint uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  ulong uVar5;
  ulong uVar6;
  int iVar7;
  int iVar8;
  short sVar9;
  uint uVar10;
  long unaff_x19;
  undefined8 unaff_x20;
  long unaff_x22;
  undefined8 *unaff_x29;
  
  puVar4 = *(undefined8 **)(unaff_x19 + 600);
  *puVar4 = *(undefined8 *)(unaff_x19 + 0x2b0);
  puVar4[1] = unaff_x20;
  uVar2 = -(int)DAT_0027fb18;
  uVar10 = -(int)DAT_0027fb18;
  uVar3 = (*param_1)((&PTR_FUN_0027c1e0)
                     [(long)(int)((uVar2 | 0x56e407c0) + (uVar2 & 0x56e407c0)) * 300 +
                      (long)(int)((uVar10 | 0x56e408bb) + (uVar10 & 0x56e408bb))]);
  uVar5 = -DAT_0027fb18;
  iVar7 = (int)DAT_0027fb18;
  *(undefined **)(unaff_x19 + 0x2f8) =
       (&PTR_FUN_0027c1e0)
       [(long)(int)((-iVar7 ^ 0x56e407c0U) + (-iVar7 & 0x56e407c0U) * 2) * 300 +
        (long)(int)((-iVar7 | 0x56e407e2U) + (-iVar7 & 0x56e407e2U))];
  uVar6 = (-DAT_0027fb18 ^ 0x2e00d84656e407c0U) + (-DAT_0027fb18 & 0x2e00d84656e407c0U) * 2;
  iVar8 = (-(int)DAT_0027fb18 | 0x140aU) * 2 - (-(int)DAT_0027fb18 ^ 0x140aU);
  sVar9 = (-(short)DAT_0027fb18 | 0x140aU) + (-(short)DAT_0027fb18 & 0x140aU);
  if ((-iVar7 | 0x56e407c0U) * 2 - (-iVar7 ^ 0x56e407c0U) != 0x3380) {
    do {
      uVar2 = -(int)DAT_0027fb18 | 0x56e507ff;
      uVar3 = (ulong)uVar2;
      uVar2 = iVar8 * (uVar2 + (-(int)DAT_0027fb18 & 0x56e507ffU));
      uVar10 = (uint)**(byte **)(unaff_x19 + 0x2f8);
      iVar8 = (uVar2 ^ uVar10) + (uVar2 & uVar10) * 2;
      sVar9 = (short)iVar8;
      uVar1 = (-DAT_0027fb18 ^ 0x2e00d84656e407c1U) + (-DAT_0027fb18 & 0x2e00d84656e407c1U) * 2;
      uVar6 = (uVar6 | uVar1) + (uVar6 & uVar1);
      *(byte **)(unaff_x19 + 0x2f8) =
           *(byte **)(unaff_x19 + 0x2f8) +
           (0x2e00d84656e407c0 - (-DAT_0027fb18 ^ 0xffffffffffffffffU));
    } while (uVar6 != 0x3380);
  }
  if (sVar9 == 0x35f) {
                    /* WARNING: Could not recover jumptable at 0x0019b07c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*DAT_00274658)(**(long **)(unaff_x19 + 600) == 0,uVar3,
                    unaff_x22 + (uVar5 | 0x2e00d84656e407c0) + (uVar5 & 0x2e00d84656e407c0));
    return;
  }
  *(undefined8 *)(((ulong)unaff_x29 | 8) + ((ulong)unaff_x29 & 8)) = 0x1c;
  *unaff_x29 = 4;
                    /* WARNING: Could not recover jumptable at 0x001aa8a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00276808)();
  return;
}


