// entry=0x1390f0

void H1390f0(undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5,undefined8 param_6)

{
  ulong uVar1;
  undefined **ppuVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  long lVar6;
  int iVar7;
  ulong unaff_x23;
  long unaff_x24;
  ulong unaff_x26;
  
  iVar5 = (*(code *)*param_1)((-(int)DAT_00279eb0 | 0x8692048U) * 2 -
                              (-(int)DAT_00279eb0 ^ 0x8692048U),param_3,&stack0x00000198,10,param_6,
                              10);
  iVar7 = (int)DAT_00279eb0;
  if (iVar5 != 0xd0359aa) {
    lVar6 = *(long *)(unaff_x24 + 0x108);
    if (*(char *)(lVar6 + -1) != '\n') {
      (*(code *)(&PTR_FUN_0027c1e0)
                [(long)(int)(0x8692045 - (-iVar7 ^ 0xffffffffU)) * 300 +
                 (long)(int)((-iVar7 | 0x86920a9U) + (-iVar7 & 0x86920a9U))])
                (1,lVar6,&stack0x00000198,
                 (ulong)(&PTR_FUN_0027c1e0)
                        [(long)(int)(0x8692045 - (-iVar7 ^ 0xffffffffU)) * 300 +
                         (long)(int)((-iVar7 | 0x86920a9U) + (-iVar7 & 0x86920a9U))] & 0xff);
      lVar6 = *(long *)(unaff_x24 + 0x108);
    }
    uVar1 = (unaff_x26 ^ -lVar6) + (unaff_x26 & -lVar6) * 2;
    ppuVar2 = &PTR_LAB_00275800;
    if ((uVar1 | unaff_x23) * 2 - (uVar1 ^ unaff_x23) != 0) {
      ppuVar2 = &PTR_LAB_00275618 +
                (long)(int)((-(int)DAT_00279eb0 | 0x8692046U) + (-(int)DAT_00279eb0 & 0x8692046U)) *
                0x69;
    }
                    /* WARNING: Could not recover jumptable at 0x00239b2c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)();
    return;
  }
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar7 ^ 0x8692046U) + (-iVar7 & 0x8692046U) * 2) * 300 +
             (long)(int)((-iVar7 | 0x86920e1U) * 2 - (-iVar7 ^ 0x86920e1U))])(&stack0x00000198);
  uVar3 = -(int)DAT_00279eb0;
  uVar4 = -(int)DAT_00279eb0;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar4 ^ 0x8692046) + (uVar4 & 0x8692046) * 2) * 300 +
             (long)(int)((uVar3 ^ 0x869206a) + (uVar3 & 0x869206a) * 2)])
            (*(undefined8 *)(unaff_x24 + 0x108));
                    /* WARNING: Could not recover jumptable at 0x00238b78. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_H1388ec_002804a0)();
  return;
}


