// entry=0xe4d34

void He4d34(uint param_1,uint param_2,long param_3)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  uint uVar6;
  uint uVar7;
  uint in_w17;
  long unaff_x19;
  long lVar8;
  
  uVar7 = (uint)param_3;
  lVar8 = (ulong)(uVar7 - 1) * 4;
  uVar2 = CONCAT13((&DAT_0028365b)[lVar8],
                   CONCAT12(*(undefined1 *)
                             ((long)(&DAT_00283658 + lVar8) +
                             (-DAT_002765f0 | 0xeb98be6e7b9ee7a0U) +
                             (-DAT_002765f0 & 0xeb98be6e7b9ee7a0U)),
                            *(undefined2 *)(&DAT_00283658 + lVar8)));
  lVar8 = param_3 * 4;
  uVar3 = (uVar2 >> 5 ^ 0xffffffff) & param_1 << 2 | uVar2 >> 5 & (param_1 << 2 ^ 0xffffffff);
  uVar4 = (uVar2 << 4 ^ 0xffffffff) & param_1 >> 3 | uVar2 << 4 & (param_1 >> 3 ^ 0xffffffff);
  uVar6 = (uVar3 | uVar4) * 2 - (uVar3 ^ uVar4);
  uVar4 = (param_1 ^ 0xffffffff) & in_w17 | param_1 & (in_w17 ^ 0xffffffff);
  uVar3 = (uVar7 ^ 0xfffffffc) & uVar7;
  uVar3 = *(uint *)(*(long *)(unaff_x19 + 0x90) +
                   (ulong)((uVar3 ^ 0xffffffff) & param_2 | uVar3 & (param_2 ^ 0xffffffff)) * 4);
  uVar3 = (uVar3 ^ 0xffffffff) & uVar2 | uVar3 & (uVar2 ^ 0xffffffff);
  uVar3 = (uVar3 | uVar4) + (uVar3 & uVar4);
  iVar5 = (*(int *)(&DAT_00283658 + lVar8) -
          (-((uVar3 ^ 0xffffffff) & uVar6 | uVar3 & (uVar6 ^ 0xffffffff)) ^ 0xffffffff)) + -1;
  (&DAT_00283658)[lVar8] = (char)iVar5;
  (&DAT_00283659)[lVar8] = (char)((uint)iVar5 >> 8);
  (&DAT_0028365a)[lVar8] = (char)((uint)iVar5 >> 0x10);
  (&DAT_0028365b)[lVar8] = (char)((uint)iVar5 >> 0x18);
  ppuVar1 = &PTR_LAB_002796a0 + (long)(int)(0x7b9ee79d - (-(int)DAT_002765f0 ^ 0xffffffffU)) * 0x6e;
  if (uVar7 - 1 != 0) {
    ppuVar1 = &PTR_He4d34_0027f988;
  }
                    /* WARNING: Could not recover jumptable at 0x001e4f5c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(iVar5,param_2,param_3 + -1);
  return;
}


