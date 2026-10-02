// entry=0x5ffdc

void H5ffdc(void)

{
  undefined **ppuVar1;
  char cVar2;
  bool bVar3;
  long lVar4;
  int iVar5;
  
LAB_0015ffe0:
  do {
    if (DAT_00286314 == 0) {
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(0x286314,0x10);
      if (bVar3) {
        DAT_00286314 = 1;
        cVar2 = ExclusiveMonitorsStatus();
      }
      if (cVar2 != '\0') goto LAB_0015ffe0;
      bVar3 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar3 = false;
    }
    if (bVar3) {
      iVar5 = (int)DAT_00274ad0;
      if ((DAT_00278314 >> 0x10) * (DAT_00278314 & 0xffff) >> 0x10 != 0) {
        DAT_00286314 = 0;
        lVar4 = (*(code *)(&PTR_FUN_0027c1e0)
                          [(long)(int)((-iVar5 | 0x1660fb7dU) * 2 - (-iVar5 ^ 0x1660fb7dU)) * 300 +
                           (long)(int)(0x1660fbb2 - (-iVar5 ^ 0xffffffffU))])
                          (&DAT_00280840,(-iVar5 | 0x1660fb81U) + (-iVar5 & 0x1660fb81U));
                    /* WARNING: Could not recover jumptable at 0x001617c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_0027f5e0)(lVar4 == 0);
        return;
      }
      ppuVar1 = &PTR_LAB_002782a0;
      if ((((-DAT_00274ad0 | 0xf939b2f51660fb7dU) + (-DAT_00274ad0 & 0xf939b2f51660fb7dU)) -
          (0xf939b2f51660fb7d - (-DAT_00274ad0 ^ 0xffffffffffffffffU) ^ 0xffffffffffffffff)) + -1 !=
          (-DAT_00274ad0 | 0xf939b2f51660fb85U) + (-DAT_00274ad0 & 0xf939b2f51660fb85U)) {
        ppuVar1 = &PTR_LAB_0027d560;
      }
                    /* WARNING: Could not recover jumptable at 0x00160920. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar1)(0xffffffffffffffff,-iVar5 ^ 0x7232e512,0xffffffff,
                          (-iVar5 | 0x1660fb85U) << 1);
      return;
    }
  } while( true );
}


