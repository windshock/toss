// entry=0xb930c

void thunk_FUN_001b9660(void)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  long in_stack_00000028;
  
  uVar1 = -(int)DAT_00279740;
  uVar2 = -(int)DAT_00279740;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar1 | 0x30fa725b) + (uVar1 & 0x30fa725b)) * 300 +
             (long)(int)((uVar2 | 0x30fa7376) * 2 - (uVar2 ^ 0x30fa7376))])(DAT_0029e790);
  lVar3 = tpidr_el0;
  if (*(long *)(lVar3 + 0x28) == in_stack_00000028) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


