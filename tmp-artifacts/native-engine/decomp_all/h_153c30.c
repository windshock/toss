// entry=0x153c30

void H153a24(ulong param_1)

{
  byte *pbVar1;
  undefined **ppuVar2;
  uint uVar3;
  int iVar4;
  uint in_w13;
  uint in_w14;
  uint in_w15;
  long in_x16;
  long in_x17;
  long unaff_x19;
  long unaff_x22;
  
  do {
    pbVar1 = (byte *)(in_x17 + param_1);
    iVar4 = (int)*(undefined8 *)(unaff_x22 + 0x260);
    param_1 = (param_1 << 1 | 2) - (param_1 ^ 1);
  } while ((uint)*pbVar1 != ((in_w15 | iVar4 * -2) - (-iVar4 ^ in_w14) & 0xff));
  uVar3 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
  (**(code **)(in_x16 + (long)(int)((in_w13 | uVar3) * 2 - (in_w13 ^ uVar3)) * 0x960 +
              (long)(int)((in_w13 - (int)*(undefined8 *)(unaff_x22 + 0x260)) + 0x115) * 8))();
  uVar3 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
  ppuVar2 = &PTR_LAB_00275f08;
  if (**(char **)(unaff_x19 + 400) != '\0') {
    ppuVar2 = &PTR_LAB_00281350 + (int)((uVar3 | 0x143a5e8d) + (uVar3 & 0x143a5e8d));
  }
                    /* WARNING: Could not recover jumptable at 0x00253ad0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


