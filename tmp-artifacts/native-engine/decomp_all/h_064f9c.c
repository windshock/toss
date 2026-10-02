// entry=0x64f9c

void FUN_00164f9c(int param_1,undefined8 param_2,long *param_3)

{
  undefined **ppuVar1;
  bool bVar2;
  
  bVar2 = DAT_0029e550 ==
          (-DAT_0027eb60 ^ 0x12608f719c0d8576U) + (-DAT_0027eb60 & 0x12608f719c0d8576U) * 2;
  bVar2 = bVar2 && DAT_0029e360 == 0 || bVar2 != (DAT_0029e360 == 0);
  if (param_1 == 0) {
    if (bVar2) {
      ppuVar1 = (undefined **)&DAT_0027d6b8;
      if (*param_3 != 0) {
        ppuVar1 = &PTR_LAB_0027fe58;
      }
                    /* WARNING: Could not recover jumptable at 0x00165484. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar1)();
      return;
    }
  }
  else if (bVar2) {
                    /* WARNING: Could not recover jumptable at 0x00165424. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&PTR_LAB_002777a0)
              [(int)((-(int)DAT_0027eb60 | 0x9c0d859bU) + (-(int)DAT_0027eb60 & 0x9c0d859bU))])();
    return;
  }
  return;
}


