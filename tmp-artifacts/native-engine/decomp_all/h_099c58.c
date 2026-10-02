// entry=0x99c58

void H99c58(long param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  undefined **ppuVar3;
  uint uVar4;
  uint uVar5;
  ulong in_x12;
  
  pbVar1 = (byte *)(param_1 + (in_x12 ^ 0xfffffffffffffff9) + (in_x12 & 0xfffffffffffffff9) * 2);
  pbVar2 = pbVar1 + (0x2e00d84656e407c0 - (-DAT_0027fb18 ^ 0xffffffffffffffffU));
  uVar4 = (uint)*pbVar1 * 0x1003f;
  uVar4 = (uVar4 | 0x5f2b8554) * 2 - (uVar4 ^ 0x5f2b8554);
  uVar4 = ((uVar4 | *pbVar2) + (uVar4 & *pbVar2)) * 0x1003f;
  uVar5 = -(int)DAT_0027fb18;
  uVar4 = ((((uVar4 ^ pbVar2[1]) + (uVar4 & pbVar2[1]) * 2) *
            (0x56e507fe - (-(int)DAT_0027fb18 ^ 0xffffffffU)) - (pbVar2[2] ^ 0xffffffff)) + -1) *
          ((uVar5 | 0x56e507ff) * 2 - (uVar5 ^ 0x56e507ff));
  uVar4 = ((uVar4 ^ pbVar2[3]) + (uVar4 & pbVar2[3]) * 2) * 0x1003f;
  uVar4 = ((uVar4 | pbVar2[4]) + (uVar4 & pbVar2[4])) * 0x1003f;
  uVar4 = ((uVar4 | pbVar2[5]) + (uVar4 & pbVar2[5])) * 0x1003f;
  ppuVar3 = &PTR_LAB_00274200;
  if ((uVar4 | pbVar2[6]) * 2 - (uVar4 ^ pbVar2[6]) != -0x6be5c2) {
    ppuVar3 = &PTR_LAB_0027d9e8;
  }
                    /* WARNING: Could not recover jumptable at 0x00199db4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)();
  return;
}


