// FUN_0015ca28 @0015ca28

void FUN_0015ca28(undefined8 param_1,long param_2,uint param_3,uint param_4)

{
  byte *pbVar1;
  byte *pbVar2;
  byte bVar3;
  byte bVar4;
  long unaff_x19;
  
  do {
    param_4 = ((param_4 ^ 0xffffff00) & param_4) + 1;
    pbVar1 = (byte *)(unaff_x19 + 0x460 + (ulong)((param_4 ^ 0xffffff00) & param_4));
    bVar3 = *pbVar1;
    param_3 = (((param_3 ^ 0xffffff00) & param_3) - (bVar3 ^ 0xffffffff)) - 1;
    pbVar2 = (byte *)(unaff_x19 + 0x460 + (ulong)((param_3 ^ 0xffffff00) & param_3));
    *pbVar1 = *pbVar2;
    *pbVar2 = bVar3;
    bVar3 = (*pbVar1 | bVar3) + (*pbVar1 & bVar3);
    bVar4 = (&DAT_0027e7c8)[param_2];
    (&DAT_0027e7c8)[param_2] = (bVar4 | bVar3) & (bVar4 & bVar3 ^ 0xff);
    param_2 = param_2 + 1;
  } while (param_2 != 0x17);
  (*(code *)PTR_FUN_00276c38)();
  return;
}

