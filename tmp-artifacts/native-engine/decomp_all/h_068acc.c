// entry=0x68acc

void H68600(ulong param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  undefined8 uVar4;
  long *in_x15;
  undefined2 *unaff_x22;
  undefined2 *unaff_x26;
  long unaff_x29;
  
  *(undefined8 *)(unaff_x29 + -0xc0) = param_3;
  uVar1 = -(int)DAT_00276dd0;
  uVar2 = -(int)DAT_00276dd0;
  lVar3 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar1 | 0xa761abe9) + (uVar1 & 0xa761abe9)) * 300 +
                     (long)(int)((uVar2 | 0xa761acd2) + (uVar2 & 0xa761acd2))])
                    (*in_x15,(param_1 | 1) + (param_1 & 1));
  if (lVar3 != 0) {
    uVar4 = *(undefined8 *)(unaff_x29 + -0xc0);
    *unaff_x22 = *unaff_x26;
    *in_x15 = lVar3;
                    /* WARNING: Could not recover jumptable at 0x00168330. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*DAT_00275048)(lVar3,uVar4);
    return;
  }
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(-0x589e5418 - (-(int)DAT_00276dd0 ^ 0xffffffffU)) * 300 +
             (long)(int)(-0x589e53c8 - (-(int)DAT_00276dd0 ^ 0xffffffffU))])(*in_x15);
                    /* WARNING: Could not recover jumptable at 0x0016a464. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00277458)();
  return;
}


