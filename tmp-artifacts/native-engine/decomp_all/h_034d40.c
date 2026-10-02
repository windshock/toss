// entry=0x34d40

void H34cc0(void)

{
  ulong uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  ushort uVar5;
  ushort uVar6;
  ushort in_w9;
  int in_w10;
  int in_w11;
  uint in_w12;
  int iVar7;
  int in_w14;
  uint uVar8;
  undefined8 *unaff_x29;
  
  iVar7 = (int)DAT_00278628;
  uVar8 = (-iVar7 ^ 0x307cc492U) + (-iVar7 & 0x307cc492U) * 2;
  uVar4 = 0x307cc492 - iVar7;
  if (in_w14 != 1) {
    if (in_w14 != 2) {
      if (in_w14 == 3) {
                    /* WARNING: Could not recover jumptable at 0x0013498c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_002799b0)();
        return;
      }
      goto LAB_00134aa8;
    }
    uVar8 = (-iVar7 | 0x307cc493U) + (-iVar7 & 0x307cc493U);
    uVar8 = (uint)(byte)(&PTR_FUN_0027c1e0)
                        [(long)(int)((-iVar7 ^ 0x307cc492U) + (-iVar7 & 0x307cc492U) * 2) * 300 +
                         (long)(int)((-iVar7 | 0x307cc581U) + (-iVar7 & 0x307cc581U))]
                        [in_w12 & uVar8 | in_w12 ^ uVar8] <<
            (ulong)((-iVar7 | 0xc49aU) * 2 - (-iVar7 ^ 0xc49aU) & 0x1f);
    uVar8 = uVar8 & 0x307cc492U - iVar7 | uVar8 ^ 0x307cc492U - iVar7;
  }
  uVar4 = ((uVar8 | (byte)(&PTR_FUN_0027c1e0)
                          [(long)(int)((-iVar7 | 0x307cc492U) + (-iVar7 & 0x307cc492U)) * 300 +
                           (long)(int)(0x307cc580 - (-iVar7 ^ 0xffffffffU))][in_w12]) &
          (uVar8 & (byte)(&PTR_FUN_0027c1e0)
                         [(long)(int)((-iVar7 | 0x307cc492U) + (-iVar7 & 0x307cc492U)) * 300 +
                          (long)(int)(0x307cc580 - (-iVar7 ^ 0xffffffffU))][in_w12] ^ 0xffffffff)) *
          ((-iVar7 | 0x8c4eae27U) * 2 - (-iVar7 ^ 0x8c4eae27U));
LAB_00134aa8:
  uVar8 = uVar4 >> (ulong)((-iVar7 | 0xc4aaU) * 2 - (-iVar7 ^ 0xc4aaU) & 0x1f);
  uVar4 = ((uVar8 ^ 0xffffffff) & uVar4 | uVar8 & (uVar4 ^ 0xffffffff)) *
          ((-iVar7 | 0x8c4eae27U) + (-iVar7 & 0x8c4eae27U));
  uVar2 = in_w11 * ((-iVar7 | 0x8c4eae27U) + (-iVar7 & 0x8c4eae27U));
  uVar3 = in_w10 * ((-iVar7 | 0x8c4eae27U) * 2 - (-iVar7 ^ 0x8c4eae27U));
  uVar8 = uVar3 >> (ulong)((-iVar7 | 0xc4aaU) * 2 - (-iVar7 ^ 0xc4aaU) & 0x1f);
  uVar8 = ((uVar8 ^ 0xffffffff) & uVar3 | uVar8 & (uVar3 ^ 0xffffffff)) *
          ((-iVar7 | 0x8c4eae27U) + (-iVar7 & 0x8c4eae27U));
  uVar4 = ((uVar4 | uVar2) & (uVar4 & uVar2 ^ 0xffffffff)) * (-0x73b151da - (-iVar7 ^ 0xffffffffU));
  uVar4 = (uVar4 ^ 0xffffffff) & uVar8 | uVar4 & (uVar8 ^ 0xffffffff);
  uVar8 = uVar4 >> (ulong)(0xc49e - (-iVar7 ^ 0xffffffffU) & 0x1f);
  uVar8 = ((uVar8 ^ 0xffffffff) & uVar4 | uVar8 & (uVar4 ^ 0xffffffff)) *
          ((-iVar7 ^ 0x8c4eae27U) + (-iVar7 & 0x8c4eae27U) * 2);
  uVar6 = (ushort)(uVar8 >> (ulong)(0xc4a0 - (-iVar7 ^ 0xffffffffU) & 0x1f));
  uVar5 = (ushort)uVar8;
  if ((ushort)((uVar6 ^ 0xffff) & uVar5 | uVar6 & (uVar5 ^ 0xffff)) == in_w9) {
                    /* WARNING: Could not recover jumptable at 0x00134a34. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027f360)();
    return;
  }
  uVar1 = (-DAT_00278628 ^ 0xedd4499f307cc49aU) + (-DAT_00278628 & 0xedd4499f307cc49aU) * 2;
  *(undefined8 *)(((ulong)unaff_x29 ^ uVar1) + ((ulong)unaff_x29 & uVar1) * 2) = 8;
  *unaff_x29 = 0x20;
  return;
}


