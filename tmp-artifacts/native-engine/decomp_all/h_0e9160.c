// entry=0xe9160

void thunk_FUN_001eef64(void)

{
  uint uVar1;
  ulong uVar2;
  undefined **ppuVar3;
  int iVar4;
  ulong uVar5;
  byte bVar6;
  byte *unaff_x20;
  long unaff_x25;
  
  bVar6 = *unaff_x20;
  uVar5 = (-DAT_002765f0 | 0xeb98be6e7b9ee79eU) + (-DAT_002765f0 & 0xeb98be6e7b9ee79eU);
  if (bVar6 == 0) {
                    /* WARNING: Could not recover jumptable at 0x001efbec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00279730)();
    return;
  }
  iVar4 = 0;
  do {
    uVar1 = (bVar6 ^ 0xffffffd0) + (bVar6 & 0xffffffd0) * 2;
    iVar4 = (uVar1 ^ iVar4 * 10) + (uVar1 & iVar4 * 10) * 2;
    uVar2 = (-DAT_002765f0 | 0xeb98be6e7b9ee79fU) + (-DAT_002765f0 & 0xeb98be6e7b9ee79fU);
    uVar5 = (uVar5 | uVar2) + (uVar5 & uVar2);
    bVar6 = *(byte *)(unaff_x25 +
                      ((-DAT_002765f0 | 0xeb98be6e7b9ee79eU) * 2 -
                      (-DAT_002765f0 ^ 0xeb98be6e7b9ee79eU)) * 0x5c + uVar5);
  } while (bVar6 != 0);
  ppuVar3 = &PTR_LAB_0027d4e0;
  if (iVar4 <= (int)((-(int)DAT_002765f0 ^ 0x7b9ee79eU) + (-(int)DAT_002765f0 & 0x7b9ee79eU) * 2)) {
    ppuVar3 = &PTR_LAB_00275730;
  }
                    /* WARNING: Could not recover jumptable at 0x001f0224. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)();
  return;
}


