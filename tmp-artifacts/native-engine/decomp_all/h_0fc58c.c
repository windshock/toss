// entry=0xfc58c

void thunk_FUN_001fbdcc(void)

{
  byte *pbVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  void *__dest;
  ulong uVar5;
  undefined8 *unaff_x19;
  ulong unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x24;
  
  *unaff_x19 = unaff_x24;
  pbVar1 = (byte *)(unaff_x22 + unaff_x23 + 9);
  uVar3 = (uint)pbVar1[1] <<
          (ulong)((-(int)DAT_00280f50 ^ 0x67f9U) + (-(int)DAT_00280f50 & 0x67f9U) * 2 & 0x1f);
  uVar2 = uVar3 ^ *pbVar1;
  uVar3 = (uVar3 & *pbVar1 | uVar2) ^ (uint)pbVar1[2] << 0x10;
  uVar2 = uVar3 & (uint)pbVar1[3] << 0x18 |
          (uVar2 & (uint)pbVar1[2] << 0x10 | uVar3) ^ (uint)pbVar1[3] << 0x18;
  *(uint *)(unaff_x19 + 3) = uVar2;
  uVar5 = -(unaff_x23 + 0xd);
  if ((ulong)uVar2 <= (unaff_x21 | uVar5) * 2 - (unaff_x21 ^ uVar5)) {
    uVar3 = -(int)DAT_00280f50;
    uVar4 = -(int)DAT_00280f50;
    __dest = (void *)(*(code *)(&PTR_FUN_0027c1e0)
                               [(long)(int)((uVar3 | 0xb52367f1) + (uVar3 & 0xb52367f1)) * 300 +
                                (long)(int)((uVar4 ^ 0xb5236906) + (uVar4 & 0xb5236906) * 2)])();
    if (uVar2 != 0) {
      memcpy(__dest,(void *)(unaff_x22 + unaff_x23 + 0xd),(long)(int)uVar2);
    }
    unaff_x19[2] = __dest;
  }
                    /* WARNING: Could not recover jumptable at 0x001fcadc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00278458)();
  return;
}


