// entry=0x86640

void H86640(undefined8 param_1,undefined8 param_2,byte *param_3)

{
  byte bVar1;
  uint uVar2;
  ulong uVar3;
  
  uVar3 = 0;
  bVar1 = 0;
  do {
    param_3[uVar3] = bVar1;
    uVar3 = (uVar3 | 1) * 2 - (uVar3 ^ 1);
    bVar1 = (bVar1 ^ 1) + (bVar1 & 1) * '\x02';
  } while (uVar3 != 0x100);
  bVar1 = *param_3;
  uVar2 = (uint)bVar1 * 2 - (uint)bVar1;
  uVar2 = (uVar2 | 0x86) + (uVar2 & 0x86);
  *param_3 = param_3[(uVar2 ^ 0xffffff00) & uVar2];
  param_3[(uVar2 ^ 0xffffff00) & uVar2] = bVar1;
                    /* WARNING: Could not recover jumptable at 0x00181be0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_H81b30_0027ea30)(0);
  return;
}


