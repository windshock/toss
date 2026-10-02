// entry=0xc31d4

void Hc31d4(void)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  long *unaff_x19;
  uint *unaff_x20;
  ulong unaff_x21;
  long unaff_x29;
  
  do {
    uVar1 = -(int)DAT_0027a2f0;
    uVar2 = -(int)DAT_0027a2f0;
    (*(code *)(&PTR_FUN_0027c1e0)
              [(long)(int)((uVar1 ^ 0x8c8f2a08) + (uVar1 & 0x8c8f2a08) * 2) * 300 +
               (long)(int)((uVar2 | 0x8c8f2a58) * 2 - (uVar2 ^ 0x8c8f2a58))])
              (*(undefined8 *)(*unaff_x19 + unaff_x21 * 8));
    unaff_x21 = (unaff_x21 | 1) + (unaff_x21 & 1);
  } while (unaff_x21 < *unaff_x20);
  uVar1 = -(int)DAT_0027a2f0;
  uVar2 = -(int)DAT_0027a2f0;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar2 | 0x8c8f2a08) * 2 - (uVar2 ^ 0x8c8f2a08)) * 300 +
             (long)(int)((uVar1 | 0x8c8f2a58) + (uVar1 & 0x8c8f2a58))])(*unaff_x19);
  unaff_x19[2] = 0;
  *unaff_x20 = 0;
  lVar3 = tpidr_el0;
  if (*(long *)(lVar3 + 0x28) == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


