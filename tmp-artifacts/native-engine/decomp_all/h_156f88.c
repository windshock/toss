// entry=0x156f88

void H156f88(undefined4 *param_1)

{
  undefined1 *in_x9;
  long lVar1;
  int in_w12;
  undefined8 *unaff_x29;
  
  if (in_w12 == -0xbb8ac5e) {
    *param_1 = 0xf2a91e08;
    *in_x9 = 8;
    lVar1 = 1;
    do {
      in_x9[lVar1] = *(undefined1 *)((long)param_1 + lVar1);
      lVar1 = lVar1 + 1;
    } while (lVar1 != 4);
    *(undefined4 *)(in_x9 + 4) = 0;
    *(undefined4 *)(in_x9 + 8) = 0;
    *(undefined4 *)(in_x9 + 0xc) = 0;
                    /* WARNING: Could not recover jumptable at 0x002591b0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00275620)();
    return;
  }
  *(undefined8 *)(((ulong)unaff_x29 | 8) + ((ulong)unaff_x29 & 8)) = 0x28;
  *unaff_x29 = 0x28;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) != unaff_x29[-0xb]) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


