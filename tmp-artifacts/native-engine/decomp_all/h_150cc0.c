// entry=0x150cc0

undefined4 H150cc0(long param_1)

{
  long in_x9;
  long unaff_x19;
  undefined4 unaff_w20;
  undefined8 *unaff_x29;
  
  *(undefined8 *)(in_x9 + param_1) = 0x24;
  *unaff_x29 = 0x18;
  if (*(long *)(*(long *)(unaff_x19 + 0x2f8) + 0x28) == unaff_x29[-0xe]) {
    return unaff_w20;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


