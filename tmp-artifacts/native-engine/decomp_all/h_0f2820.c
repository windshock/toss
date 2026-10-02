// entry=0xf2820

void Hf2820(ulong param_1,ulong *param_2,undefined8 param_3,ulong *param_4,long param_5,long param_6
           )

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  ulong uVar4;
  int iVar5;
  ulong in_x9;
  ulong in_x10;
  long *in_x11;
  undefined8 *in_x12;
  long unaff_x29;
  
  do {
    in_x9 = (in_x9 - ((-DAT_00277498 ^ 0x89ab7f6cef26f41bU) +
                      (-DAT_00277498 & 0x89ab7f6cef26f41bU) * 2 ^ 0xffffffffffffffff)) - 1;
    iVar5 = (-(int)DAT_00277498 ^ 0xef26e41bU) + (-(int)DAT_00277498 & 0xef26e41bU) * 2;
    if (DAT_0029e360 <= in_x9) break;
    *param_2 = in_x10;
    *in_x11 = (-DAT_00277498 | 0x89ab7f6cef26e41cU) * 2 - (-DAT_00277498 ^ 0x89ab7f6cef26e41cU);
    *param_4 = in_x9;
    *in_x12 = 1;
    CallSupervisor(0);
    iVar5 = (int)param_1;
    CallSupervisor(0);
    if (0xfffffffffffff000 < (ulong)(long)iVar5) {
                    /* WARNING: Could not recover jumptable at 0x001f2a80. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_Hf2820_00280628)
                ((long)iVar5,param_2,
                 (-DAT_00277498 | 0x89ab7f6cef26e41cU) * 2 - (-DAT_00277498 ^ 0x89ab7f6cef26e41cU),
                 param_4,(-DAT_00277498 ^ 0x89ab7f6cef26e41cU) +
                         (-DAT_00277498 & 0x89ab7f6cef26e41cU) * 2,
                 (-DAT_00277498 | 0x89ab7f6cef26e41bU) * 2 - (-DAT_00277498 ^ 0x89ab7f6cef26e41bU));
      return;
    }
    *param_2 = in_x9;
    *in_x11 = 1;
    *param_4 = in_x10;
    *in_x12 = 1;
    CallSupervisor(0);
    param_1 = (ulong)iVar5;
    param_6 = (-DAT_00277498 | 0x89ab7f6cef26e41bU) * 2 - (-DAT_00277498 ^ 0x89ab7f6cef26e41bU);
    param_5 = (-DAT_00277498 | 0x89ab7f6cef26e41cU) + (-DAT_00277498 & 0x89ab7f6cef26e41cU);
    CallSupervisor(0);
    iVar5 = 1;
  } while ((-DAT_00277498 | 0x89ab7f6cef26d41bU) * 2 - (-DAT_00277498 ^ 0x89ab7f6cef26d41bU) <
           param_1);
  uVar1 = -(int)DAT_00277498;
  uVar2 = -(int)DAT_00277498;
  uVar4 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar2 ^ 0xef26e41b) + (uVar2 & 0xef26e41b) * 2) * 300 +
                     (long)(int)((uVar1 | 0xef26e42f) + (uVar1 & 0xef26e42f))])
                    (0,param_2,iVar5,param_4,param_5,param_6);
  lVar3 = tpidr_el0;
  if (*(long *)(lVar3 + 0x28) != *(long *)(unaff_x29 + -8)) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail((uVar4 | 0xffffffffbb3c2577) + (uVar4 & 0xffffffffbb3c2577));
  }
  return;
}


