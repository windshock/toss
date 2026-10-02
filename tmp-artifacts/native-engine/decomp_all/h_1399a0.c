// entry=0x1399a0

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void H13994c(undefined8 param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong in_x13;
  ulong in_x16;
  ulong in_x17;
  undefined1 auVar3 [16];
  
  uVar1 = (in_x17 ^ 0xf) & in_x17;
  uVar2 = 0;
  do {
    auVar3 = a64_TBL(ZEXT816(0),
                     *(undefined1 (*) [16])
                      (&stack0x000002d0 +
                      (-DAT_00279eb0 | 0x3f63e72908692037U) + (-DAT_00279eb0 & 0x3f63e72908692037U)
                      + (in_x16 - uVar2) + (0x3f63e72908692046 - DAT_00279eb0) * 0x14),_DAT_0012c6c0
                    );
    *(long *)((long)(&stack0x000001bc +
                    uVar2 + in_x13 +
                    ((-DAT_00279eb0 ^ 0x63e72908692046U) + (-DAT_00279eb0 & 0x63e72908692046U) * 2)
                    * 0x100) + 8) = auVar3._8_8_;
    *(long *)(&stack0x000001bc +
             uVar2 + in_x13 +
             ((-DAT_00279eb0 ^ 0x63e72908692046U) + (-DAT_00279eb0 & 0x63e72908692046U) * 2) * 0x100
             ) = auVar3._0_8_;
    uVar2 = (uVar2 - ((-DAT_00279eb0 | 0x3f63e72908692056U) * 2 -
                      (-DAT_00279eb0 ^ 0x3f63e72908692056U) ^ 0xffffffffffffffff)) - 1;
  } while (uVar2 != uVar1);
  if (in_x17 == uVar1) {
                    /* WARNING: Could not recover jumptable at 0x0023fa30. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002767c0)(param_1,uVar1,uVar1 | in_x13,(in_x16 | -uVar1) << 1);
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0023efc0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00282510)();
  return;
}


