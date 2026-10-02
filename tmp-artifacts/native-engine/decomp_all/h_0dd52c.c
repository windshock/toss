// entry=0xdd52c

void Hdd52c(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  undefined8 extraout_x1;
  code *extraout_x8;
  
  uVar2 = -(int)DAT_00274f48;
  uVar3 = -(int)DAT_00274f48;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar2 ^ 0xcbf878ac) + (uVar2 & 0xcbf878ac) * 2) * 300 +
             (long)(int)((uVar3 | 0xcbf879c2) + (uVar3 & 0xcbf879c2))])(0);
  iVar4 = (*extraout_x8)((-(int)DAT_00274f48 | 0xcbf878adU) + (-(int)DAT_00274f48 & 0xcbf878adU),
                         extraout_x1,&DAT_00280f21);
  ppuVar1 = &PTR_LAB_0027ad48;
  if (iVar4 != (-(int)DAT_00274f48 | 0xcbf878acU) * 2 - (-(int)DAT_00274f48 ^ 0xcbf878acU)) {
    ppuVar1 = &PTR_LAB_00280678;
  }
                    /* WARNING: Could not recover jumptable at 0x001df1a0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


