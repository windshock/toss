// entry=0x4d57c

void H4d57c(void)

{
  long lVar1;
  short in_w8;
  long in_x9;
  int in_w10;
  long in_x11;
  long unaff_x19;
  undefined8 *unaff_x29;
  
  do {
    in_w10 = (in_w10 * (-0x683eaee - (-(int)DAT_00275ca8 ^ 0xffffffffU)) -
             (**(byte **)(unaff_x19 + 0x308) ^ 0xffffffff)) + -1;
    in_x11 = (in_x11 - ((-DAT_00275ca8 | 0x642804bbf97b14d5U) +
                        (-DAT_00275ca8 & 0x642804bbf97b14d5U) ^ 0xffffffffffffffff)) + -1;
    *(byte **)(unaff_x19 + 0x308) =
         *(byte **)(unaff_x19 + 0x308) +
         (0x642804bbf97b14d4 - (-DAT_00275ca8 ^ 0xffffffffffffffffU));
  } while (in_x11 != in_x9);
  if ((short)in_w10 == in_w8) {
    **(undefined8 **)(unaff_x19 + 0x2a8) = 0;
                    /* WARNING: Could not recover jumptable at 0x00151a90. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00281590)();
    return;
  }
  *(undefined8 *)(((ulong)unaff_x29 | 8) * 2 - ((ulong)unaff_x29 ^ 8)) = 0x20;
  *unaff_x29 = 0x1c;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) != unaff_x29[-0xc]) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


