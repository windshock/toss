// entry=0xf0fb8

void Hf0fb8(void)

{
  uint uVar1;
  long lVar2;
  undefined4 uVar3;
  undefined4 in_w11;
  undefined4 uVar4;
  char cStack0000000000000004;
  long in_stack_00000088;
  
  cStack0000000000000004 = '\0';
  uVar1 = -(int)DAT_00285dd0;
  uVar3 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)(0x7c3d89d - (-(int)DAT_00285dd0 ^ 0xffffffffU)) * 300 +
                     (long)(int)((uVar1 | 0x7c3d90b) + (uVar1 & 0x7c3d90b))])(in_w11);
  uVar4 = 3;
  if (cStack0000000000000004 ==
      (byte)((-(char)DAT_00285dd0 ^ 0x9eU) + (-(char)DAT_00285dd0 & 0x1eU) * '\x02')) {
    CallSupervisor(0);
    uVar4 = uVar3;
  }
  lVar2 = tpidr_el0;
  if (*(long *)(lVar2 + 0x28) != in_stack_00000088) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}


