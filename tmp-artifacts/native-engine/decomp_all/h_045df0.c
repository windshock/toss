// entry=0x45df0

void thunk_FUN_00147388(code *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined **ppuVar1;
  undefined4 uVar2;
  long lVar3;
  int iVar4;
  undefined8 extraout_x1;
  int iVar5;
  ulong uVar6;
  undefined4 *unaff_x19;
  long unaff_x29;
  undefined1 auVar7 [16];
  
  iVar4 = (*param_1)(1,param_3,&DAT_00283d43);
  iVar5 = (int)DAT_002752d0;
  if (iVar4 != 0) {
    uVar2 = *unaff_x19;
    auVar7 = (*(code *)(&PTR_FUN_0027c1e0)
                       [(long)(int)((-iVar5 | 0x918d3dbfU) + (-iVar5 & 0x918d3dbfU)) * 300 +
                        (long)(int)((-iVar5 ^ 0x918d3ebcU) + (-iVar5 & 0x918d3ebcU) * 2)])
                       (&DAT_00283d5a,0xb);
    uVar6 = -DAT_002752d0;
    *unaff_x19 = uVar2;
    ppuVar1 = &PTR_LAB_00274a58;
    if (auVar7._0_8_ != (uVar6 | 0x4b4da246918d3dbe) * 2 - (uVar6 ^ 0x4b4da246918d3dbe)) {
      ppuVar1 = &PTR_LAB_00278230;
    }
                    /* WARNING: Could not recover jumptable at 0x00145cec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(auVar7._0_8_,auVar7._8_8_,
                        (-(int)DAT_002752d0 ^ 0x918d3dc4U) + (-(int)DAT_002752d0 & 0x918d3dc4U) * 2)
    ;
    return;
  }
  uVar6 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((-iVar5 ^ 0x918d3dbfU) + (-iVar5 & 0x918d3dbfU) * 2) * 300 +
                     (long)(int)(-0x6e72c22e - (-iVar5 ^ 0xffffffffU))])(0,extraout_x1,4);
  lVar3 = tpidr_el0;
  if (*(long *)(lVar3 + 0x28) == *(long *)(unaff_x29 + -0x28)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail((uVar6 | 0x526f3ff7) + (uVar6 & 0x526f3ff7));
}


