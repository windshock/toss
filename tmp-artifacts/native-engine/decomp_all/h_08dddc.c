// entry=0x8dddc

void H8dddc(code *param_1)

{
  long lVar1;
  undefined8 *puVar2;
  long unaff_x29;
  
  (*param_1)();
  puVar2 = (undefined8 *)FUN_0026eefc(&DAT_00286190);
  *puVar2 = 0;
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == *(long *)(unaff_x29 + -0x28)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


