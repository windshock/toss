// entry=0xeef6c

void Heb1cc(void)

{
  uint uVar1;
  uint uVar2;
  int in_w9;
  uint in_w10;
  int iVar3;
  
  iVar3 = (int)DAT_002765f0;
  uVar2 = 0x7b9ee79d - (-iVar3 ^ 0xffffffffU);
  uVar2 = ((in_w10 | uVar2) & (in_w10 & uVar2 ^ 0xffffffff)) *
          ((-iVar3 | 0xd770d133U) * 2 - (-iVar3 ^ 0xd770d133U));
  uVar1 = in_w9 * ((-iVar3 | 0xd770d133U) + (-iVar3 & 0xd770d133U));
  uVar2 = ((uVar2 ^ 0xffffffff) & uVar1 | uVar2 & (uVar1 ^ 0xffffffff)) *
          (-0x288f2ece - (-iVar3 ^ 0xffffffffU));
  uVar1 = 0x5204338e - (-iVar3 ^ 0xffffffffU);
  uVar2 = (uVar2 | uVar1) & (uVar2 & uVar1 ^ 0xffffffff);
  uVar1 = uVar2 >> (ulong)(0xe7aa - (-iVar3 ^ 0xffffffffU) & 0x1f);
  uVar1 = ((uVar1 | uVar2) & (uVar1 & uVar2 ^ 0xffffffff)) *
          ((-iVar3 ^ 0xd770d133U) + (-iVar3 & 0xd770d133U) * 2);
  uVar2 = uVar1 >> (ulong)((-iVar3 | 0xe7adU) * 2 - (-iVar3 ^ 0xe7adU) & 0x1f);
  if (((uVar2 ^ 0xffffffff) & uVar1 | uVar2 & (uVar1 ^ 0xffffffff)) != 0xba361d72) {
                    /* WARNING: Could not recover jumptable at 0x001e5720. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027a828)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x001e7190. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002771a8)();
  return;
}


