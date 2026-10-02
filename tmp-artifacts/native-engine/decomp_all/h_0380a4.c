// entry=0x380a4

void FUN_001380a4(int param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined4 param_5)

{
  undefined **ppuVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  int iVar5;
  undefined1 auVar6 [16];
  undefined1 auStack_1420 [5048];
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  iVar5 = (int)DAT_0027ba40;
  if (param_1 == 0) {
    if (DAT_0027ba48 == -1) {
      CallSupervisor(0);
      ppuVar1 = &PTR_LAB_00276188;
      if ((ulong)(((long)auStack_1420 << 0x20) >>
                 ((-DAT_0027ba40 | 0x4dddU) + (-DAT_0027ba40 & 0x4dddU) & 0x3f)) <
          0xfffffffffffff001) {
        ppuVar1 = &PTR_LAB_0027d2b8;
      }
                    /* WARNING: Could not recover jumptable at 0x00138a7c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar1)(auStack_1420,
                          (-DAT_0027ba40 ^ 0x517618022a074dbdU) +
                          (-DAT_0027ba40 & 0x517618022a074dbdU) * 2,0);
      return;
    }
    lVar4 = (*(code *)(&PTR_FUN_0027c1e0)
                      [(long)(int)((-iVar5 | 0x2a074dbdU) * 2 - (-iVar5 ^ 0x2a074dbdU)) * 300 +
                       (long)(int)((-iVar5 ^ 0x2a074dd1U) + (-iVar5 & 0x2a074dd1U) * 2)])(0);
    lVar2 = tpidr_el0;
    if (*(long *)(lVar2 + 0x28) == local_68) {
      return;
    }
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail((lVar4 - ((-DAT_0027ba40 ^ 0x517618029c73df21U) +
                               (-DAT_0027ba40 & 0x517618029c73df21U) * 2 ^ 0xffffffffffffffff)) + -1
                    );
  }
  if (param_1 == 1) {
                    /* WARNING: Could not recover jumptable at 0x00138ae4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00285b98)();
    return;
  }
  auVar6 = (*(code *)(&PTR_FUN_0027c1e0)
                     [(long)(int)(0x2a074dbc - (-iVar5 ^ 0xffffffffU)) * 300 +
                      (long)(int)(0x2a074e1c - (-iVar5 ^ 0xffffffffU))])
                     ((-iVar5 ^ 0x2a074dbdU) + (-iVar5 & 0x2a074dbdU) * 2,param_2,param_5);
  uVar3 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)(0x2a074dbc - (-(int)DAT_0027ba40 ^ 0xffffffffU)) * 300 +
                     (long)(int)(0x2a074dd0 - (-(int)DAT_0027ba40 ^ 0xffffffffU))])
                    (0,auVar6._8_8_,auVar6._0_8_);
  lVar2 = tpidr_el0;
  if (*(long *)(lVar2 + 0x28) == local_68) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail((uVar3 ^ 0xffffffffa416e2a1) + (uVar3 & 0xffffffffa416e2a1) * 2);
}


