// entry=0xb43c0

void Hb43c0(void)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  long unaff_x29;
  
  uVar1 = -(int)DAT_00280830;
  uVar2 = -(int)DAT_00280830;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar2 | 0x115f9427) * 2 - (uVar2 ^ 0x115f9427)) * 0x2b +
             (long)(int)((uVar1 | 0x115f9443) + (uVar1 & 0x115f9443))])();
  lVar3 = tpidr_el0;
  if (*(long *)(lVar3 + 0x28) == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


