// entry=0xc61bc

void Hc6170(void)

{
  byte bVar1;
  uint uVar2;
  byte *in_x9;
  long lVar3;
  uint uVar4;
  
  lVar3 = 0;
  uVar4 = 0;
  do {
    in_x9[lVar3] = (byte)uVar4;
    lVar3 = (lVar3 - (0x327f61589992c943 - (-DAT_00281e28 ^ 0xffffffffffffffffU) ^
                     0xffffffffffffffff)) + -1;
    uVar2 = 0xc943 - (-(int)DAT_00281e28 ^ 0xffffffffU);
    uVar4 = (uVar4 | uVar2) + (uVar4 & uVar2);
  } while (lVar3 != 0x100);
  bVar1 = *in_x9;
  uVar4 = (uint)bVar1 * 2 - (uint)bVar1;
  uVar4 = (uVar4 | 0xde) + (uVar4 & 0xde);
  *in_x9 = in_x9[(uVar4 ^ 0xffffff00) & uVar4];
  in_x9[(uVar4 ^ 0xffffff00) & uVar4] = bVar1;
                    /* WARNING: Could not recover jumptable at 0x001c64cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002800c8)();
  return;
}


