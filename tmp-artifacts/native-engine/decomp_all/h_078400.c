// entry=0x78400

void thunk_FUN_001770f0(void)

{
  int iVar1;
  undefined **ppuVar2;
  uint uVar3;
  bool bVar4;
  ulong in_stack_00000050;
  
  uVar3 = -(int)DAT_00276da8;
  iVar1 = (uVar3 | 0x3994d2a1) + (uVar3 & 0x3994d2a1);
  if ((in_stack_00000050 & 0x10000) == 0) {
    iVar1 = 0;
  }
  uVar3 = -(int)DAT_00276da8;
  bVar4 = DAT_002862d8 == (uVar3 ^ 0x3994d2a1) + (uVar3 & 0x3994d2a1) * 2;
  ppuVar2 = &PTR_H7509c_0027f710;
  if (((bVar4 ^ in_stack_00000050._2_1_ & 1 ^ 1) & bVar4) == 0) {
    ppuVar2 = &PTR_LAB_00282a20;
  }
  DAT_002862d8 = (DAT_002862d8 | -iVar1) * 2 - (DAT_002862d8 ^ -iVar1);
                    /* WARNING: Could not recover jumptable at 0x00171e40. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


