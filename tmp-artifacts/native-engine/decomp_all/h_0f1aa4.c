// entry=0xf1aa4

void FUN_001f1aa4(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  char cVar4;
  
  uVar2 = -(int)DAT_00281e48;
  uVar3 = -(int)DAT_00281e48;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar3 | 0xd01866da) + (uVar3 & 0xd01866da)) * 0x2b +
             (long)(int)((uVar2 | 0xd0186704) + (uVar2 & 0xd0186704))])();
  uVar2 = -(int)DAT_00281e48;
  uVar3 = -(int)DAT_00281e48;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar2 | 0xd01866da) + (uVar2 & 0xd01866da)) * 0x2b +
             (long)(int)((uVar3 | 0xd01866ee) + (uVar3 & 0xd01866ee))])();
  uVar2 = -(int)DAT_00281e48;
  uVar3 = -(int)DAT_00281e48;
  cVar4 = (*(code *)(&DAT_0029e620)
                    [(long)(int)((uVar2 ^ 0xd01866da) + (uVar2 & 0xd01866da) * 2) * 0x2b +
                     (long)(int)((uVar3 | 0xd0186700) + (uVar3 & 0xd0186700))])();
  ppuVar1 = &PTR_LAB_002777c8;
  if (cVar4 != '\0') {
    ppuVar1 = &PTR_FUN_0027b2f0;
  }
                    /* WARNING: Could not recover jumptable at 0x001f1c5c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


