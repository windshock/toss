// entry=0x127e08

void H127e08(void)

{
  long lVar1;
  ulong uVar2;
  undefined8 *unaff_x29;
  
  uVar2 = (-DAT_00281e58 | 0x42c7e286cc88cf4aU) * 2 - (-DAT_00281e58 ^ 0x42c7e286cc88cf4aU);
  *(undefined8 *)(((ulong)unaff_x29 ^ uVar2) + ((ulong)unaff_x29 & uVar2) * 2) = 4;
  *unaff_x29 = 0x28;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == unaff_x29[-0xc]) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


