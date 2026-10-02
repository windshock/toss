// entry=0xdcc30

void FUN_001dd59c(code *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined **ppuVar1;
  int iVar2;
  
  iVar2 = (*param_1)((-(int)DAT_00274f48 | 0xcbf878adU) + (-(int)DAT_00274f48 & 0xcbf878adU),param_3
                     ,&DAT_00280f21);
  ppuVar1 = &PTR_LAB_0027ad48;
  if (iVar2 != (-(int)DAT_00274f48 | 0xcbf878acU) * 2 - (-(int)DAT_00274f48 ^ 0xcbf878acU)) {
    ppuVar1 = &PTR_LAB_00280678;
  }
                    /* WARNING: Could not recover jumptable at 0x001df1a0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


