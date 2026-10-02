// entry=0x131168

void H131168(void)

{
  uint uVar1;
  undefined **ppuVar2;
  undefined **ppuVar3;
  uint in_w13;
  int iVar4;
  
  iVar4 = (int)DAT_00281e58;
  uVar1 = (in_w13 ^ (-iVar4 ^ 0xcc88cf45U) + (-iVar4 & 0xcc88cf45U) * 2 ^ 0xffffffff) & in_w13;
  ppuVar3 = &PTR_LAB_0027d620;
  if (uVar1 != 3) {
    ppuVar3 = &PTR_H1290e0_0027fdc8;
  }
  ppuVar2 = &PTR_H11d018_0027f5d8;
  if (uVar1 != (-iVar4 ^ 0xcc88cf44U) + (-iVar4 & 0xcc88cf44U) * 2) {
    ppuVar2 = ppuVar3;
  }
  ppuVar3 = &PTR_H1126e4_0027edb0;
  if (uVar1 != 1) {
    ppuVar3 = ppuVar2;
  }
                    /* WARNING: Could not recover jumptable at 0x002235f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)(0xffffffff,0xcc88cf42,-iVar4 ^ 0xcc88cf42);
  return;
}


