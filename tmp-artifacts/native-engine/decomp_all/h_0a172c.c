// entry=0xa172c

void Ha0f04(ulong param_1)

{
  ulong uVar1;
  ulong uVar2;
  undefined **ppuVar3;
  code *UNRECOVERED_JUMPTABLE;
  long unaff_x19;
  long unaff_x20;
  
  uVar1 = (param_1 | -unaff_x20) + (param_1 & -unaff_x20);
  uVar2 = (-DAT_0027fb18 ^ 0x2e00d84656e407c1U) + (-DAT_0027fb18 & 0x2e00d84656e407c1U) * 2;
  uVar2 = (uVar1 ^ uVar2) + (uVar1 & uVar2) * 2;
  *(BADSPACEBASE **)(unaff_x19 + 0x30) = register0x00000008;
  ppuVar3 = &PTR_LAB_00283e30;
  if (uVar1 << ((-DAT_0027fb18 | 0x7e0U) + (-DAT_0027fb18 & 0x7e0U) & 0x3f) != 0) {
    ppuVar3 = &PTR_LAB_00274f50 +
              (int)((-(int)DAT_0027fb18 ^ 0x56e407cfU) + (-(int)DAT_0027fb18 & 0x56e407cfU) * 2);
  }
  UNRECOVERED_JUMPTABLE = (code *)*ppuVar3;
  *(ulong *)(unaff_x19 + 0x28) =
       (long)&stack0x00000000 - (((uVar2 ^ 0xffffffff00000000) & uVar2) + 0xf & 0xfffffffffffffff0);
                    /* WARNING: Could not recover jumptable at 0x001a1004. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)();
  return;
}


