// entry=0x16bb44

void H16bb44(ulong param_1)

{
  byte *pbVar1;
  uint uVar2;
  uint uVar3;
  byte bVar4;
  byte bVar5;
  uint in_w9;
  uint in_w10;
  
  do {
    uVar3 = (in_w9 ^ 0xffffff00) & in_w9;
    in_w9 = (uVar3 ^ 1) + (uVar3 & 1) * 2;
    pbVar1 = &stack0x00001120 + ((in_w9 ^ 0xffffff00) & in_w9);
    bVar4 = *pbVar1;
    in_w10 = (((in_w10 ^ 0xffffff00) & in_w10) - (bVar4 ^ 0xffffffff)) - 1;
    *pbVar1 = (&stack0x00001120)[(in_w10 ^ 0xffffff00) & in_w10];
    (&stack0x00001120)[(in_w10 ^ 0xffffff00) & in_w10] = bVar4;
    bVar5 = (*pbVar1 | bVar4) + (*pbVar1 & bVar4);
    bVar4 = (&DAT_00282790)[param_1];
    (&DAT_00282790)[param_1] = (bVar4 | bVar5) & (bVar4 & bVar5 ^ 0xff);
    param_1 = (param_1 ^ 1) + (param_1 & 1) * 2;
  } while (param_1 != 0x168);
  uVar2 = (DAT_00274eb8 ^ 0xfffffffe) & DAT_00274eb8;
  uVar3 = (-(int)DAT_00278300 ^ 0x43d12d52U) + (-(int)DAT_00278300 & 0x43d12d52U) * 2;
  uVar3 = uVar2 & uVar3 | uVar2 ^ uVar3;
  DAT_00274eb8 = DAT_00274eb8 & uVar3 | DAT_00274eb8 ^ uVar3;
                    /* WARNING: Could not recover jumptable at 0x0026c334. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002742f0)();
  return;
}


