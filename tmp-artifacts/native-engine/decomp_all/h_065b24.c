// entry=0x65b24

void H65b24(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong unaff_x20;
  ulong unaff_x26;
  
  uVar1 = (-DAT_00274f18 | 0x4c4e0a401b697b96U) + (-DAT_00274f18 & 0x4c4e0a401b697b96U);
  uVar1 = (((unaff_x20 ^ uVar1) + (unaff_x20 & uVar1) * 2) - (unaff_x26 ^ 0xffffffffffffffff)) - 1;
  uVar3 = (long)uVar1 >> ((-DAT_00274f18 | 0xff9fU) + (-DAT_00274f18 & 0xff9fU) & 0x3f);
  uVar3 = ((uVar3 | uVar1) & (uVar3 & uVar1 ^ 0xffffffffffffffff)) *
          ((-DAT_00274f18 | 0x6d6ed7f3b903e53aU) * 2 - (-DAT_00274f18 ^ 0x6d6ed7f3b903e53aU));
  uVar2 = (long)uVar3 >> ((-DAT_00274f18 | 0xff9cU) * 2 - (-DAT_00274f18 ^ 0xff9cU) & 0x3f);
  uVar1 = (-DAT_00274f18 | 0x42e6da41af50116cU) + (-DAT_00274f18 & 0x42e6da41af50116cU);
  uVar1 = ((DAT_0029e798 | uVar1) & (DAT_0029e798 & uVar1 ^ 0xffffffffffffffff)) *
          ((uVar2 ^ 0xffffffffffffffff) & uVar3 | uVar2 & (uVar3 ^ 0xffffffffffffffff));
                    /* WARNING: Could not recover jumptable at 0x00166618. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027af50)
            ((((long)uVar1 >> 0x1e | uVar1) & ((long)uVar1 >> 0x1e & uVar1 ^ 0xffffffffffffffff)) *
             ((-DAT_00274f18 | 0x6d6ed7f3b903e53aU) * 2 - (-DAT_00274f18 ^ 0x6d6ed7f3b903e53aU)));
  return;
}


