// entry=0x449f8

void H449f8(long param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  undefined8 uVar1;
  long lVar2;
  long unaff_x29;
  
  uVar1 = 0xffffffffffffffff;
  if ((ulong)(param_1 >> 0x20) < 0xfffffffffffff001) {
    uVar1 = *(undefined8 *)(param_4 + 0x68);
  }
  lVar2 = tpidr_el0;
  if (*(long *)(lVar2 + 0x28) == *(long *)(unaff_x29 + -0x38)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(uVar1);
}


