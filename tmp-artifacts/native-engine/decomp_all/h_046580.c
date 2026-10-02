// entry=0x46580

void H46580(long *param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  long lVar2;
  int iVar3;
  ulong uVar4;
  undefined8 extraout_x1;
  long in_x10;
  long unaff_x29;
  
  if (*param_1 == 0) {
    do {
      iVar3 = (int)DAT_002752d0;
      iVar3 = (*(code *)(&PTR_FUN_0027c1e0)
                        [(long)(int)((-iVar3 | 0x918d3dbfU) * 2 - (-iVar3 ^ 0x918d3dbfU)) * 300 +
                         (long)(int)((-iVar3 | 0x918d3e16U) * 2 - (-iVar3 ^ 0x918d3e16U))])
                        ((-iVar3 | 0x918d3dc1U) + (-iVar3 & 0x918d3dc1U),param_3,in_x10,0x9e77e,7);
      in_x10 = in_x10 + 1;
      param_3 = extraout_x1;
    } while (iVar3 != 0xea04219);
                    /* WARNING: Could not recover jumptable at 0x0014635c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027d768)();
    return;
  }
  uVar1 = -(int)DAT_002752d0;
  uVar4 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar1 ^ 0x918d3dbf) + (uVar1 & 0x918d3dbf) * 2) * 300 +
                     (long)(int)(-0x6e72c22e - (-(int)DAT_002752d0 ^ 0xffffffffU))])(0,param_3,0);
  lVar2 = tpidr_el0;
  if (*(long *)(lVar2 + 0x28) != *(long *)(unaff_x29 + -0x28)) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail((uVar4 | 0x6e0283cf) * 2 - (uVar4 ^ 0x6e0283cf));
  }
  return;
}


