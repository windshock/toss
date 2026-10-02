// entry=0xc9990

void thunk_FUN_001c9fe4(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  int iVar4;
  long unaff_x29;
  
  iVar4 = (int)DAT_002793a8;
  uVar3 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((-iVar4 | 0x96433677U) + (-iVar4 & 0x96433677U)) * 300 +
                     (long)(int)((-iVar4 | 0x9643368bU) * 2 - (-iVar4 ^ 0x9643368bU))])
                    ((-iVar4 | 0x96433677U) + (-iVar4 & 0x96433677U),param_2,0);
  uVar1 = (-DAT_002793a8 | 0xb7d6f09d60a1ff01U) + (-DAT_002793a8 & 0xb7d6f09d60a1ff01U);
  lVar2 = tpidr_el0;
  if (*(long *)(lVar2 + 0x28) == *(long *)(unaff_x29 + -0x48)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail((uVar3 | uVar1) + (uVar3 & uVar1));
}


