// entry=0xb6980

void Hb6178(undefined8 param_1,char *param_2)

{
  char cVar1;
  long lVar2;
  char *pcVar3;
  char *pcVar4;
  char *in_x10;
  char *unaff_x20;
  char *unaff_x22;
  long unaff_x29;
  
  if (*param_2 != '\n') {
    *in_x10 = *param_2;
                    /* WARNING: Could not recover jumptable at 0x001b6b6c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00285bc8)(in_x10 + 1,param_1,param_2 + 1);
    return;
  }
  *in_x10 = (-(char)DAT_0027acf8 | 0xa9U) + (-(char)DAT_0027acf8 & 0xa9U);
  pcVar3 = unaff_x20;
  do {
    pcVar4 = pcVar3;
    pcVar3 = pcVar4 + 1;
  } while (*pcVar4 != '\0');
  if (((ulong)pcVar4 | -(long)unaff_x20) + ((ulong)pcVar4 & -(long)unaff_x20) == 0) {
    CallSupervisor(0);
    lVar2 = tpidr_el0;
    if (*(long *)(lVar2 + 0x28) != *(long *)(unaff_x29 + -0x60)) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail(1);
    }
    return;
  }
  do {
    cVar1 = *unaff_x22;
    unaff_x22 = unaff_x22 + 1;
  } while (cVar1 != '\0');
                    /* WARNING: Could not recover jumptable at 0x001b6948. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00283bf8)();
  return;
}


