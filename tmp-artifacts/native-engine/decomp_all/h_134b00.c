// entry=0x134b00

void H134b00(code *param_1)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  
  iVar5 = (*param_1)();
  ppuVar1 = &PTR_LAB_002768f8;
  if (iVar5 != -1) {
    ppuVar1 = &PTR_H1346cc_002806d0;
  }
  uVar3 = -(int)DAT_00274ae0;
  uVar4 = -(int)DAT_00274ae0;
  ppuVar2 = &PTR_LAB_00281350 + (int)((uVar4 ^ 0x5de9c89a) + (uVar4 & 0x5de9c89a) * 2);
  if (iVar5 != (uVar3 | 0x5de9c898) * 2 - (uVar3 ^ 0x5de9c898)) {
    ppuVar2 = ppuVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x00233484. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


