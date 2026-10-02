// entry=0x16e8a4

void H16e570(ulong param_1)

{
  long lVar1;
  byte *pbVar2;
  uint uVar3;
  undefined **ppuVar4;
  byte bVar5;
  byte bVar6;
  uint in_w9;
  ulong uVar7;
  uint in_w11;
  long unaff_x27;
  long unaff_x29;
  
  do {
    uVar3 = (in_w9 ^ (-(int)DAT_00278300 | 0x43d12e52U) + (-(int)DAT_00278300 & 0x43d12e52U) ^
                     0xffffffff) & in_w9;
    in_w9 = (uVar3 | 1) * 2 - (uVar3 ^ 1);
    pbVar2 = &stack0x00001020 + ((in_w9 ^ 0xffffff00) & in_w9);
    bVar5 = *pbVar2;
    in_w11 = (((in_w11 ^ 0xffffff00) & in_w11) - (bVar5 ^ 0xffffffff)) - 1;
    *pbVar2 = (&stack0x00001020)[(in_w11 ^ 0xffffff00) & in_w11];
    (&stack0x00001020)[(in_w11 ^ 0xffffff00) & in_w11] = bVar5;
    bVar6 = (*pbVar2 ^ bVar5) + (*pbVar2 & bVar5) * '\x02';
    bVar5 = (&DAT_0027a318)[param_1];
    (&DAT_0027a318)[param_1] = (bVar5 | bVar6) & (bVar5 & bVar6 ^ 0xff);
    param_1 = (param_1 ^ 1) + (param_1 & 1) * 2;
  } while (param_1 != 0x10);
  DAT_00278c88 = 0;
  DAT_00286318 = 0;
  memset(&stack0x00000810,0,0x810);
  lVar1 = (-DAT_00278300 ^ 0x26e4add943d12cefU) + (-DAT_00278300 & 0x26e4add943d12cefU) * 2;
  uVar7 = -DAT_00278300;
  CallSupervisor(0);
  if ((uint)lVar1 < 0xfffff001) {
    *(undefined8 *)(unaff_x27 + 4) = 0x80;
    ppuVar4 = &PTR_LAB_0027efc8;
    if ((-DAT_00278300 | 0x26e4add943d12d53U) + (-DAT_00278300 & 0x26e4add943d12d53U) != 0) {
      ppuVar4 = &PTR_LAB_0027d380;
    }
                    /* WARNING: Could not recover jumptable at 0x0026e718. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar4)(lVar1,&DAT_0027a318,
                        (uVar7 ^ 0x26e4add943d12d53) + (uVar7 & 0x26e4add943d12d53) * 2);
    return;
  }
  uVar3 = -(int)DAT_00278300;
  uVar7 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)(0x43d12d52 - (-(int)DAT_00278300 ^ 0xffffffffU)) * 300 +
                     (long)(int)((uVar3 | 0x43d12d67) * 2 - (uVar3 ^ 0x43d12d67))])
                    (0,&DAT_0027a318,1,0x26e4add943d12d52 - (-DAT_00278300 ^ 0xffffffffffffffffU));
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail((uVar7 ^ 0x3baddf29) + (uVar7 & 0x3baddf29) * 2);
}


