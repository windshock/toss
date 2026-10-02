// entry=0x45860

void H45860(long param_1,undefined8 param_2)

{
  long lVar1;
  ulong uVar2;
  int iVar3;
  undefined4 *unaff_x19;
  undefined4 unaff_w20;
  long unaff_x29;
  
  uVar2 = -DAT_002752d0;
  *unaff_x19 = unaff_w20;
  iVar3 = (int)DAT_002752d0;
  if (param_1 == 0x4b4da246918d3dbd - (uVar2 ^ 0xffffffffffffffff)) {
                    /* WARNING: Could not recover jumptable at 0x0014694c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00285d90)
              ((&PTR_FUN_0027c1e0)
               [(long)(int)((-iVar3 ^ 0x918d3dbfU) + (-iVar3 & 0x918d3dbfU) * 2) * 300 +
                (long)(int)(-0x6e72c152 - (-iVar3 ^ 0xffffffffU))],param_1,param_2,3);
    return;
  }
  uVar2 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((-iVar3 ^ 0x918d3dbfU) + (-iVar3 & 0x918d3dbfU) * 2) * 300 +
                     (long)(int)(-0x6e72c22e - (-iVar3 ^ 0xffffffffU))])(0);
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == *(long *)(unaff_x29 + -0x28)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail((uVar2 | 0x526f3ff7) + (uVar2 & 0x526f3ff7));
}


