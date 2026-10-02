// entry=0x10d93c

void thunk_FUN_0020930c(long param_1)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  long unaff_x29;
  
  DAT_0029e818 = (-(int)DAT_00280ba0 | 0x96034946U) + (-(int)DAT_00280ba0 & 0x96034946U);
  CallSupervisor(0);
  puVar2 = (undefined1 *)
           ((param_1 << ((-DAT_00280ba0 | 0x4966U) + (-DAT_00280ba0 & 0x4966U) & 0x3f)) >> 0x20);
  puVar1 = &DAT_0027e7b4;
  if ((int)param_1 != 0) {
    puVar1 = puVar2;
  }
  *(long *)(unaff_x29 + -0x128) = -(long)puVar2;
  *(undefined1 **)(unaff_x29 + -0x120) = puVar1;
  *(int *)(unaff_x29 + -300) = -(int)param_1;
                    /* WARNING: Could not recover jumptable at 0x0020d64c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002820d0)();
  return;
}


