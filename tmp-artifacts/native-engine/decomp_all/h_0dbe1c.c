// entry=0xdbe1c

void Hdbe1c(void)

{
  int iVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  long unaff_x19;
  long unaff_x20;
  long unaff_x29;
  
  uVar2 = -(int)DAT_0027b370;
  uVar3 = -(int)DAT_0027b370;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar3 | 0x816b4073) * 2 - (uVar3 ^ 0x816b4073)) * 300 +
             (long)(int)((uVar2 ^ 0x816b40ec) + (uVar2 & 0x816b40ec) * 2)])(0);
  CallSupervisor(0);
  iVar1 = (-(int)DAT_0027b370 ^ 0x816b4073U) + (-(int)DAT_0027b370 & 0x816b4073U) * 2;
  if (unaff_x19 != unaff_x20) {
    iVar1 = -8;
  }
  CallSupervisor(0);
  lVar4 = tpidr_el0;
  if (*(long *)(lVar4 + 0x28) == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(iVar1);
}


