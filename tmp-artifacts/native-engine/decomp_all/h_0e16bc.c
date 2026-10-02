// entry=0xe16bc

undefined8 He16bc(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  ulong uVar1;
  undefined **ppuVar2;
  undefined8 uVar3;
  ulong in_x10;
  ulong in_x11;
  ulong in_x14;
  char *in_x15;
  char *pcVar4;
  long in_x16;
  char in_w17;
  long unaff_x20;
  
  do {
    pcVar4 = in_x15;
    in_x15 = pcVar4 + 1;
    in_x16 = in_x16 + -1;
    if (in_x16 == 0) {
      do {
        in_x11 = (in_x11 ^ 1) + (in_x11 & 1) * 2;
        if (in_x11 == in_x10) {
          return 0;
        }
      } while (*(ulong *)(unaff_x20 + in_x11 * 0x38 + 0x28) < 0x1001);
                    /* WARNING: Could not recover jumptable at 0x001e42b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar3 = (*(code *)PTR_LAB_002786d0)();
      return uVar3;
    }
  } while (*in_x15 != in_w17);
  if (in_x14 == (-DAT_002835b8 | 0xaee06616cbb6f37dU) * 2 - (-DAT_002835b8 ^ 0xaee06616cbb6f37dU)) {
    ppuVar2 = &PTR_LAB_00281778;
    if (in_x15 != (char *)0x0) {
      ppuVar2 = &PTR_LAB_00277888;
    }
                    /* WARNING: Could not recover jumptable at 0x001e43f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar3 = (*(code *)*ppuVar2)();
    return uVar3;
  }
  uVar1 = (-DAT_002835b8 | 0xaee06616cbb6f37cU) + (-DAT_002835b8 & 0xaee06616cbb6f37cU);
                    /* WARNING: Could not recover jumptable at 0x001e3354. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar3 = (*(code *)PTR_LAB_00278748)
                    ((in_x14 ^ uVar1) + (in_x14 & uVar1) * 2,param_1,param_4,*in_x15,pcVar4 + 2,
                     param_1 + 1);
  return uVar3;
}


