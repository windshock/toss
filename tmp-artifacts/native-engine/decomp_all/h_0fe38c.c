// entry=0xfe38c

void Hfe38c(uint param_1)

{
  byte *pbVar1;
  uint uVar2;
  uint uVar3;
  uint in_w8;
  uint uVar4;
  int iVar5;
  ulong uVar6;
  ulong uVar7;
  
  uVar6 = (-DAT_00280ba8 | 0x5716c3beb4c759feU) + (-DAT_00280ba8 & 0x5716c3beb4c759feU);
  iVar5 = (int)DAT_00280ba8;
  uVar4 = (-iVar5 ^ 0xcca98399U) + (-iVar5 & 0xcca98399U) * 2;
  if ((in_w8 & 1) != 0) {
    DAT_002862c0 = 0;
                    /* WARNING: Could not recover jumptable at 0x0020298c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&UNK_001ff648 + (ulong)*(ushort *)(&DAT_0012ca4e + (ulong)param_1 * 2) * 4))();
    return;
  }
  do {
    pbVar1 = &DAT_00282790 + (uVar6 << (-DAT_00280ba8 & 0x3fU));
    uVar2 = (uint)pbVar1[(-DAT_00280ba8 | 0x5716c3beb4c759ffU) * 2 -
                         (-DAT_00280ba8 ^ 0x5716c3beb4c759ffU)] <<
            (ulong)((-iVar5 | 0xb4c75a06U) * 2 - (-iVar5 ^ 0xb4c75a06U) & 0x1f);
    uVar3 = uVar2 & *pbVar1 | uVar2 ^ *pbVar1;
    uVar2 = (uint)pbVar1[(-DAT_00280ba8 | 0x5716c3beb4c75a00U) * 2 -
                         (-DAT_00280ba8 ^ 0x5716c3beb4c75a00U)] <<
            (ulong)((-iVar5 | 0x5a0eU) + (-iVar5 & 0x5a0eU) & 0x1f);
    uVar3 = uVar3 & uVar2 | uVar3 ^ uVar2;
    uVar2 = (uint)pbVar1[0x5716c3beb4c75a00 - (-DAT_00280ba8 ^ 0xffffffffffffffffU)] <<
            (ulong)((-iVar5 | 0x5a16U) * 2 - (-iVar5 ^ 0x5a16U) & 0x1f);
    uVar3 = (uVar3 & uVar2 | uVar3 ^ uVar2) * ((-iVar5 ^ 0x10994393U) + (-iVar5 & 0x10994393U) * 2);
    uVar2 = uVar3 >> (ulong)((-iVar5 | 0x5a16U) + (-iVar5 & 0x5a16U) & 0x1f);
    uVar2 = ((uVar2 ^ 0xffffffff) & uVar3 | uVar2 & (uVar3 ^ 0xffffffff)) *
            ((-iVar5 | 0x10994393U) + (-iVar5 & 0x10994393U));
    uVar4 = uVar4 * (0x10994392 - (-iVar5 ^ 0xffffffffU));
    uVar4 = (uVar2 ^ 0xffffffff) & uVar4 | uVar2 & (uVar4 ^ 0xffffffff);
    uVar7 = (-DAT_00280ba8 | 0x5716c3beb4c759ffU) * 2 - (-DAT_00280ba8 ^ 0x5716c3beb4c759ffU);
    uVar6 = (uVar6 | uVar7) * 2 - (uVar6 ^ uVar7);
  } while (uVar6 != 0x5716c3beb4c75a57 - (-DAT_00280ba8 ^ 0xffffffffffffffffU));
                    /* WARNING: Could not recover jumptable at 0x001febe0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002858f8)(uVar4);
  return;
}


