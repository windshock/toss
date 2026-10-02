// entry=0xe6ff8

void He6ff8(void)

{
  long lVar1;
  uint uVar2;
  char cVar3;
  bool bVar4;
  undefined8 uVar5;
  long unaff_x19;
  uint unaff_w21;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x25;
  
  *(undefined1 *)(unaff_x22 + unaff_x25) = 1;
  lVar1 = unaff_x23 + (unaff_x25 << (0xe7a2 - (-DAT_002765f0 ^ 0xffffffffffffffffU) & 0x3f));
  uVar2 = -(int)DAT_002765f0;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(0x7b9ee79d - (-(int)DAT_002765f0 ^ 0xffffffffU)) * 300 +
             (long)(int)((uVar2 | 0x7b9ee851) * 2 - (uVar2 ^ 0x7b9ee851))])
            (lVar1,0x20,&DAT_002828c0);
  *(long *)(*(long *)(unaff_x19 + 0x50) + unaff_x25 * 8) = lVar1;
  if ((unaff_x25 | 1) + (unaff_x25 & 1) == 4) {
    uVar2 = 0x7b9ee79e - (-(int)DAT_002765f0 ^ 0xffffffffU);
                    /* WARNING: Could not recover jumptable at 0x001efc10. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002759a8)((unaff_w21 | uVar2) * 2 - (unaff_w21 ^ uVar2));
    return;
  }
  do {
    if (DAT_0029e5f8 != 0) {
      ClearExclusiveLocal();
      uVar5 = 0;
      goto LAB_001e7fd8;
    }
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(0x29e5f8,0x10);
    if (bVar4) {
      DAT_0029e5f8 = 1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  uVar5 = 1;
LAB_001e7fd8:
                    /* WARNING: Could not recover jumptable at 0x001e7fe4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002743c8)(uVar5);
  return;
}


