// entry=0xe04e0

void He04e0(void)

{
  byte *pbVar1;
  undefined **ppuVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  ulong in_x11;
  ulong uVar6;
  
  pbVar1 = &DAT_0027ad10 +
           (in_x11 <<
           ((-DAT_00274f48 | 0xf676ba10cbf878aeU) + (-DAT_00274f48 & 0xf676ba10cbf878aeU) & 0x3f));
  iVar5 = (int)DAT_00274f48;
  uVar3 = (uint)pbVar1[(-DAT_00274f48 ^ 0xf676ba10cbf878adU) +
                       (-DAT_00274f48 & 0xf676ba10cbf878adU) * 2] <<
          (ulong)((-iVar5 | 0xcbf878b4U) * 2 - (-iVar5 ^ 0xcbf878b4U) & 0x1f);
  uVar4 = uVar3 & *pbVar1 | uVar3 ^ *pbVar1;
  uVar3 = (uint)pbVar1[(-DAT_00274f48 ^ 0xf676ba10cbf878aeU) +
                       (-DAT_00274f48 & 0xf676ba10cbf878aeU) * 2] <<
          (ulong)((-iVar5 | 0x78bcU) * 2 - (-iVar5 ^ 0x78bcU) & 0x1f);
  uVar4 = uVar4 & uVar3 | uVar4 ^ uVar3;
  uVar3 = (uint)pbVar1[(-DAT_00274f48 | 0xf676ba10cbf878afU) * 2 -
                       (-DAT_00274f48 ^ 0xf676ba10cbf878afU)] <<
          (ulong)(0x78c3 - (-iVar5 ^ 0xffffffffU) & 0x1f);
  uVar3 = (uVar4 & uVar3 | uVar4 ^ uVar3) * ((-iVar5 ^ 0x27ca6241U) + (-iVar5 & 0x27ca6241U) * 2);
  uVar6 = (-DAT_00274f48 | 0xf676ba10cbf878adU) * 2 - (-DAT_00274f48 ^ 0xf676ba10cbf878adU);
  ppuVar2 = &PTR_LAB_00281fd0;
  if ((in_x11 | uVar6) + (in_x11 & uVar6) !=
      (-DAT_00274f48 | 0xf676ba10cbf878b0U) * 2 - (-DAT_00274f48 ^ 0xf676ba10cbf878b0U)) {
    ppuVar2 = &PTR_He04e0_0027e160;
  }
                    /* WARNING: Could not recover jumptable at 0x001e0724. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)(0x27ca6241,0xffffffff,
                      (uVar3 >> (ulong)(0x78c3 - (-iVar5 ^ 0xffffffffU) & 0x1f) ^ 0xffffffff) &
                      uVar3);
  return;
}


