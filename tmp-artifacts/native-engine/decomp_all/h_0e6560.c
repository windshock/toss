// entry=0xe6560

void He6560(void)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  ulong uVar4;
  undefined8 uVar5;
  int iVar6;
  code *in_x14;
  ulong unaff_x27;
  ulong unaff_x30;
  undefined1 auVar7 [16];
  
  auVar7 = (*in_x14)(0);
  uVar4 = auVar7._0_8_;
  if (uVar4 < unaff_x27 !=
      ((uVar4 != 0xffffffffffffffff) == uVar4 < unaff_x30 || uVar4 == 0xffffffffffffffff) &&
      uVar4 < unaff_x27) {
    ppuVar1 = &PTR_LAB_0027f528;
    if (unaff_x27 <= (uVar4 ^ 0x1000) + (uVar4 & 0x1000) * 2) {
      ppuVar1 = &PTR_LAB_0027f4c8;
    }
                    /* WARNING: Could not recover jumptable at 0x001e6d30. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(uVar4,auVar7._8_8_,0);
    return;
  }
  iVar6 = (int)DAT_002765f0;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar6 | 0x7b9ee79eU) * 2 - (-iVar6 ^ 0x7b9ee79eU)) * 300 +
             (long)(int)((-iVar6 | 0x7b9ee7b2U) + (-iVar6 & 0x7b9ee7b2U))])
            ((-iVar6 | 0x7b9ee79eU) * 2 - (-iVar6 ^ 0x7b9ee79eU),auVar7._8_8_,0);
  do {
    if (DAT_0029e60c != 0) {
      ClearExclusiveLocal();
      uVar5 = 0;
      goto LAB_001e7c80;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x29e60c,0x10);
    if (bVar3) {
      DAT_0029e60c = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  uVar5 = 1;
LAB_001e7c80:
                    /* WARNING: Could not recover jumptable at 0x001efc24. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027e720)(uVar5);
  return;
}


