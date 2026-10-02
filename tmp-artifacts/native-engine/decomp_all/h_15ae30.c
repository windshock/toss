// entry=0x15ae30

void H15ae30(void)

{
  long lVar1;
  int in_w14;
  ulong uVar2;
  long unaff_x19;
  undefined8 *unaff_x29;
  
  if (in_w14 == -0x4e692d8a) {
    *(undefined4 *)(unaff_x19 + 0xac) = 0xb8d0c138;
    *(undefined1 *)(unaff_x29 + -0xe) = 0x38;
    uVar2 = 1;
    do {
      *(undefined1 *)((long)unaff_x29 + (uVar2 - 0x70)) = *(undefined1 *)(unaff_x19 + 0xac + uVar2);
      uVar2 = (uVar2 ^ 1) + (uVar2 & 1) * 2;
    } while (uVar2 != 4);
    *(undefined4 *)((long)unaff_x29 + -0x6c) = 0;
    *(undefined4 *)(unaff_x29 + -0xd) = 0;
    *(undefined4 *)((long)unaff_x29 + -100) = 0;
                    /* WARNING: Could not recover jumptable at 0x0025c9f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00277f18)(PTR_LAB_00277f18,3);
    return;
  }
  *(undefined8 *)(((ulong)unaff_x29 | 8) * 2 - ((ulong)unaff_x29 ^ 8)) = 0x20;
  *unaff_x29 = 0x14;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) != unaff_x29[-0xc]) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


