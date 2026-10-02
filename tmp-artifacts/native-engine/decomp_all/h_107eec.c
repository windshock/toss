// entry=0x107eec

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void H107740(ulong param_1)

{
  bool bVar1;
  undefined8 *puVar2;
  undefined **ppuVar3;
  long in_x6;
  long in_x9;
  ulong uVar4;
  ulong in_x10;
  ulong in_x11;
  ulong uVar5;
  ulong uVar6;
  long unaff_x23;
  undefined1 auVar7 [16];
  
  uVar5 = (in_x11 ^ (-DAT_00280ba0 | 0x915e2a0196034936U) * 2 -
                    (-DAT_00280ba0 ^ 0x915e2a0196034936U) ^ 0xffffffffffffffff) & in_x11;
  uVar6 = 0;
  do {
    puVar2 = (undefined8 *)
             (uVar6 + param_1 + unaff_x23 + (-0x6ea1d5fe69fcb6ba - DAT_00280ba0) * 0x80);
    auVar7 = a64_TBL(ZEXT816(0),
                     *(undefined1 (*) [16])
                      (in_x6 + ((DAT_00280ba0 * -2 | 0x22bc54032c06928cU) -
                               (-DAT_00280ba0 ^ 0x915e2a0196034946U)) * 0x14 +
                       ((in_x10 | -uVar6) * 2 - (in_x10 ^ -uVar6)) + -0xf),_DAT_0012c6c0);
    puVar2[1] = auVar7._8_8_;
    *puVar2 = auVar7._0_8_;
    uVar6 = uVar6 + 0x10;
  } while (uVar6 != uVar5);
  uVar4 = (in_x10 - (-uVar5 ^ 0xffffffffffffffff)) - 1;
  uVar6 = (uVar5 - (param_1 ^ 0xffffffffffffffff)) - 1;
  if (in_x11 != uVar5) {
    do {
      *(undefined1 *)
       (unaff_x23 +
        ((-DAT_00280ba0 ^ 0x915e2a0196034946U) + (-DAT_00280ba0 & 0x915e2a0196034946U) * 2) * 0x80 +
       uVar6) = *(undefined1 *)(in_x6 + uVar4);
      uVar6 = (uVar6 | 1) + (uVar6 & 1);
      bVar1 = 0 < (long)uVar4;
      uVar4 = -(uVar4 ^ 0xffffffffffffffff) - 2;
    } while (bVar1 != 0x7f < uVar6 && bVar1);
  }
  ppuVar3 = &PTR_LAB_00278ba8;
  if (uVar6 < 0x80 ==
      (*(char *)(in_x9 + (-DAT_00280ba0 | 0x915e2a0196034947U) +
                         (-DAT_00280ba0 & 0x915e2a0196034947U)) == '\0') || uVar6 >= 0x80) {
    ppuVar3 = (undefined **)&DAT_00278258;
  }
                    /* WARNING: Could not recover jumptable at 0x0020ecb0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)();
  return;
}


