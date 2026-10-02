// entry=0xdc2fc

void FUN_001dbf84(byte *param_1)

{
  byte bVar1;
  uint uVar2;
  ulong uVar3;
  
  uVar3 = 0;
  bVar1 = 0;
  do {
    param_1[uVar3] = bVar1;
    uVar3 = (uVar3 ^ 1) + (uVar3 & 1) * 2;
    bVar1 = (bVar1 | 1) * '\x02' - (bVar1 ^ 1);
  } while (uVar3 != 0x100);
  bVar1 = *param_1;
  uVar2 = ((uint)bVar1 * 2 - (uint)bVar1) + 0x12;
  *param_1 = param_1[(uVar2 ^ 0xffffff00) & uVar2];
  param_1[(uVar2 ^ 0xffffff00) & uVar2] = bVar1;
                    /* WARNING: Could not recover jumptable at 0x001db92c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*DAT_002768e8)();
  return;
}


