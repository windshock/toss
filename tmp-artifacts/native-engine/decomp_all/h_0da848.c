// entry=0xda848

void Hda848(void)

{
  uint uVar1;
  undefined **ppuVar2;
  uint uVar3;
  ulong uVar4;
  undefined1 *puVar5;
  undefined1 *puVar6;
  ulong uVar7;
  int iVar8;
  undefined8 *unaff_x23;
  
  uVar3 = *(uint *)(unaff_x23 + 3);
  uVar1 = (*(uint *)(unaff_x23 + 1) | 8) + (*(uint *)(unaff_x23 + 1) & 8);
  uVar1 = (uVar1 | uVar3) * 2 - (uVar1 ^ uVar3);
  uVar7 = (ulong)uVar1;
  iVar8 = (int)DAT_0027b370;
  uVar4 = (DAT_0027b370 * -2 | 0x31fd21c902d680f6U) - (-DAT_0027b370 ^ 0x18fe90e4816b407bU);
  uVar4 = (uVar7 | uVar4) * 2 - (uVar7 ^ uVar4);
  if ((((iVar8 * -2 | 0x2d680f4U) - (-iVar8 ^ 0x816b407aU) ^ uVar1 ^ 0xffffffff) & uVar1) != 0) {
    uVar7 = (uVar4 ^ 0xfffffffe00000007) & uVar4;
  }
  uVar4 = (DAT_0027b370 * -2 | 0x31fd21c902d680f0U) - (-DAT_0027b370 ^ 0x18fe90e4816b4078U);
  puVar5 = &stack0x00000000 + -((uVar7 ^ uVar4) + (uVar7 & uVar4) * 2 + 0xf & 0xfffffffffffffff0);
  puVar6 = puVar5 + -(uVar7 + 0xf & 0xfffffffffffffff0);
  *puVar5 = 1;
  puVar5[(-DAT_0027b370 ^ 0x18fe90e4816b4074U) + (-DAT_0027b370 & 0x18fe90e4816b4074U) * 2] =
       (char)uVar1;
  puVar5[2] = (char)(uVar1 >> (ulong)((-iVar8 | 0x407bU) * 2 - (-iVar8 ^ 0x407bU) & 0x1f));
  puVar5[3] = (char)(uVar1 >> (ulong)((-iVar8 | 0x4083U) * 2 - (-iVar8 ^ 0x4083U) & 0x1f));
  puVar5[4] = (char)(uVar1 >> 0x18);
  uVar1 = *(uint *)(unaff_x23 + 1);
  *puVar6 = (char)uVar1;
  puVar6[(-DAT_0027b370 | 0x18fe90e4816b4074U) * 2 - (-DAT_0027b370 ^ 0x18fe90e4816b4074U)] =
       (char)(uVar1 >> 8);
  puVar6[2] = (char)(uVar1 >> 0x10);
  puVar6[3] = (char)(uVar1 >> 0x18);
  if (uVar1 != 0) {
    memcpy(puVar6 + 4,(void *)*unaff_x23,(long)(int)uVar1);
  }
  puVar6 = puVar6 + (ulong)uVar1 + 4;
  uVar1 = *(uint *)(unaff_x23 + 3);
  *puVar6 = (char)uVar1;
  puVar6[(-DAT_0027b370 | 0x18fe90e4816b4074U) * 2 - (-DAT_0027b370 ^ 0x18fe90e4816b4074U)] =
       (char)(uVar1 >> 8);
  puVar6[(-DAT_0027b370 ^ 0x18fe90e4816b4075U) + (-DAT_0027b370 & 0x18fe90e4816b4075U) * 2] =
       (char)(uVar1 >> 0x10);
  puVar6[3] = (char)(uVar1 >> 0x18);
  ppuVar2 = &PTR_LAB_0027f160;
  if (uVar1 != 0) {
    ppuVar2 = &PTR_LAB_00283300 +
              (int)((-(int)DAT_0027b370 ^ 0x816b4079U) + (-(int)DAT_0027b370 & 0x816b4079U) * 2);
  }
                    /* WARNING: Could not recover jumptable at 0x001db49c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


