// entry=0xe72d8

void He72d8(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  long lVar1;
  uint uVar2;
  char cVar3;
  bool bVar4;
  uint uVar5;
  undefined8 uVar6;
  int iVar7;
  long unaff_x19;
  uint unaff_w21;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x25;
  
  uVar2 = (uint)unaff_x25;
  if ((long)(int)unaff_w21 <= (long)unaff_x25) {
    uVar2 = unaff_w21;
  }
  lVar1 = unaff_x23 + unaff_x25 * 0x20;
  iVar7 = (int)DAT_002765f0;
  if (*(char *)(unaff_x22 + unaff_x25) == '\0') {
    (*(code *)(&PTR_FUN_0027c1e0)
              [(long)(int)((-iVar7 | 0x7b9ee79eU) + (-iVar7 & 0x7b9ee79eU)) * 300 +
               (long)(int)((-iVar7 | 0x7b9ee851U) * 2 - (-iVar7 ^ 0x7b9ee851U))])
              (lVar1,0x20,&DAT_0027ba50,*param_3);
  }
  else {
    (*(code *)(&PTR_FUN_0027c1e0)
              [(long)(int)(0x7b9ee79d - (-iVar7 ^ 0xffffffffU)) * 300 +
               (long)(int)((-iVar7 | 0x7b9ee851U) * 2 - (-iVar7 ^ 0x7b9ee851U))])
              (lVar1,0x20,&DAT_002828c0);
  }
  *(long *)(*(long *)(unaff_x19 + 0x50) + unaff_x25 * 8) = lVar1;
  if ((unaff_x25 | 1) + (unaff_x25 & 1) == 4) {
    uVar5 = 0x7b9ee79e - (-(int)DAT_002765f0 ^ 0xffffffffU);
                    /* WARNING: Could not recover jumptable at 0x001efc10. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002759a8)((uVar2 | uVar5) * 2 - (uVar2 ^ uVar5));
    return;
  }
  do {
    if (DAT_0029e5f8 != 0) {
      ClearExclusiveLocal();
      uVar6 = 0;
      goto LAB_001e7fd8;
    }
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(0x29e5f8,0x10);
    if (bVar4) {
      DAT_0029e5f8 = 1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  uVar6 = 1;
LAB_001e7fd8:
                    /* WARNING: Could not recover jumptable at 0x001e7fe4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002743c8)(uVar6);
  return;
}


