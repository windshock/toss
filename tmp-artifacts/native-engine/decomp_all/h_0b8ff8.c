// entry=0xb8ff8

void Hb8b58(void)

{
  ulong uVar1;
  undefined **ppuVar2;
  bool bVar3;
  bool bVar4;
  ulong uVar5;
  long unaff_x20;
  
  uVar5 = *(ulong *)(unaff_x20 + 0x1b8);
  bVar4 = DAT_0029e360 ==
          (-DAT_00279740 | 0xf09a48ec30fa725bU) + (-DAT_00279740 & 0xf09a48ec30fa725bU);
  uVar1 = (-DAT_00279740 ^ 0xf09a48ec30fa725aU) + (-DAT_00279740 & 0xf09a48ec30fa725aU) * 2;
  bVar3 = uVar5 <= (DAT_0029e550 ^ uVar1) + (DAT_0029e550 & uVar1) * 2;
  ppuVar2 = &PTR_LAB_002813f0;
  if ((DAT_0029e360 >= uVar5 || (!bVar3 || !bVar4) && bVar3 == bVar4) &&
      DAT_0029e360 < uVar5 == (bVar3 && bVar4 || bVar3 != bVar4)) {
    ppuVar2 = &PTR_LAB_0027bd00;
  }
                    /* WARNING: Could not recover jumptable at 0x001b93b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


