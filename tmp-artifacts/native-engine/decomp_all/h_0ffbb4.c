// entry=0xffbb4

void Hfe3b4(void)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  
  uVar3 = -(int)DAT_00280ba8;
  iVar4 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)(-0x4b38a603 - (-(int)DAT_00280ba8 ^ 0xffffffffU)) * 300 +
                     (long)(int)((uVar3 | 0xb4c75a55) * 2 - (uVar3 ^ 0xb4c75a55))])(2);
  iVar5 = (int)DAT_00280ba8;
  if (iVar4 != 0x217c38a) {
    iVar4 = (*(code *)(&PTR_FUN_0027c1e0)
                      [(long)(int)(-0x4b38a603 - (-iVar5 ^ 0xffffffffU)) * 300 +
                       (long)(int)((-iVar5 ^ 0xb4c75a55U) + (-iVar5 & 0xb4c75a55U) * 2)])
                      ((-iVar5 ^ 0xb4c75a00U) + (-iVar5 & 0xb4c75a00U) * 2);
    ppuVar1 = &PTR_LAB_0027fa30;
    if (iVar4 != -0x5ce2c044) {
      ppuVar1 = &PTR_LAB_00274b48;
    }
    ppuVar2 = &PTR_LAB_0027fa30;
    if (iVar4 != -0x61204fcb) {
      ppuVar2 = ppuVar1;
    }
                    /* WARNING: Could not recover jumptable at 0x00202034. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x001fe2b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00278c38)
            [(long)(int)((-iVar5 | 0xb4c759feU) * 2 - (-iVar5 ^ 0xb4c759feU)) * 0x5d])();
  return;
}


