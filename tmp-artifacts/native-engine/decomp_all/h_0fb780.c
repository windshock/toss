// entry=0xfb780

void Hfb780(ulong param_1)

{
  undefined **ppuVar1;
  ulong uVar2;
  ulong uVar3;
  long unaff_x21;
  long unaff_x22;
  
  uVar2 = (ulong)*(byte *)(unaff_x22 +
                          ((-DAT_00280f50 | 0xe5eb2050b52367f3U) * 2 -
                          (-DAT_00280f50 ^ 0xe5eb2050b52367f3U))) << 8;
  uVar2 = uVar2 & param_1 | uVar2 ^ param_1;
  uVar3 = (ulong)*(byte *)(unaff_x22 +
                          (-DAT_00280f50 ^ 0xe5eb2050b52367f4U) +
                          (-DAT_00280f50 & 0xe5eb2050b52367f4U) * 2) <<
          ((-DAT_00280f50 | 0x6801U) * 2 - (-DAT_00280f50 ^ 0x6801U) & 0x3f);
  uVar2 = uVar2 & uVar3 | uVar2 ^ uVar3;
  uVar3 = (ulong)*(byte *)(unaff_x22 + 4) << 0x18;
  uVar2 = uVar2 & uVar3 | uVar2 ^ uVar3;
  uVar3 = (uVar2 - ((-DAT_00280f50 | 0xe5eb2050b52367f9U) * 2 -
                    (-DAT_00280f50 ^ 0xe5eb2050b52367f9U) ^ 0xffffffffffffffff)) - 1;
  if (((param_1 ^ 0xfffffffffffffff8) & param_1) != 0) {
    uVar2 = (uVar3 ^ 7) & uVar3;
  }
  ppuVar1 = &PTR_LAB_0027ab60;
  if (uVar2 <= unaff_x21 - 5U) {
    ppuVar1 = &PTR_LAB_0027fda8;
  }
                    /* WARNING: Could not recover jumptable at 0x001fc374. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


