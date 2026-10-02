// entry=0xed924

void Hed924(undefined8 param_1,undefined8 param_2)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  char *in_x9;
  char in_w10;
  char *unaff_x27;
  
  iVar5 = (int)DAT_002765f0;
  if (in_w10 != '\0') {
    if (in_x9 < unaff_x27) {
                    /* WARNING: Could not recover jumptable at 0x001f0114. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00277408)();
      return;
    }
    in_x9 = in_x9 + 1;
    if (in_x9 < unaff_x27) {
                    /* WARNING: Could not recover jumptable at 0x001e9cd8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)(&PTR_LAB_0027dd90)
                [(long)(int)((-iVar5 | 0x7b9ee79eU) * 2 - (-iVar5 ^ 0x7b9ee79eU)) * 0x67])();
      return;
    }
  }
  while (iVar4 = 0, in_x9 < unaff_x27) {
    while (*in_x9 == '\0') {
      in_x9 = in_x9 + (-DAT_002765f0 ^ 0xeb98be6e7b9ee79fU) +
                      (-DAT_002765f0 & 0xeb98be6e7b9ee79fU) * 2;
      iVar4 = (-iVar5 ^ 0x7b9ee79eU) + (-iVar5 & 0x7b9ee79eU) * 2;
      if (unaff_x27 <= in_x9) goto He7534;
    }
    if (in_x9 < unaff_x27) {
      ppuVar1 = &PTR_LAB_00276e88;
      if (*in_x9 != '\0') {
        ppuVar1 = (undefined **)&DAT_0027c1b0;
      }
                    /* WARNING: Could not recover jumptable at 0x001ee424. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar1)(param_1,param_2,iVar4);
      return;
    }
    in_x9 = in_x9 + (-DAT_002765f0 ^ 0xeb98be6e7b9ee79fU) +
                    (-DAT_002765f0 & 0xeb98be6e7b9ee79fU) * 2;
    if ((in_x9 < unaff_x27) && (*in_x9 != '\0')) {
      if (in_x9 < unaff_x27) {
                    /* WARNING: Could not recover jumptable at 0x001e9f48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_00280d28)();
        return;
      }
                    /* WARNING: Could not recover jumptable at 0x001ef3d4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_0027f420)();
      return;
    }
  }
He7534:
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar5 | 0x7b9ee79eU) * 2 - (-iVar5 ^ 0x7b9ee79eU)) * 300 +
             (long)(int)((-iVar5 | 0x7b9ee7b2U) + (-iVar5 & 0x7b9ee7b2U))])
            ((-iVar5 | 0x7b9ee79eU) * 2 - (-iVar5 ^ 0x7b9ee79eU));
  do {
    if (DAT_0029e60c != 0) {
      ClearExclusiveLocal();
      uVar6 = 0;
      goto LAB_001e7c80;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x29e60c,0x10);
    if (bVar3) {
      DAT_0029e60c = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  uVar6 = 1;
LAB_001e7c80:
                    /* WARNING: Could not recover jumptable at 0x001efc24. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027e720)(uVar6);
  return;
}


