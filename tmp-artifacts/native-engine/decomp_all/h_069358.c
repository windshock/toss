// entry=0x69358

void H69358(void)

{
  byte *pbVar1;
  undefined **ppuVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  long lVar7;
  ushort uVar8;
  ushort uVar9;
  ulong uVar10;
  ushort in_w8;
  ulong uVar11;
  int in_w9;
  uint in_w10;
  uint in_w11;
  ulong in_x12;
  ulong in_x13;
  ulong uVar12;
  int iVar13;
  uint unaff_w24;
  undefined8 *unaff_x29;
  
  do {
    iVar13 = (int)DAT_00276dd0;
    pbVar1 = (&PTR_FUN_0027c1e0)
             [(long)(int)(-0x589e5418 - (-iVar13 ^ 0xffffffffU)) * 300 +
              (long)(int)(-0x589e53d5 - (-iVar13 ^ 0xffffffffU))] +
             (in_x13 <<
             ((-DAT_00276dd0 | 0x2f88560a761abebU) * 2 - (-DAT_00276dd0 ^ 0x2f88560a761abebU) & 0x3f
             ));
    uVar3 = (uint)pbVar1[0x2f88560a761abe9 - (-DAT_00276dd0 ^ 0xffffffffffffffffU)] <<
            (ulong)((-iVar13 ^ 0xa761abf1U) + (-iVar13 & 0xa761abf1U) * 2 & 0x1f);
    uVar6 = uVar3 & *pbVar1 | uVar3 ^ *pbVar1;
    uVar3 = (uint)pbVar1[(-DAT_00276dd0 ^ 0x2f88560a761abebU) +
                         (-DAT_00276dd0 & 0x2f88560a761abebU) * 2] <<
            (ulong)((-iVar13 | 0xa761abf9U) * 2 - (-iVar13 ^ 0xa761abf9U) & 0x1f);
    uVar6 = uVar6 & uVar3 | uVar6 ^ uVar3;
    uVar3 = (uint)pbVar1[(-DAT_00276dd0 | 0x2f88560a761abecU) * 2 -
                         (-DAT_00276dd0 ^ 0x2f88560a761abecU)] <<
            (ulong)((-iVar13 | 0xa761ac01U) + (-iVar13 & 0xa761ac01U) & 0x1f);
    uVar6 = (uVar6 & uVar3 | uVar6 ^ uVar3) * ((-iVar13 | 0x333957eU) + (-iVar13 & 0x333957eU));
    uVar3 = uVar6 >> (ulong)((-iVar13 | 0xa761ac01U) + (-iVar13 & 0xa761ac01U) & 0x1f);
    uVar3 = ((uVar3 ^ 0xffffffff) & uVar6 | uVar3 & (uVar6 ^ 0xffffffff)) *
            ((-iVar13 ^ 0x333957eU) + (-iVar13 & 0x333957eU) * 2);
    uVar6 = in_w10 * (0x333957d - (-iVar13 ^ 0xffffffffU));
    in_w10 = (uVar3 | uVar6) & (uVar3 & uVar6 ^ 0xffffffff);
    uVar12 = 0x2f88560a761abe9 - (-DAT_00276dd0 ^ 0xffffffffffffffffU);
    in_x13 = (in_x13 | uVar12) + (in_x13 & uVar12);
  } while (in_x13 != in_x12);
  uVar6 = (in_w11 ^ (-iVar13 | 0xa761abecU) + (-iVar13 & 0xa761abecU) ^ 0xffffffff) & in_w11;
  uVar3 = (-iVar13 | 0xa761abe9U) + (-iVar13 & 0xa761abe9U);
  if (uVar6 == 1) {
                    /* WARNING: Could not recover jumptable at 0x00168dc0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*DAT_00281c88)();
    return;
  }
  if ((uVar6 == 2) || (uVar6 == 3)) {
                    /* WARNING: Could not recover jumptable at 0x001697d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027b350)();
    return;
  }
  uVar6 = uVar3 >> (ulong)((-iVar13 | 0xac01U) * 2 - (-iVar13 ^ 0xac01U) & 0x1f);
  uVar6 = ((uVar6 | uVar3) & (uVar6 & uVar3 ^ 0xffffffff)) *
          ((-iVar13 | 0x333957eU) + (-iVar13 & 0x333957eU));
  uVar4 = in_w10 * ((-iVar13 ^ 0x333957eU) + (-iVar13 & 0x333957eU) * 2);
  uVar5 = in_w9 * ((-iVar13 | 0x333957eU) * 2 - (-iVar13 ^ 0x333957eU));
  uVar3 = uVar5 >> (ulong)(0xac00 - (-iVar13 ^ 0xffffffffU) & 0x1f);
  uVar3 = ((uVar3 ^ 0xffffffff) & uVar5 | uVar3 & (uVar5 ^ 0xffffffff)) *
          (0x333957d - (-iVar13 ^ 0xffffffffU));
  uVar6 = ((uVar6 | uVar4) & (uVar6 & uVar4 ^ 0xffffffff)) *
          ((-iVar13 ^ 0x333957eU) + (-iVar13 & 0x333957eU) * 2);
  uVar6 = (uVar6 ^ 0xffffffff) & uVar3 | uVar6 & (uVar3 ^ 0xffffffff);
  uVar3 = uVar6 >> (ulong)(0xabf5 - (-iVar13 ^ 0xffffffffU) & 0x1f);
  uVar3 = ((uVar3 | uVar6) & (uVar3 & uVar6 ^ 0xffffffff)) * (0x333957d - (-iVar13 ^ 0xffffffffU));
  uVar9 = (ushort)(uVar3 >> (ulong)((-iVar13 | 0xabf8U) + (-iVar13 & 0xabf8U) & 0x1f));
  uVar8 = (ushort)uVar3;
  if ((ushort)((uVar9 ^ 0xffff) & uVar8 | uVar9 & (uVar8 ^ 0xffff)) != in_w8) {
    unaff_x29[1] = 0x14;
    *unaff_x29 = 0x28;
    lVar7 = tpidr_el0;
    if (*(long *)(lVar7 + 0x28) != unaff_x29[-0xb]) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail(0x2761abe9);
    }
    return;
  }
  if (unaff_w24 < 0xfffff001) {
    uVar10 = (*(code *)(&PTR_FUN_0027c1e0)
                       [(long)(int)(-0x589e5418 - (-iVar13 ^ 0xffffffffU)) * 300 +
                        (long)(int)((-iVar13 ^ 0xa761ac97U) + (-iVar13 & 0xa761ac97U) * 2)])
                       (unaff_w24);
    uVar3 = -(int)DAT_00276dd0;
    uVar12 = (*(code *)(&PTR_FUN_0027c1e0)
                       [(long)(int)((uVar3 | 0xa761abe9) * 2 - (uVar3 ^ 0xa761abe9)) * 300 +
                        (long)(int)(-0x589e53d5 - (-(int)DAT_00276dd0 ^ 0xffffffffU))])
                       (uVar10,unaff_w24);
    if (uVar12 == 0xffffffffffffffff) {
                    /* WARNING: Could not recover jumptable at 0x00168b94. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_H68c98_0027f318)();
      return;
    }
    uVar11 = (uVar10 | 0xffffffffffffffea) * 2 - (uVar10 ^ 0xffffffffffffffea);
    uVar10 = (uVar10 ^ 0xfffffffffffeffeb) + (uVar10 & 0xfffffffffffeffeb) * 2;
    if ((long)uVar10 <=
        (long)((-DAT_00276dd0 | 0x2f88560a761abe9U) * 2 - (-DAT_00276dd0 ^ 0x2f88560a761abe9U))) {
      uVar10 = 0;
    }
    ppuVar2 = &PTR_LAB_0027a768;
    if ((uVar11 | uVar12) * 2 - (uVar11 ^ uVar12) <= (uVar10 ^ uVar12) + (uVar10 & uVar12) * 2) {
      ppuVar2 = &PTR_LAB_002812c8 +
                (long)(int)((-(int)DAT_00276dd0 ^ 0xa761abe9U) +
                           (-(int)DAT_00276dd0 & 0xa761abe9U) * 2) * 0x5e;
    }
                    /* WARNING: Could not recover jumptable at 0x00169fa8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)();
    return;
  }
  lVar7 = tpidr_el0;
  if (*(long *)(lVar7 + 0x28) != unaff_x29[-0xb]) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(0);
  }
  return;
}


