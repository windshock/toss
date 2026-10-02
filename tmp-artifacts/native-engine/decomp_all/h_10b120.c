// entry=0x10b120

void H10aef0(void)

{
  bool bVar1;
  ulong uVar2;
  ulong uVar3;
  ulong in_x16;
  long in_x17;
  ulong uVar4;
  long unaff_x19;
  long unaff_x23;
  
  uVar4 = in_x17 >> ((-DAT_00280ba0 | 0x4966U) * 2 - (-DAT_00280ba0 ^ 0x4966U) & 0x3f);
  uVar2 = uVar4;
  if ((long)((-DAT_00280ba0 | 0x915e2a0196034946U) + (-DAT_00280ba0 & 0x915e2a0196034946U)) <=
      (long)uVar4) {
    uVar2 = 0;
  }
  uVar3 = (uVar4 | -uVar2) * 2 - (uVar4 ^ -uVar2);
  uVar2 = (-in_x16 ^ 0x7f) + (-in_x16 & 0x7f) * 2;
  if (uVar2 <= uVar3) {
    uVar3 = uVar2;
  }
  if ((-DAT_00280ba0 ^ 0x915e2a0196034956U) + (-DAT_00280ba0 & 0x915e2a0196034956U) * 2 <=
      (uVar3 - (0x915e2a0196034946 - (-DAT_00280ba0 ^ 0xffffffffffffffffU) ^ 0xffffffffffffffff)) -
      1) {
                    /* WARNING: Could not recover jumptable at 0x00207894. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00276b88)();
    return;
  }
  do {
    *(undefined1 *)(unaff_x23 + in_x16) = *(undefined1 *)(unaff_x19 + uVar4);
    in_x16 = (in_x16 | 1) * 2 - (in_x16 ^ 1);
    uVar2 = (-DAT_00280ba0 ^ 0x915e2a0196034945U) + (-DAT_00280ba0 & 0x915e2a0196034945U) * 2;
    bVar1 = (long)((long)&DAT_915e2a0196034945 - (-DAT_00280ba0 ^ 0xffffffffffffffffU)) <
            (long)uVar4;
    uVar4 = (uVar4 | uVar2) * 2 - (uVar4 ^ uVar2);
  } while (bVar1 != 0x7f < in_x16 && bVar1);
                    /* WARNING: Could not recover jumptable at 0x002092ec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00285c98)();
  return;
}


