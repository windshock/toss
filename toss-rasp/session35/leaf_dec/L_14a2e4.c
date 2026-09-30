// FUN_0014a2bc @0014a2bc

void FUN_0014a2bc(undefined8 param_1,undefined8 param_2,ulong param_3,uint param_4)

{
  uint uVar1;
  byte *pbVar2;
  byte *pbVar3;
  byte bVar4;
  long unaff_x19;
  
  do {
    param_4 = (param_4 ^ 0xffffff00) & param_4;
    pbVar2 = (byte *)(unaff_x19 + 0x560 + param_3);
    bVar4 = *pbVar2;
    uVar1 = (param_4 ^ bVar4) + (param_4 & bVar4) * 2;
    param_4 = (uVar1 ^ (byte)(&DAT_0012ccee)[param_3 % 0xf]) +
              (uVar1 & (byte)(&DAT_0012ccee)[param_3 % 0xf]) * 2;
    pbVar3 = (byte *)(unaff_x19 + 0x560 + (ulong)((param_4 ^ 0xffffff00) & param_4));
    *pbVar2 = *pbVar3;
    *pbVar3 = bVar4;
    param_3 = (param_3 | 1) + (param_3 & 1);
  } while (param_3 != 0x100);
  FUN_00155450(param_1,param_2,0,0,0);
  return;
}

