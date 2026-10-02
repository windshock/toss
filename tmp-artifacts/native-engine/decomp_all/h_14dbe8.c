// entry=0x14dbe8

void H14dbe8(void)

{
  long lVar1;
  long unaff_x19;
  undefined8 *unaff_x29;
  
  *(undefined8 *)(((ulong)unaff_x29 | 8) + ((ulong)unaff_x29 & 8)) = 0x1c;
  lVar1 = *(long *)(unaff_x19 + 0x2f8);
  *unaff_x29 = 0x28;
  if (*(long *)(lVar1 + 0x28) == unaff_x29[-0xe]) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


