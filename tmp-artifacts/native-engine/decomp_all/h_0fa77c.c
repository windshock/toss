// entry=0xfa77c

void Hfa6a8(undefined8 param_1,undefined8 param_2,long param_3)

{
  ulong uVar1;
  undefined **ppuVar2;
  uint uVar3;
  byte *pbVar4;
  long in_x14;
  ulong in_x15;
  long in_x16;
  ulong uVar5;
  long unaff_x22;
  int unaff_w27;
  
  uVar5 = 0;
  pbVar4 = (byte *)(param_3 + in_x16);
  do {
    uVar3 = unaff_w27 *
            ((-(int)DAT_00281318 ^ 0x908b729fU) + (-(int)DAT_00281318 & 0x908b729fU) * 2);
    unaff_w27 = (uVar3 | *pbVar4) + (uVar3 & *pbVar4);
    uVar1 = (-DAT_00281318 ^ 0xe06e6172908a7261U) + (-DAT_00281318 & 0xe06e6172908a7261U) * 2;
    uVar5 = (uVar5 ^ uVar1) + (uVar5 & uVar1) * 2;
    pbVar4 = pbVar4 + (-0x1f919e8d6f758da0 - (-DAT_00281318 ^ 0xffffffffffffffffU));
  } while (uVar5 != in_x15);
  ppuVar2 = (undefined **)&DAT_002815b0;
  if (unaff_w27 != *(int *)(unaff_x22 + in_x14 * 4)) {
    ppuVar2 = &PTR_LAB_00279780;
  }
                    /* WARNING: Could not recover jumptable at 0x001fa4cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


