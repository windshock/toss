// entry=0x76254

void H76254(void)

{
  int iVar1;
  undefined **ppuVar2;
  bool bVar3;
  int iVar4;
  ulong in_stack_00000050;
  
  iVar4 = (int)DAT_00276da8;
  iVar1 = (-iVar4 ^ 0x3994d2a1U) + (-iVar4 & 0x3994d2a1U) * 2;
  if ((in_stack_00000050 & 0x10000) == 0) {
    iVar1 = (-iVar4 ^ 0x3994d2a0U) + (-iVar4 & 0x3994d2a0U) * 2;
  }
  bVar3 = DAT_002862d8 == (-iVar4 ^ 0x3994d2a1U) + (-iVar4 & 0x3994d2a1U) * 2;
  ppuVar2 = &PTR_H72004_0027ecc8;
  if (((bVar3 ^ in_stack_00000050._2_1_ & 1 ^ 1) & bVar3) == 0) {
    ppuVar2 = &PTR_LAB_00277d60;
  }
  DAT_002862d8 = (DAT_002862d8 - (-iVar1 ^ 0xffffffffU)) + -1;
                    /* WARNING: Could not recover jumptable at 0x0017748c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


