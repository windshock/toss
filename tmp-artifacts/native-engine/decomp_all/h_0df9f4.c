// entry=0xdf9f4

void Hdf9f4(undefined8 param_1,long param_2)

{
  long lVar1;
  long unaff_x22;
  long unaff_x29;
  
  if (unaff_x22 != -1) {
    param_2 = (-DAT_00274f48 | 0xf676ba10cbf8792cU) * 2 - (-DAT_00274f48 ^ 0xf676ba10cbf8792cU);
    CallSupervisor(0);
  }
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(9,param_2);
}


