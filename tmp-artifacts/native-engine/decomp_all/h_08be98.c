// entry=0x8be98

void H8be98(code *param_1)

{
  undefined **ppuVar1;
  long lVar2;
  
  lVar2 = (*param_1)();
  ppuVar1 = &PTR_H86d74_0027e8b8;
  if (lVar2 != 0) {
    ppuVar1 = &PTR_LAB_00275560;
  }
                    /* WARNING: Could not recover jumptable at 0x00185320. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


