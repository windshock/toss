// entry=0x139344

void H139344(void)

{
  undefined **ppuVar1;
  uint uVar2;
  long lVar3;
  byte in_w8;
  
  DAT_0027e240 = in_w8 & 1;
  uVar2 = -(int)DAT_00279eb0;
  DAT_0029e330 = (uVar2 | 0x8692046) * 2 - (uVar2 ^ 0x8692046);
  uVar2 = -(int)DAT_00279eb0;
  DAT_00278648 = (uVar2 | 0x8692046) * 2 - (uVar2 ^ 0x8692046);
  memset(&stack0x00000110,0,0x80);
  memset(&stack0x00000090,0,0x80);
  lVar3 = 0x3f63e72908691fe1 - (-DAT_00279eb0 ^ 0xffffffffffffffffU);
  CallSupervisor(0);
  ppuVar1 = &PTR_LAB_00281b78;
  if ((ulong)(long)(int)lVar3 <= 0x3f63e72908691045 - (-DAT_00279eb0 ^ 0xffffffffffffffffU)) {
    ppuVar1 = &PTR_LAB_00281f10;
  }
                    /* WARNING: Could not recover jumptable at 0x00239ffc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(lVar3,&DAT_0027e468,&stack0x00000090,
                      (-DAT_00279eb0 ^ 0x3f63e72908692146U) +
                      (-DAT_00279eb0 & 0x3f63e72908692146U) * 2);
  return;
}


