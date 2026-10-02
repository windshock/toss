// entry=0xec16c

void He4f60(undefined8 param_1)

{
  short sVar1;
  ushort uVar2;
  char cVar3;
  bool bVar4;
  uint uVar5;
  ushort uVar6;
  undefined8 in_x5;
  undefined8 in_x7;
  ulong in_x10;
  long lVar7;
  long unaff_x19;
  
  if ((in_x10 & 1) != 0) {
    uVar2 = (DAT_00281e18 ^ 0xff00) & DAT_00281e18;
    sVar1 = (short)DAT_002765f0;
    uVar6 = (ushort)((int)(short)DAT_00281e18 >>
                    ((int)(short)(-sVar1 | 0xe7a6) + (int)(short)(-sVar1 & 0xe7a6) & 0x1fU));
    uVar5 = (uint)(short)((uVar6 ^ (-sVar1 | 0xe7a5U) + (-sVar1 & 0xe7a5U) ^ 0xffff) & uVar6);
    uVar5 = (uVar5 ^ ((int)(short)((-sVar1 | 0xe7a5U) << 1) - (int)(short)(-sVar1 ^ 0xe7a5) ^
                     0xffffU) & 0xffff) & 0xffff & uVar5;
    lVar7 = (-DAT_002765f0 ^ 0xeb98be6e7b9ee79eU) + (-DAT_002765f0 & 0xeb98be6e7b9ee79eU) * 2;
    if ((short)((int)(short)((uVar2 ^ (ushort)(1 << (ulong)(uVar5 & 0x1f)) ^ 0xffff) & uVar2) >>
               (uVar5 & 0x1f)) == 1) {
      *(undefined8 *)(unaff_x19 + 0x30) = in_x5;
      *(undefined8 *)(unaff_x19 + 0x90) = in_x7;
      DAT_0029e854 = 0;
                    /* WARNING: Could not recover jumptable at 0x001eedf0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00279bd8)();
      return;
    }
    do {
      lVar7 = (lVar7 - ((-DAT_002765f0 | 0xeb98be6e7b9ee79fU) * 2 -
                        (-DAT_002765f0 ^ 0xeb98be6e7b9ee79fU) ^ 0xffffffffffffffff)) + -1;
    } while (lVar7 != -0x146741918461184e - (-DAT_002765f0 ^ 0xffffffffffffffffU));
                    /* WARNING: Could not recover jumptable at 0x001ee354. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002767e0)(param_1,-(int)DAT_002765f0 ^ 0x7b9ee7bf);
    return;
  }
  do {
    if (DAT_0029e854 != 0) {
      ClearExclusiveLocal();
      break;
    }
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(0x29e854,0x10);
    if (bVar4) {
      DAT_0029e854 = 1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
                    /* WARNING: Could not recover jumptable at 0x001e9830. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_He4f60_0027f948)();
  return;
}


