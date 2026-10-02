// entry=0x81b30

void H81b30(undefined8 param_1,undefined8 param_2,long param_3)

{
  byte *pbVar1;
  uint uVar2;
  undefined **ppuVar3;
  byte bVar4;
  ulong in_x11;
  uint in_w12;
  
  uVar2 = (in_w12 ^ 0xffffff00) & in_w12;
  bVar4 = *(byte *)(param_3 + in_x11);
  uVar2 = (uVar2 | bVar4) * 2 - (uVar2 ^ bVar4);
  uVar2 = (uVar2 | (byte)(&DAT_0012ce33)[in_x11 & 0xf]) +
          (uVar2 & (byte)(&DAT_0012ce33)[in_x11 & 0xf]);
  pbVar1 = (byte *)(param_3 + (ulong)((uVar2 ^ 0xffffff00) & uVar2));
  *(byte *)(param_3 + in_x11) = *pbVar1;
  *pbVar1 = bVar4;
  ppuVar3 = &PTR_LAB_00279cc0;
  if ((in_x11 ^ 1) + (in_x11 & 1) * 2 != 0x100) {
    ppuVar3 = &PTR_H81b30_0027ea30;
  }
                    /* WARNING: Could not recover jumptable at 0x00181be0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)(0);
  return;
}


