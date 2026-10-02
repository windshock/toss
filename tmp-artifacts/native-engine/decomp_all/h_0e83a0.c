// entry=0xe83a0

void He83a0(undefined8 param_1,undefined8 param_2)

{
  uint uVar1;
  uint in_w8;
  undefined8 in_x12;
  uint uVar2;
  int iVar3;
  uint unaff_w25;
  int unaff_w26;
  
  uVar2 = (uint)((ulong)in_x12 >> 0x18) & 0xff;
  iVar3 = (int)DAT_002765f0;
  uVar2 = ((uVar2 ^ 0xffffffff) & (uint)in_x12 | uVar2 & ((uint)in_x12 ^ 0xffffffff)) *
          ((-iVar3 | 0xd770d133U) * 2 - (-iVar3 ^ 0xd770d133U));
  uVar1 = unaff_w26 * ((-iVar3 | 0xd770d133U) + (-iVar3 & 0xd770d133U));
  uVar1 = ((uVar1 >> 0x18 | uVar1) & (uVar1 >> 0x18 & uVar1 ^ 0xffffffff)) *
          ((-iVar3 ^ 0xd770d133U) + (-iVar3 & 0xd770d133U) * 2);
  uVar2 = ((uVar2 | in_w8) & (uVar2 & in_w8 ^ 0xffffffff)) *
          ((-iVar3 ^ 0xd770d133U) + (-iVar3 & 0xd770d133U) * 2);
  uVar1 = (uVar2 ^ 0xffffffff) & uVar1 | uVar2 & (uVar1 ^ 0xffffffff);
  uVar2 = uVar1 >> (ulong)((-iVar3 | 0xe7abU) + (-iVar3 & 0xe7abU) & 0x1f);
  uVar2 = ((uVar2 | uVar1) & (uVar2 & uVar1 ^ 0xffffffff)) * (-0x288f2ece - (-iVar3 ^ 0xffffffffU));
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar3 ^ 0x7b9ee79eU) + (-iVar3 & 0x7b9ee79eU) * 2) * 300 +
             (long)(int)((-iVar3 ^ 0x7b9ee7b2U) + (-iVar3 & 0x7b9ee7b2U) * 2)])
            (0x7b9ee79d - (-iVar3 ^ 0xffffffffU),param_2,
             ((uVar2 >> 0xf | uVar2) & (uVar2 >> 0xf & uVar2 ^ 0xffffffff)) != unaff_w25);
                    /* WARNING: Could not recover jumptable at 0x001e856c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00276028)();
  return;
}


