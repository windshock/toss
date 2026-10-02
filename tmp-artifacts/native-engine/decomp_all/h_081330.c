// entry=0x81330

void H81330(void)

{
  undefined **ppuVar1;
  bool bVar2;
  int in_w8;
  int *in_x12;
  
  bVar2 = in_w8 != (-(int)DAT_00274480 ^ 0x94f8c30cU) + (-(int)DAT_00274480 & 0x94f8c30cU) * 2;
  ppuVar1 = &PTR_LAB_00276f00;
  if (bVar2 == (*in_x12 == 0x1b) || !bVar2) {
    ppuVar1 = &PTR_LAB_00274918;
  }
                    /* WARNING: Could not recover jumptable at 0x0017da90. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


