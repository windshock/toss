// entry=0xf7120

void Hf7120(undefined8 param_1,undefined8 param_2)

{
  uint uVar1;
  uint uVar2;
  undefined8 *unaff_x21;
  undefined4 unaff_w22;
  int unaff_w23;
  undefined4 unaff_w24;
  undefined4 unaff_w25;
  
  uVar1 = -(int)DAT_00285dc0;
  uVar2 = -(int)DAT_00285dc0;
  if (unaff_w23 != (uVar1 ^ 0xb5830cfc) + (uVar1 & 0xb5830cfc) * 2) {
    *unaff_x21 = &DAT_00279b75;
    *(undefined4 *)(unaff_x21 + 1) = unaff_w22;
    unaff_x21[2] = &DAT_00279b86;
    *(undefined4 *)(unaff_x21 + 3) = unaff_w24;
    unaff_x21[4] = &DAT_00279b97;
    *(undefined4 *)(unaff_x21 + 5) = unaff_w25;
                    /* WARNING: Could not recover jumptable at 0x001f74f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00277ef8)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x001f4b60. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00275680)(param_1,param_2,(uVar2 | 0xb5830cfc) + (uVar2 & 0xb5830cfc));
  return;
}


