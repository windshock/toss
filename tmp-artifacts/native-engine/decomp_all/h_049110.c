// entry=0x49110

void H49110(ulong param_1)

{
  byte *pbVar1;
  byte bVar2;
  uint uVar3;
  byte in_w9;
  long unaff_x19;
  
  do {
    *(byte *)(unaff_x19 + 0x760 + param_1) = in_w9;
    param_1 = (param_1 | 1) + (param_1 & 1);
    in_w9 = (in_w9 | 1) * '\x02' - (in_w9 ^ 1);
  } while (param_1 != (-DAT_00275ca8 | 0x642804bbf97b15d4U) + (-DAT_00275ca8 & 0x642804bbf97b15d4U))
  ;
  pbVar1 = (byte *)(unaff_x19 + 0x760);
  bVar2 = *pbVar1;
  uVar3 = (uint)bVar2 * 2 - (uint)bVar2;
  uVar3 = (uVar3 ^ 0x86) + (uVar3 & 0x86) * 2;
  *pbVar1 = pbVar1[(uVar3 ^ 0xffffff00) & uVar3];
  pbVar1[(uVar3 ^ 0xffffff00) & uVar3] = bVar2;
                    /* WARNING: Could not recover jumptable at 0x0015e938. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027cfd0)(0);
  return;
}


