// entry=0x13d2bc

void H13d2bc(void)

{
  undefined **ppuVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  
  uVar2 = -(int)DAT_00279eb0;
  auVar3 = (*(code *)(&PTR_FUN_0027c1e0)
                     [(long)(int)(0x8692045 - (-(int)DAT_00279eb0 ^ 0xffffffffU)) * 300 +
                      (long)(int)((uVar2 | 0x8692081) + (uVar2 & 0x8692081))])
                     (&stack0x000002e4 +
                      ((-DAT_00279eb0 | 0x3f63e72908692046U) + (-DAT_00279eb0 & 0x3f63e72908692046U)
                      ) * 4);
  ppuVar1 = &PTR_thunk_FUN_0024045c_0027f7a8;
  if (auVar3._0_4_ != 0) {
    ppuVar1 = &PTR_LAB_002770f0;
  }
                    /* WARNING: Could not recover jumptable at 0x0023d384. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(auVar3._0_8_,auVar3._8_8_,0);
  return;
}


