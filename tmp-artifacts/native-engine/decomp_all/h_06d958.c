// entry=0x6d958

void H6d958(undefined8 param_1,ushort param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  ushort uVar5;
  ushort uVar6;
  int in_w8;
  int in_w9;
  uint in_w10;
  uint in_w11;
  int iVar7;
  ulong unaff_x29;
  
  iVar7 = (int)DAT_00283670;
  uVar1 = (-iVar7 | 0x2bc9ebe4U) + (-iVar7 & 0x2bc9ebe4U);
  uVar1 = (uint)(byte)(&PTR_FUN_0027c1e0)
                      [(long)(int)((-iVar7 | 0x2bc9ebe3U) + (-iVar7 & 0x2bc9ebe3U)) * 300 +
                       (long)(int)((-iVar7 | 0x2bc9ec52U) + (-iVar7 & 0x2bc9ec52U))]
                      [in_w10 & uVar1 | in_w10 ^ uVar1] <<
          (ulong)((-iVar7 ^ 0xebebU) + (-iVar7 & 0xebebU) * 2 & 0x1f);
  uVar1 = uVar1 & in_w11 | uVar1 ^ in_w11;
  uVar2 = ((uVar1 | (byte)(&PTR_FUN_0027c1e0)
                          [(long)(int)((-iVar7 | 0x2bc9ebe3U) + (-iVar7 & 0x2bc9ebe3U)) * 300 +
                           (long)(int)((-iVar7 | 0x2bc9ec52U) + (-iVar7 & 0x2bc9ec52U))][in_w10]) &
          (uVar1 & (byte)(&PTR_FUN_0027c1e0)
                         [(long)(int)((-iVar7 | 0x2bc9ebe3U) + (-iVar7 & 0x2bc9ebe3U)) * 300 +
                          (long)(int)((-iVar7 | 0x2bc9ec52U) + (-iVar7 & 0x2bc9ec52U))][in_w10] ^
          0xffffffff)) * ((-iVar7 | 0x879bd578U) * 2 - (-iVar7 ^ 0x879bd578U));
  uVar1 = uVar2 >> (ulong)((-iVar7 | 0xebfbU) * 2 - (-iVar7 ^ 0xebfbU) & 0x1f);
  uVar2 = ((uVar1 ^ 0xffffffff) & uVar2 | uVar1 & (uVar2 ^ 0xffffffff)) *
          ((-iVar7 ^ 0x879bd578U) + (-iVar7 & 0x879bd578U) * 2);
  uVar3 = in_w9 * (-0x78642a89 - (-iVar7 ^ 0xffffffffU));
  uVar4 = in_w8 * ((-iVar7 ^ 0x879bd578U) + (-iVar7 & 0x879bd578U) * 2);
  uVar1 = uVar4 >> (ulong)(0xebfa - (-iVar7 ^ 0xffffffffU) & 0x1f);
  uVar1 = ((uVar1 | uVar4) & (uVar1 & uVar4 ^ 0xffffffff)) *
          ((-iVar7 ^ 0x879bd578U) + (-iVar7 & 0x879bd578U) * 2);
  uVar2 = ((uVar2 ^ 0xffffffff) & uVar3 | uVar2 & (uVar3 ^ 0xffffffff)) *
          (-0x78642a89 - (-iVar7 ^ 0xffffffffU));
  uVar1 = (uVar2 | uVar1) & (uVar2 & uVar1 ^ 0xffffffff);
  uVar2 = uVar1 >> (ulong)(0xebef - (-iVar7 ^ 0xffffffffU) & 0x1f);
  uVar1 = ((uVar2 ^ 0xffffffff) & uVar1 | uVar2 & (uVar1 ^ 0xffffffff)) *
          ((-iVar7 | 0x879bd578U) + (-iVar7 & 0x879bd578U));
  uVar5 = (ushort)(uVar1 >> (ulong)((-iVar7 | 0xebf2U) * 2 - (-iVar7 ^ 0xebf2U) & 0x1f));
  uVar6 = (ushort)uVar1;
  if ((ushort)((uVar5 | uVar6) & (uVar5 & uVar6 ^ 0xffff)) == param_2) {
                    /* WARNING: Could not recover jumptable at 0x0016e13c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002858f0)();
    return;
  }
  *(undefined8 *)((unaff_x29 | 8) * 2 - (unaff_x29 ^ 8)) = 0x20;
                    /* WARNING: Could not recover jumptable at 0x0016d6cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002748d8)();
  return;
}


