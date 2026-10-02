// entry=0x69250

void H69250(undefined1 *param_1,uint param_2,uint param_3,ulong param_4,uint param_5)

{
  uint uVar1;
  undefined **ppuVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  byte *in_x10;
  byte *in_x11;
  byte *in_x12;
  byte *in_x13;
  int iVar6;
  uint uVar7;
  char in_w17;
  undefined1 *unaff_x19;
  long unaff_x25;
  long unaff_x29;
  
  uVar3 = CONCAT13(*param_1,CONCAT12(**(undefined1 **)(unaff_x29 + -0xa0),
                                     CONCAT11(**(undefined1 **)(unaff_x29 + -0x98),*unaff_x19)));
  uVar4 = (uint)*in_x12 << 0x10 ^ (uint)*in_x13 << 0x18 ^ (uint)*in_x10 ^ (uint)*in_x11 << 8;
  uVar7 = (uint)(param_4 >> 5) & 0x7ffffff;
  uVar7 = (uVar3 << 2 | uVar7) & (uVar3 << 2 & uVar7 ^ 0xffffffff);
  uVar5 = (uint)param_4;
  uVar1 = (uVar3 >> 3 | uVar5 << 4) & (uVar3 >> 3 & uVar5 << 4 ^ 0xffffffff);
  uVar7 = (uVar7 | uVar1) + (uVar7 & uVar1);
  uVar1 = (uVar3 | param_3) & (uVar3 & param_3 ^ 0xffffffff);
  uVar3 = *(uint *)(unaff_x25 + (0x2f88560a761abe8 - (-DAT_00276dd0 ^ 0xffffffffffffffffU)) * 0x10 +
                   (ulong)((param_5 | param_2) & (param_5 & param_2 ^ 0xffffffff)) * 4);
  uVar3 = (uVar3 | uVar5) & (uVar3 & uVar5 ^ 0xffffffff);
  uVar1 = (uVar1 | uVar3) * 2 - (uVar1 ^ uVar3);
  uVar7 = (uVar7 | uVar1) & (uVar7 & uVar1 ^ 0xffffffff);
  uVar7 = (uVar7 | uVar4) * 2 - (uVar7 ^ uVar4);
  iVar6 = (int)DAT_00276dd0;
  *in_x10 = (byte)uVar7;
  *in_x11 = (byte)(uVar7 >> 8);
  *in_x12 = (byte)(uVar7 >> (ulong)((-iVar6 ^ 0xabf9U) + (-iVar6 & 0xabf9U) * 2 & 0x1f));
  *in_x13 = (byte)(uVar7 >> 0x18);
  ppuVar2 = &PTR_H682b0_00280708;
  if (in_w17 != (byte)((-(char)DAT_00276dd0 | 0xe9U) * '\x02' - (-(char)DAT_00276dd0 ^ 0xe9U))) {
    ppuVar2 = &PTR_LAB_00274c98;
  }
                    /* WARNING: Could not recover jumptable at 0x0016a3c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


