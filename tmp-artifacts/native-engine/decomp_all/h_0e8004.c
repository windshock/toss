// entry=0xe8004

void He8004(long param_1,undefined8 param_2,int param_3,long param_4,ulong param_5)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  char cVar3;
  char in_w15;
  undefined4 in_w16;
  
  if (param_1 != param_4) {
    in_w15 = '\0';
  }
  cVar3 = (-(char)DAT_002765f0 | 0x9eU) * '\x02';
  if (in_w15 == (byte)(cVar3 - (-(char)DAT_002765f0 ^ 0x9eU))) {
    ppuVar2 = &PTR_LAB_00282e80;
    if (param_3 != 0xf70) {
      ppuVar2 = &PTR_LAB_00276530;
    }
    ppuVar1 = &PTR_LAB_00282e80;
    if (param_3 != 0xf2d) {
      ppuVar1 = ppuVar2;
    }
    ppuVar2 = &PTR_LAB_00282e80;
    if (param_3 != 0xf73) {
      ppuVar2 = ppuVar1;
    }
                    /* WARNING: Could not recover jumptable at 0x001ec1d4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)();
    return;
  }
  ppuVar2 = &PTR_LAB_00277840;
  if ((param_5 & 1) == 0) {
    ppuVar2 = &PTR_LAB_002798a0;
  }
                    /* WARNING: Could not recover jumptable at 0x001ef650. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)(-0x1467419184611863 - (-DAT_002765f0 ^ 0xffffffffffffffffU),*ppuVar2,in_w16,
                      cVar3,0);
  return;
}


