// entry=0xc237c

void Hc237c(void)

{
  uint uVar1;
  long lVar2;
  bool bVar3;
  uint uVar4;
  ulong uVar5;
  ulong unaff_x19;
  long unaff_x29;
  
  uVar5 = 0;
  uVar4 = 0xffffffff;
  do {
    uVar1 = -(int)DAT_0027a2f0;
    bVar3 = *(undefined **)((uVar5 ^ unaff_x19) + (uVar5 & unaff_x19) * 2) ==
            (&PTR_FUN_0027c1e0)
            [(long)(int)((uVar1 | 0x8c8f2a08) * 2 - (uVar1 ^ 0x8c8f2a08)) * 300 +
             (long)(int)(-0x7370d4ce - (-(int)DAT_0027a2f0 ^ 0xffffffffU))];
    uVar1 = (uint)uVar5;
    if (!bVar3) {
      uVar1 = uVar4;
    }
    uVar5 = uVar5 + 1;
    uVar4 = uVar1;
  } while (uVar5 < 0x100 != bVar3 && uVar5 < 0x100);
  if (uVar1 != 0xffffffff) {
    DAT_0027a9b0 = (uVar1 ^ 8) + (uVar1 & 8) * 2;
    DAT_00282fc0 = uVar1;
  }
  lVar2 = tpidr_el0;
  if (*(long *)(lVar2 + 0x28) == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


