// req=0x157200 entry=0x157200

void HND_157200(undefined1 param_1 [16],undefined1 param_2 [16],undefined1 param_3 [16],
               undefined1 param_4 [16])

{
  ulong uVar1;
  ulong uVar2;
  undefined **ppuVar3;
  long lVar4;
  ulong uVar5;
  long in_x12;
  long *in_x13;
  undefined8 *in_x14;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  
  in_x14[7] = param_4._8_8_;
  in_x14[6] = param_4._0_8_;
  in_x14[5] = param_3._8_8_;
  in_x14[4] = param_3._0_8_;
  in_x14[3] = param_2._8_8_;
  in_x14[2] = param_2._0_8_;
  in_x14[1] = param_1._8_8_;
  *in_x14 = param_1._0_8_;
  uVar7 = *(undefined8 *)(in_x12 + 0x48);
  uVar6 = *(undefined8 *)(in_x12 + 0x40);
  uVar9 = *(undefined8 *)(in_x12 + 0x58);
  uVar8 = *(undefined8 *)(in_x12 + 0x50);
  uVar11 = *(undefined8 *)(in_x12 + 0x68);
  uVar10 = *(undefined8 *)(in_x12 + 0x60);
  uVar12 = *(undefined8 *)(in_x12 + 0x70);
  in_x14[0xf] = *(undefined8 *)(in_x12 + 0x78);
  in_x14[0xe] = uVar12;
  in_x14[0xd] = uVar11;
  in_x14[0xc] = uVar10;
  in_x14[0xb] = uVar9;
  in_x14[10] = uVar8;
  in_x14[9] = uVar7;
  in_x14[8] = uVar6;
  uVar7 = *(undefined8 *)(in_x12 + 0x88);
  uVar6 = *(undefined8 *)(in_x12 + 0x80);
  uVar9 = *(undefined8 *)(in_x12 + 0x98);
  uVar8 = *(undefined8 *)(in_x12 + 0x90);
  uVar11 = *(undefined8 *)(in_x12 + 0xa8);
  uVar10 = *(undefined8 *)(in_x12 + 0xa0);
  uVar12 = *(undefined8 *)(in_x12 + 0xb0);
  in_x14[0x17] = *(undefined8 *)(in_x12 + 0xb8);
  in_x14[0x16] = uVar12;
  in_x14[0x15] = uVar11;
  in_x14[0x14] = uVar10;
  in_x14[0x13] = uVar9;
  in_x14[0x12] = uVar8;
  in_x14[0x11] = uVar7;
  in_x14[0x10] = uVar6;
  uVar7 = *(undefined8 *)(in_x12 + 200);
  uVar6 = *(undefined8 *)(in_x12 + 0xc0);
  uVar9 = *(undefined8 *)(in_x12 + 0xd8);
  uVar8 = *(undefined8 *)(in_x12 + 0xd0);
  uVar11 = *(undefined8 *)(in_x12 + 0xe8);
  uVar10 = *(undefined8 *)(in_x12 + 0xe0);
  uVar12 = *(undefined8 *)(in_x12 + 0xf0);
  in_x14[0x1f] = *(undefined8 *)(in_x12 + 0xf8);
  in_x14[0x1e] = uVar12;
  in_x14[0x1d] = uVar11;
  in_x14[0x1c] = uVar10;
  in_x14[0x1b] = uVar9;
  in_x14[0x1a] = uVar8;
  in_x14[0x19] = uVar7;
  in_x14[0x18] = uVar6;
  uVar1 = (-*in_x13 ^ 0xcc58693bfa09c241U) + (-*in_x13 & 0xcc58693bfa09c241U) * 2;
  uVar5 = -DAT_00277160 ^ 0xcc58693bfa09c242;
  uVar2 = uVar5 + (-DAT_00277160 & 0xcc58693bfa09c242U) * 2;
  lVar4 = (-DAT_00277160 | 0xcc58693bfa09c341U) * 2;
  ppuVar3 = &PTR_LAB_0027ed40;
  if ((uVar1 | uVar2) * 2 - (uVar1 ^ uVar2) != lVar4 - (-DAT_00277160 ^ 0xcc58693bfa09c341U)) {
    ppuVar3 = &PTR_LAB_00277258;
  }
                    /* WARNING: Could not recover jumptable at 0x002579dc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)(lVar4,uVar5,0xffffffff,-(int)DAT_00277160 ^ 0xfa0ac280);
  return;
}


