// entry=0x5e574

void H5e574(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  int iVar7;
  uint in_w13;
  uint in_w14;
  ulong in_x15;
  long unaff_x19;
  
  uVar2 = CONCAT13(DAT_00281707,CONCAT12(DAT_00281706,CONCAT11(DAT_00281705,DAT_00281704)));
  uVar3 = CONCAT13(DAT_00281703,CONCAT12(DAT_00281702,CONCAT11(DAT_00281701,DAT_00281700)));
  uVar6 = (uVar2 >> 5 ^ 0xffffffff) & in_w14 << 2 | uVar2 >> 5 & (in_w14 << 2 ^ 0xffffffff);
  iVar7 = (int)DAT_00275ca8;
  uVar5 = in_w14 >> (ulong)(0x14d6 - (-iVar7 ^ 0xffffffffU) & 0x1f);
  uVar4 = uVar2 << (ulong)((-iVar7 ^ 0x14d8U) + (-iVar7 & 0x14d8U) * 2 & 0x1f);
  uVar4 = (uVar4 ^ 0xffffffff) & uVar5 | uVar4 & (uVar5 ^ 0xffffffff);
  uVar4 = (uVar6 | uVar4) + (uVar6 & uVar4);
  uVar5 = (in_w14 | in_w13) & (in_w14 & in_w13 ^ 0xffffffff);
  uVar6 = *(uint *)(unaff_x19 + 0x350 + (in_x15 & 0xffffffff) * 4);
  uVar2 = (uVar6 ^ 0xffffffff) & uVar2 | uVar6 & (uVar2 ^ 0xffffffff);
  uVar5 = (uVar2 | uVar5) + (uVar2 & uVar5);
  uVar4 = -((uVar5 | uVar4) & (uVar5 & uVar4 ^ 0xffffffff));
  uVar4 = (uVar3 ^ uVar4) + (uVar3 & uVar4) * 2;
  DAT_00281700 = (undefined1)uVar4;
  DAT_00281701 = (undefined1)(uVar4 >> (ulong)((-iVar7 ^ 0x14dcU) + (-iVar7 & 0x14dcU) * 2 & 0x1f));
  DAT_00281702 = (undefined1)(uVar4 >> 0x10);
  DAT_00281703 = (undefined1)(uVar4 >> 0x18);
  ppuVar1 = &PTR_LAB_002781b8;
  if ((in_w13 ^ 0x61c88647) + (in_w13 & 0x61c88647) * 2 != 0) {
    ppuVar1 = (undefined **)&DAT_0027fa40;
  }
                    /* WARNING: Could not recover jumptable at 0x0015e758. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


