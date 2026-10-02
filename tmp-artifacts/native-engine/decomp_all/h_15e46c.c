// entry=0x15e46c

void H15e46c(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  ulong uVar4;
  long unaff_x19;
  
  uVar2 = -(int)DAT_00285720;
  uVar3 = -(int)DAT_00285720;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar3 | 0x4b98a2a0) * 2 - (uVar3 ^ 0x4b98a2a0)) * 300 +
             (long)(int)((uVar2 ^ 0x4b98a3a7) + (uVar2 & 0x4b98a3a7) * 2)])(2);
  uVar4 = 0x4e91c1194b98a2a0 - (-DAT_00285720 ^ 0xffffffffffffffffU);
  ppuVar1 = &PTR_LAB_00275148;
  if ((*(ulong *)(unaff_x19 + 0x18) ^ uVar4) + (*(ulong *)(unaff_x19 + 0x18) & uVar4) * 2 !=
      *(long *)(unaff_x19 + 0x28)) {
    ppuVar1 = &PTR_LAB_0027a488 +
              (long)(int)(0x4b98a29f - (-(int)DAT_00285720 ^ 0xffffffffU)) * 0x65;
  }
                    /* WARNING: Could not recover jumptable at 0x0025cb00. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


