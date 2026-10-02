// entry=0xfdb3c

void FUN_001fdb3c(int param_1,undefined8 param_2,undefined8 *param_3,void *param_4)

{
  undefined4 uVar1;
  long lVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  undefined4 *puVar6;
  void *__dest;
  undefined1 auVar7 [16];
  undefined1 auStack_d8 [128];
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  iVar5 = (int)DAT_00283638;
  if (param_1 == 0) {
    __dest = (void *)(*(code *)(&PTR_FUN_0027c1e0)
                               [(long)(int)(0x5aa6074c - (-iVar5 ^ 0xffffffffU)) * 300 +
                                (long)(int)((-iVar5 | 0x5aa60862U) + (-iVar5 & 0x5aa60862U))])(0x20)
    ;
    memcpy(__dest,param_4,0x20);
                    /* WARNING: Could not recover jumptable at 0x001fdd9c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002774b8)(param_3[1],*param_3);
    return;
  }
  if (param_1 + -1 != 0) {
    auVar7 = FUN_0026eefc(param_1 + -1,&DAT_00286130);
    uVar3 = -(int)DAT_00283638;
    uVar4 = -(int)DAT_00283638;
    (*(code *)(&PTR_FUN_0027c1e0)
              [(long)(int)((uVar4 ^ 0x5aa6074d) + (uVar4 & 0x5aa6074d) * 2) * 300 +
               (long)(int)((uVar3 | 0x5aa6083a) + (uVar3 & 0x5aa6083a))])
              (2,auVar7._8_8_,*auVar7._0_8_);
    *auVar7._0_8_ = 0;
    lVar2 = tpidr_el0;
    if (*(long *)(lVar2 + 0x28) == local_58) {
      return;
    }
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  puVar6 = (undefined4 *)
           (*(code *)(&PTR_FUN_0027c1e0)
                     [(long)(int)((iVar5 * -2 | 0xb54c0e9aU) - (-iVar5 ^ 0x5aa6074dU)) * 300 +
                      (long)(int)((-iVar5 | 0x5aa607f4U) + (-iVar5 & 0x5aa607f4U))])();
  uVar1 = *puVar6;
  iVar5 = (int)DAT_00283638;
  iVar5 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((iVar5 * -2 | 0xb54c0e9aU) - (-iVar5 ^ 0x5aa6074dU)) * 300 +
                     (long)(int)((-iVar5 | 0x5aa6082eU) + (-iVar5 & 0x5aa6082eU))])
                    (param_3,auStack_d8);
  if (iVar5 == -1) {
                    /* WARNING: Could not recover jumptable at 0x001fdbbc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&PTR_LAB_00275f88)
              [(int)((-(int)DAT_00283638 ^ 0x5aa60779U) + (-(int)DAT_00283638 & 0x5aa60779U) * 2)])
              ();
    return;
  }
  *puVar6 = uVar1;
  lVar2 = tpidr_el0;
  if (*(long *)(lVar2 + 0x28) == local_58) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(iVar5 != 0);
}


