// entry=0xe9de0

void FUN_001e9de0(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  undefined8 uVar5;
  char *unaff_x25;
  char *unaff_x27;
  
  do {
    while (iVar4 = (int)DAT_002765f0, *unaff_x25 != '\0') {
      if (unaff_x25 < unaff_x27) {
        ppuVar1 = &PTR_LAB_00276e88;
        if (*unaff_x25 != '\0') {
          ppuVar1 = (undefined **)&DAT_0027c1b0;
        }
                    /* WARNING: Could not recover jumptable at 0x001ee424. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)*ppuVar1)(param_1,param_2,param_3);
        return;
      }
      unaff_x25 = unaff_x25 +
                  (-DAT_002765f0 ^ 0xeb98be6e7b9ee79fU) + (-DAT_002765f0 & 0xeb98be6e7b9ee79fU) * 2;
      if ((unaff_x25 < unaff_x27) && (*unaff_x25 != '\0')) {
        if (unaff_x25 < unaff_x27) {
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
      param_3 = 0;
      if (unaff_x27 <= unaff_x25) goto He7534;
    }
    unaff_x25 = unaff_x25 +
                (-DAT_002765f0 ^ 0xeb98be6e7b9ee79fU) + (-DAT_002765f0 & 0xeb98be6e7b9ee79fU) * 2;
    param_3 = (ulong)((-iVar4 ^ 0x7b9ee79eU) + (-iVar4 & 0x7b9ee79eU) * 2);
  } while (unaff_x25 < unaff_x27);
He7534:
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar4 | 0x7b9ee79eU) * 2 - (-iVar4 ^ 0x7b9ee79eU)) * 300 +
             (long)(int)((-iVar4 | 0x7b9ee7b2U) + (-iVar4 & 0x7b9ee7b2U))])
            ((-iVar4 | 0x7b9ee79eU) * 2 - (-iVar4 ^ 0x7b9ee79eU));
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


