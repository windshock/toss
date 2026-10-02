// entry=0x1016d8

void H1016d8(void)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  ulong uVar4;
  undefined8 extraout_x1;
  int iVar5;
  long unaff_x29;
  
  DAT_0029e354 = 1;
  iVar5 = (int)DAT_00280ba8;
  DAT_0029e778 = (*(code *)(&PTR_FUN_0027c1e0)
                           [(long)(int)((-iVar5 ^ 0xb4c759feU) + (-iVar5 & 0xb4c759feU) * 2) * 300 +
                            (long)(int)((-iVar5 | 0xb4c75a91U) * 2 - (-iVar5 ^ 0xb4c75a91U))])
                           ((-iVar5 | 0xb4c759feU) + (-iVar5 & 0xb4c759feU));
  uVar1 = -(int)DAT_00280ba8;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar1 | 0xb4c759fe) * 2 - (uVar1 ^ 0xb4c759fe)) * 300 +
             (long)(int)(-0x4b38a4e8 - (-(int)DAT_00280ba8 ^ 0xffffffffU))])(DAT_002862b8);
  uVar1 = -(int)DAT_00280ba8;
  uVar2 = -(int)DAT_00280ba8;
  uVar4 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar2 ^ 0xb4c759fe) + (uVar2 & 0xb4c759fe) * 2) * 300 +
                     (long)(int)((uVar1 ^ 0xb4c75a12) + (uVar1 & 0xb4c75a12) * 2)])
                    (0,extraout_x1,DAT_0029e778);
  lVar3 = tpidr_el0;
  if (*(long *)(lVar3 + 0x28) == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail((uVar4 | 0x4ea7b9e6) * 2 - (uVar4 ^ 0x4ea7b9e6));
}


