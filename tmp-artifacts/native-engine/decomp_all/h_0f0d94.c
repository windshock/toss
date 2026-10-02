// entry=0xf0d94

void FUN_001f0d94(int param_1,undefined8 param_2,long param_3)

{
  undefined **ppuVar1;
  long lVar2;
  long lVar3;
  undefined8 in_x7;
  int iVar4;
  int in_stack_00000000;
  undefined1 auStack_a8 [72];
  long local_60;
  long local_28;
  
  lVar2 = tpidr_el0;
  local_28 = *(long *)(lVar2 + 0x28);
  iVar4 = (int)DAT_00285dd0;
  if (param_1 != 0) {
    CallSupervisor(0);
    lVar2 = -0x3c7f8414f83c2764 - (-DAT_00285dd0 ^ 0xffffffffffffffffU);
    if ((-iVar4 | 0x7c3d83aU) * 2 - (-iVar4 ^ 0x7c3d83aU) < 0xfffff001) {
      lVar2 = local_60;
    }
    lVar3 = tpidr_el0;
    if (*(long *)(lVar3 + 0x28) == local_28) {
      return;
    }
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(lVar2,in_x7,auStack_a8,
                     (-DAT_00285dd0 ^ 0xc3807beb07c3d89eU) +
                     (-DAT_00285dd0 & 0xc3807beb07c3d89eU) * 2);
  }
  if (in_stack_00000000 != (-iVar4 ^ 0x7c3d89dU) + (-iVar4 & 0x7c3d89dU) * 2) {
    CallSupervisor(0);
    ppuVar1 = &PTR_LAB_00278bf8;
    if (in_stack_00000000 != param_3) {
      ppuVar1 = (undefined **)
                (&DAT_00280078 + (long)(int)((-iVar4 | 0x7c3d89eU) + (-iVar4 & 0x7c3d89eU)) * 0x69);
    }
                    /* WARNING: Could not recover jumptable at 0x001f12e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(-iVar4 & 0x7c3d89f,(long)in_stack_00000000,
                        (-DAT_00285dd0 ^ 0xc3807beb07c3d89eU) +
                        (-DAT_00285dd0 & 0xc3807beb07c3d89eU) * 2,
                        (-DAT_00285dd0 | 0xc3807beb07c3d8a0U) * 2 -
                        (-DAT_00285dd0 ^ 0xc3807beb07c3d8a0U));
    return;
  }
  lVar2 = tpidr_el0;
  if (*(long *)(lVar2 + 0x28) == local_28) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(0);
}


