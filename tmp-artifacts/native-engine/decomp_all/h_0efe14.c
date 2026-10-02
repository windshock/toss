// entry=0xefe14

void Hefe14(void)

{
  undefined **ppuVar1;
  uint uVar2;
  char cVar3;
  bool bVar4;
  
  do {
    if (DAT_0029e3cc != 0) {
      ClearExclusiveLocal();
      bVar4 = false;
      goto LAB_001efe54;
    }
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(0x29e3cc,0x10);
    if (bVar4) {
      DAT_0029e3cc = 1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  bVar4 = true;
LAB_001efe54:
  uVar2 = -(int)DAT_002765f0;
  ppuVar1 = &PTR_LAB_00277168 + (int)(0x7b9ee7dc - (-(int)DAT_002765f0 ^ 0xffffffffU));
  if (!bVar4) {
    ppuVar1 = &PTR_Hefe14_0027d8e0 +
              (long)(int)((uVar2 | 0x7b9ee79e) * 2 - (uVar2 ^ 0x7b9ee79e)) * 0x5f;
  }
                    /* WARNING: Could not recover jumptable at 0x001efed4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


